package com.wecp.progressive.repository;
 
import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
 
import com.wecp.progressive.entity.Customers;
 
@Repository
public interface CustomerRepository extends JpaRepository<Customers,Integer> {
    @Query("select c form Customer c order by name")
    public List<Customers> getAllCustomersSortedByName();
 
}
 
 
