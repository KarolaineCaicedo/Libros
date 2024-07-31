package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table (name ="factura_detalle")


public class FacturaDetalle {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	@Column (name = "idFacturaDetalle")
	private int idFacturaDetalle;
	@Column (name = "cantidad")
	private int cantidad;
	@Column (name = "subtotal")
	private double subtotal;
	@Column (name ="idFactura")
	private int idFactura;
	@Column (name ="idLibro")
	private int idLibro;
	
	public FacturaDetalle() {}
	public FacturaDetalle(int idFacturaDetalle, int cantidad, Float subtotal, int idFactura, int idLibro) {
		
		this.idFacturaDetalle = idFacturaDetalle;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.idFactura = idFactura;
		this.idLibro = idLibro;
	}
	public int getIdFacturaDetalle() {
		return idFacturaDetalle;
	}
	public void setIdFacturaDetalle(int idFacturaDetalle) {
		this.idFacturaDetalle = idFacturaDetalle;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Float subtotal) {
		this.subtotal = subtotal;
	}
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	@Override
	public String toString() {
		return "FacturaDetalle [idFacturaDetalle=" + idFacturaDetalle + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", idFactura=" + idFactura + ", idLibro=" + idLibro + "]";
	}
	
	
	

}
