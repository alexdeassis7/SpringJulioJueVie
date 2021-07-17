package ar.com.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ar.com.aop.dao.ClienteDao;
import ar.com.aop.dao.ClienteVIPDAO;

public class ClasePrincipal {

	public static void main(String[] args) {
		// leemos la configuracion de Spring
		// indicandole en el constructor cual es la clase que posee la config

		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);

		ClienteDao miCliente = contexto.getBean("clienteDAO", ClienteDao.class);
		ClienteVIPDAO miClienteVIP = contexto.getBean("clienteVIPDAO", ClienteVIPDAO.class);

		// llamamos al metodo
		System.out.println("****************************** miCliente.insertaCliente() ****************************");
		miCliente.insertaCliente();// este es el nombre del metodo que debe coincidir con la anotacion @Before

		System.out.println("****************************** miClienteVIP.insertaCliente() ****************************");
		miClienteVIP.insertaCliente();// llamamos a un metodo de otra clase que tiene el mismo nombre que en la clase
										// clienteDAO

		System.out.println(
				"****************************** miClienteVIP.insertaClienteVIP() ****************************");
		miClienteVIP.insertaClienteVIP();

		System.out.println(
				"****************************** miClienteVIP.insertaClienteVIPConError() ****************************");

		try {
			miClienteVIP.insertaClienteVIPConError();
		} catch (Exception e) {
			System.out.println("Se capturo Una Exception en la ejecucion del metodo insertaClienteVIPConError()");
		}

		contexto.close();
	}

}
