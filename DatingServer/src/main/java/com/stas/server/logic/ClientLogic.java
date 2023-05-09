package com.stas.server.logic;

import com.stas.server.dal.IClientDal;
import com.stas.server.dal.IUsersDal;
import com.stas.server.entities.Client;
import com.stas.server.entities.User;
import com.stas.server.exceptions.ServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientLogic {
  private IClientDal iClientDal;


  @Autowired
  public ClientLogic(IClientDal iClientDal) {
    this.iClientDal = iClientDal;

  }

  public void createClient(Client client) throws ServerException {
    iClientDal.save(client);
  }

  public Client getClient( long id)throws ServerException{
    return iClientDal.findById(id).get();
  }
}
