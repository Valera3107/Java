package dao.daos;

import model.Developer;

import java.sql.SQLException;
import java.util.List;

public interface DeveloperDAO {
  Developer create(Developer dev) throws SQLException;

  Developer read(int id);

  void update(int id, Developer dev);

  void delete(int id);

  List<Developer> getAllDevelopers();
}
