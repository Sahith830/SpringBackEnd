package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CreditCardService creditCardService;

	public List<User> getUsers() {
		return userRepository.findAll();
	}

	public User addUser(User user) {
		creditCardService.addCreditCard(user.getCreditcards());
		return userRepository.save(user);
	}
	
	public User getUserByUserName(String userName,String password) {
		return userRepository.findByUserNameAndPassword(userName,password);
	}

}
