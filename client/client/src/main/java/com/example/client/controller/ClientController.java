package com.example.client.controller;


import org.springframework.web.bind.annotation.RestController;
import com.example.client.dao.clientDao;
import com.example.client.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private clientDao clientDao;


    @GetMapping(value="Clients")

    public List<Client> clientList(){

        return clientDao.findAll();
    }


    @GetMapping(value="Clients/{id}")
    public Client afficherClient(@PathVariable int id){

        return clientDao.findById(id);
    }

    @PostMapping("Clients")
    public void addClient(@RequestBody Client client ) {
       clientDao.save(client);

    }

    @DeleteMapping("Clients/{id}")
    public  List<Client> deleteClient(@PathVariable int id ){
        clientDao.deleteById(id);
        return clientDao.findAll();

    }


    @PutMapping("Clients")
    public void modifyclient(@RequestBody Client client ) {
        clientDao.deleteById(client.getId());
        clientDao.save(client);

    }
}
