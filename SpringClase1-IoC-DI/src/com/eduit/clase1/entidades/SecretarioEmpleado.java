package com.eduit.clase1.entidades;

import com.eduit.clase1.interfaces.CreacionInformes;
import com.eduit.clase1.interfaces.IEmpleados;

public class SecretarioEmpleado implements IEmpleados {

	private CreacionInformes informeNuevo;

	@Override
	public String getTareas() {
		return "Soy un SecretarioEmpleado y me gusta obedecer lo que me indica "
				+ "mi superior , tambien me encargo de gestionar su Agenda de Meetings";
	}

	@Override
	public String getInforme() {
		return "";
	}

	// generamos un Setters para utilizar la inyeccion de dependencias mediante el
	// tag
	// property dentro del .xml
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

}
