package GreenApps.model;
// Generated Jan 18, 2020 10:18:03 PM by Hibernate Tools 4.3.1



/**
 * TipoPersona generated by hbm2java
 */
public class TipoPersona  implements java.io.Serializable {


     private Integer idTipoPersona;
     private String descripcionPersona;

    public TipoPersona() {
    }

    public TipoPersona(String descripcionPersona) {
       this.descripcionPersona = descripcionPersona;
    }
   
    public Integer getIdTipoPersona() {
        return this.idTipoPersona;
    }
    
    public void setIdTipoPersona(Integer idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }
    public String getDescripcionPersona() {
        return this.descripcionPersona;
    }
    
    public void setDescripcionPersona(String descripcionPersona) {
        this.descripcionPersona = descripcionPersona;
    }




}


