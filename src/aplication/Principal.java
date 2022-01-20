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
		
		
		    //System.out.println("\n=== TEST 1: findById =======");
		   // Seller seller = sellerDaoJDBC.findById(3);
		    //System.out.println(seller);
		    
		    
		    //System.out.println("\n=== TEST 2: findByDepartment =====");
			//Department department = new Department(2, null);
			//List<Seller> list = sellerDaoJDBC.findByDepartment(department);
			//for (Seller obj : list) {
				//System.out.println(obj);
			//}
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
    }
}
