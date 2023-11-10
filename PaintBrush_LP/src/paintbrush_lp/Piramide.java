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

import java.awt.*; // Importação da classe Graphics do pacote java.awt.

/**
 * A classe Piramide representa uma pirâmide tridimensional no contexto de um programa de pintura.
 * Ela estende a classe _3D, indicando que Piramide herda as propriedades e comportamentos da classe _3D.
 */
public class Piramide extends _3D {
    
    // Atributos públicos que armazenam a base, largura da base e a altura da pirâmide.
    public int base;
    public int largura;

    /**
     * Método para calcular o perímetro da base da pirâmide.
     * Retorna -1, indicando que o perímetro não é aplicável a uma pirâmide.
     * Isso é uma decisão de design, pois a pirâmide não tem um perímetro simples.
     */
    @Override
    public float perimetro() {
        return -1;
    }

    /**
     * Método para calcular a área da superfície da pirâmide.
     * Retorna a soma da área da base retangular e a área dos triângulos laterais.
     */
    @Override
    public float area() {
        float A = base * largura;  // Área da base retangular.
        float P = 2 * (base + largura);  // Perímetro da base retangular.
        return ((P * altura / 2) + A);  // Área total da pirâmide.
    }

    /**
     * Método para calcular o volume da pirâmide.
     * Retorna o terço do produto da base, largura da base e altura.
     */
    @Override
    public float volume() {
        return (base * largura * altura) / 3;
    }

    /**
     * Sobrescrita do método desenhar da classe pai (_3D).
     * Chama o método desenhar da superclasse para exibir informações adicionais, se houver.
     * Desenha as linhas que representam a estrutura da pirâmide.
     */
    @Override
    public void desenhar(Graphics g) {
        super.desenhar(g);  // Chama o método desenhar da superclasse para exibir informações adicionais.
        g.setColor(cor);  // Define a cor das linhas da pirâmide.
        g.drawRect(x, y + 2 * largura, base, largura);  // Desenha a base retangular.
        g.drawLine(x, y + 2 * largura, x + base / 2, y);  // Linha que conecta o vértice à base.
        g.drawLine(x, y + 3 * largura, x + base / 2, y);  // Linha que conecta o vértice à base.
        g.drawLine(x + base, y + 2 * largura, x + base / 2, y);  // Linha que conecta o vértice à base.
        g.drawLine(x + base, y + 3 * largura, x + base / 2, y);  // Linha que conecta o vértice à base.
    }

}
