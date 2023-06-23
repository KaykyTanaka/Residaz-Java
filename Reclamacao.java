public class Reclamacao {
	private Morador morador;
	private String titulo;
	private String descricao;
	private String data;
	private String autor;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String visualizarReclamacao() {
		return "Titulo da encomenda: " + getTitulo() + "\nDescricao da encomenda: " + getDescricao() +
				"\nData da encomenda: " + getData() + "Autor: " + morador.getNome();
	}

	public void cadastrarReclamacao(String titulo, String descricao, String data, Pessoa useratual) {
		setTitulo(titulo);
		setDescricao(descricao);
		setData(data);
		setAutor(useratual.getNome());
	}
}
