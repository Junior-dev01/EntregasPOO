package br.com.nexustech.main;
import br.com.nexustech.exception.NivelInsuficienteException;
import br.com.nexustech.exception.BanidoException;
import br.com.nexustech.model.Masmorra;
import br.com.nexustech.model.ModoJogo;
import br.com.nexustech.model.ModoCasual;
import br.com.nexustech.model.ModoRanqueado;
import br.com.nexustech.model.Matchmaker;

public class Main {
    public static void main(String[] args) {
        
        // --- EXERCÍCIO 9 (Testando a Masmorra) ---
        System.out.println("--- Testando Masmorra ---");
        Masmorra masmorra = new Masmorra();
        try {
            masmorra.entrar(20); // Nível menor que 50, vai lançar exceção
        } catch (NivelInsuficienteException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }

        // --- EXERCÍCIOS 10 a 14 (Nível Boss: Matchmaker) ---
        System.out.println("\n--- Testando Matchmaker ---");
        Matchmaker matchmaking = new Matchmaker();
        ModoJogo casual = new ModoCasual();
        ModoJogo ranqueado = new ModoRanqueado();

        // Tentando buscar partida com um jogador banido (true)
        try {
            matchmaking.encontrarSala(casual, true);
        } catch (BanidoException e) {
            System.out.println("Sistema bloqueou com sucesso: " + e.getMessage());
        }

        // Testando uma busca normal (jogador não banido = false)
        try {
            matchmaking.encontrarSala(ranqueado, false);
        } catch (BanidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}