package aplication;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import db.DB;
import modelo.DAO.DaoFactory;
import modelo.DAO.SellerDAO;
import modelo.DAO.Impl.SellerDaoJDBC;
import modelo.entidade.Department;
import modelo.entidade.Seller;

public class Principal {

	public static void main(String[] args) {

	     	Scanner sc = new Scanner(System.in);
		    SellerDAO sellerDaoJDBC = DaoFactory.createSellerDao();

		    System.out.println("\n=== TEST 6: seller delete =====");
			
		    System.out.println("Enter id for delete test: ");
			int id = sc.nextInt();
			sellerDaoJDBC.deleteById(id);
			System.out.println("Delete completed");
			
			sc.close();
		    
     }
}


   





