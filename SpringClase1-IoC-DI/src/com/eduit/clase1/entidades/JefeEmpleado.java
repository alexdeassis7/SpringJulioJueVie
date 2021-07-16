package com.eduit.clase1.entidades;

import com.eduit.clase1.interfaces.IEmpleados;

public class JefeEmpleado implements IEmpleados {

	@Override // sobreescribo el metodo abstracto de la interface
	public String getTareas() {
		return "Soy un JefeEmpleado, me encargo de controlar y hacer que se realicen las " + "tareas ....";
	}

	@Override
	public String getInforme() {
		return "";
	}

}
