package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Test 1: department findAll ===");
		List<Department> list = depDao.findAll();
		for (Department d : list) {
			System.out.println(d.toString());
		}
		
		System.out.println("\n=== Test 2: department findById ===");
		Department newDep = depDao.findById(2);
		System.out.println(newDep.toString());
		
		System.out.println("\n=== Test 3: department insert ===");
		Department insertDep = new Department(null, "Shoes");
		depDao.insert(insertDep);
		System.out.println("Inserted! New id = " + insertDep.getId());
		
		System.out.println("\n=== Test 4: department update ===");
		newDep.setName("Home and electronics");
		depDao.update(newDep);
		System.out.println(newDep.toString());
		
		System.out.println("\n=== Test 5: department delete ===");
		depDao.deleteById(8);
		System.out.println("Delete completed!");
	}

}
