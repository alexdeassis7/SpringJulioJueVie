package ar.com.aop.dao;

import org.springframework.stereotype.Component;

@Component("clienteVIPDAO")
public class ClienteVIPDAO {

	// esta clase posee un metodo insertaCliente() con el mismo nombre que la clase
	// ClienteDAO
	public void insertaCliente() {
		// aqui estaria el codigo de insercion en la DB , como la idea de esta demo
		// es ver AOP solamente nos vamos a imaginar que efectivamente este
		// metodo inserto un cliente
		System.out.println("insertaCliente() Se inserto el cliente VIP en la DB exitosamente");
	}

	public void insertaClienteVIP() {
		// aqui estaria el codigo de insercion en la DB , como la idea de esta demo
		// es ver AOP solamente nos vamos a imaginar que efectivamente este
		// metodo inserto un cliente
		System.out.println("insertaClienteVIP() Se inserto el cliente VIPPPPP en la DB exitosamente");
	}
	
	public void insertaClienteVIPConError() throws Exception {
		// aqui estaria el codigo de insercion en la DB , como la idea de esta demo
		// es ver AOP solamente nos vamos a imaginar que efectivamente este
		// metodo inserto un cliente
		System.out.println("insertaClienteVIPConError()  Se inserto el cliente VIPPPPP en la DB exitosamente");
		throw new Exception();
	}

}
