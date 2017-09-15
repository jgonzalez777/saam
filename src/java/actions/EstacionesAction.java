package actions;

import com.opensymphony.xwork2.ActionSupport;
import daos.EstacionesDAO;
import java.util.ArrayList;
import java.util.List;
import model.Estacion;
import model.Usuario;

public class EstacionesAction extends ActionSupport{
    
    List<Estacion> estaciones = new ArrayList<Estacion>(0);
    Estacion estacion = new Estacion();
    
    public String listarEstaciones(){
        EstacionesDAO estDAO = new EstacionesDAO();
        estaciones = estDAO.obtenerEstacionesPorUsuarioIdDAO(1L);
        return SUCCESS;
    }
    
    public String crearEstacion(){
        if(estacion.getNombre() != null){
            estacion.setUsuario(new Usuario(1L));
            EstacionesDAO estDAO = new EstacionesDAO();            
            estDAO.guardarCultivoDAO(estacion);
            return SUCCESS;
        }
        else
            return "captura";
    }
    
    @Override
    public void validate() {
        if(estacion.getNombre() != null && estacion.getIp() != null){
            if (estacion.getNombre().length() == (0)) 
                this.addFieldError("estacion.nombre", "Por favor capture un nombre");        
            if (estacion.getIp().length() == (0)) 
                this.addFieldError("estacion.ip", "Por favor capture una ip");        
            if(estacion.getLatitud() == 0)
                this.addFieldError("estacion.latitud", "Por favor capture una latitud");
            if(estacion.getLongitud()== 0)
                this.addFieldError("estacion.longitud", "Por favor capture una longitud");
        }
    }

    public List<Estacion> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(List<Estacion> estaciones) {
        this.estaciones = estaciones;
    }   

    public Estacion getEstacion() {
        return estacion;
    }

    public void setEstacion(Estacion estacion) {
        this.estacion = estacion;
    }    
}
