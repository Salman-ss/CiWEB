package com.core.integra.base.controller;

public interface UserDao {

	public int insert(Register rs);
	public Register select(String name);
	public boolean valid(String email , String password);

	
}
