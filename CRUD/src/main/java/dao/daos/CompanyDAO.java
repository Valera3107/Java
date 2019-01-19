package dao.daos;

import model.Company;

import java.util.List;

public interface CompanyDAO {
  Company create(Company company);

  Company read(int id);

  void update(int id, Company company);

  void delete(int id);

  List<Company> getAllCompanies();
}
