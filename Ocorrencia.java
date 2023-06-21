public class Ocorrencia {
	private String titulo;
	private String descricao;
	private String data;
	private String providencias;
	
	public Ocorrencia() {
		setTitulo( "" );
		setDescricao( "" );
		setData( "" );
		setProvidencias( "" );
	}
	
	public String getTitulo(){
		return titulo;
	}
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	public String getDescricao(){
		return descricao;
	}
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	public String getData(){
		return data;
	}
	public void setData(String data){
		this.data = data;
	}
	public String getProvidencias(){
		return data;
	}
	public void setProvidencias(String providencias){
		this.providencias = providencias;
	}
	
	public String visualizarOcorrencia(){
		return "Titulo da encomenda: " + getTitulo() + "\nDescricao da encomenda: " + getDescricao() + 
		"\nData da encomenda: " + getData() + "Providencias.: " + getProvidencias();
	}
	public void cadastrarOcorrencia(String titulo, String descricao, String data, String providencias){
		this.titulo = titulo;  
		this.descricao = descricao;
		this.data = data;
		this.providencias = providencias;
	}
}

