package actions;

import com.opensymphony.xwork2.ActionSupport;
import daos.TiposCultivoDAO;
import java.util.ArrayList;
import java.util.List;
import model.TipoCultivo;

public class TiposCultivoAction extends ActionSupport{
    
    List<TipoCultivo> tiposCultivo = new ArrayList<TipoCultivo>(0);
    
    public String listarTiposCultivo(){
        TiposCultivoDAO tipCulDAO = new TiposCultivoDAO();
        setTiposCultivo(tipCulDAO.obtenerCatalogoTipoCultivoDAO());
        return SUCCESS;
    }

    public List<TipoCultivo> getTiposCultivo() {
        return tiposCultivo;
    }

    public void setTiposCultivo(List<TipoCultivo> tiposCultivo) {
        this.tiposCultivo = tiposCultivo;
    }    
}
