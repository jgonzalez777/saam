package actions;

import com.opensymphony.xwork2.ActionSupport;
import daos.EstacionesDAO;
import java.util.ArrayList;
import java.util.List;
import model.Estacion;

public class EstacionesAction extends ActionSupport{
    
    List<Estacion> estaciones = new ArrayList<Estacion>(0);
    
    public String listarEstaciones(){
        EstacionesDAO estDAO = new EstacionesDAO();
        estaciones = estDAO.obtenerEstacionesPorUsuarioIdDAO(1L);
        return SUCCESS;
    }

    public List<Estacion> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(List<Estacion> estaciones) {
        this.estaciones = estaciones;
    }   
}
