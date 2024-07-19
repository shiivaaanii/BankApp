package com.wecp.progressive.service;
 
import java.sql.SQLException;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.wecp.progressive.entity.Customers;
import com.wecp.progressive.repository.CustomerRepository;
 
@Service
public class CustomerServiceImplJpa implements CustomerService{
 
    @Autowired
    private CustomerRepository customerRepository;
 
    @Override
    public List<Customers> getAllCustomers() throws SQLException {
        return customerRepository.findAll();
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'getAllCustomers'");
    }
 
    @Override
    public Customers getCustomerById(int customerId) throws SQLException {
        // TODO Auto-generated method stub
        return customerRepository.findById(customerId).get();
        //throw new UnsupportedOperationException("Unimplemented method 'getCustomerById'");
    }
 
    @Override
    public int addCustomer(Customers customers) throws SQLException {
        // TODO Auto-generated method stub
        customerRepository.save(customers);
        return customers.getCustomerId();
       // throw new UnsupportedOperationException("Unimplemented method 'addCustomer'");
    }
 
    @Override
    public void updateCustomer(Customers customers) throws SQLException {
        // TODO Auto-generated method stub
        customerRepository.save(customers);
       // throw new UnsupportedOperationException("Unimplemented method 'updateCustomer'");
    }
 
    @Override
    public void deleteCustomer(int customerId) throws SQLException {
        // TODO Auto-generated method stub
        customerRepository.deleteById(customerId);
      //  throw new UnsupportedOperationException("Unimplemented method 'deleteCustomer'");
    }
 
    @Override
    public List<Customers> getAllCustomersSortedByName() throws SQLException {
       return customerRepository.getAllCustomersSortedByName();
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersSortedByName'");
    }
 
    @Override
    public List<Customers> getAllCustomersFromArrayList() {
        return null;
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersFromArrayList'");
    }
 
    @Override
    public List<Customers> addCustomersToArrayList(Customers customers) {
        return null;
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'addCustomersToArrayList'");
    }
 
    @Override
    public List<Customers> getAllCustomersSortedByNameFromArrayList() {
        return null;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersSortedByNameFromArrayList'");
    }
 
    @Override
    public void emptyArrayList() {
       
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'emptyArrayList'");
    }
   
}