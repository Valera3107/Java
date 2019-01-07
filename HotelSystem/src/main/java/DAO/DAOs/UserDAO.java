package DAO.DAOs;

import Model.User;
import java.util.List;

public interface UserDAO {
  boolean addNewUser();

  boolean deleteUserById();

  List<User> getAllUsers();

  User getUserById();
}
