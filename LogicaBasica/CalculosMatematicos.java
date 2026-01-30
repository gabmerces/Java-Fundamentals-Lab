package LogicaBasica;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class CalculosMatematicos {
    public static void main(String[] args) {
        
        // 08: Múltiplos ---
        String numS = showInputDialog(null, "Digite um número para ver seus múltiplos:", "Exercício 08", 3);
        if (numS != null) {
            int num = Integer.parseInt(numS);
            String multiplos = "Os 3 primeiros múltiplos de " + num + " são:\n" +
                               (num * 1) + ", " + (num * 2) + " e " + (num * 3);
            showMessageDialog(null, multiplos);
        }

        // 09: Média de 3 números ---
        String n1 = showInputDialog(null, "Digite o 1º número para a média:", "Exercício 09", 3);
        String n2 = showInputDialog(null, "Digite o 2º número:", "Exercício 09", 3);
        String n3 = showInputDialog(null, "Digite o 3º número:", "Exercício 09", 3);

        if (n1 != null && n2 != null && n3 != null) {
            double media = (Double.parseDouble(n1) + Double.parseDouble(n2) + Double.parseDouble(n3)) / 3;
            showMessageDialog(null, "A média aritmética é: " + String.format("%.2f", media));
        }
    }
}
 
