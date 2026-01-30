package EntradaDados; 

import static javax.swing.JOptionPane.showInputDialog;

public class ManipulacaoStrings {
    public static void main(String[] args) {
        
        // 05: Receber nome e exibir no console
        // O "3" no final representa o ícone de interrogação na janelinha
        String nome = showInputDialog(null, "Qual é o seu nome", "Exercício 05", 3);
        System.out.println("Nome recebido: " + nome);

        // 06: Receber curso e exibir frase concatenada
        String curso = showInputDialog(null, "Qual é o seu curso", "Exercício 06", 3);
        
        // Exibição final unindo as variáveis (Concatenação)
        System.out.println("\n--- Resultado 06 ---");
        System.out.println(nome + ", estuda " + curso);
    }
}