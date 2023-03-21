package AulaRevisao1;

import java.util.Scanner;

public class ExemploRevisao {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        // 1. Ler a primeira nota
        System.out.println("Informe a 1ª nota do Aluno");
        int nota1 = sc.nextInt();
        // 2. Ler a seguna nota
        System.out.println("Informe a 2ª nota do Aluno");
        int nota2 = sc.nextInt();
        // 3. Calcular a Média
        double media = (nota1 + nota2) / 2;
        // 4. Mostra a Média
        System.out.println("A média do Aluno é" + media);
        // 5. Ler o total de aulas da disciplina
        System.out.println("Informe o total de aulas da disciplina");
        int aulasDadas = sc.nextInt();
        // 6. Ler a quantidade de faltas do Aluno
        System.out.println("Informe o total de faltas do Aluno");
        int totalFaltas = sc.nextInt();
        // 7. Calcular a porcentagem de frequência
        double frequencia = ((aulasDadas - totalFaltas) * 100) / aulasDadas;
        // 8. Mostrar a Frequência
        System.out.println("A frenquência do Aluno é" + frequencia + "%");
        // 9. Se media >= 50 e frequencia >= 75% então Aprovado
        if (media >= 50 && frequencia >= 75) {
            System.out.println("Aluno Aprovado");
        } else if (media < 50 && frequencia >= 75) {
            System.out.println("Aluno de Recuperação");
        } else {// Se não, Reprovado
            System.out.println("Aluno Reprovado");
        }
    }

}
