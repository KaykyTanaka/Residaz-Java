import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Pessoa {
	private static int id;
	private static String nome, cpf, telefone, email, tipo;
	private static String arquivo = "dadosUsuarios.txt", separador = "|", separador2 = "\\|";
	private static String[] pessoaS = new String[20];

	private Pessoa[] pessoaNS = new Pessoa[20];
	private int idNS;
	private String nomeNS, cpfNS, telefoneNS, emailNS, tipoNS;

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
		return idNS;
	}

	public void setId(int id) {
		this.idNS = id;
	}

	public String getNome() {
		return nomeNS;
	}

	public void setNome(String nome) {
		this.nomeNS = nome;
	}

	public String getCpf() {
		return cpfNS;
	}

	public void setCpf(String cpf) {
		this.cpfNS = cpf;
	}

	public String getTelefone() {
		return telefoneNS;
	}

	public void setTelefone(String telefone) {
		this.telefoneNS = telefone;
	}

	public String getEmail() {
		return emailNS;
	}

	public void setEmail(String email) {
		this.emailNS = email;
	}

	public String getTipo() {
		return tipoNS;
	}

	public void setTipo(String tipo) {
		this.tipoNS = tipo;
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
		int qtde = 20, contador = 1;
		Pessoa[] usu = new Pessoa[qtde];
		try {
			FileReader fr = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(fr);
			while (contador < qtde && br.ready()) {
				String linha = br.readLine();
				pessoaS[contador] = linha;
				String campos[] = linha.split(separador2);
				usu[contador] = new Pessoa(Integer.parseInt(campos[0]), campos[1], campos[2], campos[3], campos[4],
						campos[5]);
				contador++;
			}
			br.close();
			fr.close();
			return usu;
		} catch (IOException e) {
			return null;
		}
	}

	public void converterPessoas(Pessoa pessoa[]) {
		for (int i = 1; i < pessoaS.length - 1 && pessoaS[i] != null; i++) {
			if (pessoaNS[i] == null) {
				String campos[] = this.pessoaS[i].split("\\|");

				pessoaNS[i] = new Pessoa(Integer.parseInt(campos[0]), campos[1], campos[2], campos[3], campos[4],
						campos[5]);
				pessoa[i] = pessoaNS[i];
			} else {
				break;
			}
		}
	}

	@Override
	public String toString() {
		return "[ID: " + getId() + "] [Nome: " + getNome() + "] [CPF: " + getCpf() + "] \n[Telefone: " + getTelefone() +
				"] [Email: " + getEmail() + "] [Tipo de usuario: " + getTipo() + "]";
	}

}
