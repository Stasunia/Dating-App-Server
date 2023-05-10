package com.stas.server.logic;

import com.stas.server.dal.IClientDal;
import com.stas.server.dal.IUsersDal;
import com.stas.server.dto.ClientDTO;
import com.stas.server.entities.Client;
import com.stas.server.entities.User;
import com.stas.server.enums.Gender;
import com.stas.server.exceptions.ServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientLogic {
  private IClientDal iClientDal;
// mm

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

  public List<ClientDTO> getClientByGender(byte age, Gender gender) {
    byte lowAge = (byte)(age-10);
    byte highAge = (byte)(age+10);
    Gender genderForMatching;
    if(gender == Gender.MALE){
      genderForMatching = Gender.FEMALE;
    }else{
      genderForMatching = Gender.MALE;
    }
    return iClientDal.matchByAge(lowAge,highAge,genderForMatching);
  }
}
