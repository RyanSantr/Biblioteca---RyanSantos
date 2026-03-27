package entidade;

public class Livro {
	private String titulo;
	private Integer qtdPaginas;
	private String autor;
	private String genero;
	private String editora;
	private Integer qtdDisponivel;
	
	
	public Livro(String titulo, 
			Integer qtdPaginas, 
			String autor, 
			String genero, 
			String editora,
			Integer qtdDisponivel) {
		this.titulo = titulo;
		this.qtdPaginas = qtdPaginas;
		this.autor = autor;
		this.genero = genero;
		this.editora = editora;
		this.qtdDisponivel = qtdDisponivel;
	}
	
	public Livro() {
		
	}
	
	public Livro(String titulo) {
		this.titulo = titulo;
	}
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getQtdPaginas() {
		return qtdPaginas;
	}
	public void setQtdPaginas(Integer qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Integer getQtdDisponivel() {
		return qtdDisponivel;
	}

	public void setQtdDisponivel(Integer qtdDisponivel) {
		this.qtdDisponivel = qtdDisponivel;
	}

	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	// implementar metodo que apresenta qtd e titulo
	
	@Override
	public String toString() {
	    return String.format("Nome %s | autor %s | quantidade: %d", titulo, autor, qtdDisponivel);
	}
}
