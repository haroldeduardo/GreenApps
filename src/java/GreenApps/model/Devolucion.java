package GreenApps.model;
// Generated Jan 18, 2020 10:18:03 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Devolucion generated by hbm2java
 */
public class Devolucion  implements java.io.Serializable {


     private Integer idDevolucion;
     private String numeroDevolucion;
     private int idEmpleado;
     private int idPersona;
     private float totalDevolucion;
     private int idTipoTransaccion;
     private Date fechaDevolucion;

    public Devolucion() {
    }

    public Devolucion(String numeroDevolucion, int idEmpleado, int idPersona, float totalDevolucion, int idTipoTransaccion, Date fechaDevolucion) {
       this.numeroDevolucion = numeroDevolucion;
       this.idEmpleado = idEmpleado;
       this.idPersona = idPersona;
       this.totalDevolucion = totalDevolucion;
       this.idTipoTransaccion = idTipoTransaccion;
       this.fechaDevolucion = fechaDevolucion;
    }
   
    public Integer getIdDevolucion() {
        return this.idDevolucion;
    }
    
    public void setIdDevolucion(Integer idDevolucion) {
        this.idDevolucion = idDevolucion;
    }
    public String getNumeroDevolucion() {
        return this.numeroDevolucion;
    }
    
    public void setNumeroDevolucion(String numeroDevolucion) {
        this.numeroDevolucion = numeroDevolucion;
    }
    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public int getIdPersona() {
        return this.idPersona;
    }
    
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    public float getTotalDevolucion() {
        return this.totalDevolucion;
    }
    
    public void setTotalDevolucion(float totalDevolucion) {
        this.totalDevolucion = totalDevolucion;
    }
    public int getIdTipoTransaccion() {
        return this.idTipoTransaccion;
    }
    
    public void setIdTipoTransaccion(int idTipoTransaccion) {
        this.idTipoTransaccion = idTipoTransaccion;
    }
    public Date getFechaDevolucion() {
        return this.fechaDevolucion;
    }
    
    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }




}


