
package com.mycompany.prota;

import java.util.Scanner;


public class Prota{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seu nome é Dex, você foi teleportado para um mundo de fantasia!\nEscolha sua classe:\nMago \nGuerreiro \nBarbaro \nNecromante \nAssassino ");
        
        //classes
        Mago m = new Mago();
        Guerreiro g = new Guerreiro();
        Barbaro b = new Barbaro();
        Necromante n = new Necromante();
        Assassino a = new Assassino();
  //itens especiais      
 ItensEspeciais mi = new ItensEspeciais(20.0);
 ItensEspeciais gi = new ItensEspeciais(20.0);
 ItensEspeciais cf = new ItensEspeciais(20.0);  
 ItensEspeciais ml = new ItensEspeciais(20.0); 
 ItensEspeciais ms = new ItensEspeciais(20.0);
 
        String classe = sc.nextLine().toLowerCase();
        //mago
        
        if (classe.equals("mago")){
        System.out.println("Inventario do Mago: " );    
        m.setCajadoComum("Cajado comum ");
        m.setGrimorio("\nGrimorio basico ");
        mi.realizarAcao();
        System.out.println(m.MagoInventario());
        }else if (classe.equals("guerreiro")){
        //Guerreiro
        System.out.println("Inventario do Guerreiro: ");
        g.setEspadaComum("Espada Comum");
        g.setArmaduraMediocre("\nArmadura Mediocre");
        g.setEscudoFraco("\nEscudo Fraco");
        gi.realizaracao1();
        System.out.println(g.InventarioGuerreiro());
        }else if (classe.equals("barbaro")){
         //barbaro
        System.out.println("inventario do Barbaro: ");
        b.setMachado("Machado");
        b.setCapaceteBarbaro("\nCapacete de barbaro");
        ml.realizaracao2();
        System.out.println(b.DetalhesBarbaro());
        }else if (classe.equals("necromante")){
        n.setCajadoVazio("cajado vazio");
        //necromante
        n.setAdagasDuplas("\nadagas duplas");
        ms.realizaracao3();
        System.out.println(n.DetalhesNecromante());
        }else if(classe.equals("Assassino")){
        //assassino
        a.setAdagas("Adagas Simples");
        a.setAdagasDuplas("Adagas Duplas");
        cf.realizaracao4();
        System.out.println(a.detalhesAssassino());
        }
        
        
    }}
   
        
               
                
      
            
        
