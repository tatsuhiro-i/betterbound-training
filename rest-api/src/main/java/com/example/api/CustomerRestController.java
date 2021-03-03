package com.example.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Customer;
import com.example.service.CustomerService;

@RestController
@RequestMapping("v1/users")
public class CustomerRestController {
    @Autowired
    CustomerService customerService;
    
    /**
     * 顧客情報取得API
     * @param id
     * @return List<customer>
     */
    @RequestMapping(path="{id}")
    Optional<Customer> getCustomer(@PathVariable Integer id) {
        return customerService.findById(id);
    }
    
    /**
     * 顧客情報登録
     * @param customer
     * @return customer
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Customer postCustomer(@RequestBody Customer customer) {
    	return customerService.create(customer);
    }
    
    /**
     * 顧客情報削除API
     * @param id
     */
    @DeleteMapping(path = "{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteCustomer(@PathVariable Integer id) {
    	customerService.delete(id);
    }
    
    /**
     * 顧客情報更新API
     * @param id
     * @param customer
     * @return customer
     */
    @PutMapping(path = "{id}")
    Customer putCustomer(@PathVariable Integer id, @RequestBody Customer customer) {
    	customer.setId(id);
    	return customerService.update(customer);
    }
    

}