package com.prueba.anotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.interfaces.IEmpleados;

public class DemoUsoAnotaciones {

	public static void main(String[] args) {
		// leemos nuestro archivo xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// solicitamos el bean al contexto
		IEmpleados comercialMarce = contexto.getBean("comercialExperimentado", IEmpleados.class);
		IEmpleados comercialJesus = contexto.getBean("comercialExperimentado", IEmpleados.class);

		if (comercialMarce == comercialJesus) {
			System.out.println("Direcciones de memoria ");
			System.out.println("Singleton : apuntan al mismo objeto en memoria");
			System.out.println(comercialMarce + "\n" + comercialJesus);
		} else {
			System.out.println(
					"Prototype :  NOOO apuntan al mismo lugar de la memoria , son" + " dos instancias diferentes");
			System.out.println(comercialMarce + "\n" + comercialJesus);
		}

//		/utilizamos el bean previamente solicitado 
		System.out.println(comercialMarce.getTareas());
		System.out.println(comercialMarce.getinforme());

		// liberamos recursos
		contexto.close();

	}
}
