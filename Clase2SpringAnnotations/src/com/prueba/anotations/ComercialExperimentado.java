package com.prueba.anotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.interfaces.CreacionInformesFinancieros;
import com.interfaces.IEmpleados;

//registramos el bean en el contenedor ,no es necesario que el id coincida con el nombre de 
//la clase y podemos prescindir de indicar explicitamente un id al componente , si lo 
//omitimos Spring tomaria como id el nombre de la clase pero con la primer letra en minuscula 
@Component("comercialExperimentado")

//Demo @Scope , lo modificamos para utilizar el patron prototype y que spring sea 
//capaz de generar varias instancias de un objeto
//@Scope("prototype")
public class ComercialExperimentado implements IEmpleados {

	private CreacionInformesFinancieros informeNuevo;

	/*
	 * Creamos un constructor para que a traves de este pueda inyectarse la
	 * dependencia , si comentamos la anotacion @Autowired todo seguira funcionando
	 * , es la ultimas versiones de Srping no es necesario utilizarlo , pero si es
	 * RECOMENDABLE
	 */
	@Autowired
	public ComercialExperimentado(CreacionInformesFinancieros informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		return "Soy un Super Vendedor y me encargo de hacerle ganar plata a la empresa";
	}

	@Override
	public String getinforme() {
		// utilizamos el metodo getInformeFinanciero() de la interface mediante la
		// inyeccion de dependencias
		return informeNuevo.getInformeFinanciero();
	}

	// ejcucion de codigo despues de la creacion o construccion del bean
	@PostConstruct
	public void ejecutarDespuesCracion() {
		System.out.println("ejecutamois este proceso tras la creacion de nuestro bean en el " + " containner");
	}

	// ejecucion de codigo despues del apagado del contenedor de spring
	@PreDestroy
	public void ejecutarAntesDestruccion() {
		System.out.println("Ejecutamos este procedimiento antes de la destruccion ");
	}
}
