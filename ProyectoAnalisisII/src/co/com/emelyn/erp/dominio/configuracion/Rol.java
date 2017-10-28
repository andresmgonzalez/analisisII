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
public class Rol {
    
  /** identificacion del Rol. */
  private String idRol;
  
  /** estado del Rol. */
  private String estado;
  
  /** estado del Rol. */
  private OpcionesApp[] listaOpciones;

  /**
   * @return the idRol
   */
  public String getIdRol() {
    return idRol;
  }

  /**
   * @param idRol the idRol to set
   */
  public void setIdRol(String idRol) {
    this.idRol = idRol;
  }

  /**
   * @return the estado
   */
  public String getEstado() {
    return estado;
  }

  /**
   * @param estado the estado to set
   */
  public void setEstado(String estado) {
    this.estado = estado;
  }

  /**
   * @return the listaOpciones
   */
  public OpcionesApp[] getListaOpciones() {
    return listaOpciones;
  }

  /**
   * @param listaOpciones the listaOpciones to set
   */
  public void setListaOpciones(OpcionesApp[] listaOpciones) {
    this.listaOpciones = listaOpciones;
  }
    
}
