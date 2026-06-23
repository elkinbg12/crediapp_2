import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);
        ClienteDAO clienteDao = new ClienteDAO();
        int opcao = -1;

        do {
            System.out.println("=== SISTEMA DE CREDITO ===");
            System.out.println("1- Para Cadastrar Cliente.");
            System.out.println("0- Para encerrar o Programa.");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {

                case 1 -> {
                    String continuar = "S";
                    List<Cliente> listaTemporaria = new ArrayList<>();

                    while (continuar.equalsIgnoreCase("S")) {
                       
                    System.out.println("Digite o Nome: ");
                    String nome = teclado.nextLine();

                    System.out.println("Digite o CPF: ");
                    String cpf = teclado.nextLine();

                    System.out.println("Digite o Celular: ");
                    String celular = teclado.nextLine();
                    
                    System.out.println("Digite o nome da rua: ");
                    String rua = teclado.nextLine();

                    System.out.println("Digite o número: ");
                    String numero = teclado.nextLine();

                    System.out.println("Digite o nome do Bairro: ");
                    String bairro = teclado.nextLine();

                    System.out.println("Digite o Complemento: ");
                    String complemento = teclado.nextLine();

                    Cliente c = new Cliente(0, nome, cpf, celular, rua, numero, bairro, complemento);

                    listaTemporaria.add(c);

                    System.out.println("Deseja adicionar outro cliente?: ");
                    continuar = teclado.nextLine();
                    }
                    
                    
                    
                     for (Cliente clienteAtual : listaTemporaria) {
                        
                        clienteDao.cadastrarCliente(clienteAtual);
                        System.out.println("Cliente " + clienteAtual.getNome() + " cadastrado com sucesso!\n");
                    }

                }
                case 0 -> {
                    System.out.println("Encerrando Programa...");
                    break;
                }

            }
        } while(opcao != 0);

    teclado.close();    
    }
}