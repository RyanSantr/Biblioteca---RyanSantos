package core;

import entidade.Biblioteca;
import entidade.Livro;
import entidade.Usuario;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Biblioteca biblioteca = new Biblioteca();
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		Livro livro3 = new Livro();
		
		Scanner sc = new Scanner(System.in);
		
		
		Usuario user1 = new Usuario();
		
		System.out.println("Cadastro");
		System.out.println("Usuario digite seu nome: ");
		user1.setNome(sc.nextLine());
		
		System.out.println("Digite seu Registro");
		user1.setRegistro(sc.nextLine());
		
		System.out.println("Digite sua Data de Nascimento");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(sc.nextLine(), formatter);
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
