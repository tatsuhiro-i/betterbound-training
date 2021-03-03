package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.domain.Customer;
import com.example.repository.CustomerRepository;


import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	
	/**
	 * 顧客情報取得サービス
	 * @param id
	 * @return List<Customer>
	 */
	public Optional<Customer> findById(Integer id){
		return customerRepository.findById(id);
	}
	
	/**
	 * 商品登録サービス
	 * @param Customer
	 * @return Customer
	 */
	public Customer create(Customer customer) {
		return customerRepository.save(customer);
	}
	/**
	 * 商品削除サービス
	 * @param id
	 */
	public void delete(Integer id) {
		customerRepository.deleteById(id);
	}
	
	/**
	 * 商品更新サービス
	 * @param customer
	 * @return customer
	 */
	public Customer update(Customer customer) {
		return customerRepository.save(customer);
	}
}