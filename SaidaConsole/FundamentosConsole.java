public class FundamentosConsole { 

    public static void main(String[] args) {
        
        // 01: Mostrar nome completo no console
        System.out.println("Gabriela Merces Assis");
        
        // 02: Definir variáveis
        String nome = "Gabriela";
        int numero = 19;
        char caractere = 'A';
        boolean booleana = true;
        
        // Apresentar no console as variáveis
        System.out.println("\n--- Variaveis ---");
        System.out.println(nome);
        System.out.println(numero);
        System.out.println(caractere);
        System.out.println(booleana);

        // 03: Diferença println() e print()
        // Dica: Adicione um espaço entre os nomes para não grudarem
        System.out.println("\n--- Diferenca println e print ---");
        System.out.println("Gabriela" + " Merces"); // Pula linha
        System.out.print("Gabriela" + " Merces");   // Não pula linha
        System.out.println(); // Pula linha manual para não grudar no próximo

        // 04: Variáveis x e y e operações
        int x = 7;
        int y = 9;
        
        System.out.println("\n--- Operacoes com X=7 e Y=9 ---");
        System.out.println("Soma: " + (x + y));
        System.out.println("Subtracao: " + (x - y));
        System.out.println("Multiplicacao: " + (x * y));
        System.out.println("Divisao: " + (x / y)); // Retorna 0 (divisao inteira)
    }   
}