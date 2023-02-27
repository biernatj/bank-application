package com.training.model;

import java.util.List;

public class Bank {

    List<Client> clients;

    public void addClient(Client client) throws ClientExistsException {
        if(clientExists(client))
            throw new ClientExistsException();
        clients.add(client);
    }

    public boolean clientExists(Client client) {
        for(Client currentClient : clients) {
            if(currentClient.getName().equals(client.getName())) return true;
        }
        return false;
    }

    public List<Client> getClients() {
        return clients;
    }

}
