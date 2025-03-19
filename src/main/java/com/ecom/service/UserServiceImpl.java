package com.ecom.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecom.config.JwtProvider;
import com.ecom.exception.ProductException;
import com.ecom.exception.UserException;
import com.ecom.model.User;
import com.ecom.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;
	private JwtProvider jwtProvider;
	
	

	public UserServiceImpl(UserRepository userRepository, JwtProvider jwtProvider) {
		this.userRepository = userRepository;
		this.jwtProvider = jwtProvider;
	}

	@Override
	public User findUserById(Long id) throws UserException {
		Optional<User> user = userRepository.findById(id);
		
		if (user.isPresent()) {
			return user.get();
		}
		throw new UserException("User Not Found With ID: " + id);
	}

	@Override
	public User findUserProfileByJwt(String jwt) throws UserException {
		String email =jwtProvider.getEmailFromToken(jwt);
		
		User user = userRepository.findByEmail(email);
		
		if (user==null) {
			throw new UserException("User not found with email: " + email);
		}
		return user;
	}

}
