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
		if(nome == null){
			
			throw new IllegalArgumentException("Nome Invalido! Nao Pode Ser Nulo!");
			}
		if(nome.length() < 3){
			
			throw new IllegalArgumentException("Nome Invalido! Coloque o nome certo!");
			}
		this.nome = nome;
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
