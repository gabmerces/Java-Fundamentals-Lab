package LogicaBasica; 

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class ConversorTemperatura {
    public static void main(String[] args) {
        
        // 012: Solicita a entrada de dados via janela flutuante
        // O parâmetro '3' define o ícone de interrogação (QUESTION_MESSAGE)
        String input = showInputDialog(null, "Digite a temperatura em Celsius (°C):", "Exercício 12", 3);
        
        if (input != null) {
            double celsius = Double.parseDouble(input);
            
            // Aplicação da fórmula matemática de conversão (Celsius para Fahrenheit)
            double fahrenheit = (celsius * 9 / 5) + 32;
            
            String resultado = String.format("%.1f°C equivalem a %.1f°F", celsius, fahrenheit);
            
            showMessageDialog(null, resultado, "Conversão de Temperatura", 1);
        }
    }
}