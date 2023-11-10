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

import java.awt.Graphics;
import java.util.Random;

/**
 * A classe Spray representa um efeito de "spray" no contexto de um programa de pintura.
 * Ela herda da classe Ponto, indicando que Spray herda as propriedades e comportamentos da classe Ponto.
 */
public class Spray extends Ponto {
    
    // Atributos públicos que definem a densidade e o raio do efeito de spray.
    public int densidade = 30;
    public int raio = 15;

    /**
     * Sobrescrita do método desenhar da classe pai (Ponto).
     * Utiliza um algoritmo de "spray" para desenhar pontos aleatórios dentro de um raio específico ao redor do ponto central.
     */
    @Override
    public void desenhar(Graphics g) {
        int i = 0;  // Contador para controlar a densidade de pontos a serem desenhados.
        Random random = new Random();  // Objeto Random para gerar coordenadas aleatórias.
        g.setColor(cor);  // Define a cor do "spray".

        // Loop para desenhar pontos dentro da área especificada pelo raio.
        while (i < densidade) {
            // Gera coordenadas x e y aleatórias dentro da área do raio, ao redor do ponto central (x, y).
            int xRandom = (int) ((random.nextDouble() * 2 * raio) - raio + x);
            int yRandom = (int) ((random.nextDouble() * 2 * raio) - raio + y);

            // Calcula a distância entre o ponto gerado e o ponto central.
            double distancia = Math.sqrt(Math.pow(xRandom - x, 2) + Math.pow(yRandom - y, 2));

            // Verifica se o ponto gerado está dentro do raio especificado.
            if (distancia < raio) {
                // Desenha um ponto na posição gerada.
                g.drawLine(xRandom, yRandom, xRandom, yRandom);
                i++;  // Incrementa o contador de pontos desenhados.
            }
        }
    }
}







