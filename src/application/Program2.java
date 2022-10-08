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
	}

}
