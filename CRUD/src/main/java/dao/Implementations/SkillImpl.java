package dao.Implementations;

import dao.daos.SkillDAO;
import model.Project;
import model.Skill;
import util.Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SkillImpl implements SkillDAO {
  public Skill create(Skill skill) {
    Connection connection = Utils.getConnection();
    PreparedStatement statement;

    if (getSkillID(skill.getLanguage(), connection) == -1)
      try {
        statement = connection.prepareStatement("INSERT INTO mydb.skills(language) values (?)");
        statement.setString(1, skill.getLanguage());
        statement.execute();
        System.out.println("Successfully added!");
        return skill;
      } catch (SQLException e) {
        e.printStackTrace();
      }

    return read(skill.getId());
  }

  private int getSkillID(String language, Connection connection) {
    try {
      PreparedStatement statement = connection.prepareStatement("SELECT id FROM mydb.skills WHERE language = ?");
      statement.setString(1, language);
      ResultSet result = statement.executeQuery();
      if (result.next()) return result.getInt(1);
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return -1;
  }

  public Skill read(int id) {
    try {
      Connection connection = Utils.getConnection();
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM mydb.skills WHERE id = ?");
      statement.setInt(1, id);
      ResultSet rs = statement.executeQuery();
      if (rs.next()) {
        int skID = rs.getInt(1);
        String language = rs.getString(2);
        Skill skill = new Skill(language);
        skill.setId(skID);
        return skill;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  public void update(int id, Skill skill) {
    Connection connection = Utils.getConnection();
    try {
      PreparedStatement statement = connection.prepareStatement("UPDATE mydb.skills SET language = ? WHERE id = ?");
      statement.setString(1, skill.getLanguage());
      statement.setInt(2, id);

      statement.executeUpdate();
      System.out.println("Successfully updated!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void delete(int id) {
    Connection connection = Utils.getConnection();
    try {
      PreparedStatement statement = connection.prepareStatement("DELETE  FROM mydb.developers_has_skills WHERE skills_id = ?");
      statement.setInt(1, id);
      statement.executeUpdate();
      statement = connection.prepareStatement("DELETE  FROM mydb.skills WHERE id = ?");
      statement.setInt(1, id);
      statement.executeUpdate();
      System.out.println("Successfully deleted!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void getDevelopersBySkill(Skill skill) {
    Connection connection = Utils.getConnection();
    List<Integer> list = new ArrayList<Integer>();
    try {
      PreparedStatement statement = connection.prepareStatement("SELECT developers_id FROM mydb.developers_has_skills WHERE skills_id = ?");
      statement.setInt(1, skill.getId());
      ResultSet rs = statement.executeQuery();
      while (rs.next()) list.add(rs.getInt(1));
      for (int i = 0; i < list.size(); i++) {
        statement = connection.prepareStatement("SELECT * FROM mydb.developers WHERE id = ?");
        statement.setInt(1, list.get(i));
        rs = statement.executeQuery();
        while (rs.next())
          System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  private void setSkilsOnDeveloper(Skill skill) {
    Connection connection = Utils.getConnection();
    try {
      PreparedStatement statement = connection.prepareStatement("SELECT developers_id FROM mydb.developers_has_skills WHERE skills_id = ?");
      statement.setInt(1, skill.getId());
      ResultSet rs = statement.executeQuery();
      while (rs.next()) skill.setDevelopers(rs.getInt(1));
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public List<Skill> getAllSkills() {
    List<Skill> list = new ArrayList<Skill>();
    Connection connection = Utils.getConnection();
    try {
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM mydb.skills");
      ResultSet rs = statement.executeQuery();
      while (rs.next()) {
        int id = rs.getInt(1);
        String language = rs.getString(2);
        Skill skill = new Skill(language);
        skill.setId(id);
        setSkilsOnDeveloper(skill);
        list.add(skill);
      }
      return list;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }
}
