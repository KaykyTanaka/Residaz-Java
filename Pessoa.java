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
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public static boolean cadastrarUsuario() {

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
