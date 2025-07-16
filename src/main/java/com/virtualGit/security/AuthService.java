package com.virtualGit.security;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements UserDetailsService {
	
	@Override
	public UserDetails loadUserByUsername(String username) {
		return new org.springframework.security.core.userdetails.User("user", "{noop}password", new ArrayList<>());

	}
}
