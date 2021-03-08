import java.util.Arrays;
import java.util.Scanner;


public class Ted2Triangulo{
    public static void main(String args[]){
        int i = 0;
        
        int todosOsLados [] = new int [3];
        int ladosMenores [] = new int [2];
        Scanner entrada = new Scanner(System.in);

        //Colocando todos os elementos num vetor
        for(i=0 ; i < todosOsLados.length; i++ ){
            System.out.print("Digite o comprimento do lado: ");
            int lado = entrada.nextInt();
            todosOsLados[i] = lado;            
        }

        //Colocando os lados em ordem crescente
        Arrays.sort(todosOsLados);        


        //Atribuindo o maior lado 
        int maiorLado = todosOsLados[2];    
       

        //Colocando os menores lados num vetor
        ladosMenores[0] = todosOsLados[0];
        ladosMenores[1] = todosOsLados[1];
        

        //Verificando os tipos de triângulos
        int soma = ladosMenores[0] + ladosMenores[1];
        
        if (soma > maiorLado){
            System.out.println("Os lados fornecidos formam um triângulo!");
            if (maiorLado ==  ladosMenores[0]){
                System.out.println("O triângulo é equilátero!");
            }
            else if (soma == 2 * ladosMenores[0]){
                System.out.println("O triângulo é isóceles!");
            }
            else{
                System.out.println("O triângulo é escaleno!");
            }
        }else{
            System.out.println("Os lados fornecidos não formam um triângulo!");
        }
        entrada.close();
    }
}