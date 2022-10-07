package model.DAO;

import db.DB;
import model.DAO.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDaoJDBC createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
