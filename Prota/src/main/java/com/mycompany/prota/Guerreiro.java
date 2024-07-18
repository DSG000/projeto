
package com.mycompany.prota;

public class Guerreiro {
    private String EspadaComum;
    private String ArmaduraMediocre;
    private String EscudoFraco;
    private String GumeDoInfinito;
    private String ArmaduraDoDragão;

    public String getArmaduraDoDragão() {
        return ArmaduraDoDragão;
    }

    public void setArmaduraDoDragão(String ArmaduraDoDragão) {
        this.ArmaduraDoDragão = ArmaduraDoDragão;
    }

    public String getEspadaComum() {
        return EspadaComum;
    }

    public String getArmaduraMediocre() {
        return ArmaduraMediocre;
    }

    public String getEscudoFraco() {
        return EscudoFraco;
    }

    public String getGumeDoInfinito() {
        return GumeDoInfinito;
    }

    public void setEspadaComum(String EC) {
        this.EspadaComum = EC;
    }

    public void setArmaduraMediocre(String AM) {
        this.ArmaduraMediocre = AM;
    }

    public void setEscudoFraco(String EF) {
        this.EscudoFraco = EF;
    }

    public void setGumeDoInfinito(String GI) {
        this.GumeDoInfinito = GI;
    }

 
    public String InventarioGuerreiro() {
        return EspadaComum+ ArmaduraMediocre + EscudoFraco +'.';
    }
    
}
