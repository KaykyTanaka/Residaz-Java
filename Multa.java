import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Multa {
	private static String titulo, descricao, data, apartamento;
	private static double valor;

	private static String arquivo = "dadosMulta.txt",
			separador = " | ";

	public Multa() {
		setTitulo("");
		setDescricao("");
		setData("");
		setApartamento("");
		setValor(0.0);
	}

	public Multa(String titulo, String descricao, String data, double valor, String apartamento) {
		setTitulo(titulo);
		setDescricao(descricao);
		setData(data);
		setApartamento(apartamento);
		setValor(valor);

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getApartamento() {
		return apartamento;
	}

	public void setApartamento(String apartamento) {
		this.apartamento = apartamento;
	}

	public String visualizarMulta() {
		return "Titulo da multa: " + getTitulo() + "\nDescricao da multa: " + getDescricao() + "\nData da multa: "
				+ getData() +
				"\nValor: " + getValor() + "Apart.: " + getApartamento();
	}

	public static boolean cadastrarMulta() {

		try {

			FileWriter fw = new FileWriter(arquivo, true);

			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(titulo);
			bw.write(separador);
			bw.write(descricao);
			bw.write(separador);
			bw.write(data);
			bw.write(separador);
			bw.write(apartamento);
			bw.write(separador);
			bw.write("" + valor);
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
