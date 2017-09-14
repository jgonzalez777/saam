package model;
// Generated 22/08/2017 11:33:32 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Cultivo generated by hbm2java
 */
public class Cultivo  implements java.io.Serializable {


     private Long id;
     private TipoCultivo tipoCultivo;
     private Estacion estacion;
     private Set<Estadistica> estadisticas = new HashSet<Estadistica>(0);
     private Set<CatalogoSensor> catalogoSensors = new HashSet<CatalogoSensor>(0);
     private Set<CatalogoActuador> catalogoActuadors = new HashSet<CatalogoActuador>(0);

    public Cultivo() {
    }

	
    public Cultivo(TipoCultivo tipoCultivo, Estacion estacion) {
        this.tipoCultivo = tipoCultivo;
        this.estacion = estacion;

    }
    public Cultivo(TipoCultivo tipoCultivo, Estacion estacion, Set<Estadistica> estadisticas, Set<CatalogoSensor> catalogoSensors, Set<CatalogoActuador> catalogoActuadors) {
       this.tipoCultivo = tipoCultivo;
       this.estacion = estacion;
       this.estadisticas = estadisticas;
       this.catalogoSensors = catalogoSensors;
       this.catalogoActuadors = catalogoActuadors;
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public TipoCultivo getTipoCultivo() {
        return this.tipoCultivo;
    }
    
    public void setTipoCultivo(TipoCultivo tipoCultivo) {
        this.tipoCultivo = tipoCultivo;
    }
    public Estacion getEstacion() {
        return this.estacion;
    }
    
    public void setEstacion(Estacion estacion) {
        this.estacion = estacion;
    }
    public Set<Estadistica> getEstadisticas() {
        return this.estadisticas;
    }
    
    public void setEstadisticas(Set<Estadistica> estadisticas) {
        this.estadisticas = estadisticas;
    }
    public Set<CatalogoSensor> getCatalogoSensors() {
        return this.catalogoSensors;
    }
    
    public void setCatalogoSensors(Set<CatalogoSensor> catalogoSensors) {
        this.catalogoSensors = catalogoSensors;
    }
    public Set<CatalogoActuador> getCatalogoActuadors() {
        return this.catalogoActuadors;
    }
    
    public void setCatalogoActuadors(Set<CatalogoActuador> catalogoActuadors) {
        this.catalogoActuadors = catalogoActuadors;
    }




}


