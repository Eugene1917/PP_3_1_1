package myApp.dao;

import myApp.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUser();
    void add(User user);
    void edit(User user);
    User getById(long id);
    void update(long id,User user);
    void remove(long id);
}
