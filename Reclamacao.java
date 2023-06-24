import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reclamacao {

	private static String titulo, descricao, data;

	private static String arquivo = "dadosReclamacao.txt",
			separador = " | ";

	public Reclamacao() {
		setTitulo("");
		setDescricao("");
		setData("");

	}

	public Reclamacao(String titulo, String descricao, String data) {
		setTitulo(titulo);
		setDescricao(descricao);
		setData(data);

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

	public String visualizarReclamacao() {
		return "Titulo da encomenda: " + getTitulo() + "\nDescricao da encomenda: " + getDescricao() +
				"\nData da encomenda: " + getData();
	}

	public void cadastrarReclamacao(String titulo, String descricao, String data, Pessoa useratual) {
		setTitulo(titulo);
		setDescricao(descricao);
		setData(data);
	}

	public static boolean cadastrarReclamacao() {

		try {

			FileWriter fw = new FileWriter(arquivo, true);

			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(titulo);
			bw.write(separador);
			bw.write(descricao);
			bw.write(separador);
			bw.write(data);
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
