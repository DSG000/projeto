
package com.mycompany.prota;


public class Mago{
    private String CajadoComum;
    private String MantoInvisivel;
    private String Grimorio;
    private String CetroDemoniaco;

    public String getCajadoComum() {
        return CajadoComum;
    }

    public void setCajadoComum(String CajadoComum) {
        this.CajadoComum = CajadoComum;
    }

    public String getMantoInvisivel() {
        return MantoInvisivel;
    }

    public void setMantoInvisivel(String MantoInvisivel) {
        this.MantoInvisivel = MantoInvisivel;
    }

    public String getGrimorio() {
        return Grimorio;
    }

    public void setGrimorio(String Grimorio) {
        this.Grimorio = Grimorio;
    }

    public String getCetroDemoniaco() {
        return CetroDemoniaco;
    }

    public void setCetroDemoniaco(String CetroDemoniaco) {
        this.CetroDemoniaco = CetroDemoniaco;
    }

    public void MagiaDeFogo(){
        System.out.println("Bola de fogo deu 35 de dano.");
        
}
    public void MagiaDeGelo(){
        System.out.println("Magia de gelo congela seus inimigos por um turno e da 15 de dano.");
    }

    public String MagoInventario() {
        return CajadoComum + Grimorio +'.';
    }
    
}
