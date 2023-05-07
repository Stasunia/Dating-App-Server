package com.stas.server.dal;


import com.stas.server.data.SuccessfulLoginData;
import com.stas.server.entities.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUsersDal extends CrudRepository<User, Long> {

    @Query("SELECT new com.stas.server.data.SuccessfulLoginData(u.id,  u.type ) " +
            " FROM User u  " +
            " WHERE u.email = :email and u.password = :password")
    SuccessfulLoginData createLogin(@Param("email") String email, @Param("password") String password);




}


