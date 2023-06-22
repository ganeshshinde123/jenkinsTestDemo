package com.hubspot.login.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hubspot.login.Model.User;
import com.hubspot.login.UserException.UserNotFoundException;

@Service
public class UserService implements IUserService {

	@Override
	public User checkUsser(User user) throws UserNotFoundException {
		Optional<?> isuser = null;
		if(user!=null) {
			return user;
		}else {
			return null;
		}
		
	}

}
