import java.util.Scanner;


public class Ted2Lutador {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o nome do lutador? ");
        String nome = entrada.next();

        System.out.print("Qual o peso do lutador? ");
        float peso = entrada.nextFloat();

        String categoria = " ";

        if (peso < 65){
            categoria = "Pena";
        }
        else if (peso >= 65 && peso < 72){
            categoria = "Leve";
        }
        else if (peso >= 72 && peso < 79){
           categoria = "Ligeiro";
        }
        else if (peso >= 79 && peso < 86){
           categoria = "Meio-médio";
        }
        else if (peso >= 86 && peso < 93){
            categoria = "Médio";
        }
        else if (peso >= 93 && peso < 100){
            categoria = "Meio-pesado";
        }
        else if (peso >= 100){
            categoria = "Pesado";
        }

        System.out.println("Nome fornecido: " + nome);
        System.out.println("Peso fornecido: " + peso);
        System.out.println("O lutador " + nome + " pesa " + peso + " e se enquadra na " +
         " categoria " + categoria);

         entrada.close();
    }
}
