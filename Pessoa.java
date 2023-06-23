import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Pessoa {
	private static int id;
	private static String nome, cpf, telefone, email, tipo;
	private static String arquivo = "dadosUsuarios.txt",
			separador = " | ";

	public Pessoa() {
		setId(0);
		setNome("");
		setCpf("");
		setTelefone("");
		setEmail("");
		setTipo("");
	}

	public Pessoa(int id, String nome, String cpf, String telefone, String email, String tipo) {
		setId(id);
		setNome(nome);
		setCpf(cpf);
		setTelefone(telefone);
		setEmail(email);
		setTipo(tipo);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nCpf: " + getCpf() + "\nTelefone: " + getTelefone() + "\nEmail: " + getEmail();
	}

	public static boolean cadastrarUsuario() {

		try {

			FileWriter fw = new FileWriter(arquivo, true);

			BufferedWriter bw = new BufferedWriter(fw);
			String idString = Integer.toString(id);

			bw.write(idString);
			bw.write(separador);
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

	public static Pessoa[] leDoArquivoEGeraUmVetor() {

		int qtde = 100, contador = 0;

		Pessoa[] usu = new Pessoa[qtde];

		try {

			FileReader fr = new FileReader(arquivo);

			BufferedReader br = new BufferedReader(fr);

			while (contador < qtde && br.ready()) {

				String linha = br.readLine();

				// System.out.println ( linha );

				String campos[] = linha.split(separador);

				usu[contador++] = new Pessoa(Integer.parseInt(campos[0]), campos[1], campos[2], campos[3], campos[4],
						campos[5]);

			}

			br.close();

			fr.close();

			return usu;

		} catch (IOException e) {

			return null;
		}
	}
}
