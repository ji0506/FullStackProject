package org.zerock.security;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

/**
 * Created by DevHoon on 2016. 5. 20.
 */
@Component
public class DatasourceAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private HttpServletRequest httpServletRequest;

	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String userID = (String) authentication.getPrincipal();
		String password = (String) authentication.getCredentials();
		
		

		UsernamePasswordAuthenticationToken result = new UsernamePasswordAuthenticationToken(userID, password,new ArrayList<>());
		result.setDetails(user);
		
		return result;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}
	
	
	
}
