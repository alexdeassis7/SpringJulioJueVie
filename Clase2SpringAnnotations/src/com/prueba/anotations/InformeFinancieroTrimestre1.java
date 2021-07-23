package com.prueba.anotations;

import org.springframework.stereotype.Component;
import com.interfaces.CreacionInformesFinancieros;

//esta clase es la dependencia de la clase "ComercialExperimentado"
//aca la registramos en el contenedor de Spring
@Component
public class InformeFinancieroTrimestre1 implements CreacionInformesFinancieros {

	@Override
	public String getInformeFinanciero() {
		return "Esta es la presentacion del informe financiero del primer trimestre del año";
	}

}
