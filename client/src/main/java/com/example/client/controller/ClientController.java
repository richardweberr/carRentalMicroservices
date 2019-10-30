package com.example.client.controller;

import com.example.client.dao.clientDao;
import com.example.client.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private clientDao clientDao;

    @GetMapping(value = "clients")
    public List<Client> clientList() {
        return clientDao.findAll();
    }

    @GetMapping(value = "client/{id}")
    public Client showClient(@PathVariable int id) {
        return clientDao.findById(id);
    }

    @PostMapping("client")
    public void addClient(@RequestBody Client client) {
        clientDao.save(client);
    }

    @PutMapping("client")
    public void modifyClient(@RequestBody Client client) {
        clientDao.deleteById(client.getId());
        clientDao.save(client);
    }

    @DeleteMapping("client/{id}")
    public List<Client> deleteClient(@PathVariable int id) {
        clientDao.deleteById(id);
        return clientDao.findAll();
    }
}
