public class Pessoa {
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private String tipo;
	
	public Pessoa( String nome, String cpf, String telefone, String email, String tipo ){
		setNome( nome );
		setCpf( cpf );
		setTelefone( telefone );
		setEmail( email );
		setTipo( tipo );
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

