package com.eduit.clase1.interfaces;

//Creamos una abstraccion
public interface IEmpleados {

	public String getTareas();

	// este metodo lo utilizaremos para la DI (Inyeccion de Dependencias)
	public String getInforme();
}
