import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        String mensagemOculta = "Hello, World!";

        Scanner scanner = new Scanner(System.in); // cria objeto scanner para ler as entradas do teclado

        int escolha = 0; // variável que armazena a opção escolhida pelo usuário

        while (escolha != 3) { // enquanto a opção for diferente de 3, o menu será exibido
            System.out.println("-----Menu-----"); // exibe menu
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");  // Usei print para ficar na mesma linha
            escolha = scanner.nextInt(); // lê a opção digitada pelo usuário

            if (escolha == 1) { // se o usuário escolher calcular a área do quadrado
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble(); // lê o valor do lado
                double areaQuadrado = lado * lado; // calcula a área do quadrado (lado²)
                System.out.println("Área do quadrado: " + areaQuadrado); // exibe o resultado
            } else if (escolha == 2) {
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble(); // lê o valor do raio
                double areaCirculo = Math.PI * raio * raio; // calcula área do círculo usando Math.PI (πr²)
                System.out.println("Área do círculo: " + areaCirculo); // exibe o resultado
            } else if (escolha == 3) { // se o usuário escolher sair
                System.out.println("Programa encerrado.");
            } else { // caso a opção seja inválida
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
