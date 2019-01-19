package dao.daos;

import model.Project;

import java.util.List;

public interface ProjectDAO {
  Project create(Project project);

  Project read(int id);

  void update(int id, Project project);

  void delete(int id);

  List<Project> getAllProjects();
}
