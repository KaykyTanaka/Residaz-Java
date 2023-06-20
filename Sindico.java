public class Sindico extends Pessoa {
	private Multa multa;
	private Reclamacao reclamacao;
	private Manutencao manutencao;
	private Ocorrencia ocorrencia;
	
	public Sindico( String nome, String cpf, String telefone, String email, String tipo  ){
		super( nome, cpf, telefone, email, tipo);
	}
}

