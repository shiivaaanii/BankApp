package com.wecp.progressive.service;
 
import java.sql.SQLException;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.wecp.progressive.entity.Accounts;
import com.wecp.progressive.repository.AccountRepository;
 
@Service
public class AccountServiceImplJpa implements AccountService {
 
    @Autowired
    private AccountRepository accountRepository;
 
    @Override
    public List<Accounts> getAllAccounts() throws SQLException {
        return accountRepository.findAll();
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllAccounts'");
    }
 
    @Override
    public List<Accounts> getAccountsByUser(int userId) throws SQLException {
        return accountRepository.getAccountsByUser(userId);
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'getAccountsByUser'");
    }
 
    @Override
    public Accounts getAccountById(int accountId) throws SQLException {
        return accountRepository.findById(accountId).get();
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAccountById'");
    }
 
    @Override
    public int addAccount(Accounts accounts) throws SQLException {
         accountRepository.save(accounts);
         return accounts.getAccountId();
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'addAccount'");
    }
 
    @Override
    public void updateAccount(Accounts accounts) throws SQLException {
        // TODO Auto-generated method stub
         accountRepository.save(accounts);
        //throw new UnsupportedOperationException("Unimplemented method 'updateAccount'");
    }
 
    @Override
    public void deleteAccount(int accountId) throws SQLException {
        // TODO Auto-generated method stub
        accountRepository.deleteById(accountId);
        //throw new UnsupportedOperationException("Unimplemented method 'deleteAccount'");
    }
 
    @Override
    public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
        // TODO Auto-generated method stub
        return accountRepository.getAllAccountsSortedByBalance();
       // throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsSortedByBalance'");
    }
 
    @Override
    public List<Accounts> getAllAccountsFromArrayList() {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsFromArrayList'");
       return null;
    }
 
    @Override
    public List<Accounts> addAccountToArrayList(Accounts accounts) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'addAccountToArrayList'");
        return null;
    }
 
    @Override
    public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsSortedByBalanceFromArrayList'");
       return null;
    }
 
    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
 
       // throw new UnsupportedOperationException("Unimplemented method 'emptyArrayList'");
    }
   
}