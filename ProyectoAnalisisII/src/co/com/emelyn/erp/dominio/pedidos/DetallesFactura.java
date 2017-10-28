/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.emelyn.erp.dominio.pedidos;

import co.com.emelyn.erp.dominio.configuracion.Producto;

/**
 *
 * @author agonzalez
 */
public class DetallesFactura {
    
  /** codigo del encabezado de la Factura. */
  private String codigoFactura;
  
    /** codigo de la Factura. */
  private String codigoDetalle;
  
    /** prodcuto del detalle de la Factura. */
  private Producto prodcuto;
  
  /** cantidad del detalle de la Factura. */
  private int cantidad;
  
  /** precioUnitario  del detalle de la Factura. */
  private double precioUnitario;
  
    /** descuento  del detalle de la Factura. */
  private double descuentoDetalle;
  
    /** valor del descuento  del detalle de la Factura. */
  private double valordescuentoDetalle;
  
    /** precioTotal  del detalle de la Factura. */
  private double precioTotal;

  
    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public String getCodigoDetalle() {
        return codigoDetalle;
    }

    public void setCodigoDetalle(String codigoDetalle) {
        this.codigoDetalle = codigoDetalle;
    }

    public Producto getProdcuto() {
        return prodcuto;
    }

    public void setProdcuto(Producto prodcuto) {
        this.prodcuto = prodcuto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getDescuentoDetalle() {
        return descuentoDetalle;
    }

    public void setDescuentoDetalle(double descuentoDetalle) {
        this.descuentoDetalle = descuentoDetalle;
    }

    public double getValordescuentoDetalle() {
        return valordescuentoDetalle;
    }

    public void setValordescuentoDetalle(double valordescuentoDetalle) {
        this.valordescuentoDetalle = valordescuentoDetalle;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
  
  

  
    
}
