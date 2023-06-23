public class Sindico extends Pessoa {
	public Sindico(int id, String nome, String cpf, String telefone, String email, String tipo) {
		super(id, nome, cpf, telefone, email, tipo);
	}

	@Override
	public String toString() {
		return "[ID: " + getId() + "] [Nome: " + getNome() + "] [CPF: " + getCpf() + "] \n[Telefone: " + getTelefone() +
				"] [Email: " + getEmail() + "] [Tipo de usuario: " + getTipo() + "]";
	}
}
