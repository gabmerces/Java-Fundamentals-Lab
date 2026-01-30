package LogicaBasica; 

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

// 07: Calculadora Simples ---
public class CalculadoraDialog {
    public static void main(String[] args) {
        
        String num1S = showInputDialog(null, "Digite o primeiro número:", "Exercício 07", 3);
        String num2S = showInputDialog(null, "Digite o segundo número:", "Exercício 07", 3);

        if (num1S != null && num2S != null) {
            int x = Integer.parseInt(num1S);
            int y = Integer.parseInt(num2S);

            int soma = x + y;
            int subtracao = x - y;
            int multiplicacao = x * y;
            double divisao = (double) x / y;

            String mensagem = "Resultados para X=" + x + " e Y=" + y + ":\n\n" +
                              "Soma (X+Y): " + soma + "\n" +
                              "Subtração (X-Y): " + subtracao + "\n" +
                              "Multiplicação (X*Y): " + multiplicacao + "\n" +
                              "Divisão (X/Y): " + divisao;

            showMessageDialog(null, mensagem, "Resultado Final", 1);
        }
    }
}