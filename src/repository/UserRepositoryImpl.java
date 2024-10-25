package repository;

import model.User;
import utils.MyArrayList;
import utils.MyList;

/**
* @author Sergey Bugaenko
* {@code @date} 25.10.2024
*/

public class UserRepositoryImpl implements UserRepository {

    private final MyList<User> users;

    public UserRepositoryImpl() {
        users = new MyArrayList<>();
    }

    @Override
    public User addUser(String email, String password) {
       User user = new User(email, password);
       users.add(user);
       return user;
    }

    @Override
    public boolean isEmailExists(String email) {
        return false;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }
}
