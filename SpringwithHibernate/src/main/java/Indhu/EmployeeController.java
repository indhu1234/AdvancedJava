package Indhu;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController 
{
	@Autowired
	employeeservices employeeService;
	@RequestMapping("/employee")
    public String Employees(Model m)
    {
    	Employee emp=new Employee();
    	m.addAttribute("employee",emp);
    	List <Employee> emplist=employeeService.listemployee();
		m.addAttribute("lists",emplist);
    	return "Employee";
    }
	
	@RequestMapping("/insertemployee")
	public String AddEmployee(@Valid @ModelAttribute("employee") Employee emp,Model m)
	{
		System.out.println("From Controller");
		employeeService.addEmployee(emp);
		List <Employee> emplist=employeeService.listemployee();
		m.addAttribute("lists",emplist);
		return "Employee";
	}
	@RequestMapping("/deleteemp/{id}")
	public String delete(@PathVariable("id") int eid,Model m)
	{
		System.out.println("Deletion is in progress");
		Employee e=employeeService.getid(eid);
		employeeService.deleteemp(e);
		List <Employee> emplist=employeeService.listemployee();
		m.addAttribute("lists",emplist);
		return "success";
	}
}
