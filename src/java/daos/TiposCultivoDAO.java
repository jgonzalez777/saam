package daos;

import java.util.ArrayList;
import java.util.List;
import model.HibernateUtil;
import model.TipoCultivo;
import org.hibernate.Query;
import org.hibernate.Session;

public class TiposCultivoDAO {
    
    Session session = null;
    
    public TiposCultivoDAO(){
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List<TipoCultivo> obtenerCatalogoTipoCultivoDAO(){
        List<TipoCultivo> tiposCultivo = new ArrayList<TipoCultivo>(0);        
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from TipoCultivo as tc where 1=1");
            tiposCultivo = (List<TipoCultivo>) q.list();
            System.out.println("tiposCultivo: " + tiposCultivo.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tiposCultivo;
    }
    
}
