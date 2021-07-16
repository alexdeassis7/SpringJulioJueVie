package com.eduit.clase1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eduit.clase1.entidades.JefeEmpleado;
import com.eduit.clase1.entidades.SecretarioEmpleado;
import com.eduit.clase1.interfaces.IEmpleados;

public class DemoUsoEmpleado {

	public static void main(String[] args) {
		// creamos objetos de tipo Empleado

		JefeEmpleado e1 = new JefeEmpleado();

		// me creo una referencia a la abstraccion
		IEmpleados e2 = new JefeEmpleado();
		IEmpleados e3 = new SecretarioEmpleado();

		// uso de los objetos creados

		System.out.println("empleado e1 :" + e1.getTareas());
		System.out.println("empleado e2 :" + e2.getTareas());
		System.out.println("empleado e3 :" + e3.getTareas());

		// Ahora realizamos lo mismo pero con el contenedor de Spring
		System.out.println("Demo IOC Spring XML");

		// Paso 1 ) Cargar el xml de configuracion
		// primero creamos el contexto y le pasamos por parametro el nombre del archivo
		// con extension ".xml"
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Paso 2) solicitamos el beans al contenedor, enviandole por parametro el alias
		// o id
		// y en segundo lugar le enviamos el nombre de la abstraccion (interface)
		IEmpleados alex = contexto.getBean("miEmpleado", IEmpleados.class);

		// Paso 3) Utilizamos el objeto a gusto .....
		System.out.println("utilizamos le Bean : " + alex.getTareas());

		// Demo Inyeccion de dependecia : la ventaja de esto es que ahora podemos
		// reutilizarlo en otra clase como por ejemplo JefeEmpleado
		System.out.println("Utilizamos la inyeccion de dependecia : " + alex.getInforme());

		// Paso 4) cerramos el contexto y asi liberamos los recursos
		contexto.close();
	}
}
