import java.util.Scanner;

public class Ted1Escada {
        public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o comprimento: ");
        int comprimento = entrada.nextInt();

        System.out.println("Digite o grau que a escada faz com o solo: ");
        double angulo = Math.toRadians(entrada.nextDouble());
        double seno = Math.sin(angulo);

        double altura = comprimento * seno;

        System.out.println(String.format("A altura da escada é de: %.2f ", altura));

        entrada.close();
    }
}
