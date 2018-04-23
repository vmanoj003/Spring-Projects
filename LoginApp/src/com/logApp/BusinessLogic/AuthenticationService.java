package com.logApp.BusinessLogic;
import java.util.*;

import com.Details.user.User;
public class AuthenticationService {

	
	HashMap<String,String> user = new HashMap<>();
	
	public AuthenticationService(){
		
		user.put("manoj","kumar");
		user.put("kumar","velama");
		user.put("velama","manojkumar");
	}
	
	public boolean authentication(String userID,String password){
		
		if(userID == "" || password == ""){
			return false;
		}else{
			return true;
		}
	}
	
	public User getUserDetails(String userId){
		
		User users = new User();
		
		users.setFname(user.get(userId));
		users.setLname(userId);
		
		return users;
		 
		
		
	}

}
