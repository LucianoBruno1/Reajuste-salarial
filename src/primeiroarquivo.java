import java.util.Scanner;
public class primeiroarquivo {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Digite a primeira nota: ");
        nota1 = input.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = input.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = input.nextDouble();

        media = (nota1+nota2+nota3)/3;

        System.out.println("Sua média final é: "+ media);


        if (media >= 7) {
            System.out.println("Parabéns. Você está APROVADO.");

        }else if (media >=3 && media <=7 ){
            System.out.println("Você irá fazer a recuperação.");

        }else if (media<3){
            System.out.println("Você está reprovado.");
        }


    }
}
