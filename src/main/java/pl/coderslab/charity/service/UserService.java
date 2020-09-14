package pl.coderslab.charity.service;

import pl.coderslab.charity.model.User;

import java.util.List;

public interface UserService {

    User findUserByUsername(String username);

    User findUserById(Long id);

    List<User> findAllUsers();

    void saveUser(User user);
}
