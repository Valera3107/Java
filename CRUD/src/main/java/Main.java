import controller.DeveloperController;
import dao.Implementations.*;
import dao.daos.DeveloperDAO;
import model.*;

import java.util.List;

public class Main {

  public static void main(String[] args) {

//    Company company = new Company("Google", "10900");
//    CompanyImpl companyFunc = new CompanyImpl();
//    companyFunc.create(company);
//    Company readCompany1 = companyFunc.read(5);
//    Company readCompany2 = companyFunc.read(6);
//    readCompany1.setSize("1500");
//    companyFunc.delete(3);
//    companyFunc.update(4, readCompany1);
//    companyFunc.addProjectToTheCompany(readCompany2);
////    List<Company> allCompanies = companyFunc.getAllCompanies();
////    for (Company c : allCompanies
////         ) {
////      System.out.println(c);
////    }

    //====================================

//    CustomerImpl customerFunc = new CustomerImpl();
//    Customer customer = customerFunc.read(6);
//    customerFunc.create(customer);
//    System.out.println(customerFunc.read(3));
//    Customer customer1 = customerFunc.read(3);
//    customer1.setProfit(9999999);
//    customerFunc.update(3, customer1);
//    customerFunc.delete(1);
//    customerFunc.addProjectToCustomer(customer);
//    List<Customer> allCustomers = customerFunc.getAllCustomers();
//    for (Customer c : allCustomers
//         ) {
//      System.out.println(c);
//    }

    //=====================================

    //DeveloperImpl developerFunc = new DeveloperImpl();
    //Developer developer = new Developer("Donald","Senior", 5500);
    //developerFunc.create(developer);
    //Developer developer1 = developerFunc.read(7);
    //developerFunc.delete(3);
    //developerFunc.addSkill(developer1);
    //List<Developer> allDevelopers = developerFunc.getAllDevelopers();
    //for (Developer d : allDevelopers
      //   ) {
      //System.out.println(d);
    //}

    //=====================================

//    ProjectImpl projectFunc = new ProjectImpl();
    //Project project = new Project("Gamil.com", 1300300);
    //projectFunc.create(project);
//    Project project1 = projectFunc.read(6);
//    project1.setCost(999000);
//    projectFunc.update(6, project1);
//    projectFunc.addDeveloperOnProject(project1);
//    projectFunc.delete(5);
//    List<Project> allProjects = projectFunc.getAllProjects();
//    for (Project p: allProjects
//         ) {
//      System.out.println(p);
//    }

    //======================================

    SkillImpl skillFunc = new SkillImpl();
   // Skill skill = new Skill("Python");
    //skillFunc.create(skill);
    Skill skill1 = skillFunc.read(7);
    Skill skill2 = skillFunc.read(3);
    skill2.setLanguage("Java8");
    skillFunc.update(1, skill2);
    skillFunc.delete(4);
    skillFunc.getDevelopersBySkill(skill2);
    List<Skill> allSkills = skillFunc.getAllSkills();
    for (Skill s : allSkills
         ) {
      System.out.println(s);
    }
  }
}
