package br.fiap.controle;
import static java.lang.Long.parseLong;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.*;

public class Controle {

    public void menu() {
        int opcao;
        while(true) {
            opcao = parseInt(showInputDialog(gerarMenu()));
        }
    }

    private String gerarMenu() {
        String aux = "SISTEMA DE COMPRAS ONLINE";
        aux += "1. Comprar\n";
        aux += "2. Adicionar produto\n";
        aux += "3. Remover produto\n";
        aux += "4. Fechar compra\n";
        aux += "5. Finalizar compra\n";
        return aux;
    }

}
