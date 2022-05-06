package com.core.integra.base.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class RowMapperImpl implements RowMapper<Register> {

	public Register mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Register s = new Register();
		s.setName(rs.getString(1));
		
		return s;
	}

}
