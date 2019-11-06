package com.bway.swingdemo.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bway.swingdemo.db.DB;
import com.bway.swingdemo.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	Connection con = null;
	
	public EmployeeServiceImpl() {
		
		con = DB.getDb();
	}
	@Override
	public boolean addEmployee(Employee emp) {
		
		String sql = "insert into employee(fname,lname,dob,joiningDate,gender,phone,email,company,post,country,city,state,salary)values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			
			pstm.setString(1, emp.getFname());
			pstm.setString(2, emp.getLname());
			pstm.setDate(3, emp.getDob());
			pstm.setDate(4, emp.getJoiningDate());
			pstm.setString(5, emp.getGender());
			pstm.setString(6, emp.getPhone());
			pstm.setString(7, emp.getEmail());
			pstm.setString(8, emp.getCompany());
			pstm.setString(9, emp.getPost());
			pstm.setString(10, emp.getCountry());
			pstm.setString(11, emp.getCity());
			pstm.setString(12, emp.getState());
			pstm.setDouble(13, emp.getSalary());
			
			pstm.execute();
			return true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
    
		return false;
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		List<Employee> elist = new ArrayList<>();
				
		String sql = "select id,fname,company,city from employee";
		
		try {
			Statement stm = con.createStatement();
			
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				
				Employee emp = new Employee();
				
				emp.setId(rs.getInt("id"));
				emp.setFname(rs.getString("fname"));
				emp.setCompany(rs.getString("company"));
				emp.setCity(rs.getString("city"));
				
				elist.add(emp);
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return elist;
	}

	@Override
	public List<Employee> searchEmployee(String input) {
		// TODO Auto-generated method stub
		return null;
	}

}
