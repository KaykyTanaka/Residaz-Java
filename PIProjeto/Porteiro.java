public class Porteiro extends Pessoa {
	private Reclamacao reclamacao;
	private Manutencao manutencao;
	private Encomenda encomenda;
	private Ocorrencia ocorrencia;
	
	public Porteiro( String nome, String cpf, String telefone, String email, String tipo  ){
		super( nome, cpf, telefone, email, tipo);
	}
}

