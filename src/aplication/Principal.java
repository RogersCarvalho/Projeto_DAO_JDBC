package aplication;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;

import db.DB;
import modelo.DAO.DaoFactory;
import modelo.DAO.SellerDAO;
import modelo.DAO.Impl.SellerDaoJDBC;
import modelo.entidade.Department;
import modelo.entidade.Seller;

public class Principal {

	public static void main(String[] args) {

	     	SellerDAO sellerDaoJDBC = DaoFactory.createSellerDao();

		    System.out.println("\n=== TEST 5: seller update =====");
		    
		    Seller s = sellerDaoJDBC.findById(1);
		    s.setName("Martha Waine");
		    sellerDaoJDBC.update(s);
		    System.out.println("Update completed");
		    
     }
}


   





