package GreenApps.model;
// Generated Jan 18, 2020 10:18:03 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Compra generated by hbm2java
 */
public class Compra  implements java.io.Serializable {


     private Integer idCompra;
     private String numeroCompra;
     private int idEmpleado;
     private int idPersona;
     private float totalCompra;
     private int idTipoTransaccion;
     private Date fechaCompra;
     private Byte estadoCompra;

    public Compra() {
    }

	
    public Compra(String numeroCompra, int idEmpleado, int idPersona, float totalCompra, int idTipoTransaccion, Date fechaCompra) {
        this.numeroCompra = numeroCompra;
        this.idEmpleado = idEmpleado;
        this.idPersona = idPersona;
        this.totalCompra = totalCompra;
        this.idTipoTransaccion = idTipoTransaccion;
        this.fechaCompra = fechaCompra;
    }
    public Compra(String numeroCompra, int idEmpleado, int idPersona, float totalCompra, int idTipoTransaccion, Date fechaCompra, Byte estadoCompra) {
       this.numeroCompra = numeroCompra;
       this.idEmpleado = idEmpleado;
       this.idPersona = idPersona;
       this.totalCompra = totalCompra;
       this.idTipoTransaccion = idTipoTransaccion;
       this.fechaCompra = fechaCompra;
       this.estadoCompra = estadoCompra;
    }
   
    public Integer getIdCompra() {
        return this.idCompra;
    }
    
    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }
    public String getNumeroCompra() {
        return this.numeroCompra;
    }
    
    public void setNumeroCompra(String numeroCompra) {
        this.numeroCompra = numeroCompra;
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
    public float getTotalCompra() {
        return this.totalCompra;
    }
    
    public void setTotalCompra(float totalCompra) {
        this.totalCompra = totalCompra;
    }
    public int getIdTipoTransaccion() {
        return this.idTipoTransaccion;
    }
    
    public void setIdTipoTransaccion(int idTipoTransaccion) {
        this.idTipoTransaccion = idTipoTransaccion;
    }
    public Date getFechaCompra() {
        return this.fechaCompra;
    }
    
    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public Byte getEstadoCompra() {
        return this.estadoCompra;
    }
    
    public void setEstadoCompra(Byte estadoCompra) {
        this.estadoCompra = estadoCompra;
    }




}

