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
		
		@Column (name = "nombre_dpt")
		private int nombre_dpt;
		@Column (name = "numero_dpt")
		private int numero_dpt;
		@Column (name ="dni_director")
		private int dni_director;
		@Column (name ="fech_ingre_direct")
		private int fech_ingre_direct;
		
		public Departamento () {}

		public Departamento(int nombre_dpt, int numero_dpt, int dni_director, int fech_ingre_direct) {
			super();
			this.nombre_dpt = nombre_dpt;
			this.numero_dpt = numero_dpt;
			this.dni_director = dni_director;
			this.fech_ingre_direct = fech_ingre_direct;
		}

		public int getNombre_dpt() {
			return nombre_dpt;
		}

		public void setNombre_dpt(int nombre_dpt) {
			this.nombre_dpt = nombre_dpt;
		}

		public int getNumero_dpt() {
			return numero_dpt;
		}

		public void setNumero_dpt(int numero_dpt) {
			this.numero_dpt = numero_dpt;
		}

		public int getDni_director() {
			return dni_director;
		}

		public void setDni_director(int dni_director) {
			this.dni_director = dni_director;
		}

		public int getFech_ingre_direct() {
			return fech_ingre_direct;
		}

		public void setFech_ingre_direct(int fech_ingre_direct) {
			this.fech_ingre_direct = fech_ingre_direct;
		}

		@Override
		public String toString() {
			return "Departamento [nombre_dpt=" + nombre_dpt + ", numero_dpt=" + numero_dpt + ", dni_director="
					+ dni_director + ", fech_ingre_direct=" + fech_ingre_direct + "]";
		}
		
		

	}

