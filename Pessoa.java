public class Pessoa {
	private int id;
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private String tipo;
	
	public Pessoa(){}
	
	public Pessoa(int id, String nome, String cpf, String telefone, String email, String tipo ){
		setId( id );
		setNome( nome );
		setCpf( cpf );
		setTelefone( telefone );
		setEmail( email );
		setTipo( tipo );
	}
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getCpf(){
		return cpf;
	}
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	public String getTelefone(){
		return telefone;
	}
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getTipo(){
		return tipo;
	}
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	@Override
	public String toString(){
		return "Nome: " + getNome() + "\nCpf: " + getCpf() + "\nTelefone: " + getTelefone() + "\nEmail: " + getEmail();
	}
}

