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
		if(titulo == null){
			
			throw new IllegalArgumentException("Titulo Invalido! Nao Pode Ser Nulo!");
			}
		if(titulo.length() < 2){
			
			throw new IllegalArgumentException("Titulo Invalido! Nao Pode ter menos de 2 caracteres!");
			}
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if(descricao == null){
			
			throw new IllegalArgumentException("Descricao Invalida! Nao Pode Ser Nulo!");
			}
		if(descricao.length() < 2){
			
			throw new IllegalArgumentException("Descricao Invalida! Faca uma descricao melhor!");
			}
		this.descricao = descricao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		if(data == null){
			
			throw new IllegalArgumentException("Data Invalida! Nao Pode Ser Nulo!");
			}
		if(data.length() < 8){
			
			throw new IllegalArgumentException("Data Invalido! Nao Pode ter menos de 8 caracteres!");
			}
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if(valor < 0){
			
			throw new IllegalArgumentException("Valor Invalido! Digite um valor correto!");
			}
		this.valor = valor;
	}

	public String getApartamento() {
		return apartamento;
	}

	public void setApartamento(String apartamento) {
		if(apartamento == null){
			
			throw new IllegalArgumentException("apartamento Invalido! Nao Pode Ser Nulo!");
			}
		if(apartamento.length() < 1){
			
			throw new IllegalArgumentException("apartamento Invalido! Este apartamento nao existe!");
			}
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
