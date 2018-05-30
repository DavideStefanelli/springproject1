import com.sys.beans.Persona;
import com.sys.configuration.ConfigurationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationContext.class);

        Persona beanPersona = context.getBean(Persona.class);

        beanPersona.setNome("Davide");
        beanPersona.setCognome("Stefanelli");


        Persona persona = context.getBean(Persona.class);
        System.out.printf(persona.toString());


    }



}
