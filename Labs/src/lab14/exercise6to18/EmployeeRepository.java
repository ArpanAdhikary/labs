package lab14.exercise6to18;

import java.util.HashMap;

public class EmployeeRepository {
	private static HashMap<Integer, Employee> db = new HashMap<Integer, Employee>();
	
	public static Employee getEmployee(int employeeId) {
		if (db.containsKey(employeeId)) {
			return db.get(employeeId);
		}
		return null;
	}
	
	public static void setEmployee(Employee emp) {
		db.putIfAbsent(emp.getEmployeeId(),emp);
		System.out.println("record inserted");
	}

	public static HashMap<Integer, Employee> getDb() {
		return db;
	}

	public static void setDb(HashMap<Integer, Employee> db) {
		EmployeeRepository.db = db;
	}
	
	public static int getLength() {
		return db.size();
	}

}
