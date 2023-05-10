package com.stas.server.controllers;

import com.stas.server.data.UserLoginData;
import com.stas.server.dto.ClientDTO;
import com.stas.server.entities.Client;
import com.stas.server.entities.User;
import com.stas.server.enums.Gender;
import com.stas.server.exceptions.ServerException;
import com.stas.server.logic.ClientLogic;
import com.stas.server.logic.UserLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private ClientLogic clientLogic;
//    aa

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

    @GetMapping("/byAge&byGender")
    public List<ClientDTO> getClientByGender(@PathVariable ("gender")Gender gender, @PathVariable("age") byte age) throws ServerException{
        return  this.clientLogic.getClientByGender(age, gender);
    }

}
