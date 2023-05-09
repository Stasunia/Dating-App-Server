package com.stas.server.controllers;

import com.stas.server.data.UserLoginData;
import com.stas.server.entities.Client;
import com.stas.server.entities.User;
import com.stas.server.exceptions.ServerException;
import com.stas.server.logic.ClientLogic;
import com.stas.server.logic.UserLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/clients")
public class ClientController {

    private ClientLogic clientLogic;

    @Autowired
    public ClientController(ClientLogic clientLogic) {
      this.clientLogic = clientLogic;
    }

    @PostMapping
    public void addClient(@RequestBody Client client) throws ServerException {
      clientLogic.createClient(client);
    }

    @GetMapping("{clientId}")
  public Client getClient(@PathVariable ("clientId") long id) throws ServerException{
      return  this.clientLogic.getClient(id);
    }
}
