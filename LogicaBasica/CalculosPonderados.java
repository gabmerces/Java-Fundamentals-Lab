package LogicaBasica;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class CalculosPonderados {
    public static void main(String[] args) {
        
        // 010: Calcular a média do Aluno (60% Prova + 40% Atividade) ---
        String nomeAluno = showInputDialog(null, "Nome do Aluno:", "Média Escolar", 3);
        
        // Recebendo e convertendo notas decimais
        double prova = Double.parseDouble(showInputDialog("Nota da Prova:"));
        double ativ = Double.parseDouble(showInputDialog("Nota da Atividade:"));
        
        double media = (prova * 0.6) + (ativ * 0.4);
        
        showMessageDialog(null, "Aluno: " + nomeAluno + "\nMédia Final: " + String.format("%.2f", media));


        // 011: Calculando salário Líquido ---
        String funcionario = showInputDialog(null, "Nome do Funcionário:", "RH - Folha de Pagamento", 3);
        double bruto = Double.parseDouble(showInputDialog("Salário Bruto:"));
        double inss = Double.parseDouble(showInputDialog("Desconto INSS:"));
        double ir = Double.parseDouble(showInputDialog("Desconto Imposto de Renda:"));
        
        double liquido = bruto - (inss + ir);
        
        showMessageDialog(null, "Funcionário: " + funcionario + "\nSalário Líquido: R$ " + String.format("%.2f", liquido));
    }
}