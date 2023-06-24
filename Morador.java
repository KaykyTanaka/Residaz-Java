public class Morador extends Pessoa {

	public Morador(int id, String nome, String cpf, String telefone, String email, String tipo) {
		super(nome, cpf, telefone, email, tipo);
	}

	@Override
	public String toString() {
		return "[Nome: " + getNome() + "] [CPF: " + getCpf() + "] \n[Telefone: " + getTelefone() +
				"] [Email: " + getEmail() + "] [Tipo de usuario: " + getTipo();
	}
}
