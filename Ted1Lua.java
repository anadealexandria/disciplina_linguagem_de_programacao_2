//A gravidade da Lua é cerca de 17% a da Terra. Crie um programa que calcule seu peso na Lua.
import java.util.Scanner;

public class Ted1Lua{

    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        double gravidadeDaTerra = 10.0; //fiz o arredondamento
        double gravidadeDaLua = gravidadeDaTerra* 0.17;

        System.out.print("Qual a sua massa (o seu 'peso')?" );
        double minhaMassa = entrada.nextInt();
        double pesoNaLua = minhaMassa * gravidadeDaLua;

        System.out.println("O seu peso na lua é de " + pesoNaLua + " Newtons");
        
        entrada.close();
    }
}