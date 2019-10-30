package com.example.client.dao;

import com.example.client.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface clientDao extends JpaRepository<Client, Integer> {
    Client findById(int id);

    Client deleteById(int id);
}
