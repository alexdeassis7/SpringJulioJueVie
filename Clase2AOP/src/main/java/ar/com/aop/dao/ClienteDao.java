package ar.com.aop.dao;

import org.springframework.stereotype.Component;

//esta clase debe funcionar a modo componente
//utilizamos la Anotation @component y le definimos un id "clienteDAO"
@Component("clienteDAO")//registramos la clase en el containner de Spring 
//podemos prescindir de darle un nombre o un id al componente , en ese caso Spring 
//tomaria como id al nombre de la clase pero con la primer letra en minuscula ,
//entoncres se vuelve muy importante escribir bien el nombre de nuestras clases , para 
//no tener problemas luego a la hora de solicitar nuestros beans 

public class ClienteDao {

	// antes de ejecutar este metodo por detras y de manera automatica se
	// deberia ejecutar el aspecto ("LoginConAspectos") que comprueba que el
	// user esta logueado y que el login es el correcto (osea que tiene los roles
	// necesarios para hacer un insert en la DB)
	public void insertaCliente() {
		// aqui estaria el codigo de insercion en la DB , como la idea de esta demo
		// es ver AOP solamente nos vamos a imaginar que efectivamente este
		// metodo inserto un cliente
		System.out.println("Se inserto el cliente en la base de datos correctamente");
	}
}
