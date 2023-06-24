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
		if (titulo == null) {

			throw new IllegalArgumentException("Titulo Invalido! Nao Pode Ser Nulo!");
		}
		if (titulo.length() < 2) {

			throw new IllegalArgumentException("Titulo Invalido! Nao Pode ter menos de 2 caracteres!");
		}
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao == null) {

			throw new IllegalArgumentException("Descricao Invalida! Nao Pode Ser Nulo!");
		}
		if (descricao.length() < 2) {

			throw new IllegalArgumentException("Descricao Invalida! Faca uma descricao melhor!");
		}
		this.descricao = descricao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		if (data == null) {

			throw new IllegalArgumentException("Data Invalida! Nao Pode Ser Nulo!");
		}
		if (data.length() < 8) {

			throw new IllegalArgumentException("Data Invalido! Nao Pode ter menos de 8 caracteres!");
		}
		this.data = data;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		if (local == null) {

			throw new IllegalArgumentException("Local Invalido! Nao Pode Ser Nulo!");
		}
		if (local.length() < 4) {

			throw new IllegalArgumentException("Local Invalido! Digite um lugar que existe!");
		}
		this.local = local;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tipo == null) {

			throw new IllegalArgumentException("Tipo Invalido! Nao Pode Ser Nulo!");
		}
		if (tipo.length() < 2) {

			throw new IllegalArgumentException("Tipo Invalido! Tipo de manutençao nao existente!");
		}
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {

		if (valor < 0) {

			throw new IllegalArgumentException("Valor Invalido! Digite um valor correto!");
		}
		this.valor = valor;
	}

	public String getApartamento() {

		return apartamento;
	}

	public void setApartamento(String apartamento) {
		if (apartamento == null) {

			throw new IllegalArgumentException("apartamento Invalido! Nao Pode Ser Nulo!");
		}
		if (apartamento.length() < 1) {

			throw new IllegalArgumentException("apartamento Invalido! Este apartamento nao existe!");
		}
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
