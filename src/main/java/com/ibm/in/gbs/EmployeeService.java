package com.example;

import com.example.dao.EmployeeDAO;

public class EmployeeService {
	
	EmployeeDAO employeeDAO;
	
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public boolean updateDetails(int id,String name,double salary) {
		//20 loc
		if(id > 100 && name.length() > 5 && salary > 50000.00) {
			return employeeDAO.save(id, name, salary);	
			
		}
		return false;
	}

}
