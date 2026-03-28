package core;

import entidade.Biblioteca;
import entidade.Livro;
import entidade.Usuario;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// cadadastro livro
		Biblioteca biblioteca = new Biblioteca();
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		Livro livro3 = new Livro();
		
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

		
		// Castrp de Usuario;
		
		Usuario user1 = new Usuario();
		System.out.println("Cadastro");
		System.out.println("Usuario digite seu nome: ");
		user1.setNome(sc.nextLine());
		
		System.out.println("Digite seu Registro");
		user1.setRegistro(sc.nextLine());
		
		System.out.println("Digite sua Data de Nascimento (dd/MM/yyyy");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String datasc = sc.nextLine();
		LocalDate dataNasc = LocalDate.parse(datasc, formatter);
		user1.setDataNasc(dataNasc);
		
		biblioteca.AddUsuario(user1);
		biblioteca.ListarUsuarioss();
		
		// todos os dados
	

		sc.close();
		
		
	}
}
