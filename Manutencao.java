import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Manutencao {
	private static String titulo, descricao, data, local, tipo, apartamento;
	private static double valor;
	private static String arquivo = "dadosManutencao.txt",
			separador = " | ";

	public Manutencao() {

		setTitulo("");
		setDescricao("");
		setData("");
		setLocal("");
		setTipo("");
		setApartamento("");
		setValor(0.0);
	}

	public Manutencao(String titulo, String descricao, String data, String local, String tipo, String apartamento,
			double valor) {
		setTitulo(titulo);
		setDescricao(descricao);
		setData(data);
		setLocal(local);
		setTipo(tipo);
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

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	public String visualizarManutencao() {
		return "Titulo da multa: " + getTitulo() + "\nDescricao da multa: " + getDescricao() + "\nData da multa: "
				+ getData() +
				"\nValor: " + getValor() + "Apart.: " + getApartamento();
	}

	public static boolean cadastrarManutencao() {

		try {

			FileWriter fw = new FileWriter(arquivo, true);

			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(titulo);
			bw.write(separador);
			bw.write(descricao);
			bw.write(separador);
			bw.write(data);
			bw.write(separador);
			bw.write(local);
			bw.write(separador);
			bw.write(tipo);
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
