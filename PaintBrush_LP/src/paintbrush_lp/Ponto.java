/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbrush_lp; // Declaração do pacote ao qual esta classe pertence.

/**
 *
 * @author Lincoln
 */

import java.awt.Color; // Importação da classe Color do pacote java.awt.
import java.awt.Graphics; // Importação da classe Graphics do pacote java.awt.

/**
 * A classe Ponto representa um ponto no contexto de um programa de pintura.
 * Ela armazena as coordenadas x e y do ponto, bem como sua cor.
 */

public class Ponto {
    // Atributos públicos que armazenam as coordenadas x e y do ponto e sua cor.
    public int x, y;
    public Color cor;
    /**
     * Método para desenhar o ponto na tela.
     * Define a cor do pincel como a cor do ponto e desenha uma linha vertical de um pixel
     * nas coordenadas (x, y), efetivamente representando um ponto.
     */
    public void desenhar(Graphics g) {
        g.setColor(cor); // Define a cor do pincel como a cor do ponto.
        g.drawLine(x, y, x, y); // Desenha uma linha vertical de um pixel nas coordenadas (x, y).       
    } 
    
}


