/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbrush_lp;

/**
 *
 * @author Lincoln
 */

import java.awt.Graphics; // Importação da classe Graphics do pacote java.awt.
import java.util.ArrayList; // Importação da classe ArrayList do pacote java.util.

/**
 * A classe Poligono representa um polígono no contexto de um programa de pintura.
 * Ela estende a classe _2D, indicando que Poligono herda as propriedades e comportamentos da classe _2D.
 */
public class Poligono extends _2D {

    // Lista de pontos que definem os vértices do polígono.
    public ArrayList<Ponto> Pontos;

    /**
     * Construtor padrão que inicializa a lista de pontos.
     */
    public Poligono() {
        Pontos = new ArrayList<>();
    }

    /**
     * Método para calcular a área do polígono.
     * Retorna -1, indicando que a área não é aplicável a um polígono arbitrário.
     */
    @Override
    public float area() {
        return -1;
    }

    /**
     * Método para calcular o perímetro do polígono.
     * Retorna -1, indicando que o perímetro não é aplicável a um polígono arbitrário.
     */
    @Override
    public float perimetro() {
        return -1;
    }

    /**
     * Método para adicionar um ponto à lista de pontos do polígono.
     * Cria um novo ponto com as coordenadas especificadas e adiciona à lista.
     */
    public void adicionarPonto(int x, int y) {
        Ponto p = new Ponto();
        p.x = x;
        p.y = y;
        Pontos.add(p);
    }

    /**
     * Método para remover todos os pontos da lista de pontos.
     */
    public void removerPontos() {
        Pontos.clear();
    }

    /**
     * Sobrescrita do método desenhar da classe pai (_2D).
     * Converte os pontos do polígono em arrays de coordenadas X e Y.
     * Desenha o polígono preenchido e a borda usando os arrays de coordenadas.
     * Remove todos os pontos após desenhar o polígono.
     */
    @Override
    public void desenhar(Graphics g) {
        int[] pontosX = new int[Pontos.size()];
        int[] pontosY = new int[Pontos.size()];
        for (int i = 0; i < Pontos.size(); i++) {
            pontosX[i] = Pontos.get(i).x;
            pontosY[i] = Pontos.get(i).y;
        }
        g.setColor(cor_Interna);  // Define a cor interna do polígono.
        g.fillPolygon(pontosX, pontosY, Pontos.size());  // Desenha o polígono preenchido.
        g.setColor(cor);  // Define a cor da borda do polígono.
        g.drawPolygon(pontosX, pontosY, Pontos.size());  // Desenha a borda do polígono.
        removerPontos();  // Remove todos os pontos após desenhar o polígono.
    }
}
