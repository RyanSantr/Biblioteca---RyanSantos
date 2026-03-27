package core;

import entidade.Biblioteca;
import entidade.Livro;
// import entidade.Usuario;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		Livro livro3 = new Livro();
		
		// todos os dados
		
		livro1.setTitulo("O Morro dos Ventos Uivantes");
		livro1.setAutor("Emily Brontë");
		livro1.setQtdDisponivel(4);
		
		livro2.setTitulo("O Senhor dos Aneis");
		livro2.setAutor("J.R.R. Tolkien");
		livro2.setQtdDisponivel(6);
		
		livro3.setTitulo("Iracema");
		livro3.setAutor("José de Alencar");
		livro3.setQtdDisponivel(2);
		
		biblioteca.addLivro(livro1);
		biblioteca.addLivro(livro2);
		biblioteca.addLivro(livro3);
		
		biblioteca.listarLivros();
	}
}