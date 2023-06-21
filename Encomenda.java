public class Encomenda {
	private Morador morador;
	private String nome;
	private String descricao;
	private String data;
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
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
		return "Titulo da encomenda: " + getNome() + "\nDescricao da encomenda: " + getDescricao() + 
		"\nData da encomenda: " + getData() + "Apart.: " + morador.getApartamento();
	}
	public void cadastrarEncomenda(String nome, String descricao, String data, String apartamento, Pessoa pessoa[]){
		for(int i=0; i<pessoa.length; i++){
			if( ((Morador)pessoa[i]).getApartamento().equalsIgnoreCase(apartamento)){
				morador.setApartamento( apartamento );
			}
			if( i == ( pessoa.length-1) ){
				System.out.println("Apartamento invalido, falha no cadastro...");
				return;
			}
		}
		setNome( nome );  
		setDescricao( descricao );
		setData( data );
	}
}

