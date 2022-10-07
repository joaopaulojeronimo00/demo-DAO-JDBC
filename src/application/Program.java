package application;

import java.util.List;

import model.DAO.DaoFactory;
import model.DAO.SellerDao;
import model.entiteis.Department;
import model.entiteis.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao(); 
		
		
		System.out.println("=== TEST 1: SELLER findById ===");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("=== TEST 2: SELLER findByDepartment ===");
		Department dep = new Department(2, null);
		
		List<Seller> list = sellerDao.findByDepartment(dep);
		for(Seller obj : list) {
			System.out.println(obj);
		}
	}

}
