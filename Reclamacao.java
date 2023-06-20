public class Reclamacao {
	private Morador morador;
	private String titulo;
	private String descricao;
	private String data;
	
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
	
	public String visualizarReclamacao(){
		return "Titulo da encomenda: " + getTitulo() + "\nDescricao da encomenda: " + getDescricao() + 
		"\nData da encomenda: " + getData() + "Autor: ";
	}
	public void cadastrarReclamacao(String titulo, String descricao, String data){
		setTitulo( titulo );  
		setDescricao( descricao );
		setData( data );
		
	}
}

