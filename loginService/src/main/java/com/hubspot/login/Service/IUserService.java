package com.hubspot.login.Service;

import com.hubspot.login.Model.User;
import com.hubspot.login.UserException.UserNotFoundException;

public interface IUserService {
	public User checkUsser(User user) throws UserNotFoundException;
	
}
