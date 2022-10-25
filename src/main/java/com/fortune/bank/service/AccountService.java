//package com.fortune.bank.service;
//
//import com.fortune.bank.Dto.AccountDto;
//import com.fortune.bank.Dto.CustomerDto;
//import com.fortune.bank.exceptions.AccountDoesNotExist;
//import com.fortune.bank.exceptions.CustomerDoesNotExist;
//import com.fortune.bank.model.Account;
//import com.fortune.bank.model.Customer;
//import com.fortune.bank.repo.AccountRepository;
//import com.fortune.bank.repo.CustomerRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;
    private final CustomerRepository customerRepository;
//     public Account addAccount(AccountDto accountDto){
//         Account account = accountRepository.findByCustomerId(accountDto.getCustomerId());
//         if (account!= null){
//             return account;
//         }
//         throw  new AccountDoesNotExist("account does not exist");
//     }
//     public Customer addCustomer(CustomerDto customerDto){
//         Customer customer = customerRepository.findCustomerByUsername(customerDto.getUsername()).orElse(null);
//         if (customer==null){
//             Customer customer1 = new Customer();
//             customer1.setUsername(customerDto.getUsername());
//             customer1.setMobileNumber(customerDto.getMobileNumber());
//             customer1.setEmail(customerDto.getEmail());
//             customerRepository.save(customer1);
//             return customer1;
//         }
//         throw  new CustomerDoesNotExist("customer does not exist");
//     }
//
//     public List<Customer>getCustomers (){
//         return customerRepository.findAll();
//     }
//    public List<Account>getAccount(){
//        return accountRepository.findAll();
//    }
//}
