
package com.mycompany.prota;

public class Necromante {
    private String CajadoVazio;
    private String AdagasDuplas;
    private String MonarcaDasSombras;

    public String getCajadoVazio() {
        return CajadoVazio;
    }

    public String getAdagasDuplas() {
        return AdagasDuplas;
    }

    public String getMonarcaDasSombras() {
        return MonarcaDasSombras;
    }

    public void setCajadoVazio(String CajadoVazio) {
        this.CajadoVazio = CajadoVazio;
    }
 
    public void setAdagasDuplas(String AdagasDuplas) {
        this.AdagasDuplas = AdagasDuplas;
    }

    public void setMonarcaDasSombras(String MS) {
        this.MonarcaDasSombras = MS;
    }


    public String DetalhesNecromante() {
        return CajadoVazio + AdagasDuplas +'.';
    }
    
}
