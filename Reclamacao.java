import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reclamacao {
	private static Morador morador;
	private static String titulo, descricao, data, autor;

	private static String arquivo = "dadosReclamacao.txt",
			separador = " | ";

	public Reclamacao() {
		setTitulo("");
		setDescricao("");
		setData("");
		setAutor("");
	}

	public Reclamacao(String titulo, String descricao, String data, Pessoa useratual) {
		setTitulo(titulo);
		setDescricao(descricao);
		setData(data);
		setAutor(useratual.getNome());

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

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String visualizarReclamacao() {
		return "Titulo da encomenda: " + getTitulo() + "\nDescricao da encomenda: " + getDescricao() +
				"\nData da encomenda: " + getData() + "Autor: " + morador.getNome();
	}

	public void cadastrarReclamacao(String titulo, String descricao, String data, Pessoa useratual) {
		setTitulo(titulo);
		setDescricao(descricao);
		setData(data);
		setAutor(useratual.getNome());
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
			bw.write(separador);
			bw.write(autor);
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
