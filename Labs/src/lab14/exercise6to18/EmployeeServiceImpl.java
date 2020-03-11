package lab14.exercise6to18;

public class EmployeeServiceImpl {
	SumSalary es1 = () -> {
		double sum = 0;
		for (int i = 1; i < 4; i++) {
			double sal = EmployeeRepository.getEmployee(i).getSalary();
			sum = sum + sal;
		}
		return sum;
	};

	// exercise14.10
	EmployeeService es2 = () -> {
		String name = null;
		for (int i = 1; i < EmployeeRepository.getLength() + 1; i++) {

			Employee d = EmployeeRepository.getEmployee(i);
			if (d.getDepartment() == null) {
				System.out.println(d);
			}
		}
	};

}
