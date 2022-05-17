package org.zerock.mapper.ex02;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
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
	
	@Insert("INSERT INTO Customers"
			+ " (CustomerName, ContactName, City, Address, PostalCode) "
			+ " VALUES(#{customerName}, #{contactName}, #{city}, #{address}, #{postalCode} )")
	
	int insertCustomer(CustomerDto customer);
	//java beans 의 property 명은 customer
	//return 타입이 int
	//mybatis가 insert한 mybatis의 개수를 return 해줌,int 리턴하던 execute update method처럼 하나넣었으니까 1이 리턴

	@Insert("INSERT INTO Employees "
			+ "(FirstName, LastName, Photo, Notes, BirthDate) "
			+ "VALUES (#{firstName}, #{lastName}, #{photo}, #{notes}, #{birthDate} )")
	int insertEmployee(EmployeeDto dto);
	
	@Select("SELECT EmployeeID id, FirstName, LastName, Photo, Notes, BirthDate "
			+ "FROM Employees ORDER BY EmployeeID")
	List<EmployeeDto> listEmployee();

	@Select("SELECT CustomerID id, ContactName, City, Address, PostalCode "
			+ "FROM Customers ORDER BY CustomerID")
	List<CustomerDto> listCustomer();

	
	@Select("SELECT CustomerID id, "
			+ "CustomerName, "
			+ "ContactName, "
			+ "Address, "
			+ "City, "
			+ "PostalCode, "
			+ "Country "
			+ "FROM Customers "
			+ "LIMIT #{from }, #{row }")
	List<CustomerDto> listCustomerPage(@Param("from") int from, @Param("row") int row);

	@Select("SELECT Count(Customerid) FROM Customers")
	int countCustomers();

}


