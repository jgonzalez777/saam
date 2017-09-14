package actions;

import com.opensymphony.xwork2.ActionSupport;
import model.Estacion;

public class NuevaEstacionAction extends ActionSupport{
    Estacion estacion;
    
    public String crearNuevaEstacion(){
        return SUCCESS;
    }
}
