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

/**
 * A classe Circulo representa um círculo no contexto de um programa de pintura.
 * Ela estende a classe _2D, indicando que Circulo herda as propriedades e comportamentos da classe _2D.
 */
public class Circulo extends _2D {
    
    // Atributos públicos que armazenam o raio do círculo e uma constante PI.
    public int raio;
    public static final float PI = 3.14f;

    /**
     * Método para calcular a área do círculo.
     * Retorna o produto de PI pelo quadrado do raio.
     */
    @Override
    public float area() {
        return PI * raio * raio;
    }

    /**
     * Método para calcular o perímetro do círculo.
     * Retorna o dobro de PI pelo raio.
     */
    @Override
    public float perimetro() {
        return 2 * PI * raio;
    }

    /**
     * Sobrescrita do método desenhar da classe pai (_2D).
     * Se as flags exibir_Area ou exibir_Perimetro estiverem ativadas, exibe as informações na tela.
     * Desenha o círculo preenchido e a borda usando as coordenadas (x, y) e o raio especificados.
     */
    @Override
    public void desenhar(Graphics g) {
        if (exibir_Area) g.drawString("Área = " + Float.toString(area()), x - raio, y - raio);
        if (exibir_Perimetro) g.drawString("Perímetro = " + Float.toString(perimetro()), x - raio, y - raio - 10);
        g.setColor(cor_Interna);  // Define a cor interna do círculo.
        g.fillOval(x - raio, y - raio, 2 * raio, 2 * raio);  // Desenha o círculo preenchido.
        g.setColor(cor);  // Define a cor da borda do círculo.
        g.drawOval(x - raio, y - raio, 2 * raio, 2 * raio);  // Desenha a borda do círculo.
    }
}
