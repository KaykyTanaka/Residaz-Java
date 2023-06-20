public class Morador extends Pessoa {
	private Multa multa;
	private Reclamacao reclamacao;
	private Manutencao manutencao;
	private Encomenda encomenda;
	private Ocorrencia ocorrencia;
	private String apartamento;
	
	public Morador( String nome, String cpf, String telefone, String email, String tipo  ){
		super( nome, cpf, telefone, email, tipo);
	}
	public String getApartamento(){
		return apartamento;
	}
	public void setApartamento(String apartamento){
		this.apartamento = apartamento;
	}
}

