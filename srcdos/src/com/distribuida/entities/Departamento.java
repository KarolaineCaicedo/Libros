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
	@Table (name ="departamento")
	
	public class Departamento {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		@Column (name = "nombredpt")
		private int nombredpt;
		@Column (name = "numerodpt")
		private int numerodpt;
		@Column (name ="dndirector")
		private int dnidirector;
		@Column (name ="fechingredirect")
		private int fechingredirect;
		
		public Departamento () {}

		public Departamento(int nombredpt, int numerodpt, int dnidirector, int fechingredirect) {
			
			this.nombredpt = nombredpt;
			this.numerodpt = numerodpt;
			this.dnidirector = dnidirector; 
			this.fechingredirect = fechingredirect;
		}

		public int getNombredpt() {
			return nombredpt;
		}

		public void setNombredpt(int nombredpt) {
			this.nombredpt = nombredpt;
		}

		public int getNumerodpt() {
			return numerodpt;
		}

		public void setNumeropt(int numerodpt) {
			this.numerodpt = numerodpt;
		}

		public int getDnidirector() {
			return dnidirector;
		}

		public void setDnidirector(int dnidirector) {
			this.dnidirector = dnidirector;
		}

		public int getFechingredirect() {
			return fechingredirect;
		}

		public void setFechingredirect(int fechingredirect) {
			this.fechingredirect = fechingredirect;
		}

		@Override
		public String toString() {
			return "Departamento [nombredpt=" + nombredpt + ", numerodpt=" + numerodpt + ", dnidirector="
					+ dnidirector + ", fechingredirect=" + fechingredirect + "]";
		}
		
		

	}






