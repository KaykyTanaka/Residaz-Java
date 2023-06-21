public class Manutencao {
	private Morador morador;
	private String titulo;
	private String descricao;
	private String data;
	private String local;
	private String tipo;
	private String autor;
	private double valor;
	
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
	public String getLocal(){
		return local;
	}
	public void setLocal(String local){
		this.local = local;
	}
	public String getTipo(){
		return tipo;
	}
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	public double getValor(){
		return valor;
	}
	public void setValor(double valor){
		this.valor = valor;
	}
	
	public String visualizarManutencao(){
		return "Titulo da multa: " + getTitulo() + "\nDescricao da multa: " + getDescricao() + "\nData da multa: " + getData() +
		"\nValor: " + getValor() + "Apart.: " + morador.getApartamento();
	}
	public void gerarRelatorioManu(String titulo, String descricao, String data, String local, String tipo, double valor){
		setTitulo( titulo );  
		setDescricao( descricao );
		setData( data );
		setLocal( local );
		setTipo( tipo );
		setValor( valor );
	}
	public void gerarRelatorioManu( String titulo, String descricao, String data, 
	String local,String tipo, double valor, Pessoa useratual){
		setTitulo( titulo );  
		setDescricao( descricao );
		setData( data );
		setLocal( local );
		setTipo( tipo );
		setValor( valor );
		morador.setApartamento( useratual.getNome() );
	}
}

