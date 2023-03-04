package com.luxoft.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Bank {

    private final Set<Client> clients;

    public Bank() {
        this.clients = new HashSet<Client>();
    }

    public void addClient(Client client) throws ClientExistsException {
        if(clientExists(client))
            throw new ClientExistsException();
        clients.add(client);
    }

    public boolean clientExists(Client client) {
        return clients.contains(client);
    }

    public Set<Client> getClients() {
        return Collections.unmodifiableSet(clients);
    }

}
