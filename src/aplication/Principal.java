package aplication;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import db.DB;
import modelo.DAO.DaoFactory;
import modelo.DAO.SellerDAO;
import modelo.DAO.Impl.SellerDaoJDBC;
import modelo.entidade.Department;
import modelo.entidade.Seller;

public class Principal {

	public static void main(String[] args) {

	     			
		    SellerDAO sellerDaoJDBC = DaoFactory.createSellerDao();
	        Seller seller = sellerDaoJDBC.findById(3);
		    System.out.println(seller);
		    
		    
   }
}
