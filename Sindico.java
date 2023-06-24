public class Sindico extends Pessoa {
	public Sindico(String nome, String cpf, String telefone, String email, String tipo) {
		super(nome, cpf, telefone, email, tipo);
	}

	@Override
	public String toString() {
		return "[Nome: " + getNome() + "] [CPF: " + getCpf() + "] \n[Telefone: " + getTelefone() +
				"] [Email: " + getEmail() + "] [Tipo de usuario: " + getTipo() + "]";
	}
}
