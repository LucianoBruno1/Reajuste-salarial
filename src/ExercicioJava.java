import java.util.Scanner;
public class ExercicioJava {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double salario, aumento, novosalario;

        System.out.println("Digite seu salário: ");
        salario = input.nextDouble();

        if (salario <=280){
            aumento = salario * 0.2;
            novosalario = salario * 1.2;

            System.out.println("Seu salário era de R$"+ salario);
            System.out.println("O percentual de aumento foi de 20%");
            System.out.println("Seu aumento foi de R$"+aumento);
            System.out.println("Seu novo salário é de R$"+novosalario);

        }else if (salario > 280 && salario <= 700){

            aumento = salario * 0.15;
            novosalario = salario * 1.15;

            System.out.println("Seu salário era de R$"+salario);
            System.out.println("O percentual de aumento foi de 15%");
            System.out.println("Seu aumento foi de R$"+aumento);
            System.out.println("Seu novo salário é de R$"+novosalario);

        }else if (salario > 700 && salario <=1500){

            aumento = salario * 0.1;
            novosalario = salario * 1.1;

            System.out.println("Seu salário era de R$"+salario);
            System.out.println("O percentual de aumento foi de 10%");
            System.out.println("Seu aumento foi de R$"+aumento);
            System.out.println("Seu novo salário é de R$"+novosalario);

        }else if (salario > 1500){

            aumento = salario * 0.05;
            novosalario = salario * 1.05;

            System.out.println("Seu salário era de R$"+salario);
            System.out.println("O percentual de aumento foi de 5%");
            System.out.println("Seu aumento foi de R$"+aumento);
            System.out.println("Seu novo salário é de R$"+novosalario);

        }


    }
}
