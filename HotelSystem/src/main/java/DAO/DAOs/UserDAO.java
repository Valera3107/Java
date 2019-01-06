package DAO.DAOs;

import Model.User;
import com.sun.tools.javac.util.List;

public interface UserDAO<T extends User> {
  boolean addNewUser();

  boolean deleteUserById();

  List<T> getAllUsers();

  T getUserById();
}
