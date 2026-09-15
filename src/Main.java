import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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
                    System.out.println("Cadastro de produto selecionado");
                    break;

                case 2:
                    System.out.println("Listagem de produtos selecionado");
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






