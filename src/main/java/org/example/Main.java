package org.example;

public class Main {
    public static void main(String[] args) {

        // String, StringBuilder e StringBuffer
        // A classe String é imutável, seu valor não muda

        //String s = "Olá";  // Criada a String "Olá", está na mémoria
        //s = s + " Pessoal!"; // Criada a String "Olá Pessoal!", também está na mémoria
        // Fazer concatenação de String desse jeito acima não é legal, para isso utilizamos StringBuilder e Buffer
        //s += " Pessoal!";
       // System.out.println(s);

        StringBuilder sb = new StringBuilder("Olá"); // Existe a StringBuilder
        sb.append(" Pessoal!"); // Reaproveitando a StringBuilder

        String resultado = sb.toString();
        System.out.println("Com StringBuilder: " + resultado);

        // A diferença entre StringBuilder e StringBuffer é que a Builder é mais rápida e
        //não é protegida em relação a treds (acessos concorrentes, muitos programinhas acessando o mesmo objeto),
       //as operações com a Builder pode dar problema, pode ser concatenado errado, mas isso só vai acontecer
       //quando estivermos trabalhando com sistemas multi-treds e com recursos compartilhados.
       //Já a Buffer é protegida nesse cenário, então, seria melhor usá-la.
    }

}