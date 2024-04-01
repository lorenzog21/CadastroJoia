//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Joia joia = new Joia();
        int op;

        do {
            System.out.println("Escolha uma opção:\n" +
                    "1-Cadastrar Jóia\n" +
                    "2-Exibir Jóia\n" +
                    "0-Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o código da jóia:");
                    String codigo = sc.next() + sc.nextLine();
                    System.out.println("Digite o valor da jóia :");
                    String valor =  sc.next() + sc.nextLine();
                    System.out.println("Digite a especificação de jóia:");
                    String especificacao = sc.next() + sc.nextLine();
                    joia.codigo = codigo;
                    joia.valor = Float.valueOf(valor);
                    joia.especificacao = String.valueOf(especificacao);
                    break;
                case 2:
                    System.out.println("Código: " + joia.codigo + "Valor: R$" + joia.valor + "Especificação: " + joia.especificacao);
                    break;
                case 0:
                    System.out.println("Finalizando o programa");
                    break; // Adicionado o break para sair do loop
                default:
                    System.out.println("Opção inválida");
            }
        } while(op != 0);

        sc.close();
    }
}
