package com.stas.server.dal;

import com.stas.server.dto.ClientDTO;
import com.stas.server.entities.Client;
import com.stas.server.enums.Gender;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IClientDal extends CrudRepository<Client, Long> {



   @Query("SELECT new com.stas.server.dto.ClientDTO(cl.name, cl.age, cl.gender, cl.description, cl.cityOfResidence, cl.hobbies) "
           + " FROM Client cl WHERE cl.gender= :gender AND cl.age BETWEEN  :lowAge AND :highAge ")
   List<ClientDTO> matchByAge(@Param("lowAge") byte lowAge, @Param("highAge") byte highAge, @Param("gender") Gender gender);
}
