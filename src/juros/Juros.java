
package juros;

import java.util.Scanner;


public class Juros {

    
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
        
        double investimento, investimentoFinal;
        double juros;
        
        System.out.println("Qual sera o valor do seu investimentos(ao mês)? ");
        investimento = entrada.nextDouble();
        
        System.out.println("Qual a taxa de juros mensal? ");
        juros = entrada.nextDouble();
        
        investimentoFinal = (investimento + juros ) * 12;
         System.out.println("O seu investimento após 12 meses sera de: "+investimentoFinal);
    }
    
}
