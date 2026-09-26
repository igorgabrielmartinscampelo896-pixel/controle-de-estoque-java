import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nomes = new  ArrayList<>();
        ArrayList<Double> precos = new ArrayList<>();
        ArrayList<Integer> quantidades = new ArrayList<>();

        boolean sistemaAtivo = true;

        while (sistemaAtivo) {

            System.out.println("=== CONTROLE DE ESTOQUE ===");
            System.out.println();
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produto");
            System.out.println("3 - Consultar produto");
            System.out.println("4 - Registrar venda");
            System.out.println("5 - Ver estoque");
            System.out.println("6 - Historico de movimentacoes");
            System.out.println("0 - Sair");

            System.out.println();

            System.out.println("Escolha uma opcao: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine();

                   String nome = "";
                   while (nome.isBlank()) {
                       System.out.println ("Nome do produto: ");
                       nome = scanner .nextLine();
                       if (nome.isBlank()) {
                           System.out.println("Nome invalido. Digite novamente.");
                       }
                   }

                    System.out.println("Preco do produto: ");
                    double preco = scanner.nextDouble();

                    System.out.println("Quatidade em estoque");
                    int quantidade =  scanner.nextInt();

                    nomes.add(nome);
                    precos.add(preco);
                    quantidades.add(quantidade);

                    System.out.println("Produto cadastrado com sucesso");
                    break;

                case 2:
                    int opcaoLista;
                    do {


                        System.out.println("=== PRODUTOS CADASTRADOS ===");
                        if (nomes.isEmpty()) {
                            System.out.println("Nenhum produto cadastrado");
                        }
                        for (int i = 0; i < nomes.size(); i++) {
                            System.out.println(
                                    (i + 1) + " - " +
                                            nomes.get(i) +
                                            " | R$ " +
                                            precos.get(i) +
                                            " | Estoque: " +
                                            quantidades.get(i)
                            );
                        }
                        System.out.println();
                        System.out.println("0 -  Voltar ao menu");
                        System.out.println("Escolha uma opcao:");
                        opcaoLista = scanner.nextInt();

                    } while (opcaoLista !=0);
                        break;



                case 3:
                    System.out.println("Consulta de produtos selecionado");
                    break;

                case 4:
                    System.out.println("Registro de vendas selecionados");
                    break;

                case 5:
                    System.out.println("Visualizacao de estoque selecionado");
                    break;

                case 6:
                    System.out.println("Historico de movimentacoes selecionado");
                    break;


                case 0:
                    System.out.println("Saindo do sistema...");
                    sistemaAtivo = false;
                    break;


                default:
                    System.out.println("Opcao invalida");
                    break;


            }


        }
    }
}






