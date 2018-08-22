package br.com.barbershop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.barbershop.model.Fornecedor;
import br.com.barbershop.service.FornecedorService;

@RestController
public class FornecedorController {
	
	@Autowired
    FornecedorService fornecedorService;	
	
	//EndPoints
		
	@RequestMapping(method=RequestMethod.POST,
			       value="/fornecedores", consumes =
			       MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Fornecedor> cadastrarFornecedor
	              (@RequestBody Fornecedor fornecedor){
		
		Fornecedor fornecedorSalvo = fornecedorService.cadastrar(fornecedor);
		return new ResponseEntity<>(fornecedorSalvo, HttpStatus.CREATED);
	}
	
//================================================================================================================
	@RequestMapping(method=RequestMethod.GET,
			       value="/fornecedores", produces =
			       MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Fornecedor>> buscarTodosFornecedores(){
		
		List<Fornecedor> fornecedorEncontrado = fornecedorService.buscarTodos();
		return new ResponseEntity<>(fornecedorEncontrado, HttpStatus.OK);
	}
	
//================================================================================================================	
	@RequestMapping(method=RequestMethod.DELETE, value="/fornecedores/{id}")
	public ResponseEntity<Fornecedor> excluirFornecedor(@PathVariable Integer id){
		
		Fornecedor fornecedorEncontrado = fornecedorService.buscarPorId(id);
		if (fornecedorEncontrado == null){
			return new ResponseEntity<>( HttpStatus.NOT_FOUND);
		  	
		} else{
			fornecedorService.excluir(fornecedorEncontrado);
			return new ResponseEntity<>(HttpStatus.OK);	
		}		
	}
	
//=================================================================================================================	
	@RequestMapping(method=RequestMethod.PUT,
			       value="/fornecedores", consumes =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Fornecedor> alterarFornecedor
	       (@RequestBody Fornecedor fornecedor){
		
		Fornecedor fornecedorAlterado = fornecedorService.alterar(fornecedor);
		return new ResponseEntity<>(fornecedorAlterado, HttpStatus.OK);
	}

}
