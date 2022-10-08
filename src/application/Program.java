package application;


import java.util.Date;
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
		
		System.out.println("=== TEST 3: SELLER findAll ===");
		
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TEST 4: SELLER insert ===");
		Seller obj = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
		
		sellerDao.insert(obj);
		System.out.println("Inserted, id:" + obj.getId());
		
		System.out.println("=== TEST 5: SELLER update ===");
		obj = sellerDao.findById(1);
		obj.setName("Martha Wayne");
		sellerDao.update(obj);
		System.out.println("update completed!");
		
		System.out.println("=== TEST 6: SELLER deleteById ===");
		sellerDao.deleteById(10);
		
	}

}
