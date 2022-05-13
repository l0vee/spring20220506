package org.zerock.mapper.ex02;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.ex01.CustomerDto;
import org.zerock.domain.ex01.EmployeeDto;

public interface Ex02Mapper {
	
	@Select("SELECT CustomerName FROM Customers WHERE CustomerId = #{id}")
	String selectNameById(int id);

	@Select("SELECT FirstName FROM Employees WHERE EmployeeId = #{id}")
	String selectFirstEmployeeNameById(int id);

	@Select("SELECT"
			+ "CustomerName AS Name,"
			+ "Address,"
			+ "City,"
			+ "Country"
			+ "FROM Customers"
			+ "WHERE CustomerId = #{id}")
	CustomerDto selectCustomerById(int id);
	//AS는 생략 가능하다
	//CustomerName Name 바로 이렇게 씀

	@Select("SELECT FirstName, LastName, BirthDate FROM Employees WHERE EmployeeId = #{id}")
	EmployeeDto selectEmployeeById(int id);
	

}
