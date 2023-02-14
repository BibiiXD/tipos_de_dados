import java.util.Scanner;


public class OperadorCalc {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
    // colete dois números do teclado 
    // faça as 5 operações matemáticas 
    // declare também as variáveis soma, multiplicação, divisão, resto, subtração
    int soma; 
    int multiplicacao;
    float divisao; 
    double resto; 
    int subtracao; 
    int numero1;
    int numero2;
    int numero3;
    int numero4; 
    int numero5; 
    int numero6;
    float numero7;
    float numero8;
    double numero9;
    double numero10;

    System.out.println("Digite um número");
    numero1=entrada.nextInt();
    System.out.println("Digite um número");
    numero2=entrada.nextInt();
    soma=numero1+numero2;
    System.out.println("A soma dos dois números é:" + soma);


    System.out.println("Digite um número");
    numero3=entrada.nextInt();
    System.out.println("Digite um número");
    numero4=entrada.nextInt();
    multiplicacao=numero3*numero4;
    System.out.println("A multiplicação dos dois números é:" + multiplicacao);


    System.out.println("Digite um número");
    numero5=entrada.nextInt();
    System.out.println("Digite um número");
    numero6=entrada.nextInt();
    subtracao=numero5-numero6;
    System.out.println("A subtração dos dois números é:" + subtracao);


    System.out.println("Digite um número");
    numero7=entrada.nextFloat();
    System.out.println("Digite um número");
    numero8=entrada.nextFloat();
    divisao=numero7/numero8;
    System.out.println("A divisão dos dois números é:" + divisao);
    

    System.out.println("Digite um número");
    numero9=entrada.nextDouble();
    System.out.println("Digite um número");
    numero10=entrada.nextDouble();
    resto=numero9%numero10;
    System.out.println("O resto dos dois números é:" + resto);

    }
}
