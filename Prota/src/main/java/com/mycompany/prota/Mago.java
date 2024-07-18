
package com.mycompany.prota;


public class Mago{
    private String CajadoComum;
    private String MantoInvisivel;
    private String Grimorio;

    public String getCajadoComum() {
        return CajadoComum;
    }

    public String getMantoInvisivel() {
        return MantoInvisivel;
    }

    public String getGrimorio() {
        return Grimorio;
    }

    public void setCajadoComum(String Cc) {
        this.CajadoComum = Cc;
    }

    public void setMantoInvisivel(String Mi) {
        this.MantoInvisivel = Mi;
    }

    public void setGrimorio(String G) {
        this.Grimorio = G;
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
