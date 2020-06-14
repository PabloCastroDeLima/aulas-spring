package castro.pablo.exemploinjecaodependencia;

import castro.pablo.exemploinjecaodependencia.Model.Cat;
import castro.pablo.exemploinjecaodependencia.Model.Dog;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ExemploinjecaodependenciaApplication {

	public static void main(String[] args) {
		//3 maneira
		ConfigurableApplicationContext applicationContext = SpringApplication.run(ExemploinjecaodependenciaApplication.class, args);;
		;
		Pet pet = (Pet) applicationContext.getBean(Pet.class);
		pet.execute();



//		1 maneira
//		Pet pet = new Pet
//		pet.execute


//		2 maneiera
//		Pet pet = new Pet(new Cat());
//		pet.execute();
//
//		Pet pet1 = new Pet(new Dog());
//		pet.execute();



	}

}
