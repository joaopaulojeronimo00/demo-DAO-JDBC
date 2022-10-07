package application;

import model.DAO.DaoFactory;
import model.DAO.SellerDao;
import model.entiteis.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao(); 
		
		
		System.out.println("=== TEST 1: SELLER findById ===");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
	
	}

}
