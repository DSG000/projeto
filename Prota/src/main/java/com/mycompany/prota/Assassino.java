
package com.mycompany.prota;

public class Assassino {
    private String Adagas;
    private String CapaDeFurtividade;
    private String AdagasDuplas;

    public String getAdagas() {
        return Adagas;
    }

    public String getCapaDeFurtividade() {
        return CapaDeFurtividade;
    }

    public String getAdagasDuplas() {
        return AdagasDuplas;
    }

    public void setAdagas(String A) {
        this.Adagas = A;
    }

    public void setCapaDeFurtividade(String CF) {
        this.CapaDeFurtividade = CF;
    }

    public void setAdagasDuplas(String AD) {
        this.AdagasDuplas = AD;
    }
        public void furtividadeAssassina(){
            System.out.println("ganha 20 de Velocidade e da 15 de dano no inimigo");
}


    public String detalhesAssassino() {
        return Adagas + CapaDeFurtividade +'.';
    }
        
}
