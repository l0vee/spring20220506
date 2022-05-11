package org.zerock.controller.ex05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.controller.ex03.Customer;
import org.zerock.controller.ex03.Employee;

@Controller
@RequestMapping("ex08")
public class Ex08Controller {

	@RequestMapping("sub01")
	public String method01(HttpServletRequest req) {
		
		req.setAttribute("address", "new york");
		//prefix:/WEB-INF/views/
		//suffix:.jsp
		//full view name: /WEB-INF/views/ex08/sub01.jsp
		return "ex08/sub01";
	}
	@RequestMapping("sub02")
	public String method01(Model model) {
		model.addAttribute("address", "london");
		
		return "ex08/sub01";
	}
	
	@RequestMapping("sub03")
	public String method03(Model model) {
		
		model.addAttribute("myName", "sunja");
		model.addAttribute("myAge", 99);
		return "ex08/sub03";
	}
	
			//prefix:/WEB-INF/views/
			//suffix:.jsp
			//요청경로: /ex08/sub04
			//view name :/WEB-INF/views/ex08/sub04.jsp
	@RequestMapping("sub04")
	public void method04(Model model) {
		model.addAttribute("foods", new String[] {"apple","milk","coffee"});
		
	}
	
	@RequestMapping("sub05")
	public void method05(Model model) {
		List<String> list = new ArrayList<>();
		list.add("doctorstrange");
		list.add("spiderman");
		list.add("batman");
		model.addAttribute("heroList",list);
	}
	
	@RequestMapping("sub06")
	public void method06(Model model) {
		
		Map<String, String> map = new HashMap<>();
		map.put("name", "jin");
		map.put("song", "butter");
		map.put("group", "bts");
		
		model.addAttribute("desc",map);
		
		
	}
	
	
	@RequestMapping("sub07")
	public void method07(Model model) {
		
		Customer cus = new Customer();
		cus.setAddress("seoul");
		cus.setAge(30);
		cus.setName("donald");
		
		model.addAttribute("customer",cus);
		
	}
	
	@RequestMapping("sub08")
	public void method08(Model model) {
		Employee emp = new Employee();
//		email, name, salary 세팅
		emp.setEmail("z0303@gmail.com");
		emp.setName("judy");
		emp.setSalary(5000);
		
		model.addAttribute("employee",emp);
		
		
	// jsp와 이메소드를 완성해서 위에 세팅한 email, name, salary 출력하도록 함
	}
	
	@RequestMapping("sub09")
	public String method09(Model model) {
		Employee emp = new Employee();
		emp.setEmail("korea@gmail.com");
		emp.setName("sunja");
		emp.setSalary(70000);
		
		//model.addAttribute(emp);
		model.addAttribute(emp); //attribute이름이 클래스의 이름으로 결정(단, lowerCamelCase 형식)
		return "ex08/sub08";
	}
	
	@RequestMapping("sub10")
	public String method10(Model model) {
		
		Customer c = new Customer();
		c.setAddress("seoul");
		c.setAge(300);
		c.setName("tweety");
		
		model.addAttribute(c);
		
		// model.addAttribute(Object)를 사용해서
		// sub07.jsp에서 고객의 정보가 출력되도록 코드를 완성
		
		return "ex08/sub07";
	}
	
	@RequestMapping("sub11")
	public void method11(Model model) {
		List<String> l  = new ArrayList<>();
		
		l.add("wanda");
		l.add("doctor");
		l.add("wong");
		
		model.addAttribute("list",l);
	}
	
	@RequestMapping("sub12")
	public void method12() {
		//1.request 파라미터 수집/ 가공
		//2.business 로직처리
		//3.add attribute
		//4/forward/redirect
	}
}
