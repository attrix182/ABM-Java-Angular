package abm.service;

import java.util.List;

import abm.entity.User;

public interface UserService {

    public List<User> findAll();

    public User findById(int id);

    public void save(User user);

    public void deleteById(int id);
    
}
