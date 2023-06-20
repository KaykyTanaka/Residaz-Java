public class Multa {
	private Morador morador;
	private String titulo;
	private String descricao;
	private String data;
	private double valor;
	private boolean status;
	
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
	public double getValor(){
		return valor;
	}
	public void setValor(double valor){
		this.valor = valor;
	}
	public String visualizarMulta(){
		return "Titulo da multa: " + getTitulo() + "\nDescricao da multa: " + getDescricao() + "\nData da multa: " + getData() +
		"\nValor: " + getValor() + "Apart.: " + morador.getApartamento();
	}
	public void cadastrarMulta(String titulo, String descricao, String data, double valor, String apartamento, Pessoa pessoa[]){
		setTitulo( titulo );  
		setDescricao( descricao);
		setData( data );
		setValor( valor );
		for(int i=0; i<pessoa.length; i++){
			if( ((Morador)pessoa[i]).getApartamento().equalsIgnoreCase(apartamento)){
				morador.setApartamento( apartamento );
			}
		}
		
	}
}

