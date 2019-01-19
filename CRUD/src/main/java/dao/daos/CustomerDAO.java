package dao.daos;

import model.Customer;

import java.util.List;

public interface CustomerDAO {
  Customer create(Customer customer);

  Customer read(int id);

  void update(int id, Customer customer);

  void delete(int id);

  List<Customer> getAllCustomers();
}
