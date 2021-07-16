package com.eduit.clase1.entidades;

import com.eduit.clase1.interfaces.CreacionInformes;
import com.eduit.clase1.interfaces.IEmpleados;

public class DirectorEmpleado implements IEmpleados {

	// creacion de atributo del tipo CreacionInformes (Interface)
	// para hacer uso de la inyeccion de dependencias
	private CreacionInformes informeNuevo;

	// creacion de un constructor que inyectara la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		// implementamos el metodo getInforme() de la interface
		return "Soy el Director Simour Skynner , y gestiono mi nomina de profesores";
	}

	@Override
	public String getInforme() {
		// Implementamos el metodo getInforme() de la interface
		return "Informe Creado por el Director Simour : " + informeNuevo.getInforme();
	}

}
