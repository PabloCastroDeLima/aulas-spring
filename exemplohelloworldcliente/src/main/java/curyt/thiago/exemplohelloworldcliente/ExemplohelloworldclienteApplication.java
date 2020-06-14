package curyt.thiago.exemplohelloworldcliente;

import curyt.thiago.exemplohelloworldcliente.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemplohelloworldclienteApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExemplohelloworldclienteApplication.class, args);

		//objeto 1
		Client client = new Client();
		client.setName("Thiago");
		client.setLastName("Cury");
		System.out.println(client);

		//objeto 2
		Client client1 = new Client("Ze", "Silva");
		System.out.println(client1);

		//objeto 3
		System.out.println(new Client("Joao", "Mendes", 1000.0));

	}

}
