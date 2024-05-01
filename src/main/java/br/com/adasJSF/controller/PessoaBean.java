package br.com.adasJSF.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.adasJSF.model.Pessoa;

@Named("pessoaBean")
@SessionScoped

public class PessoaBean implements Serializable{
	// Serial implementado pela interface
	private static final long serialVersionUID = 1L;
	
	//Injeção de dependencia da classe Pessoa do pacote Model
	@Inject
	private Pessoa pessoa;
	
	List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	//Declaracao dos metodos da Bean
	public String adicionar() {
		pessoas.add(pessoa);
		pessoa = new Pessoa();
		System.out.println("Tamanho da lista: " + this.pessoas.size());
		return null;
	}
	
	//Getters e Setters

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	

}
