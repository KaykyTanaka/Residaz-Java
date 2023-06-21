<<<<<<< HEAD
import java.util.Scanner;
public class Residaz {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		Pessoa pessoa[] = new Pessoa[50];
		Pessoa useratual = new Pessoa();
		Manutencao manutencao[] = new Manutencao[20];
		Multa multa[] = new Multa[20];
		Ocorrencia ocorrencia[] = new Ocorrencia[20];
		Reclamacao reclamacao[] = new Reclamacao[20];
		Encomenda encomenda[] = new Encomenda[20];
		int opcao = 0;
		int idsessao = 0;
		int saida = 0;
		int idusuario = 0;
		int posicaouser = 0;
		int posicaomulta = 0;
		int posicaomanut = 0;
		int posicaooccor = 0;
		int posicaorecla = 0;
		int posicaoencom = 0;
		do{
			pessoa[0] = new Sindico( 0, "Sindico Padrao", "Sem CPF", "Sem Telefone", "Sem email", "Sindico" );
			if( idsessao == 0 ){
				useratual = pessoa[idsessao];
				idsessao = 1;
			}
			if( useratual instanceof Sindico){
				System.out.println("[" + useratual.getNome() + "]");
				System.out.println("=== Residaz ===");
				System.out.println("1) Cadastrar Usuario");
				System.out.println("2) Cadastrar Ocorrencia");
				System.out.println("3) Gerar Relatorio de Manutencao");
				System.out.println("4) Cadastrar Multa");
				System.out.println("5) Visualizar Ocorrencias");
				System.out.println("6) Visualizar Historio de Reclamacao");
				System.out.println("7) Visualizar Usuarios");
				System.out.println("9) Visualizar Manutencao");
				System.out.println("10) Trocar Usuario");
				System.out.println("-----------");
				System.out.println("11) Sair");
				System.out.println("-----------");
				System.out.print(">>> Opcao: ");
				saida = 11;
				opcao = ler.nextInt();
			}else
			if( useratual instanceof Morador){
				System.out.println("[Morador: " + useratual.getNome() + "]");
				System.out.println("=== Residaz ===");
				System.out.println("1) Cadastrar Reclamação");
				System.out.println("2) Solicitar Manutenção");
				System.out.println("3) Visualizar Multa");
				System.out.println("4) Visualizar Encomenda");
				System.out.println("5) Visualizar Ocorrencias");
				System.out.println("6) Visualizar Manutencao");
				System.out.println("7) Trocar Usuario");
				System.out.println("-----------");
				System.out.println("8) Sair");
				System.out.println("-----------");
				System.out.print(">>> Opcao: ");
				saida = 8;
				opcao = ler.nextInt();
			}else
			if( useratual instanceof Porteiro){
				System.out.println("[Porteiro: " + useratual.getNome() + "]");
				System.out.println("=== Residaz ===");
				System.out.println("1) Cadastrar Encomenda");
				System.out.println("2) Cadastrar Ocorrencia");
				System.out.println("3) Visualizar Ocorrencia");
				System.out.println("4) Visualizar Encomenda");
				System.out.println("5) Visualizar Manutencao");
				System.out.println("6) Trocar Usuario");
				System.out.println("-----------");
				System.out.println("7) Sair");
				System.out.println("-----------");
				System.out.print(">>> Opcao: ");
				saida = 7;
				opcao = ler.nextInt();
			}else
			if( useratual instanceof Zelador){
				System.out.println("[Zelador: " + useratual.getNome() + "]");
				System.out.println("=== Residaz ===");
				System.out.println("1) Gerar Relatorio de Manutencao");
				System.out.println("2) Cadastrar Ocorrencia");
				System.out.println("3) Visualizar Historico de Reclamacao");
				System.out.println("4) Visualizar Manutencao");
				System.out.println("5) Visualizar Ocorrencia");
				System.out.println("6) Trocar Usuario");
				System.out.println("-----------");
				System.out.println("7) Sair");
				System.out.println("-----------");
				System.out.print(">>> Opcao: ");
				saida = 7;
				opcao = ler.nextInt();
			}
			switch( ( opcao == saida ) ? 0 : opcao){
				case 0: break;
				case 1:
				
				if ( useratual instanceof Sindico){
					//Tipo
					posicaouser++;
					System.out.println("Qual o tipo de usuario (Sindico/Morador/Porteiro/Zelador): ");
					ler.nextLine();
					String tipousuario = ler.nextLine();
					boolean igual = false;
					if( tipousuario.equalsIgnoreCase("sindico") || tipousuario.equalsIgnoreCase("morador")
					|| tipousuario.equalsIgnoreCase("porteiro") || tipousuario.equalsIgnoreCase("zelador") ){
						igual = true;
					}
					if( igual == false ){
						do{
							System.out.println("Por favor, selecione apenas [Sindico], [Morador], [Porteiro] ou [Zelador]: ");
							tipousuario = ler.nextLine();
							if( tipousuario.equalsIgnoreCase("sindico") || tipousuario.equalsIgnoreCase("morador")
							|| tipousuario.equalsIgnoreCase("porteiro") || tipousuario.equalsIgnoreCase("zelador") ){
							igual = true;
							}
						}while( igual == false);
					}
					//O resto (id, nome, cpf, telefone, email) <- pra me localiza
					idusuario++;
					System.out.println("Digite o nome do usuario: ");
					String nomeusuario = ler.nextLine();
					System.out.println("Digite o CPF do usuario: ");
					String cpf = ler.nextLine();
					System.out.println("Digite o telefone do usuario: ");
					String telefone = ler.nextLine();
					System.out.println("Digite o email do usuario: ");
					String email = ler.nextLine();
					if( tipousuario.equalsIgnoreCase("sindico") ){
						pessoa[posicaouser] = new Sindico( idusuario, nomeusuario, cpf, telefone, email, tipousuario);
					}else if( tipousuario.equalsIgnoreCase("morador") ){
						System.out.println("Digite o apartamento do usuario: ");
						String apartamento = ler.nextLine();
						pessoa[posicaouser] = new Morador( idusuario, nomeusuario, cpf, telefone, email, tipousuario, apartamento );
					}else if( tipousuario.equalsIgnoreCase("porteiro") ){
						pessoa[posicaouser] = new Porteiro( idusuario, nomeusuario, cpf, telefone, email, tipousuario);
					}else if( tipousuario.equalsIgnoreCase("zelador") ){
						pessoa[posicaouser] = new Zelador( idusuario, nomeusuario, cpf, telefone, email, tipousuario);
					}
					
				}else if ( useratual instanceof Morador){
					ler.nextLine();
					System.out.println("Digite o titulo da reclamacao: ");
					String titulo = ler.nextLine();
					System.out.println("Digite a descricao da reclamacao: ");
					String descricao = ler.nextLine();
					System.out.println("Digite o data que a reclamacao foi feita: ");
					String data = ler.nextLine();
					reclamacao[posicaorecla].cadastrarReclamacao( titulo, descricao, data, useratual );
				}else if ( useratual instanceof Porteiro){
					ler.nextLine();
					System.out.println("Digite o nome da encomenda: ");
					String nome = ler.nextLine();
					System.out.println("Digite a descricao da encomenda: ");
					String descricao = ler.nextLine();
					System.out.println("Digite a data de chegada da encomenda: ");
					String data = ler.nextLine();
					System.out.println("Digite o apartamento da encomenda: ");
					String apart = ler.nextLine();
					encomenda[posicaoencom].cadastrarEncomenda( nome, descricao, data, apart, pessoa);
					posicaoencom++;
				}else if ( useratual instanceof Zelador){
					ler.nextLine();
					System.out.println("Digite o titulo da manutencao: ");
					String titulo = ler.nextLine();
					System.out.println("Digite a descricao da manutencao: ");
					String descricao = ler.nextLine();
					System.out.println("Digite a data da manutencao: ");
					String data = ler.nextLine();
					System.out.println("Digite o local da manutencao: ");
					String local = ler.nextLine();
					System.out.println("Digite o tipo de manutencao: ");
					String tipo = ler.nextLine();
					System.out.println("Digite o valor da manutencao: ");
					double valor = ler.nextDouble();
					manutencao[posicaomanut].gerarRelatorioManu( titulo, descricao, data, local, tipo, valor );
					posicaomanut++;
				}
				break;
				case 2:
				if ( useratual instanceof Sindico){
					ler.nextLine();
					ocorrencia[posicaooccor] = new Ocorrencia();
					System.out.println("Digite o titulo da ocorrencia: ");
					String titulo = ler.nextLine();
					System.out.println("Digite a descricao da ocorrencia: ");
					String descricao = ler.nextLine();
					System.out.println("Digite a data da ocorrencia: ");
					String data = ler.nextLine();
					System.out.println("Digite a providencias da ocorrencia: ");
					String providencia = ler.nextLine();
					ocorrencia[posicaooccor].setTitulo( titulo );
					//ocorrencia[posicaooccor].cadastrarOcorrencia( titulo, descricao, data, providencia );
					posicaooccor++;
				}else 
				if ( useratual instanceof Morador){
					ler.nextLine();
					System.out.println("Digite o titulo da manutencao: ");
					String titulo = ler.nextLine();
					System.out.println("Digite a descricao da manutencao: ");
					String descricao = ler.nextLine();
					System.out.println("Digite a data da manutencao: ");
					String data = ler.nextLine();
					System.out.println("Digite o local da manutencao: ");
					String local = ler.nextLine();
					System.out.println("Digite o tipo de manutencao: ");
					String tipo = ler.nextLine();
					System.out.println("Digite o custo da manutencao: ");
					double custo = ler.nextDouble();
					manutencao[posicaomanut].gerarRelatorioManu( titulo, descricao, data, local, tipo, custo );
					posicaooccor++;
				}else 
				if ( useratual instanceof Porteiro){
					ler.nextLine();
					System.out.println("Digite o titulo da ocorrencia: ");
					String titulo = ler.nextLine();
					System.out.println("Digite a descricao da ocorrencia: ");
					String descricao = ler.nextLine();
					System.out.println("Digite a data da ocorrencia: ");
					String data = ler.nextLine();
					System.out.println("Digite a providencias da ocorrencia: ");
					String providencia = ler.nextLine();
					ocorrencia[posicaooccor].cadastrarOcorrencia( titulo, descricao, data, providencia );
					posicaooccor++;
				}else 
				if ( useratual instanceof Zelador){
					ler.nextLine();
					System.out.println("Digite o titulo da ocorrencia: ");
					String titulo = ler.nextLine();
					System.out.println("Digite a descricao da ocorrencia: ");
					String descricao = ler.nextLine();
					System.out.println("Digite a data da ocorrencia: ");
					String data = ler.nextLine();
					System.out.println("Digite a providencias da ocorrencia: ");
					String providencia = ler.nextLine();
					ocorrencia[posicaooccor].cadastrarOcorrencia( titulo, descricao, data, providencia );
					posicaooccor++;
				}
				break;
				case 3:
				if ( useratual instanceof Sindico){
					ler.nextLine();
					System.out.println("Digite o titulo da manutencao: ");
					String titulo = ler.nextLine();
					System.out.println("Digite a descricao da manutencao: ");
					String descricao = ler.nextLine();
					System.out.println("Digite a data da manutencao: ");
					String data = ler.nextLine();
					System.out.println("Digite o local da manutencao: ");
					String local = ler.nextLine();
					System.out.println("Digite o tipo de manutencao: ");
					String tipo = ler.nextLine();
					System.out.println("Digite o valor da manutencao: ");
					double valor = ler.nextDouble();
					manutencao[posicaomanut].gerarRelatorioManu( titulo, descricao, data, local, tipo, valor );
					posicaomanut++;
				}else if ( useratual instanceof Morador){
					
				}else if ( useratual instanceof Porteiro){
					
				}else if ( useratual instanceof Zelador){
					
				}
				break;
				case 4:
				if ( useratual instanceof Sindico){
					ler.nextLine();
					System.out.println("Digite o titulo da multa: ");
					String titulo = ler.nextLine();
					System.out.println("Digite a descricao da multa: ");
					String descricao = ler.nextLine();
					System.out.println("Digite a data da multa: ");
					String data = ler.nextLine();
					System.out.println("Digite o valor da multa: ");
					double valor = ler.nextDouble();
					System.out.println("Digite o apartamento do responsavel: ");
					String apartamento = ler.nextLine();
					multa[posicaomulta].cadastrarMulta( titulo, descricao, data, valor, apartamento, pessoa);
				}else if ( useratual instanceof Morador){
					
				}else if ( useratual instanceof Porteiro){
					
				}else if ( useratual instanceof Zelador){
					
				}
				break;
				case 5:
				if ( useratual instanceof Sindico){
					
				}else if ( useratual instanceof Morador){
					
				}else if ( useratual instanceof Porteiro){
					
				}else if ( useratual instanceof Zelador){
					
				}
				break;
				case 6:
				if ( useratual instanceof Sindico){
					
				}else if ( useratual instanceof Morador){
					
				}else if ( useratual instanceof Porteiro){
					System.out.println("Selecione um dos seguintes usuarios pelo id: ");
					for(int i = 0;i<pessoa.length && pessoa[i] != null;i++){
						System.out.println(pessoa[i]);
					}
					System.out.print("ID: ");
					int opcao2 = ler.nextInt();
					if( opcao2 < 0 || pessoa[opcao2] == null ){
						do{
							System.out.println("ID incorreto, tente novamente: ");
							System.out.print("ID: ");
							opcao2 = ler.nextInt();
						}while(opcao2 < 0 || pessoa[opcao2] == null);
					}
					useratual = pessoa[opcao2];
				}else if ( useratual instanceof Zelador){
					System.out.println("Selecione um dos seguintes usuarios pelo id: ");
					for(int i = 0;i<pessoa.length && pessoa[i] != null;i++){
						System.out.println(pessoa[i]);
					}
					System.out.print("ID: ");
					int opcao2 = ler.nextInt();
					if( opcao2 < 0 || pessoa[opcao2] == null ){
						do{
							System.out.println("ID incorreto, tente novamente: ");
							System.out.print("ID: ");
							opcao2 = ler.nextInt();
						}while(opcao2 < 0 || pessoa[opcao2] == null);
					}
					useratual = pessoa[opcao2];
				}
				break;
				case 7: 
				if ( useratual instanceof Sindico){
					
				}else if ( useratual instanceof Morador){
					System.out.println("Selecione um dos seguintes usuarios pelo id: ");
					for(int i = 0;i<pessoa.length && pessoa[i] != null;i++){
						System.out.println(pessoa[i]);
					}
					System.out.print("ID: ");
					int opcao2 = ler.nextInt();
					if( opcao2 < 0 || pessoa[opcao2] == null ){
						do{
							System.out.println("ID incorreto, tente novamente: ");
							System.out.print("ID: ");
							opcao2 = ler.nextInt();
						}while(opcao2 < 0 || pessoa[opcao2] == null);
					}
					useratual = pessoa[opcao2];
				}else if ( useratual instanceof Porteiro){
					
				}else if ( useratual instanceof Zelador){
					
				}
				break;
				case 8: 
				if ( useratual instanceof Sindico){
					
				}else if ( useratual instanceof Morador){
					break;
				}else if ( useratual instanceof Porteiro){
					System.out.println("[Opcao Incorreta]!");break;
				}else if ( useratual instanceof Zelador){
					System.out.println("[Opcao Incorreta]!");break;
				}
				break;
				case 9:
				if ( useratual instanceof Sindico){
					
					break;
				}else if ( useratual instanceof Morador){
					System.out.println("[Opcao Incorreta]!");break;
				}else if ( useratual instanceof Porteiro){
					System.out.println("[Opcao Incorreta]!");break;
				}else if ( useratual instanceof Zelador){
					System.out.println("[Opcao Incorreta]!");break;
				}
				break;
				case 10:
				if ( useratual instanceof Sindico){
					if( pessoa[1] == null ){
						System.out.println("Ainda nao ha usuarios cadastrados!");
						break;
					}else{
						System.out.println("Selecione um dos seguintes usuarios pelo id: ");
						for(int i = 0;i<pessoa.length && pessoa[i] != null;i++){
							System.out.println(pessoa[i]);
						}
						System.out.print("ID: ");
						int opcao2 = ler.nextInt();
						if( opcao2 < 0 || pessoa[opcao2] == null ){
							do{
								System.out.println("ID incorreto, tente novamente: ");
								System.out.print("ID: ");
								opcao2 = ler.nextInt();
							}while(opcao2 < 0 || pessoa[opcao2] == null);
						}
						useratual = pessoa[opcao2];
					}
				}else if ( useratual instanceof Morador){
					System.out.println("[Opcao Incorreta]!");break;
				}else if ( useratual instanceof Porteiro){
					System.out.println("[Opcao Incorreta]!");break;
				}else if ( useratual instanceof Zelador){
					System.out.println("[Opcao Incorreta]!");break;
				}
				break;
				default: System.out.println("[Opcao Incorreta]!");break;
			}
		}while(opcao != saida);
	}
}

