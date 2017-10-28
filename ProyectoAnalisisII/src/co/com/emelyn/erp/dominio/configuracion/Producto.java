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
public class Producto {
    
  /** codigo del producto. */
  private String codigo;
  
  /** nombre del producto. */
  private String nombre;

  /** descripcion del producto. */
  private String descripcion;
  
  /** estado del producto. */
  private boolean estado;
  
  /** impuesto del producto. */
  private double impuesto;
  
  /** precioVenta del producto. */
  private double precioVenta;

  /**
   * @return the codigo
   */
  public String getCodigo() {
    return codigo;
  }

  /**
   * @param codigo the codigo to set
   */
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  /**
   * @return the nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * @param nombre the nombre to set
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * @return the descripcion
   */
  public String getDescripcion() {
    return descripcion;
  }

  /**
   * @param descripcion the descripcion to set
   */
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  /**
   * @return the estado
   */
  public boolean isEstado() {
    return estado;
  }

  /**
   * @param estado the estado to set
   */
  public void setEstado(boolean estado) {
    this.estado = estado;
  }

  /**
   * @return the impuesto
   */
  public double getImpuesto() {
    return impuesto;
  }

  /**
   * @param impuesto the impuesto to set
   */
  public void setImpuesto(double impuesto) {
    this.impuesto = impuesto;
  }

  /**
   * @return the precioVenta
   */
  public double getPrecioVenta() {
    return precioVenta;
  }

  /**
   * @param precioVenta the precioVenta to set
   */
  public void setPrecioVenta(double precioVenta) {
    this.precioVenta = precioVenta;
  } 
    
}
