import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ocorrencia {
<<<<<<< HEAD
	private String titulo;
	private String descricao;
	private String data;
	private String providencias;
	
	public Ocorrencia() {
		setTitulo( "" );
		setDescricao( "" );
		setData( "" );
		setProvidencias( "" );
	}
	
	public String getTitulo(){
=======
	private static String titulo, descricao, data, providencias;
	private static String arquivo = "dadosOcorrencia.txt",
			separador = " | ";

	public Ocorrencia() {
		setTitulo("");
		setDescricao("");
		setData("");
		setProvidencias("");
	}

	public Ocorrencia(String titulo, String descricao, String data, String providencias) {
		setTitulo(titulo);
		setDescricao(descricao);
		setData(data);
		setProvidencias(providencias);
	}

	public String getTitulo() {
>>>>>>> 83d601745bd34dc7b703bfd01adfb75b54dc5a05
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

	public String getProvidencias() {
		return data;
	}

	public void setProvidencias(String providencias) {
		this.providencias = providencias;
	}
<<<<<<< HEAD
	
	public String visualizarOcorrencia(){
		return "Titulo da encomenda: " + getTitulo() + "\nDescricao da encomenda: " + getDescricao() + 
		"\nData da encomenda: " + getData() + "Providencias.: " + getProvidencias();
	}
	public void cadastrarOcorrencia(String titulo, String descricao, String data, String providencias){
		this.titulo = titulo;  
		this.descricao = descricao;
		this.data = data;
		this.providencias = providencias;
	}
}
=======
>>>>>>> 83d601745bd34dc7b703bfd01adfb75b54dc5a05

	public String visualizarOcorrencia() {
		return "Titulo da encomenda: " + getTitulo() + "\nDescricao da encomenda: " + getDescricao() +
				"\nData da encomenda: " + getData() + "Providencias.: " + getProvidencias();
	}

	public static boolean cadastrarOcorrencia() {

		try {

			FileWriter fw = new FileWriter(arquivo, true);

			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(titulo);
			bw.write(separador);
			bw.write(descricao);
			bw.write(separador);
			bw.write(data);
			bw.write(separador);
			bw.write(providencias);
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
