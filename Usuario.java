package entidade;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Usuario {
	  private String nome;
	  private String registro;
	  private LocalDate dataNasc;
	  
	  public Usuario() {
		  
	  }
	  
	  public Usuario(String nome, String registro, LocalDate dataNasc) {
			
			this.nome = nome;
			this.registro = registro;
			this.dataNasc = dataNasc;
			
		}
	  
	  
	  
	  public String getNome() {
		  return nome;
	  }
	  
	  public void setNome(String nome) {
		  this.nome = nome;
	  }
	  
	  public String getRegistro() {
		  return registro;
	  }
	  
	  public void setRegistro(String registro) {
		  this.registro = registro;
	  }
	  
	  public LocalDate getDataNasc() {
		  return dataNasc;
	  }
	  
	  public void setDataNasc(LocalDate dataNasc) {
		  this.dataNasc = dataNasc;
	  }
	  
	  @Override
	  public String toString() {
			 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		  String dataformatada = dataNasc != null ? dataNasc.format(formatter) : "nao informada"; 
		  
		  
		  return "Nome: " + nome + "\n" + "Registro: " + registro + "\n"+ "Data Nascimento: " + dataformatada;
	  }
	  
	  
	
}
