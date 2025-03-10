package com.ecom.service;

import com.ecom.exception.UserException;
import com.ecom.model.User;

public interface UserService {
	User findUserById(Long id) throws UserException;
	User findUserProfileByJwt(String jwt) throws UserException;

}
