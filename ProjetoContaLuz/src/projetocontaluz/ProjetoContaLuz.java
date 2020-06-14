package projetocontaluz;

import javax.swing.JOptionPane;

public class ProjetoContaLuz {

    public static void main(String[] args) {
        Luz leitura = new Luz();
        
        leitura.setLeituraAnterior(Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor da Leitura Anterior")));
        leitura.setLeituraAtual(Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor da Leitura Atual")));
        
       int quantidade = leitura.leitura(leitura.getLeituraAnterior(), leitura.getLeituraAtual());
       double valor = leitura.cobranca(leitura.getTe() ,leitura.getTusd() );
       double cor = leitura.verificaBandeira();
       
       
       leitura.imprimeConta();
       
    }
    
}