=======
import java.util.Scanner;
import java.io.IOException;

public class Residaz {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Pessoa pessoa[] = new Pessoa[50];
		Pessoa useratual = new Pessoa();
		Manutencao manutencao[] = new Manutencao[20];
		Multa multa[] = new Multa[20];
		Reclamacao reclamacao[] = new Reclamacao[20];
		Encomenda encomenda[] = new Encomenda[20];
		int opcao = 0;
		int idsessao = 0;
		int saida = 0;
		int idusuario = 0;
		int posicaouser = 0;
		int posicaomulta = 0;
		int posicaomanut = 0;
		int posicaorecla = 0;
		int posicaoencom = 0;
		do {
			pessoa[0] = new Sindico(0, "Sindico Padrao", "Sem CPF", "Sem Telefone", "Sem email", "Sindico");
			if (idsessao == 0) {
				useratual = pessoa[idsessao];
				idsessao = 1;
			}
			if (useratual instanceof Sindico) {
				System.out.println("[" + useratual.getNome() + "]");
				System.out.println("=== Residaz ===");
				System.out.println("1) Cadastrar Usuario");
				System.out.println("2) Cadastrar Ocorrencia");
				System.out.println("3) Gerar Relatorio de Manutencao");
				System.out.println("4) Cadastrar Multa");
				System.out.println("5) Visualizar Ocorrencias");
				System.out.println("6) Visualizar Historio de Reclamacao");
				System.out.println("7) Visualizar Usuarios");
				System.out.println("9) Visualizar Manutencoes");
				System.out.println("10) Trocar Usuario");
				System.out.println("-----------");
				System.out.println("11) Sair");
				System.out.println("-----------");
				System.out.print(">>> Opcao: ");
				saida = 11;
				opcao = ler.nextInt();
			} else if (useratual instanceof Morador) {
				System.out.println("[Morador: " + useratual.getNome() + "]");
				System.out.println("=== Residaz ===");
				System.out.println("1) Cadastrar Reclamação");
				System.out.println("2) Solicitar Manutenção");
				System.out.println("3) Visualizar Multa");
				System.out.println("4) Visualizar Encomenda");
				System.out.println("5) Visualizar Ocorrencias");
				System.out.println("6) Visualizar Manutencoes");
				System.out.println("7) Trocar Usuario");
				System.out.println("-----------");
				System.out.println("8) Sair");
				System.out.println("-----------");
				System.out.print(">>> Opcao: ");
				saida = 8;
				opcao = ler.nextInt();
			} else if (useratual instanceof Porteiro) {
				System.out.println("[Porteiro: " + useratual.getNome() + "]");
				System.out.println("=== Residaz ===");
				System.out.println("1) Cadastrar Encomenda");
				System.out.println("2) Cadastrar Ocorrencia");
				System.out.println("3) Visualizar Ocorrencias");
				System.out.println("4) Visualizar Encomenda");
				System.out.println("5) Visualizar Manutencoes");
				System.out.println("6) Trocar Usuario");
				System.out.println("-----------");
				System.out.println("7) Sair");
				System.out.println("-----------");
				System.out.print(">>> Opcao: ");
				saida = 7;
				opcao = ler.nextInt();
			} else if (useratual instanceof Zelador) {
				System.out.println("[Zelador: " + useratual.getNome() + "]");
				System.out.println("=== Residaz ===");
				System.out.println("1) Gerar Relatorio de Manutencao");
				System.out.println("2) Cadastrar Ocorrencia");
				System.out.println("3) Visualizar Historico de Reclamacao");
				System.out.println("4) Visualizar Manutencoes");
				System.out.println("5) Visualizar Ocorrencias");
				System.out.println("6) Trocar Usuario");
				System.out.println("-----------");
				System.out.println("7) Sair");
				System.out.println("-----------");
				System.out.print(">>> Opcao: ");
				saida = 7;
				opcao = ler.nextInt();
			}
			switch ((opcao == saida) ? 0 : opcao) {
				case 0:
					break;
				case 1:

					if (useratual instanceof Sindico) {
						// Tipo
						posicaouser++;
						System.out.println("Qual o tipo de usuario (Sindico/Morador/Porteiro/Zelador): ");
						ler.nextLine();
						String tipousuario = ler.nextLine();
						boolean igual = false;
						if (tipousuario.equalsIgnoreCase("sindico") || tipousuario.equalsIgnoreCase("morador")
								|| tipousuario.equalsIgnoreCase("porteiro")
								|| tipousuario.equalsIgnoreCase("zelador")) {
							igual = true;
						}
						if (igual == false) {
							do {
								System.out.println(
										"Por favor, selecione apenas [Sindico], [Morador], [Porteiro] ou [Zelador]: ");
								tipousuario = ler.nextLine();
								if (tipousuario.equalsIgnoreCase("sindico") || tipousuario.equalsIgnoreCase("morador")
										|| tipousuario.equalsIgnoreCase("porteiro")
										|| tipousuario.equalsIgnoreCase("zelador")) {
									igual = true;
								}
							} while (igual == false);
						}
						// O resto (id, nome, cpf, telefone, email) <- pra me localiza
						idusuario++;
						System.out.println("Digite o nome do usuario: ");
						String nomeusuario = ler.nextLine();
						System.out.println("Digite o CPF do usuario: ");
						String cpf = ler.nextLine();
						System.out.println("Digite o telefone do usuario: ");
						String telefone = ler.nextLine();
						System.out.println("Digite o email do usuario: ");
						String email = ler.nextLine();
						if (tipousuario.equalsIgnoreCase("sindico")) {
							pessoa[posicaouser] = new Sindico(idusuario, nomeusuario, cpf, telefone, email,
									tipousuario);
						} else if (tipousuario.equalsIgnoreCase("morador")) {
							System.out.println("Digite o apartamento do usuario: ");
							String apartamento = ler.nextLine();
							pessoa[posicaouser] = new Morador(idusuario, nomeusuario, cpf, telefone, email, tipousuario,
									apartamento);
						} else if (tipousuario.equalsIgnoreCase("porteiro")) {
							pessoa[posicaouser] = new Porteiro(idusuario, nomeusuario, cpf, telefone, email,
									tipousuario);
						} else if (tipousuario.equalsIgnoreCase("zelador")) {
							pessoa[posicaouser] = new Zelador(idusuario, nomeusuario, cpf, telefone, email,
									tipousuario);
						}

					} else if (useratual instanceof Morador) {
						ler.nextLine();
						System.out.println("Digite o titulo da reclamacao: ");
						String titulo = ler.nextLine();
						System.out.println("Digite a descricao da reclamacao: ");
						String descricao = ler.nextLine();
						System.out.println("Digite o data que a reclamacao foi feita: ");
						String data = ler.nextLine();
						reclamacao[posicaorecla].cadastrarReclamacao(titulo, descricao, data, useratual);
					} else if (useratual instanceof Porteiro) {
						ler.nextLine();
						System.out.println("Digite o nome da encomenda: ");
						String nome = ler.nextLine();
						System.out.println("Digite a descricao da encomenda: ");
						String descricao = ler.nextLine();
						System.out.println("Digite a data de chegada da encomenda: ");
						String data = ler.nextLine();
						System.out.println("Digite o apartamento da encomenda: ");
						String apart = ler.nextLine();
						encomenda[posicaoencom].cadastrarEncomenda(nome, descricao, data, apart, pessoa);
						posicaoencom++;
					} else if (useratual instanceof Zelador) {
						ler.nextLine();
						System.out.println("Digite o titulo da manutencao: ");
						String titulo = ler.nextLine();
						System.out.println("Digite a descricao da manutencao: ");
						String descricao = ler.nextLine();
						System.out.println("Digite a data da manutencao: ");
						String data = ler.nextLine();
						System.out.println("Digite o local da manutencao: ");
						String local = ler.nextLine();
						System.out.println("Digite o tipo de manutencao: ");
						String tipo = ler.nextLine();
						System.out.println("Digite o valor da manutencao: ");
						double valor = ler.nextDouble();
						manutencao[posicaomanut].gerarRelatorioManu(titulo, descricao, data, local, tipo, valor);
						posicaomanut++;
					}
					break;
				case 2:
					if (useratual instanceof Sindico) {
						ler.nextLine();
						System.out.println("Digite o titulo da ocorrencia: ");
						String titulo = ler.nextLine();
						System.out.println("Digite a descricao da ocorrencia: ");
						String descricao = ler.nextLine();
						System.out.println("Digite a data da ocorrencia: ");
						String data = ler.nextLine();
						System.out.println("Digite a providencias da ocorrencia: ");
						String providencia = ler.nextLine();
						Ocorrencia ocorrenciaS = new Ocorrencia(titulo, descricao, data, providencia);
						ocorrenciaS.cadastrarOcorrencia();

					} else if (useratual instanceof Morador) {
						ler.nextLine();
						System.out.println("Digite o titulo da manutencao: ");
						String titulo = ler.nextLine();
						System.out.println("Digite a descricao da manutencao: ");
						String descricao = ler.nextLine();
						System.out.println("Digite a data da manutencao: ");
						String data = ler.nextLine();
						System.out.println("Digite o local da manutencao: ");
						String local = ler.nextLine();
						System.out.println("Digite o tipo de manutencao: ");
						String tipo = ler.nextLine();
						System.out.println("Digite o custo da manutencao: ");
						double custo = ler.nextDouble();
						manutencao[posicaomanut].gerarRelatorioManu(titulo, descricao, data, local, tipo, custo);

					} else if (useratual instanceof Porteiro) {
						ler.nextLine();
						System.out.println("Digite o titulo da ocorrencia: ");
						String titulo = ler.nextLine();
						System.out.println("Digite a descricao da ocorrencia: ");
						String descricao = ler.nextLine();
						System.out.println("Digite a data da ocorrencia: ");
						String data = ler.nextLine();
						System.out.println("Digite a providencias da ocorrencia: ");
						String providencia = ler.nextLine();
						Ocorrencia ocorrenciaP = new Ocorrencia(titulo, descricao, data, providencia);
						ocorrenciaP.cadastrarOcorrencia();
					} else if (useratual instanceof Zelador) {
						ler.nextLine();
						System.out.println("Digite o titulo da ocorrencia: ");
						String titulo = ler.nextLine();
						System.out.println("Digite a descricao da ocorrencia: ");
						String descricao = ler.nextLine();
						System.out.println("Digite a data da ocorrencia: ");
						String data = ler.nextLine();
						System.out.println("Digite a providencias da ocorrencia: ");
						String providencia = ler.nextLine();
						Ocorrencia ocorrenciaZ = new Ocorrencia(titulo, descricao, data, providencia);
						ocorrenciaZ.cadastrarOcorrencia();
					}
					break;
				case 3:
					if (useratual instanceof Sindico) {
						ler.nextLine();
						System.out.println("Digite o titulo da manutencao: ");
						String titulo = ler.nextLine();
						System.out.println("Digite a descricao da manutencao: ");
						String descricao = ler.nextLine();
						System.out.println("Digite a data da manutencao: ");
						String data = ler.nextLine();
						System.out.println("Digite o local da manutencao: ");
						String local = ler.nextLine();
						System.out.println("Digite o tipo de manutencao: ");
						String tipo = ler.nextLine();
						System.out.println("Digite o valor da manutencao: ");
						double valor = ler.nextDouble();
						manutencao[posicaomanut].gerarRelatorioManu(titulo, descricao, data, local, tipo, valor);
						posicaomanut++;
					} else if (useratual instanceof Morador) {

					} else if (useratual instanceof Porteiro) {

					} else if (useratual instanceof Zelador) {

					}
					break;
				case 4:
					if (useratual instanceof Sindico) {
						ler.nextLine();
						System.out.println("Digite o titulo da multa: ");
						String titulo = ler.nextLine();
						System.out.println("Digite a descricao da multa: ");
						String descricao = ler.nextLine();
						System.out.println("Digite a data da multa: ");
						String data = ler.nextLine();
						System.out.println("Digite o valor da multa: ");
						double valor = ler.nextDouble();
						System.out.println("Digite o apartamento do responsavel: ");
						String apartamento = ler.nextLine();
						multa[posicaomulta].cadastrarMulta(titulo, descricao, data, valor, apartamento, pessoa);
					} else if (useratual instanceof Morador) {

					} else if (useratual instanceof Porteiro) {

					} else if (useratual instanceof Zelador) {

					}
					break;
				case 5:
					if (useratual instanceof Sindico) {
						System.out.println();
						System.out.println("\nTitulo | Descricao | Data | Providencias \n");
						Ocorrencia.lerDoArquivo();
						System.out.println("\n");
					} else if (useratual instanceof Morador) {
						System.out.println();
						System.out.println("\nTitulo | Descricao | Data | Providencias \n");
						Ocorrencia.lerDoArquivo();
						System.out.println("\n");
					} else if (useratual instanceof Porteiro) {
						System.out.println();
						System.out.println("\nTitulo | Descricao | Data | Providencias \n");
						Ocorrencia.lerDoArquivo();
						System.out.println("\n");
					} else if (useratual instanceof Zelador) {
						System.out.println();
						System.out.println("\nTitulo | Descricao | Data | Providencias \n");
						Ocorrencia.lerDoArquivo();
						System.out.println("\n");
					}
					break;
				case 6:
					if (useratual instanceof Sindico) {

					} else if (useratual instanceof Morador) {

					} else if (useratual instanceof Porteiro) {
						System.out.println("Selecione um dos seguintes usuarios pelo id: ");
						for (int i = 0; i < pessoa.length && pessoa[i] != null; i++) {
							System.out.println(pessoa[i]);
						}
						System.out.print("ID: ");
						int opcao2 = ler.nextInt();
						if (opcao2 < 0 || pessoa[opcao2] == null) {
							do {
								System.out.println("ID incorreto, tente novamente: ");
								System.out.print("ID: ");
								opcao2 = ler.nextInt();
							} while (opcao2 < 0 || pessoa[opcao2] == null);
						}
						useratual = pessoa[opcao2];
					} else if (useratual instanceof Zelador) {
						System.out.println("Selecione um dos seguintes usuarios pelo id: ");
						for (int i = 0; i < pessoa.length && pessoa[i] != null; i++) {
							System.out.println(pessoa[i]);
						}
						System.out.print("ID: ");
						int opcao2 = ler.nextInt();
						if (opcao2 < 0 || pessoa[opcao2] == null) {
							do {
								System.out.println("ID incorreto, tente novamente: ");
								System.out.print("ID: ");
								opcao2 = ler.nextInt();
							} while (opcao2 < 0 || pessoa[opcao2] == null);
						}
						useratual = pessoa[opcao2];
					}
					break;
				case 7:
					if (useratual instanceof Sindico) {

					} else if (useratual instanceof Morador) {
						System.out.println("Selecione um dos seguintes usuarios pelo id: ");
						for (int i = 0; i < pessoa.length && pessoa[i] != null; i++) {
							System.out.println(pessoa[i]);
						}
						System.out.print("ID: ");
						int opcao2 = ler.nextInt();
						if (opcao2 < 0 || pessoa[opcao2] == null) {
							do {
								System.out.println("ID incorreto, tente novamente: ");
								System.out.print("ID: ");
								opcao2 = ler.nextInt();
							} while (opcao2 < 0 || pessoa[opcao2] == null);
						}
						useratual = pessoa[opcao2];
					} else if (useratual instanceof Porteiro) {

					} else if (useratual instanceof Zelador) {

					}
					break;
				case 8:
					if (useratual instanceof Sindico) {

					} else if (useratual instanceof Morador) {
						break;
					} else if (useratual instanceof Porteiro) {
						System.out.println("[Opcao Incorreta]!");
						break;
					} else if (useratual instanceof Zelador) {
						System.out.println("[Opcao Incorreta]!");
						break;
					}
					break;
				case 9:
					if (useratual instanceof Sindico) {

						break;
					} else if (useratual instanceof Morador) {
						System.out.println("[Opcao Incorreta]!");
						break;
					} else if (useratual instanceof Porteiro) {
						System.out.println("[Opcao Incorreta]!");
						break;
					} else if (useratual instanceof Zelador) {
						System.out.println("[Opcao Incorreta]!");
						break;
					}
					break;
				case 10:
					if (useratual instanceof Sindico) {
						if (pessoa[1] == null) {
							System.out.println("Ainda nao ha usuarios cadastrados!");
							break;
						} else {
							System.out.println("Selecione um dos seguintes usuarios pelo id: ");
							for (int i = 0; i < pessoa.length && pessoa[i] != null; i++) {
								System.out.println(pessoa[i]);
							}
							System.out.print("ID: ");
							int opcao2 = ler.nextInt();
							if (opcao2 < 0 || pessoa[opcao2] == null) {
								do {
									System.out.println("ID incorreto, tente novamente: ");
									System.out.print("ID: ");
									opcao2 = ler.nextInt();
								} while (opcao2 < 0 || pessoa[opcao2] == null);
							}
							useratual = pessoa[opcao2];
						}
					} else if (useratual instanceof Morador) {
						System.out.println("[Opcao Incorreta]!");
						break;
					} else if (useratual instanceof Porteiro) {
						System.out.println("[Opcao Incorreta]!");
						break;
					} else if (useratual instanceof Zelador) {
						System.out.println("[Opcao Incorreta]!");
						break;
					}
					break;
				default:
					System.out.println("[Opcao Incorreta]!");
					break;
			}
		} while (opcao != saida);
	}
}
>>>>>>> 83d601745bd34dc7b703bfd01adfb75b54dc5a05
