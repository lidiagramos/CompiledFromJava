package aula09;

import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contMulheresVerdesLouros = 0;
        int somaIdadesMulheresVerdesLouros = 0;
        int contHomens = 0;
        int somaIdadesHomens = 0;

        System.out.println("Por favor, entre com os dados das 500 pessoas:");

        for (int i = 0; i < 3; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");

            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);

            System.out.print("Cor dos olhos (A/V/C): ");
            char corOlhos = scanner.next().charAt(0);

            System.out.print("Cor dos cabelos (L/C/P): ");
            char corCabelos = scanner.next().charAt(0);

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            if (sexo == 'F' && idade >= 18 && idade <= 35 && corOlhos == 'V' && corCabelos == 'L') {
                contMulheresVerdesLouros++;
                somaIdadesMulheresVerdesLouros += idade;
            }

            if (sexo == 'M') {
                contHomens++;
                somaIdadesHomens += idade;
            }
        }

        if (contMulheresVerdesLouros > 0) {
            double mediaIdadesMulheresVerdesLouros = (double) somaIdadesMulheresVerdesLouros / contMulheresVerdesLouros;
            System.out.println("Quantidade de mulheres com olhos verdes e cabelos louros entre 18 e 35 anos: " + contMulheresVerdesLouros);
            System.out.println("Média das idades das mulheres com olhos verdes e cabelos louros entre 18 e 35 anos: " + mediaIdadesMulheresVerdesLouros);
        } else {
            System.out.println("Não foram encontradas mulheres com olhos verdes e cabelos louros entre 18 e 35 anos.");
        }

        if (contHomens > 0) {
            double mediaIdadesHomens = (double) somaIdadesHomens / contHomens;
            System.out.println("Média das idades dos homens: " + mediaIdadesHomens);
        } else {
            System.out.println("Não foram encontrados homens na amostra.");
        }

        scanner.close();
    }
}
