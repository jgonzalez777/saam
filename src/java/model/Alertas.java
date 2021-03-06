package model;
// Generated 14/09/2017 04:33:27 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Alertas generated by hbm2java
 */
public class Alertas  implements java.io.Serializable {


     private Long id;
     private Cultivo cultivo;
     private boolean leido;
     private String contenido;
     private Date fechaCreacion;
     private Date fechaLeido;

    public Alertas() {
    }

    public Alertas(Cultivo cultivo, boolean leido, String contenido, Date fechaCreacion, Date fechaLeido) {
       this.cultivo = cultivo;
       this.leido = leido;
       this.contenido = contenido;
       this.fechaCreacion = fechaCreacion;
       this.fechaLeido = fechaLeido;
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public Cultivo getCultivo() {
        return this.cultivo;
    }
    
    public void setCultivo(Cultivo cultivo) {
        this.cultivo = cultivo;
    }
    public boolean isLeido() {
        return this.leido;
    }
    
    public void setLeido(boolean leido) {
        this.leido = leido;
    }
    public String getContenido() {
        return this.contenido;
    }
    
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Date getFechaLeido() {
        return this.fechaLeido;
    }
    
    public void setFechaLeido(Date fechaLeido) {
        this.fechaLeido = fechaLeido;
    }




}


