/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.emelyn.erp.dominio.cliente;

/**
 *
 * @author agonzalez
 */
public class Cliente {
    
  /** identificacion del cliente. */
  private String identificacion;
  
  /** nombres del cliente. */
  private String nombres;
  
  /** apellidos del cliente. */
  private String apellidos;
  
  /** direccion del cliente. */
  private String direccion;
  
  /** telefono del cliente. */
  private String telefono;
  
  /** estado del cliente. */
  private String estado;

  /**
   * @return the identificacion
   */
  public String getIdentificacion() {
    return identificacion;
  }

  /**
   * @param identificacion the identificacion to set
   */
  public void setIdentificacion(String identificacion) {
    this.identificacion = identificacion;
  }

  /**
   * @return the nombres
   */
  public String getNombres() {
    return nombres;
  }

  /**
   * @param nombres the nombres to set
   */
  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  /**
   * @return the apellidos
   */
  public String getApellidos() {
    return apellidos;
  }

  /**
   * @param apellidos the apellidos to set
   */
  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  /**
   * @return the direccion
   */
  public String getDireccion() {
    return direccion;
  }

  /**
   * @param direccion the direccion to set
   */
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  /**
   * @return the telefono
   */
  public String getTelefono() {
    return telefono;
  }

  /**
   * @param telefono the telefono to set
   */
  public void setTelefono(String telefono) {
    this.telefono = telefono;
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
    
}
