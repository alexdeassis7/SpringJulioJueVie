package ar.com.aop.aspectos;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//esta clase sera nuestro aspecto 
//y contendra esa funcionalida transversal que tiene que ejecutarse siempre
@Component // indicamos que es un componente
@Aspect // indicamos que esta clase es un aspecto
public class LoginConAspectos {
	// Utilizamos before para que se ejecute ANTES del metodo insertaCliente()
	// que pasa si tengo mas de un metodo con este nombre en distintas clases?
	// hagamos la prueba : el aspecto se va a ejecutar SIEMPRE ya que no hace
	// distinciones de nombres de clase
	// que pas si quiero que solo se ejecute este aspecto para
	// ClienteVIPDAO()???????????
	// para ello debemos incluir la ruta en la annotation @Before

	// y si quiero que se ejecute el aspecto para todos los metodos que comienzan
	// con la palabra inserta....*()
	// utilizamos un asterisco para crear el pointCut

//	@Before("execution(public void insertaCliente())")
//	@Before("execution(public void ar.com.aop.dao.ClienteVIPDAO.insertaCliente())") //pointCut
	@Before("execution(public void inserta*())")
	public void antesInsertarCliente() {
		System.out.println("Se comprobo y el usuario esta logueado !");
		System.out.println("Se comprobo Role/Perfil del user logueado y es el correcto osea que puede "
				+ "realizar operaciones CRUD en las tablas de la DB");
	}

	// esta anotacion ejecuta un advice despues de la ejecucion del pointCut
	// Especificado ,
	// siempre que el metodo del punto de corte "retorne de forma normal" (normal :
	// sin lanzar exceptions)
	@AfterReturning("execution(public void insertaCliente())")
	public void despuesDeInsertaCliente() {
		System.out.println("Este metodo se ejecuta despues de insertar un cliente()");
	}

	@AfterThrowing(pointcut = "execution(public * insertaClienteVIPConError())", throwing = "daoe")
	public void logException(Exception daoe) {
		System.out.println("sucedio un Error en el metodo insertaClienteVIPConError() y por eso me acabo de ejecutar ");
		System.out.println("Aqui podemos ademas de guardar un log disparar una alerta al area de monitoreo que verifiquen"
				+ " a que se debe este fallo ");
	}

}
