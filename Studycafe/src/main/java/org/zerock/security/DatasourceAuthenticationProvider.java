package org.zerock.security;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import org.apache.commons.codec.binary.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class DatasourceAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private HttpServletRequest httpServletRequest;

	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String userIDCrypt = (String) authentication.getPrincipal();
		String passwordCrypt = (String) authentication.getCredentials();
		
		String userID = decrypt(userIDCrypt);
		String password = decrypt(passwordCrypt);
		
		UsernamePasswordAuthenticationToken result = new UsernamePasswordAuthenticationToken(userID, password,new ArrayList<>());
		//result.setDetails(user);
		
		return result;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}
	
	
	/**
	 * 암호화 되어진 ID, PW 해제
	 * @param 
	 * @return
	 */
	private String decrypt(String data){
		
		if (data == null) {
	        return "";
	    }

	    byte[] hashValue = null; // 해쉬값
	    hashValue = data.getBytes();

	    return new String(Base64.decodeBase64(hashValue));	
	}
}
