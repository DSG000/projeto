
package com.mycompany.prota;

import java.util.Random;


public class ItensEspeciais {
private double porcentagem;
private Random random;

public ItensEspeciais(double porcentagem){
    this.porcentagem = porcentagem;
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

public void SetPorcentagem(double porcentagem){
    this.porcentagem = porcentagem;
}
public void realizarAcao(){
    if (random.nextDouble() < this.porcentagem / 100.0) {
        System.out.println("Você ganhou um ITEM ESPECIAL\nManto Invisivel");
    }else{
        System.out.println("Esses são seus itens");
    }
}
public void realizaracao1(){
    if (random.nextDouble() < this.porcentagem / 100.0) {
        System.out.println("Você ganhou um ITEM ESPECIAL\nGume do Infinito");
    }else{
        System.out.println("Esses são seus itens");
}
}
public void realizaracao2(){
    if (random.nextDouble() < this.porcentagem / 100.0) {
        System.out.println("Você ganhou um ITEM ESPECIAL\nMachado Lendario");
    }else{
        System.out.println("Esses são seus itens");
}
}
public void realizaracao4(){
    if (random.nextDouble() < this.porcentagem / 100.0) {
        System.out.println("Você ganhou um ITEM ESPECIAL\nAdagas Duplas");
    }else{
        System.out.println("Esses são seus itens");
}
}
public void realizaracao3(){
    if (random.nextDouble() < this.porcentagem / 100.0) {
        System.out.println("Você ganhou um ITEM ESPECIAL\nMonarca das Sombras");
    }else{
        System.out.println("Esses são seus itens");
    }
}
}