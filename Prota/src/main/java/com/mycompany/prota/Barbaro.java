
package com.mycompany.prota;

public class Barbaro {
    private String Machado;
    private String CapaceteBarbaro;
    private String MachadoLendario;

    public String getMachado() {
        return Machado;
    }

    public String getCapaceteBarbaro() {
        return CapaceteBarbaro;
    }

    public String getMachadoLendario() {
        return MachadoLendario;
    }

    public void setMachado(String Machado) {
        this.Machado = Machado;
    }

    public void setCapaceteBarbaro(String CapaceteBarbaro) {
        this.CapaceteBarbaro = CapaceteBarbaro;
    }

    public void setMachadoLendario(String MachadoLendario) {
        this.MachadoLendario = MachadoLendario;
    }

    public String DetalhesBarbaro() {
        return Machado + CapaceteBarbaro +'.';
    }
    
}
