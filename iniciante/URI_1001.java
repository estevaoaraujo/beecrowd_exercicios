/* 
beecrowd | 1001
Extremamente Básico
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o 
seu resultado na variável X. Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem 
alguma além daquilo que está sendo especificado e não esqueça de imprimir o fim de linha após o resultado, 
caso contrário, você receberá "Presentation Error".

Exemplos de Entrada	Exemplos de Saída
10
9

X = 19

-10
4

X = -6

15
-7

X = 8

*/

import java.util.Scanner;

public class URI_1001{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n1 = leia.nextInt();
        int n2 = leia.nextInt();

        int r = n1 + n2;
        
        System.out.println(r);

        leia.close();
    }
}

/*import java.util.Scanner;

public class Main { // Alterado de URI_1001 para Main
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n1 = leia.nextInt();
        int n2 = leia.nextInt();

        int r = n1 + n2;

        // A saída precisa seguir o formato exigido pelo Beecrowd
        System.out.println("X = " + r);

        leia.close();
    }
} */