import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Encomenda {
	private static String nome, descricao, data, apartamento;
	private static String arquivo = "dadosEncomenda.txt",
			separador = " | ";

	public Encomenda() {
		setNome("");
		setDescricao("");
		setData("");
		setApartamento("");
	}

	public Encomenda(String nome, String descricao, String data, String apartamento) {
		setNome(nome);
		setDescricao(descricao);
		setData(data);
		setApartamento(apartamento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getApartamento() {
		return apartamento;
	}

	public void setApartamento(String apartamento) {
		this.apartamento = apartamento;
	}

	public String visualizarEncomenda() {
		return "Titulo da encomenda: " + getNome() + "\nDescricao da encomenda: " + getDescricao() +
				"\nData da encomenda: " + getData() + "Apart.: " + getApartamento();
	}

	public static boolean cadastrarEncomenda() {

		try {

			FileWriter fw = new FileWriter(arquivo, true);

			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(nome);
			bw.write(separador);
			bw.write(descricao);
			bw.write(separador);
			bw.write(data);
			bw.write(separador);
			bw.write(apartamento);
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

}
