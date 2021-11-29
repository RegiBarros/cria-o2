import java.util.Scanner;
//Pequeno codigo ler valor e nos mostra quantidade de litros de gasolina a ser abastecido.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float valor;
        float litros = 1.000f;
        System.out.print("##### Sistema de Abastecimento Online. #####" + "\n");
        System.out.print("***** Valor Atual da Gasolina: R$ 6.95 *****" + "\n");

        System.out.print("\n" + "Digite Valor a Ser Abastecido. R$: ");
        valor = scan.nextInt();

        litros = (valor / 6.95f) / litros;
        System.out.print("\n" + "Quantidade a Ser Abastecido:" + litros + " ml" + "\n");
        System.out.print("\n" + "Obrigado! Pela Preferência.");

    }

}
