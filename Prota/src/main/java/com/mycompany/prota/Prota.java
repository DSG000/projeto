package com.mycompany.prota;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Prota {

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
        ItensEspeciais mi = new ItensEspeciais();
        ItensEspeciais gi = new ItensEspeciais();
        ItensEspeciais cf = new ItensEspeciais();
        ItensEspeciais ml = new ItensEspeciais();
        ItensEspeciais ms = new ItensEspeciais();

        String classe = sc.nextLine().toLowerCase();
        StringBuilder inventario = new StringBuilder();
        String itemEspecial = "";
        //mago

        
        
        if (classe.equals("mago")) {
            System.out.println("Inventario do Mago: ");
            m.setCajadoComum("Cajado comum ");
            System.out.println(m.getCajadoComum());
            m.setGrimorio("Grimorio basico ");
            System.out.println(m.getGrimorio());
            System.out.println("inventario: ");
            inventario.append(m.MagoInventario()).append("\n");
            itemEspecial = mi.realizarAcao(m);
            inventario.append("item Especial: ").append(itemEspecial);
            System.out.println(inventario);
        } if (classe.equals("guerreiro")) {
            //Guerreiro
            System.out.println("Inventario do Guerreiro: ");
            g.setEspadaComum("Espada Comum ");
            System.out.println(g.getEspadaComum());
            g.setArmaduraMediocre("Armadura Mediocre ");
            System.out.println(g.getArmaduraMediocre());
            g.setEscudoFraco("Escudo Fraco ");
            System.out.println(g.getEscudoFraco());
            System.out.println("inventario: ");
            inventario.append(g.InventarioGuerreiro()).append("\n");
            itemEspecial = gi.realizaracao1(g);
            inventario.append("item Especial: ").append(itemEspecial);
            System.out.println(inventario);
        } if (classe.equals("barbaro")) {
            //barbaro
            System.out.println("inventario do Barbaro: ");
            b.setMachado("Machado ");
            System.out.println(b.getMachado());
            b.setCapaceteBarbaro("Capacete de barbaro ");
            System.out.println(b.getCapaceteBarbaro());
            System.out.println("inventario: ");
            inventario.append(b.DetalhesBarbaro()).append("\n");
            itemEspecial = ml.realizaracao2(b);
            inventario.append("item Especial: ").append(itemEspecial);
            System.out.println(inventario);
        } if (classe.equals("necromante")) {
            n.setCajadoVazio("cajado vazio");
            //necromante
            System.out.println("inventario do Necromante: ");
            n.setAdagasDuplas("adagas duplas");
            System.out.println(n.getAdagasDuplas());
            n.setCajadoVazio("Cajado do Vazio");
            System.out.println(n.getCajadoVazio());
            System.out.println("inventario: ");
            inventario.append(n.DetalhesNecromante()).append("\n");
            itemEspecial = ms.realizaracao4(n);
            inventario.append("item Especial: ").append(itemEspecial);
            System.out.println(inventario);
        } if(classe.equals("Assassino")) {
            //assassino
            System.out.println("inventario do Assassino: ");
            a.setAdagas("Adagas Simples");
            System.out.println(a.getAdagas());
            a.setAdagasDuplas("adaga dupla");
            System.out.println(a.getAdagasDuplas());
            System.out.println("inventario: ");
            inventario.append(a.detalhesAssassino()).append("\n");
            itemEspecial = cf.realizaracao3(a);
            inventario.append("item Especial: ").append(itemEspecial);
            System.out.println(inventario);
        }else
            System.out.println("Você não selecionou nenhum personagem");

        try (Connection connection = bancodedados.getConnection()) {
            String sql = "insert INTO personagens (nome, classe) VALUES (?, ?)";
            try (PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                stmt.setString(1, "DEX");
                stmt.setString(2, classe);
                //  stmt.setString(3, )
                stmt.executeUpdate();

                try (var GeneratedKeys = stmt.getGeneratedKeys()) {
                    if (GeneratedKeys.next()) {
                        int personagemId = GeneratedKeys.getInt(1);

                        String itemEspecialSql = "INSERT INTO itens_especiais (personagem_id, item) VALUES (?, ?)";
                        try (PreparedStatement itemEspecialStmt = connection.prepareStatement(itemEspecialSql)) {
                            itemEspecialStmt.setInt(1, personagemId);
                            itemEspecialStmt.setString(2, itemEspecial);
                            itemEspecialStmt.executeUpdate();
                        }
                    }
                }
                System.out.println("Personagem salvo no banco de dados com sucesso!!!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
