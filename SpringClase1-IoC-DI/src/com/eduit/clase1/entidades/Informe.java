package com.eduit.clase1.entidades;

import com.eduit.clase1.interfaces.CreacionInformes;

public class Informe implements CreacionInformes {

	@Override
	public String getInforme() {
		
		return "Esto es un Informe detallado , para la demo de Inyeccion de Dependencias,"
				+ " y esta es una caracteristica que tienen en comun todas las entidades"
				+ " De nuestra app (Jefe , Secretario , Director ....)";
	}

}
