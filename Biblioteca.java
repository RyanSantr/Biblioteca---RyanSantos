package entidade;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private List<Livro> livros;
	private List<Usuario> usuarios;
	
	public Biblioteca() {
		this.livros = new ArrayList<Livro>();
		this.usuarios = new ArrayList<Usuario>();
	}
	
	
	// add livro
	 public void addLivro(Livro livro) {
		 this.livros.add(livro);
	 }
	 
	 
	// listar
	public void listarLivros() {
		
			if(livros.isEmpty()) {
				System.out.println(" LIVRO NAO ENCONTRADO");
			
			}
			
			System.out.println("Lista");
			for(int i = 0; i < livros.size(); i++) {
				System.out.println((i + 1) + " - " + livros.get(i).toString());
			}
		}
	}
	
	

