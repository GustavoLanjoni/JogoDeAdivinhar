package Jogo;

import java.util.Random;

import javax.swing.JOptionPane;

public class JogoAdivinha {

	public static void main(String[] args) {

        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;

        int tentativas = 0;
        boolean acertou = false;

        while (!acertou) {

            String palpiteTexto = JOptionPane.showInputDialog("Tente adivinhar o número entre 1 e 100:");
            int palpite = Integer.parseInt(palpiteTexto);

            tentativas++;

            if (palpite == numeroSecreto) {
                acertou = true;

                if (tentativas == 1) {
                    JOptionPane.showMessageDialog(null, "INCRÍVEL! Você acertou de primeira! 🎯");
                } else {
                    JOptionPane.showMessageDialog(null, "Parabéns! Você acertou o número " + palpite + " em " + tentativas + " tentativas!");
                }

            } else if (palpite < numeroSecreto) {
                JOptionPane.showMessageDialog(null, "O número secreto é MAIOR que " + palpite + ". Tente novamente.");
            } else {
                JOptionPane.showMessageDialog(null, "O número secreto é MENOR que " + palpite + ". Tente novamente.");
            }
        }
    }
}