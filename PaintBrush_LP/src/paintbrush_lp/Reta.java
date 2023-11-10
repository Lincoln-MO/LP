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

import java.awt.Graphics; // Importação da classe Graphics do pacote java.awt.

/**
 * A classe Reta representa uma linha no contexto de um programa de pintura.
 * Ela estende a classe _1D, indicando que Reta herda as propriedades e comportamentos
 * da classe _1D.
 */
public class Reta extends _1D{
    // Atributos públicos que armazenam as coordenadas iniciais (x, y) e finais (x1, y1) da reta.
    public int x1, y1;
    public boolean exibirCompr = false; // Indica se o comprimento da reta deve ser exibido.
    
    /**
     * Método que calcula o comprimento da reta usando o Teorema de Pitágoras.
     * Retorna o comprimento da reta.
     */
    @Override
    public float comprimento() {
        float distancia_X = Math.abs(x1 - x); // Calcula a distância horizontal.
        float distancia_Y = Math.abs(y1 - y); // Calcula a distância vertical.
        float comprimento = (float) Math.sqrt(distancia_X * distancia_X + distancia_Y * distancia_Y); // Calcula o comprimento usando o Teorema de Pitágoras.
        return comprimento;
    }
    
    /**
     * Método para desenhar a reta na tela.
     * Se a variável exibirCompr for verdadeira, exibe o comprimento da reta.
     * Desenha a reta usando as coordenadas inicial (x, y) e final (x1, y1).
     */
    @Override
    public void desenhar(Graphics g) {
        if(exibirCompr) g.drawString(Float.toString(comprimento()), x, y); //Se ExibirComprimento = Thrue entao mostra o valor do comprimento da reta.
        g.setColor(cor); // Define a cor do pincel como a cor da reta.
        g.drawLine(x, y, x1, y1); // Desenha a linha entre as coordenadas (x, y) e (x1, y1).
    }
}
    
