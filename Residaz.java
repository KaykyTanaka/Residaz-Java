import java.util.Scanner;
import java.io.IOException;

public class Residaz {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);

		String nomeusuario, cpf, telefone, email, titulo, descricao, data, providencia, local, tipo, nome, apart;
		double valor;
		int opc;

		do {
			System.out.println("=== Residaz ===");
			System.out.println("Selecione o Tipo de usuario: \n");
			System.out.println("1) Sindico");
			System.out.println("2) Morador");
			System.out.println("3) Porteiro");
			System.out.println("4) Zelador");
			System.out.println("-----------");
			System.out.println("0) Finalizar");
			System.out.println("-----------");
			System.out.print(">>> ");
			opc = leia.nextInt();

			switch (opc) {
				case 1:
					int sindicoOpcao;
					do {
						System.out.println("=== Residaz ===");
						System.out.println(" | Sindico | \n");
						System.out.println("1) Cadastrar Usuario");
						System.out.println("2) Cadastrar Ocorrencia");
						System.out.println("3) Gerar Relatorio de Manutencao");
						System.out.println("4) Cadastrar Multa");
						System.out.println("5) Visualizar Ocorrencias");
						System.out.println("6) Visualizar Historio de Reclamacao");
						System.out.println("7) Visualizar Usuarios");
						System.out.println("8) Visualizar Manutencoes");
						System.out.println("-----------");
						System.out.println("0) Sair");
						System.out.println("-----------");
						System.out.print(">>> ");
						sindicoOpcao = leia.nextInt();
						switch (sindicoOpcao) {
							case 1:
								System.out.println("Qual o tipo de usuario (Sindico/Morador/Porteiro/Zelador): ");
								leiaStr.nextLine();
								String tipousuario = leiaStr.nextLine();
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
										tipousuario = leiaStr.nextLine();
										if (tipousuario.equalsIgnoreCase("sindico")
												|| tipousuario.equalsIgnoreCase("morador")
												|| tipousuario.equalsIgnoreCase("porteiro")
												|| tipousuario.equalsIgnoreCase("zelador")) {
											igual = true;
										}
									} while (igual == false);
								}

								System.out.println("Digite o nome do usuario: ");
								nomeusuario = leiaStr.nextLine();
								System.out.println("Digite o CPF do usuario: ");
								cpf = leiaStr.nextLine();
								System.out.println("Digite o telefone do usuario: ");
								telefone = leiaStr.nextLine();
								System.out.println("Digite o email do usuario: ");
								email = leiaStr.nextLine();
								Pessoa pessoa = new Pessoa(nomeusuario, cpf, telefone, email, tipousuario);
								pessoa.cadastrarUsuario();

								break;
							case 2:
								System.out.println("Digite o titulo da ocorrencia: ");
								titulo = leiaStr.nextLine();
								System.out.println("Digite a descricao da ocorrencia: ");
								descricao = leiaStr.nextLine();
								System.out.println("Digite a data da ocorrencia: ");
								data = leiaStr.nextLine();
								System.out.println("Digite a providencias da ocorrencia: ");
								providencia = leiaStr.nextLine();
								Ocorrencia ocorrenciaS = new Ocorrencia(titulo, descricao, data, providencia);
								ocorrenciaS.cadastrarOcorrencia();
								break;
							case 3:
								System.out.println("Digite o titulo da manutencao: ");
								titulo = leiaStr.nextLine();
								System.out.println("Digite a descricao da manutencao: ");
								descricao = leiaStr.nextLine();
								System.out.println("Digite a data da manutencao: ");
								data = leiaStr.nextLine();
								System.out.println("Digite o local da manutencao: ");
								local = leiaStr.nextLine();
								System.out.println("Digite o tipo de manutencao: ");
								tipo = leiaStr.nextLine();
								System.out.println("Digite o valor da manutencao: ");
								valor = leia.nextDouble();
								Manutencao manutencao = new Manutencao(titulo, descricao, data, local, tipo, tipo,
										valor);
								manutencao.cadastrarManutencao();
								break;
							case 4:
								System.out.println("Digite o titulo da multa: ");
								titulo = leiaStr.nextLine();
								System.out.println("Digite a descricao da multa: ");
								descricao = leiaStr.nextLine();
								System.out.println("Digite a data da multa: ");
								data = leiaStr.nextLine();
								System.out.println("Digite o valor da multa: ");
								valor = leia.nextDouble();
								System.out.println("Digite o apartamento do responsavel: ");
								String apartamento = leiaStr.nextLine();
								Multa multa = new Multa(titulo, descricao, data, valor, apartamento);
								multa.cadastrarMulta();
								break;
							case 5:
								System.out.println();
								System.out.println("\nTitulo | Descricao | Data | Providencias");
								Ocorrencia.lerDoArquivo();
								System.out.println("\n" + "\n");
								break;
							case 6:
								System.out.println();
								System.out.println("\nTitulo | Descricao | Data | Providencias");
								Reclamacao.lerDoArquivo();
								System.out.println("\n" + "\n");
								break;
							case 7:
								System.out.println();
								System.out.println("\nId | Nome | CPF | Telefone | Email | Tipo");
								Pessoa.lerDoArquivo();
								System.out.println("\n" + "\n");
								break;
							case 8:
								System.out.println();
								System.out
										.println("\nTitulo | Descricao | Data | Local | Tipo | Apartamento | Valor");
								Manutencao.lerDoArquivo();
								System.out.println("\n" + "\n");
								break;
							case 0:
								System.out.println("Saindo...\n");
								break;
							default:
								System.out.println("Opcao invalida!");
								break;
						}
					} while (sindicoOpcao != 0);
					break;
				case 2:
					int moradorOpcao;
					do {
						System.out.println("=== Residaz ===");
						System.out.println("| Morador | \n");
						System.out.println("1) Cadastrar Reclamacao");
						System.out.println("2) Solicitar Manutencao");
						System.out.println("3) Visualizar Multa");
						System.out.println("4) Visualizar Encomenda");
						System.out.println("5) Visualizar Ocorrencias");
						System.out.println("6) Visualizar Manutencoes");
						System.out.println("-----------");
						System.out.println("0) Sair");
						System.out.println("-----------");
						System.out.print(">>> ");
						moradorOpcao = leia.nextInt();
						switch (moradorOpcao) {
							case 1:
								System.out.println("Digite o titulo da reclamacao: ");
								titulo = leiaStr.nextLine();
								System.out.println("Digite a descricao da reclamacao: ");
								descricao = leiaStr.nextLine();
								System.out.println("Digite o data que a reclamacao foi feita: ");
								data = leiaStr.nextLine();
								Reclamacao reclamacaoM = new Reclamacao(titulo, descricao, data);
								reclamacaoM.cadastrarReclamacao();
								break;
							case 2:
								System.out.println("Digite o titulo da manutencao: ");
								titulo = leiaStr.nextLine();
								System.out.println("Digite a descricao da manutencao: ");
								descricao = leiaStr.nextLine();
								System.out.println("Digite a data da manutencao: ");
								data = leiaStr.nextLine();
								System.out.println("Digite o local da manutencao: ");
								local = leiaStr.nextLine();
								System.out.println("Digite o tipo de manutencao: ");
								tipo = leiaStr.nextLine();
								System.out.println("Digite o custo da manutencao: ");
								double custo = leiaStr.nextDouble();
								Manutencao manutencaoM = new Manutencao(titulo, descricao, data, local, tipo, tipo,
										custo);
								manutencaoM.cadastrarManutencao();
								break;
							case 3:
								System.out.println();
								System.out.println("\nTitulo | Descricao | Data | Apartamento | Valor");
								Multa.lerDoArquivo();
								System.out.println("\n" + "\n");
								break;
							case 4:
								System.out.println();
								System.out.println("\nNome | Descricao | Data | Apartamento");
								Encomenda.lerDoArquivo();
								System.out.println("\n" + "\n");
								break;
							case 5:
								System.out.println();
								System.out.println("\nTitulo | Descricao | Data | Providencias");
								Ocorrencia.lerDoArquivo();
								System.out.println("\n" + "\n");
								break;
							case 6:
								System.out.println();
								System.out.println("\nTitulo | Descricao | Data | Local | Tipo | Apartamento | Valor");
								Manutencao.lerDoArquivo();
								System.out.println("\n" + "\n");
								break;
							case 0:
								System.out.println("Saindo...\n");
								break;
							default:
								System.out.println("Opcao invalida!");
								break;
						}
					} while (moradorOpcao != 0);
					break;
				case 3:
					int porteiroOpcao;
					do {
						System.out.println("=== Residaz ===");
						System.out.println("| Porteiro | \n");
						System.out.println("1) Cadastrar Encomenda");
						System.out.println("2) Cadastrar Ocorrencia");
						System.out.println("3) Visualizar Ocorrencias");
						System.out.println("4) Visualizar Encomenda");
						System.out.println("5) Visualizar Manutencoes");
						System.out.println("-----------");
						System.out.println("0) Sair");
						System.out.println("-----------");
						System.out.print(">>> ");
						porteiroOpcao = leia.nextInt();
						switch (porteiroOpcao) {
							case 1:
								System.out.println("Digite o nome da encomenda: ");
								nome = leiaStr.nextLine();
								System.out.println("Digite a descricao da encomenda: ");
								descricao = leiaStr.nextLine();
								System.out.println("Digite a data de chegada da encomenda: ");
								data = leiaStr.nextLine();
								System.out.println("Digite o apartamento da encomenda: ");
								apart = leiaStr.nextLine();
								Encomenda encomenda = new Encomenda(nome, descricao, data, apart);
								encomenda.cadastrarEncomenda();
								break;
							case 2:
								System.out.println("Digite o titulo da ocorrencia: ");
								titulo = leiaStr.nextLine();
								System.out.println("Digite a descricao da ocorrencia: ");
								descricao = leiaStr.nextLine();
								System.out.println("Digite a data da ocorrencia: ");
								data = leiaStr.nextLine();
								System.out.println("Digite a providencias da ocorrencia: ");
								providencia = leiaStr.nextLine();
								Ocorrencia ocorrenciaP = new Ocorrencia(titulo, descricao, data, providencia);
								ocorrenciaP.cadastrarOcorrencia();
								break;
							case 3:
								System.out.println();
								System.out.println("\nTitulo | Descricao | Data | Providencias");
								Ocorrencia.lerDoArquivo();
								System.out.println("\n" + "\n");
								break;
							case 4:
								System.out.println();
								System.out.println("\nNome | Descricao | Data | Apartamento");
								Encomenda.lerDoArquivo();
								System.out.println("\n" + "\n");
								break;
							case 5:
								System.out.println();
								System.out.println("\nTitulo | Descricao | Data | Providencias");
								Manutencao.lerDoArquivo();
								System.out.println("\n" + "\n");
								break;
							case 0:
								System.out.println("Saindo...\n");
								break;
							default:
								System.out.println("Opcao invalida!");
								break;
						}
					} while (porteiroOpcao != 0);
					break;
				case 4:
					int zeladorOpcao;
					do {
						System.out.println("=== Residaz ===");
						System.out.println("| Zelador | \n");
						System.out.println("1) Gerar Relatorio de Manutencao");
						System.out.println("2) Cadastrar Ocorrencia");
						System.out.println("3) Visualizar Historico de Reclamacao");
						System.out.println("4) Visualizar Manutencoes");
						System.out.println("5) Visualizar Ocorrencias");
						System.out.println("-----------");
						System.out.println("0) Sair");
						System.out.println("-----------");
						System.out.print(">>> ");
						zeladorOpcao = leia.nextInt();
						switch (zeladorOpcao) {
							case 1:
								System.out.println("Digite o titulo da manutencao: ");
								titulo = leiaStr.nextLine();
								System.out.println("Digite a descricao da manutencao: ");
								descricao = leiaStr.nextLine();
								System.out.println("Digite a data da manutencao: ");
								data = leiaStr.nextLine();
								System.out.println("Digite o local da manutencao: ");
								local = leiaStr.nextLine();
								System.out.println("Digite o tipo de manutencao: ");
								tipo = leiaStr.nextLine();
								System.out.println("Digite o apartamento: ");
								apart = leiaStr.nextLine();
								System.out.println("Digite o valor da manutencao: ");
								valor = leia.nextDouble();
								Manutencao manutencaoZ = new Manutencao(titulo, descricao, data, local, tipo, apart,
										valor);
								manutencaoZ.cadastrarManutencao();
								break;
							case 2:
								System.out.println("Digite o titulo da ocorrencia: ");
								titulo = leiaStr.nextLine();
								System.out.println("Digite a descricao da ocorrencia: ");
								descricao = leiaStr.nextLine();
								System.out.println("Digite a data da ocorrencia: ");
								data = leiaStr.nextLine();
								System.out.println("Digite a providencias da ocorrencia: ");
								providencia = leiaStr.nextLine();
								Ocorrencia ocorrenciaZ = new Ocorrencia(titulo, descricao, data, providencia);
								ocorrenciaZ.cadastrarOcorrencia();
								break;
							case 3:
								System.out.println();
								System.out.println("\nTitulo | Descricao | Data | Providencias");
								Reclamacao.lerDoArquivo();
								System.out.println("\n" + "\n");
								break;
							case 4:
								System.out.println();
								System.out
										.println("\nTitulo | Descricao | Data | Local | Tipo | Apartamento | Valor");
								Manutencao.lerDoArquivo();
								System.out.println("\n" + "\n");
								break;
							case 5:
								System.out.println();
								System.out.println("\nTitulo | Descricao | Data | Providencias");
								Ocorrencia.lerDoArquivo();
								System.out.println("\n" + "\n");
								break;
							case 0:
								System.out.println("Saindo...\n");
								break;
							default:
								System.out.println("Opcao invalida!");
								break;
						}
					} while (zeladorOpcao != 0);
					break;
				case 0:
					System.out.println("Finalizando...");
					break;
				default:
					System.out.println("Opcao invalida!");
					break;
			}
		} while (opc != 0);
	}
}