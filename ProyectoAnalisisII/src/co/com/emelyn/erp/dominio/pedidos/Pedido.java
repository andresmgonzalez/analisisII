/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.emelyn.erp.dominio.pedidos;

import co.com.emelyn.erp.dominio.cliente.Cliente;
import co.com.emelyn.erp.dominio.configuracion.Usuario;
import java.util.Date;

/**
 *
 * @author agonzalez
 */
public class Pedido {
    
  /** codigo del Pedido. */
  private String codigo;
  
  /** fecha del Pedido. */
  private Date fecha;
  
  /** cliente del Pedido. */
  private Cliente cliente;
  
  /** vendedor del Pedido. */
  private Usuario vendedor;
  
    /** descuentoEncabezado del Pedido. */
  private double descuentoEncabezado;
  
    /** detalles del Pedido. */
  private DetallesPedido[] detalles;
  
    /** totalBruto del Pedido. */
  private double totalBruto;
  
    /** totalDescuentos del Pedido. */
  private double totalDescuentos;
  
    /** totalImpuestos del Pedido. */
  private double totalImpuestos;
  
    /** valorTotal del Pedido. */
  private double valorTotalPedido;

  
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

    public double getValorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(double valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }
  
  
  
  
  
    
}
