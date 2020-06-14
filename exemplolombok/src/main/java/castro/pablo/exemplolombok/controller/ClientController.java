package castro.pablo.exemplolombok.controller;

import castro.pablo.exemplolombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ClientController {
    @GetMapping("/client")
    public Client getCliente() {

        Client client = new Client();
        client.setName("Pablo");
        client.setLastName("Castro");
        client.setAge(17);
        return client;

    }
    @GetMapping("/clients")
    public ArrayList<Client> getClientes() {

        ArrayList<Client> clients = new ArrayList<>();

        Client client = new Client();
        client.setName("Pablo");
        client.setLastName("Castro");
        client.setAge(17);

        Client client1 = new Client();
        client1.setName("Josney");
        client1.setLastName("Silva sauro");
        client1.setAge(25);
        clients.add(client);
        clients.add(client1);

        return clients;
    }
}
