package myApp.dao;

import org.springframework.stereotype.Repository;
import myApp.model.User;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserImpDao implements UserDAO {

    @PersistenceContext()
    private EntityManager entityManager;


    @Override
    public List<User> getAllUser() {
        return entityManager.createQuery(
                "from User", User.class).getResultList();
    }

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public void edit(User user) {
      entityManager.merge(user);
    }

    @Override
    public User getById(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void update(long id,User user) {
        User newUser = getById(id);
        newUser.setFirstName(user.getFirstName());
        newUser.setEmail(user.getEmail());
        newUser.setAge(user.getAge());
    }

    @Override
    public void remove(long id) {
        User user = getById(id);
        if (user != null) {
            entityManager.remove(user);
        } else {
            System.out.println("There is no such user");
        }
    }
}
