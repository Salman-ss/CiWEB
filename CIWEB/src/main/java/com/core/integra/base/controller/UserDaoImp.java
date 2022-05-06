package com.core.integra.base.controller;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;




public class UserDaoImp implements UserDao {
	
	public JdbcTemplate jt;
	
	 public int insert(Register rs) {
		 
	    
		 String ft = "select count(*) from register where email = ? and pass = ?";
			
			int count = this.jt.queryForObject(ft,Integer.class,rs.getEmail(),rs.getPass());
			
			if(count>=1)
			{
				System.out.println("user already exist");
			}	
			else
			{
		 
          String ras = "insert into register(name,email,city,pass)value(?,?,?,?)";
          int r =this.jt.update(ras,rs.getName(),rs.getEmail(),rs.getCity(),rs.getPass());

		   return r;
			}
		return 1 ;
	}

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public Register select(String name) {
		// TODO Auto-generated method stub
		
	String jz = "Select * from register where name = ?";
	

	RowMapper<Register> rowmapper = new RowMapperImpl();
	
	Register r = this.jt.queryForObject(jz,rowmapper,name);

	
		
		return r;
	}
/*
	@Override
	public int valid(String email, String password) {
		// TODO Auto-generated method stub
		
		String ft = "select count(*) from register where email = ? and pass = ?";
		
		int count = this.jt.queryForObject(ft,Integer.class,email,password);
		
		if(count==1)
		{
			return true;
		}
		else
		{
			return 10;
		}
		
	}

	*/

	@Override
	public boolean valid(String email, String password) {
		// TODO Auto-generated method stub
String ft = "select count(*) from register where email = ? and pass = ?";
		
		int count = this.jt.queryForObject(ft,Integer.class,email,password);
		
		if(count>=1)
		{
			return true;
		}
		
		return false;
	}
	
	
}
