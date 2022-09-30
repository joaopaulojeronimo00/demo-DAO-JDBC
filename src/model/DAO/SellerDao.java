package model.DAO;

import java.util.List;
import model.entiteis.Seller;

public interface SellerDao {
void insert(Seller obj);
	
	void update(Seller obj);
	
	void deleteById(Integer id);
	
	Seller findById(Integer id);
	
	List<Seller> findAll();
}
