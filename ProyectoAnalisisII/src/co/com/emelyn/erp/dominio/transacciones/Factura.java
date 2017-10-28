/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.emelyn.erp.dominio.transacciones;

import co.com.emelyn.erp.dominio.cliente.Cliente;
import co.com.emelyn.erp.dominio.configuracion.Usuario;
import java.util.Date;

/**
 *
 * @author agonzalez
 */
public class Factura {
    
  /** codigo de la Factura. */
  private String codigo;
  
  /** fecha de la Factura. */
  private Date fecha;
  
  /** cliente de la Factura. */
  private Cliente cliente;
  
  /** vendedor de la Factura. */
  private Usuario vendedor;
  
    /** descuentoEncabezado de la Factura. */
  private double descuentoEncabezado;
  
    /** detalles de la Factura. */
  private DetallesPedido[] detalles;
  
    /** totalBruto de la Factura. */
  private double totalBruto;
  
    /** totalDescuentos de la Factura. */
  private double totalDescuentos;
  
    /** totalImpuestos de la Factura. */
  private double totalImpuestos;
  
    /** valorTotal de la Factura. */
  private double valorTotalFactura;
  
  /** pedidoRelacionado a la Factura. */
  private Pedido pedidoRelacionado;
  

  
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
    }

    public double getDescuentoEncabezado() {
        return descuentoEncabezado;
    }

    public void setDescuentoEncabezado(double descuentoEncabezado) {
        this.descuentoEncabezado = descuentoEncabezado;
    }

    public DetallesPedido[] getDetalles() {
        return detalles;
    }

    public void setDetalles(DetallesPedido[] detalles) {
        this.detalles = detalles;
    }

    public double getTotalBruto() {
        return totalBruto;
    }

    public void setTotalBruto(double totalBruto) {
        this.totalBruto = totalBruto;
    }

    public double getTotalDescuentos() {
        return totalDescuentos;
    }

    public void setTotalDescuentos(double totalDescuentos) {
        this.totalDescuentos = totalDescuentos;
    }

    public double getTotalImpuestos() {
        return totalImpuestos;
    }

    public void setTotalImpuestos(double totalImpuestos) {
        this.totalImpuestos = totalImpuestos;
    }

    public double getValorTotalFactura() {
        return valorTotalFactura;
    }

    public void setValorTotalFactura(double valorTotalFactura) {
        this.valorTotalFactura = valorTotalFactura;
    }

    public Pedido getPedidoRelacionado() {
        return pedidoRelacionado;
    }

    public void setPedidoRelacionado(Pedido pedidoRelacionado) {
        this.pedidoRelacionado = pedidoRelacionado;
    }
  
    
}
