package dev.yashshekhar.springsecurityclient.service;

import dev.yashshekhar.springsecurityclient.entity.User;
import dev.yashshekhar.springsecurityclient.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);

    void saveVerificationTokenForUser(String token, User user);

    String validateVerificationToken(String token);
}
