package myApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import myApp.dao.UserDAO;
import myApp.model.User;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> getAllUser() {
        return userDAO.getAllUser();
    }

    @Override
    public void add(User user) {
        userDAO.add(user);
    }

    @Override
    public void edit(User user) {
        userDAO.edit(user);
    }

    @Override
    public User getById(long id) {
        return userDAO.getById(id);
    }

    @Override
    public void update(long id,User user){
        userDAO.update(id,user);
    }
    @Override
    public void remove(long id) {
        userDAO.remove(id);
    }
}
