package ar.com.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
//clase qeu configura a spring para que sepa que vamos a utilizar AOP e indicarle
//en donde debe buscar las clases con los aspectos 

@Configuration // indicamos que esta clase es un archivo de conf
@EnableAspectJAutoProxy // habilitamos la configuracion de programacion orientada a aspectos
@ComponentScan("ar.com.aop") // le indicamos a spring a donde ir a buscar los aspectos , esto
//buscara en el paquete raiz y los paquetes subyacentes
public class Configuracion {
	// esta clase no necesita llevar código en su interior
}
