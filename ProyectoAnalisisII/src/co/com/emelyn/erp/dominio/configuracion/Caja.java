/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.emelyn.erp.dominio.configuracion;

/**
 *
 * @author agonzalez
 */
public class Caja {
    
  /** codigo de la Caja. */
  private String codigo;
  
    /** descripcion de la Caja. */
  private String descripcion;
  
    /** estado de la Caja. */
  private String estado;
  
    /** cajeroAsignado de la Caja. */
  private Usuario cajeroAsignado;

  
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getCajeroAsignado() {
        return cajeroAsignado;
    }

    public void setCajeroAsignado(Usuario cajeroAsignado) {
        this.cajeroAsignado = cajeroAsignado;
    }
  
  
    
}
