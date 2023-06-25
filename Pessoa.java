import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Pessoa {
	private static String nome, cpf, telefone, email, tipo;
	private static String arquivo = "dadosUsuarios.txt", separador = "|";

	public Pessoa() {
		setNome("");
		setCpf("");
		setTelefone("");
		setEmail("");
		setTipo("");
	}

	public Pessoa(String nome, String cpf, String telefone, String email, String tipo) {

		setNome(nome);
		setCpf(cpf);
		setTelefone(telefone);
		setEmail(email);
		setTipo(tipo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null) {

			throw new IllegalArgumentException("Nome Invalido! Nao Pode Ser Nulo!");
		}
		if (nome.length() < 3) {

			throw new IllegalArgumentException("Nome Invalido! Coloque o nome certo!");
		}
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf == null) {

			throw new IllegalArgumentException("CPF Invalido! Nao Pode Ser Nulo!");
		}
		if (cpf.length() < 11) {

			throw new IllegalArgumentException("CPF Invalido! Coloque um cpf dessa forma: xxx-xxx-xxx-xx !");
		}
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if (telefone == null) {

			throw new IllegalArgumentException("Telefone Invalido! Nao Pode Ser Nulo!");
		}
		if (telefone.length() < 8) {

			throw new IllegalArgumentException("Telefone Invalido! Coloque um Telefone dessa forma: xxxx-xxxx !");
		}
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email == null) {

			throw new IllegalArgumentException("Email Invalido! Nao Pode Ser Nulo!");
		}
		if (email.length() < 10) {

			throw new IllegalArgumentException("Email Invalido! Coloque um email dessa forma: x@xxxxx.xxx !");
		}
		this.email = email;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tipo == null) {

			throw new IllegalArgumentException("Tipo Invalido! Nao Pode Ser Nulo!");
		}
		if (tipo.length() < 1) {

			throw new IllegalArgumentException("Tipo Invalido! Coloque um tipo valido!");
		}
		this.tipo = tipo;
	}

	public static boolean cadastrar() {

		try {

			FileWriter fw = new FileWriter(arquivo, true);

			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(nome);
			bw.write(separador);
			bw.write(cpf);
			bw.write(separador);
			bw.write(telefone);
			bw.write(separador);
			bw.write(email);
			bw.write(separador);
			bw.write(tipo);
			bw.newLine();

			bw.close();
			fw.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static boolean lerDoArquivo() {
		try {

			FileReader fr = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(fr);
			while (br.ready()) {
				String linha = br.readLine();
				System.out.println(linha);
			}
			br.close();
			fr.close();
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	@Override
	public String toString() {
		return "[Nome: " + getNome() + "] [CPF: " + getCpf() + "] \n[Telefone: " + getTelefone() +
				"] [Email: " + getEmail() + "] [Tipo de usuario: " + getTipo() + "]";
	}

}
