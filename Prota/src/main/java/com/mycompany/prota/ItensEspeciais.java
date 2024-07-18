package com.mycompany.prota;

import java.util.Random;

public class ItensEspeciais {

    private double porcentagem;
    private Random random;
    double nextDouble;// = random.nextDouble();
    String msg = "";

    public ItensEspeciais() {
        this.random = new Random();
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public Random getRandom() {
        return random;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public void SetPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public String realizarAcao(Mago m) {//0.1
        nextDouble = random.nextDouble();//0.0 - 1.0
        if (nextDouble <= 0.33) {
            msg = "Você ganhou um ITEM ESPECIAL\nManto Invisivel";
            m.setMantoInvisivel("Manto Invisivel");
            //System.out.println("Você ganhou um ITEM ESPECIAL\nManto Invisivel");
        } else if (nextDouble > 0.33 && nextDouble <= 0.66) {
            msg = "Você ganhou um ITEM LENDARIO!!!\nCetro demoniaco";
            m.setCetroDemoniaco("Cetro demoniaco");
            //System.out.println("Você ganhou um ITEM LENDARIO!!!\nCetro demoniaco");
        } else {
            msg = "Você não ganhou nenhum item especial ";
            //System.out.println("Esses são seus itens");
        }
        return msg;
    }

    public String realizaracao1(Guerreiro g) {
        nextDouble = random.nextDouble();
        if (nextDouble <= 0.25) {
            msg = "Você ganhou um ITEM ESPECIAL\nGume do Infinito";
            g.setGumeDoInfinito("Gume do infinito");
        } else if (nextDouble > 0.25 && nextDouble <= 0.50) {
            msg = "Você ganhou um ITEM LENDARIO!!!\nArmadura do Dragão";
            g.setArmaduraDoDragão("Armadura do dragão");
        } else {
            msg = "Você não ganhou nenhum item especial ";
        }
        return msg;
    }

    public String realizaracao2(Barbaro b) {
        nextDouble = random.nextDouble();
        if (nextDouble <= 0.33) {
            msg = "Você ganhou um ITEM ESPECIAL\nMachado FODA!";
            b.setMachadoLendario("Machado Foda!");
        } else if (nextDouble > 0.33 && nextDouble <= 0.66) {
            msg = "Você ganhou um ITEM LENDARIO!!! \nClava gigante";
            b.setClavaGigante("Clava gigante");
        } else {
            msg = "Você não ganhou nenhum item especial ";
        }
        return msg;
    }

    public String realizaracao4(Necromante n) {
        nextDouble = random.nextDouble();
        if (nextDouble <= 0.33) {
            msg = "Você ganhou um ITEM ESPECIAL\nMagia sombria";
            n.setAdagasDuplas("magia sombria");
        } else if (nextDouble > 0.33 && nextDouble <= 0.66) {
            msg = "Você é o novo **monarca das sombras** ";
            n.setMonarcaDasSombras("Monarca das sombras");
        } else {
            msg = "Você não ganhou nenhum item especial ";
        }
        return msg;
    }

    public String realizaracao3(Assassino a) {
        nextDouble = random.nextDouble();
        if (nextDouble <= 0.33) {
          msg = "Você ganhou um ITEM ESPECIAL\\nGarra de grifo";
          a.setGarrasdegrifo("Garras de grifo");
        } else if (nextDouble > 0.33 && nextDouble <= 0.66) {
          msg = "Você ganhou um ITEM LENDARIO!!! \nKatana rios de sangue";
          a.setKatanariosdesangue("Katana rios de sangue");
        }else {
        msg = "Você não ganhou nenhum item especial ";
    }
         return msg;
}
}
//nesse jogo você pode escolher uma classe e você vai receber seus itens... chance de item raro!!!
