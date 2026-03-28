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
	
	public void AddUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
		System.out.println("Cadastro Completo");
	
	}
	
	public void ListarUsuarioss() {
		if(usuarios.isEmpty()) {
			System.out.println("Usuario nao encontrado");
		}else {
			System.out.println("lista de usuarios");
			System.out.println("Total: " + usuarios.size() + " usuário(s)\n");
			for(int i = 0; i  < usuarios.size(); i++) {
				System.out.println(("Usuario-" + (i + 1)) +  "\n" + usuarios.get(i).toString());
			}
		}
		
	}
}
	
	

	

