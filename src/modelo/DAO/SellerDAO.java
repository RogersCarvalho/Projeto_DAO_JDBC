package modelo.DAO;

import java.util.List;

import modelo.entidade.Seller;


public interface SellerDAO {
	
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	
	
	//Esse m�oto � usado para fazer uma consulta 
	//no BD com id informado, se encontrar 
	//retorna um objeto 
	Seller findById(Integer id);
	
	//Esse m�todo retorna uma lista de objetos
	//ou seja, uma lista de todos os deptos
	List<Seller> findAll();

}


