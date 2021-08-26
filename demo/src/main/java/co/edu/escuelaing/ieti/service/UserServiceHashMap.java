package co.edu.escuelaing.ieti.service;

import co.edu.escuelaing.ieti.data.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceHashMap implements UserService{

    public HashMap<String, User> users = new HashMap<>();


    @Override
    public User create(User user) {
        users.put(user.getId(), user);
        return user;
    }

    @Override
    public User findById(String id) {
        return users.get(id);
    }

    @Override
    public List<User> all() {
        return new ArrayList<>(users.values());
    }

    @Override
    public void deleteById(String id) {
        users.remove(id);

    }

    @Override
    public User update(User user, String userId) {
        user.setId(userId);
        users.put(userId, user);
        return user;
    }
}
