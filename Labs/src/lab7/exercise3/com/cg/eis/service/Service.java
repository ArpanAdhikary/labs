package lab7.exercise3.com.cg.eis.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import lab7.exercise3.com.cg.eis.bean.Employee;

public class Service implements EmployeeScheme {

	private static HashMap<String, Employee> map = new HashMap<String, Employee>();

	public void addEmployee(Employee e) {
		map.putIfAbsent(e.getName(), e);
		System.out.println("record inserted.");
	}

	public void sortMapBySalary() {

		List<Map.Entry<String, Employee>> list = new LinkedList<Map.Entry<String, Employee>>(map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Employee>>() {
			public int compare(Map.Entry<String, Employee> o1, Map.Entry<String, Employee> o2) {
				if(o1.getValue().getSalary()<o1.getValue().getSalary())
					return 1;
				else
					return -1;
			}
		});

		HashMap<String, Employee> temp = new LinkedHashMap<String, Employee>();
		for (Map.Entry<String, Employee> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		
		map = temp;
		for(Employee e:map.values()) {
			System.out.println(e);
		}
	}

	public boolean deleteEmployee(int id) {
		for (Employee e : map.values()) {
			if (e.getId() == id) {
				map.remove(e.getName());
				return true;
			}
		}
		return false;
	}

	public void displayByScheme(String scheme) {
		for (Employee e : map.values()) {
			if (e.getInsuranceScheme().equals(scheme))
				System.out.println(e);
		}
	}

	@Override
	public void generateScheme(Employee e) {
		double salary = e.getSalary();
		String designation = e.getDesignation();
		if (salary <= 5000 && designation.equals("Clerk")) {
			e.setInsuranceScheme("No Scheme");
		} else if (salary < 20000 && designation.equals("System Associate")) {
			e.setInsuranceScheme("Scheme C");
		} else if (salary < 40000 && designation.equals("Programmer")) {
			e.setInsuranceScheme("Scheme B");
		} else {
			e.setInsuranceScheme("Scheme A");
		}
	}

	
}
