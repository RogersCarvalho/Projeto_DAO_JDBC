package modelo.DAO;

import java.util.List;

import modelo.entidade.Department;

public interface DepatmentDao {
	
	
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	
	
	//Esse m�oto � usado para fazer uma consulta 
	//no BD com id informado, se encontrar 
	//retorna um objeto 
	Department findById(Integer id);
	
	//Esse m�todo retorna uma lista de objetos
	//ou seja, uma lista de todos os deptos
	List<Department> findAll();
	

}
