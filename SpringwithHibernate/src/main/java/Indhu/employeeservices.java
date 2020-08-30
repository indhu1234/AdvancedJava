
package Indhu;

import java.util.List;

public interface employeeservices {
	public boolean addEmployee(Employee e);
    public List<Employee> listemployee();
	public boolean deleteemp(Employee e);
	public Employee getid(int id);
}
