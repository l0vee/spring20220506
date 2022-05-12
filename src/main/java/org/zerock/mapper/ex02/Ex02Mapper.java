package org.zerock.mapper.ex02;

import org.apache.ibatis.annotations.Select;

public interface Ex02Mapper {
	
	@Select("SELECT CustomerName FROM Customers WHERE CustomerId = #{id}")
	String selectNameById(int id);

}
