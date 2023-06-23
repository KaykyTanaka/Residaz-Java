import java.util.Scanner;
import java.io.IOException;

public class Residaz {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Pessoa[] pessoa = new Pessoa[20];
		Pessoa useratual = new Pessoa();
		new Pessoa(){}.leDoArquivoEGeraUmVetor();
		new Pessoa(){}.converterPessoas( pessoa );
		/*for(int i=0;i<pessoa.length-1;i++){
			if(useratual.getPessoaS ( i ) != null){
				System.out.println( useratual.getPessoaS( i ) );
			}
		}*/
		/*new Pessoa(){}.getPessoaNS();
		for(int i=1;i< pessoa.length && pessoa[i] != null;i++){
			System.out.println(pessoa[i]);
			if(pessoa[i] == null){
				pessoa[i] = new Pessoa(){}.getPessoaNS( i );
				System.out.println( pessoa[i] );
			}else{
				break;
			}
		}*/

		int opcao = 0;
		int idsessao = 0;
		int saida = 0;
		int idusuario = 0;

		do {
			pessoa[0] = new Sindico(0, "Sindico Padrao", "Sem CPF", "Sem Telefone", "Sem email", "Sindico");
			if (idsessao == 0) {
				useratual = pessoa[idsessao];
				idsessao = 1;
			}
			if (useratual.getTipo().equalsIgnoreCase( "sindico" )) {
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
			} else if (useratual.getTipo().equalsIgnoreCase( "morador" )) {
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
			} else if (useratual.getTipo().equalsIgnoreCase( "porteiro" )) {
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
			} else if (useratual.getTipo().equalsIgnoreCase( "zelador" )) {
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

					if (useratual.getTipo().equalsIgnoreCase( "sindico" )) {
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
							Pessoa sindico = new Sindico(idusuario, nomeusuario, cpf, telefone, email,
									tipousuario);
							sindico.cadastrarUsuario();
						} else if (tipousuario.equalsIgnoreCase("morador")) {
							System.out.println("Digite o apartamento do usuario: ");
							String apartamento = ler.nextLine();
							Morador morador = new Morador(idusuario, nomeusuario, cpf, telefone, email, tipousuario);
							morador.cadastrarUsuario();
						} else if (tipousuario.equalsIgnoreCase("porteiro")) {
							Pessoa porteiro = new Porteiro(idusuario, nomeusuario, cpf, telefone, email,
									tipousuario);
							porteiro.cadastrarUsuario();
						} else if (tipousuario.equalsIgnoreCase("zelador")) {
							Pessoa zelador = new Zelador(idusuario, nomeusuario, cpf, telefone, email,
									tipousuario);
							zelador.cadastrarUsuario();
						}

					} else if (useratual.getTipo().equalsIgnoreCase( "morador" )) {
						ler.nextLine();
						System.out.println("Digite o titulo da reclamacao: ");
						String titulo = ler.nextLine();
						System.out.println("Digite a descricao da reclamacao: ");
						String descricao = ler.nextLine();
						System.out.println("Digite o data que a reclamacao foi feita: ");
						String data = ler.nextLine();
						// reclamacao[posicaorecla].cadastrarReclamacao(titulo, descricao, data,
						// useratual);
					} else if (useratual.getTipo().equalsIgnoreCase( "porteiro" )) {
						ler.nextLine();
						System.out.println("Digite o nome da encomenda: ");
						String nome = ler.nextLine();
						System.out.println("Digite a descricao da encomenda: ");
						String descricao = ler.nextLine();
						System.out.println("Digite a data de chegada da encomenda: ");
						String data = ler.nextLine();
						System.out.println("Digite o apartamento da encomenda: ");
						String apart = ler.nextLine();
						Encomenda encomenda = new Encomenda(nome, descricao, data, apart);
						encomenda.cadastrarEncomenda();
					} else if (useratual.getTipo().equalsIgnoreCase( "zelador" )) {
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
						System.out.println("Digite o apartamento: ");
						String apartamento = ler.nextLine();
						System.out.println("Digite o valor da manutencao: ");
						double valor = ler.nextDouble();
						Manutencao manutencao = new Manutencao(titulo, descricao, data, local, tipo, apartamento,
								valor);
						manutencao.cadastrarManutencao();

					}
					break;
				case 2:
					if (useratual.getTipo().equalsIgnoreCase( "sindico" )) {
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

					} else if (useratual.getTipo().equalsIgnoreCase( "morador" )) {
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
						Manutencao manutencao = new Manutencao(titulo, descricao, data, local, tipo, tipo, custo);
						manutencao.cadastrarManutencao();

					} else if (useratual.getTipo().equalsIgnoreCase( "porteiro" )) {
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
					} else if (useratual.getTipo().equalsIgnoreCase( "zelador" )) {
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
					if (useratual.getTipo().equalsIgnoreCase( "sindico" )) {
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
						Manutencao manutencao = new Manutencao(titulo, descricao, data, local, tipo, tipo, valor);
						manutencao.cadastrarManutencao();

					} else if (useratual.getTipo().equalsIgnoreCase( "morador" )) {

					} else if (useratual.getTipo().equalsIgnoreCase( "porteiro" )) {

					} else if (useratual.getTipo().equalsIgnoreCase( "zelador" )) {

					}
					break;
				case 4:
					if (useratual.getTipo().equalsIgnoreCase( "sindico" )) {
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
						// multa[posicaomulta].cadastrarMulta(titulo, descricao, data, valor,
						// apartamento, pessoa);
					} else if (useratual.getTipo().equalsIgnoreCase( "morador" )) {
						System.out.println();
						System.out.println("\nNome | Descricao | Data | Apartamento");
						Encomenda.lerDoArquivo();
						System.out.println("\n");
					} else if (useratual.getTipo().equalsIgnoreCase( "porteiro" )) {
						System.out.println();
						System.out.println("\nNome | Descricao | Data | Apartamento");
						Encomenda.lerDoArquivo();
						System.out.println("\n");
					} else if (useratual.getTipo().equalsIgnoreCase( "zelador" )) {

					}
					break;
				case 5:
					if (useratual.getTipo().equalsIgnoreCase( "sindico" )) {
						System.out.println();
						System.out.println("\nTitulo | Descricao | Data | Providencias \n");
						Ocorrencia.lerDoArquivo();
						System.out.println("\n");
					} else if (useratual.getTipo().equalsIgnoreCase( "morador" )) {
						System.out.println();
						System.out.println("\nTitulo | Descricao | Data | Providencias \n");
						Ocorrencia.lerDoArquivo();
						System.out.println("\n");
					} else if (useratual.getTipo().equalsIgnoreCase( "porteiro" )) {
						System.out.println();
						System.out.println("\nTitulo | Descricao | Data | Providencias \n");
						Ocorrencia.lerDoArquivo();
						System.out.println("\n");
					} else if (useratual.getTipo().equalsIgnoreCase( "zelador" )) {
						System.out.println();
						System.out.println("\nTitulo | Descricao | Data | Providencias \n");
						Ocorrencia.lerDoArquivo();
						System.out.println("\n");
					}
					break;
				case 6:
					if (useratual.getTipo().equalsIgnoreCase( "sindico" )) {

					} else if (useratual.getTipo().equalsIgnoreCase( "morador" )) {

					} else if (useratual.getTipo().equalsIgnoreCase( "porteiro" )) {
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
					} else if (useratual.getTipo().equalsIgnoreCase( "zelador" )) {
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
					if (useratual.getTipo().equalsIgnoreCase( "sindico" )) {

					} else if (useratual.getTipo().equalsIgnoreCase( "morador" )) {
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
					} else if (useratual.getTipo().equalsIgnoreCase( "porteiro" )) {

					} else if (useratual.getTipo().equalsIgnoreCase( "zelador" )) {

					}
					break;
				case 8:
					if (useratual.getTipo().equalsIgnoreCase( "sindico" )) {

					} else if (useratual.getTipo().equalsIgnoreCase( "morador" )) {
						break;
					} else if (useratual.getTipo().equalsIgnoreCase( "porteiro" )) {
						System.out.println("[Opcao Incorreta]!");
						break;
					} else if (useratual.getTipo().equalsIgnoreCase( "zelador" )) {
						System.out.println("[Opcao Incorreta]!");
						break;
					}
					break;
				case 9:
					if (useratual.getTipo().equalsIgnoreCase( "sindico" )) {

						break;
					} else if (useratual.getTipo().equalsIgnoreCase( "morador" )) {
						System.out.println("[Opcao Incorreta]!");
						break;
					} else if (useratual.getTipo().equalsIgnoreCase( "porteiro" )) {
						System.out.println("[Opcao Incorreta]!");
						break;
					} else if (useratual.getTipo().equalsIgnoreCase( "zelador" )) {
						System.out.println("[Opcao Incorreta]!");
						break;
					}
					break;
				case 10:
					if (useratual.getTipo().equalsIgnoreCase( "sindico" )) {
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
					} else if (useratual.getTipo().equalsIgnoreCase( "morador" )) {
						System.out.println("[Opcao Incorreta]!");
						break;
					} else if (useratual.getTipo().equalsIgnoreCase( "porteiro" )) {
						System.out.println("[Opcao Incorreta]!");
						break;
					} else if (useratual.getTipo().equalsIgnoreCase( "zelador" )) {
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
