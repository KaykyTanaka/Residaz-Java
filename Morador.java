public class Morador extends Pessoa {
	//private String apartamento;

	public Morador(int id, String nome, String cpf, String telefone, String email, String tipo) {
		super(id, nome, cpf, telefone, email, tipo);
		//setApartamento(apartamento);
	}

	/*public String getApartamento() {
		return apartamento;
	}

	public void setApartamento(String apartamento) {
		this.apartamento = apartamento;
	}*/

	@Override
	public String toString() {
		return "[ID: " + getId() + "] [Nome: " + getNome() + "] [CPF: " + getCpf() + "] \n[Telefone: " + getTelefone() +
				"] [Email: " + getEmail() + "] [Tipo de usuario: " + getTipo(); /*"] [Apartamento: " + getApartamento()
				+ "]"*/
	}
}
