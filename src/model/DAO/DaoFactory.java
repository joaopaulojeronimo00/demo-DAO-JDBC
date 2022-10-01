package model.DAO;

import model.DAO.impl.SellerDaoJDBC;

public class DaoFactory {
	public static SellerDaoJDBC createSellerDao() {
		return new SellerDaoJDBC();
	}
}
