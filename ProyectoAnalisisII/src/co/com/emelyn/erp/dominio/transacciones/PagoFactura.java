/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.emelyn.erp.dominio.transacciones;

import co.com.emelyn.erp.dominio.configuracion.Caja;
import java.util.Date;

/**
 *
 * @author agonzalez
 */
public class PagoFactura {
    
  /** codigo de la factura. */
  private String codigoFactura;
  
  /** fecha del pago de la factura. */
  private Date fecha;
  
  /** caja donde se registra el pago de la factura. */
  private Caja caja;
  
  /** medioDePago del Pago. */
  private String medioDePago;
  
  /** medioDePago con tarjeta en el Pago. */
  private String tarjeta;
  
  /** cuenta Bancaria del medio de  Pago. */
  private String cuentaBancaria;
  
  /** nroAprobacion del medio de  Pago. */
  private String nroAprobacion;
  
  /** valor del Pago. */
  private double valorPago;

  
    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public String getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(String medioDePago) {
        this.medioDePago = medioDePago;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getNroAprobacion() {
        return nroAprobacion;
    }

    public void setNroAprobacion(String nroAprobacion) {
        this.nroAprobacion = nroAprobacion;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }
    
  
 
}
