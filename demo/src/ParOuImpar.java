import java.util.Scanner;

//Criacao classe: Caio
public class ParOuImpar {
    public static void main(String[] args) {
        //Criacao atributo: Caio
        int numero;

        //Criacao scanner: Caio
        Scanner sc = new Scanner(System.in);

        //Criação da entrada de dados: Brian
        System.out.print("Digite o número a ser verificado: ");
        numero = sc.nextInt();

        //Chamada de metodo: Fernando
        classificarNumero(numero);
    }

    //Criação do metodo de verificacao: Fernando
    static void classificarNumero(int numero) {
        if (numero % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }
}
