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
public class DetallesPedido {
    
  /** codigo del encabezado del pedido. */
  private String codigoPedido;
  
    /** codigo del detalle. */
  private String codigoDetalle;
  
    /** prodcuto del detalle del pedido. */
  private Producto prodcuto;
  
  /** cantidad del detalle del pedido. */
  private int cantidad;
  
  /** precioUnitario  del detalle del pedido. */
  private double precioUnitario;
  
    /** descuento  del detalle del pedido. */
  private double descuentoDetalle;
  
    /** valor del descuento  del detalle del pedido. */
  private double valordescuentoDetalle;
  
    /** precioTotal  del detalle del pedido. */
  private double precioTotal;

  
    public String getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
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
