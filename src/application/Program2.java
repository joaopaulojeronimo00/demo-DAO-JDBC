package application;

import java.util.ArrayList;
import java.util.List;

import model.DAO.DaoFactory;
import model.DAO.DepartmentDAO;
import model.entiteis.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDAO departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department findById ===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("=== TEST 2: Department findAll ===");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		/*System.out.println("=== TEST 3: Department insert ===");
		Department dep1 = new Department(12, "Food");
		departmentDao.insert(dep1);
		System.out.println("Inserted :" + dep1);*/
		
		System.out.println("=== TEST 4: Department update ===");
		Department dep2 = new Department(13, "Food");
		dep2.setName("Games");
		departmentDao.update(dep2);
		dep2.setName("Sports");
		departmentDao.update(dep2);
		
		
		System.out.println("=== TEST 5: Department delete ===");
		departmentDao.deleteById(5);
		departmentDao.deleteById(6);
		departmentDao.deleteById(7);
		departmentDao.deleteById(8);
		departmentDao.deleteById(9);
		departmentDao.deleteById(10);
	}

}
