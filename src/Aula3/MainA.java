package Aula3;
import java.util.ArrayList;
import java.util.Scanner;

public class MainA {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Quantas notas você quer adicionar?: ");
        int c = x.nextInt();
        ArrayList<Double> k = new ArrayList<>();
        for(int i = 0; i < c;i++){
            System.out.println("Digite o primeiro número: ");
            int a = x.nextInt();
            System.out.println("Digite o segundo número: ");
            int b = x.nextInt();
            MainB z = new MainB(a, b);
            k.add(z.media());
        }
        System.out.println("Qual média você quer acessar? ");
        int l = x.nextInt();
        while (true){
            if (l < k.size()){
                System.out.println(k.get(l));
                break;
            }
            else{
                System.out.printf("Você só possui %s notas %n", c);
                System.out.println("Escolha qual média você quer acessr: ");
                l = x.nextInt() -1;
            }
        }
    }
}
