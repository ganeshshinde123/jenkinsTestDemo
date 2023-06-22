package com.hubspot.login.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hubspot.login.Model.User;
import com.hubspot.login.Service.IUserService;
import com.hubspot.login.UserException.UserNotFoundException;

@RestController
@RequestMapping("api/v2")
@CrossOrigin
public class LoginController {

	@Autowired
	private IUserService userService;
	
	private ResponseEntity<?> responseEntity;
	
	@PostMapping("/user")
	public ResponseEntity<?> checkUserhandler(@RequestBody User user){
		User authUser = null;
		try {
			authUser=userService.checkUsser(user);
			responseEntity = new ResponseEntity<User>(authUser, HttpStatus.OK);
		} catch (UserNotFoundException e) {
			responseEntity = new ResponseEntity<User>(authUser, HttpStatus.NOT_FOUND);
			e.printStackTrace();
		}
		
		return responseEntity;
	}
}
