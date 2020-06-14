
package projetocontaluz;

import javax.swing.JOptionPane;

public class Luz {

    public int leituraAnterior;
    public int leituraAtual;
    public double tusd = 0.30;
    public double te = 0.29;
    public double total; 
    public double valorParcial;
    public String corBandeira;
    public int difLeitura;
    public double icms;
   
    public int getDifLeitura() {
        return difLeitura;
    }

    public void setDifLeitura(int difLeitura) {
        this.difLeitura = difLeitura;
    }
    
 
    
    
    public double getIcms() {
        return icms;
    }

    public void setIcms(double icms) {
        this.icms = icms;
    }
      
    
    public int getLeituraAnterior() {
        return leituraAnterior;
    }

    public void setLeituraAnterior(int leituraAnterior) {
        this.leituraAnterior = leituraAnterior;
    }

    public int getLeituraAtual() {
        return leituraAtual;
    }

    public void setLeituraAtual(int leituraAtual) {
        this.leituraAtual = leituraAtual;
    }

    public double getTusd() {
        return tusd;
    }

    public void setTusd(double tusd) {
        this.tusd = tusd;
    }

    public double getTe() {
        return te;
    }

    public void setTe(double te) {
        this.te = te;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getValorParcial() {
        return valorParcial;
    }

    public void setValorParcial(double valorParcial) {
        this.valorParcial = valorParcial;
    }

    public String getCorBandeira() {
        return corBandeira;
    }

    public void setCorBandeira(String corBandeira) {
        this.corBandeira = corBandeira;
    }

    
    public int leitura (int leituraAnterior, int leituraAtual){
        this.difLeitura = leituraAtual - leituraAnterior;
        return this.difLeitura;
        
    }
    
    public double cobranca (double tusd, double te) {
    double parcial = (this.difLeitura * tusd) + (this.difLeitura * te);
    double sas = parcial * 0.25;
    this.valorParcial = parcial + sas;
    return this.valorParcial;
}
    public double verificaBandeira () {
        
        
        if(this.difLeitura < 101){
            this.corBandeira = "verde";
        }
        if(this.difLeitura > 100 && this.difLeitura < 151) {
            this.corBandeira = "amarela";  
        }
        if(this.difLeitura > 150 && this.difLeitura < 201) {
            this.corBandeira = "vermelha 1";
        }
        if (this.difLeitura > 200) {
            this.corBandeira = "vermelha 2";
        }
        
       switch (this.corBandeira)  {
           
           case "verde":
               this.total = this.valorParcial;
               break;
            case "amarela":
               this.icms = (this.difLeitura * 0.013) * 0.25;
               this.total = this.valorParcial + this.icms;                
                break;
            case "vermelha 1":
               this.icms = (this.difLeitura * 0.042) * 0.25; 
               this.total = this.valorParcial + this.icms;
                break;
            case "vermelha 2":
               this.icms = (this.difLeitura * 0.062) * 0.25; 
               this.total = this.valorParcial + this.icms;
                break;
       }
       return this.total;
    }
    public void imprimeConta (){
    JOptionPane.showMessageDialog(null, "Cia Elétrica do THIAGO\n" 
            + "************************\n" 
            + "Consumo Anterior: " + this.leituraAnterior 
            + "\nConsumo Atual: " + this.leituraAtual 
            + "\nQuantidade Consumida:" + this.difLeitura 
            + "\nTarifa Bandeira: " + this.corBandeira 
            + "\nValor Parcial: " + this.valorParcial
            + "\nValor Total: " + this.total) ;
    
}
}
    

