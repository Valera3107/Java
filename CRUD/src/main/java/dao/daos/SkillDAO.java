package dao.daos;

import model.Skill;

import java.util.List;

public interface SkillDAO {
  Skill create(Skill skill);

  Skill read(int id);

  void update(int id, Skill skill);

  void delete(int id);

  List<Skill> getAllSkills();
}
