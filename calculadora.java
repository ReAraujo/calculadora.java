import java.util.Scanner;
public class calculadora{
    private static final int n2 = 78;

    static public void main(String[] args){
    Scanner scan=new Scanner(System.in);
    
    numero n1=new numero();
    numero resultado=new numero();

    System.out.printf("%nDigite o valor em reais do investimento: R$ ");
    n1.setValor(scan.nextInt());
    resultado.setValor(n1.getValor() * n2);
    System.out.printf("%nA projeção aproximada da quantidade alcançada de visualizações e de %d",resultado.getValor());

    scan.close();
    }
}