package br.com.barbershop.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.barbershop.model.Fornecedor;
import br.com.barbershop.repository.FornecedorRepository;

@Service
public class FornecedorService {
	
	@Autowired
    FornecedorRepository fornecedorRepository;
	
	public Fornecedor cadastrar(Fornecedor fornecedor){
		
		return fornecedorRepository.save(fornecedor);
	}
	
//======================================================================	
	public List<Fornecedor> buscarTodos(){
		
		return fornecedorRepository.findAll();
		
	}
	
//======================================================================	
	public void excluir(Fornecedor fornecedor){
		
		fornecedorRepository.delete(fornecedor);
	}
	
//======================================================================	
	public Fornecedor buscarPorId(Integer id) {
		
		return fornecedorRepository.getOne(id);
	}
	
//======================================================================	
	public Fornecedor alterar(Fornecedor fornecedor){
		
		fornecedorRepository.save(fornecedor);
		return fornecedor;
	}
}
