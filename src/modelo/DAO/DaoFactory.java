package modelo.DAO;

import modelo.entidade.Seller;
import db.DB;

import modelo.DAO.Impl.SellerDaoJDBC;

public class DaoFactory {
	
	
	public static SellerDAO createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
		
	}
	
}
