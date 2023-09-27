import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de produto:");
        System.out.println("1. Processadores");
        System.out.println("2. Sistemas Operacionais");
        System.out.println("3. Computadores");
        System.out.println("4. consulta");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        switch (escolha) {
            case 1:
                System.out.print("Digite o nome do processador: ");
                String nomeProcessador = scanner.nextLine();

                System.out.print("Digite a descricao do processador: ");
                String descricaoProcessador = scanner.nextLine();

                System.out.print("Digite a velocidade do processador (GHz): ");
                double velocidadeProcessador = scanner.nextDouble();
                scanner.nextLine();

                Processador novoProcessador = new Processador(nomeProcessador, descricaoProcessador,
                        velocidadeProcessador);
                novoProcessador.exibirInfo();
                BancoDeDados.inserirProcessador(novoProcessador);
                break;

            case 2:
                System.out.print("Digite o nome do sistema operacional: ");
                String nomeSistemaOperacional = scanner.nextLine();

                System.out.print("Digite a descricao do sistema operacional: ");
                String descricaoSistemaOperacional = scanner.nextLine();

                System.out.print("Digite a versão do sistema operacional: ");
                String versaoSistemaOperacional = scanner.nextLine();

                SistemaOperacional novoSistemaOperacional = new SistemaOperacional(nomeSistemaOperacional,
                        descricaoSistemaOperacional, versaoSistemaOperacional);
                novoSistemaOperacional.exibirInfo();
                BancoDeDados.inserirSistemaOperacional(novoSistemaOperacional);
                break;

            case 3:
                System.out.print("Digite o nome do computador: ");
                String nomeComputador = scanner.nextLine();

                System.out.print("Digite a descricao do computador: ");
                String descricaoComputador = scanner.nextLine();

                System.out.print("Digite a marca do computador: ");
                String marcaComputador = scanner.nextLine();

                Computador novoComputador = new Computador(nomeComputador, descricaoComputador, marcaComputador);
                novoComputador.exibirInfo();
                BancoDeDados.inserirComputador(novoComputador);
                break;

            case 4:
                System.out.println("\nEscolha um produto para consultar:");
                System.out.println("1. Processador");
                System.out.println("2. Sistemas Operacionais");
                System.out.println("3. Computador");
                int escolha1 = scanner.nextInt();
                scanner.nextLine();

                switch (escolha1) {
                    case 1:
                        ConsultaSQL.ConsultaProcessador();
                        break;

                    case 2:
                        ConsultaSQL.ConsultaSistemaOperacional();
                        break;

                    case 3:
                        ConsultaSQL.ConsultaComputador();
                        break;
                }
        }
        scanner.close();
    }
}
