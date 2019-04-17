/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.domain.security;

import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author Abhinav Sinha
 */
public class Authority implements GrantedAuthority {
    private final String authority;
	
	public Authority(String authority) {
		this.authority = authority;
	}
	
	@Override
	public String getAuthority() {
		return authority;
	}
}
