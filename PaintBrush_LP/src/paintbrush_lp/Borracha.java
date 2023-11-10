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
 * A classe Borracha estende a classe Retangulo, indicando que Borracha herda
 * as propriedades e comportamentos da classe Retangulo.
 */

public class Borracha extends Retangulo {
    /**
     * Construtor da classe Borracha que recebe a largura da borracha como parâmetro.
     * A palavra-chave 'super' é usada para chamar o construtor da classe pai (Retangulo).
     */
    public Borracha(int largura) {
        this.largura = largura; // Inicializa o atributo 'largura' da classe Retangulo.
    }
    /**
     * Sobrescrita do método desenhar da classe pai (Retangulo).
     * Este método desenha um retângulo branco (representando a borracha) usando as
     * coordenadas e largura fornecidas.
     */
    @Override
    public void desenhar(Graphics g){
        g.setColor (Color.WHITE); // Define a cor do pincel como branco.
        g.fillRect(super.x - largura/2, super.y - largura/2, largura, largura); // Desenha um retângulo branco centrado nas coordenadas (x, y) com a largura especificada.
    }    
}
