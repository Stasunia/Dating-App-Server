package com.stas.server.logic;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stas.server.dal.IUsersDal;
import com.stas.server.data.SuccessfulLoginData;
import com.stas.server.data.UserLoginData;
import com.stas.server.entities.User;
import com.stas.server.utils.JWTUtils;
import com.stas.server.exceptions.ServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLogic {
    private IUsersDal iUsersDal;


    @Autowired
    public UserLogic(IUsersDal iUsersDal) {
        this.iUsersDal = iUsersDal;

    }

    public void createUser(User user) throws ServerException {
        iUsersDal.save(user);
    }

    public String login(UserLoginData loginDetails)throws Exception {
        SuccessfulLoginData successfulLoginData = iUsersDal.createLogin(loginDetails.getEmail(), loginDetails.getPassword());
        if (successfulLoginData == null) {
            throw new Exception("Failed to login");
        }
        ObjectMapper objectMapper = new ObjectMapper();
        String token = JWTUtils.createJWT(successfulLoginData);
        return token;

    }

    public User getUser(long id) {

        return iUsersDal.findById(id).get();
    }
}
