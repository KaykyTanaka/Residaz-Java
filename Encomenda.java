public class Encomenda {
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
	
	public String visualizarEncomenda(){
		return "Titulo da encomenda: " + getTitulo() + "\nDescricao da encomenda: " + getDescricao() + 
		"\nData da encomenda: " + getData() + "Apart.: " + morador.getApartamento();
	}
	public void cadastrarEncomenda(String titulo, String descricao, String data, double valor, String apartamento, Pessoa pessoa[]){
		setTitulo( titulo );  
		setDescricao( descricao );
		setData( data );
		boolean nexist = false;
		for(int i=0; i<pessoa.length; i++){
			if( ((Morador)pessoa[i]).getApartamento().equalsIgnoreCase(apartamento)){
				morador.setApartamento( apartamento );
				if( i == pessoa.length-1){ nexist = true; }
			}else {
				if( nexist == true ){ morador.setApartamento ( "nao existe "); }
			}
		}
	}
}

