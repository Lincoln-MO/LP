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
 * A classe Cilindro representa um cilindro tridimensional no contexto de um programa de pintura.
 * Ela estende a classe _3D, indicando que Cilindro herda as propriedades e comportamentos da classe _3D.
 */
public class Cilindro extends _3D {
    
    // Atributos públicos que armazenam o raio da base do cilindro e uma constante PI.
    public int raio;
    public static final float PI = 3.14f;

    /**
     * Método para calcular o perímetro da base do cilindro.
     * Retorna -1, indicando que o perímetro não é aplicável a um cilindro.
     * Isso é uma decisão de design, pois o cilindro não tem um perímetro simples.
     */
    @Override
    public float perimetro() {
        return -1;
    }

    /**
     * Método para calcular a área da superfície do cilindro.
     * Retorna o dobro do produto de PI pelo raio e a soma do raio com a altura.
     */
    @Override
    public float area() {
        return 2 * (PI * raio * (raio + altura));
    }

    /**
     * Método para calcular o volume do cilindro.
     * Retorna o produto de PI pelo quadrado do raio e pela altura.
     */
    @Override
    public float volume() {
        return Circulo.PI * raio * raio * altura;  // Usa a constante PI da classe Circulo.
    }

    /**
     * Sobrescrita do método desenhar da classe pai (_3D).
     * Chama o método desenhar da superclasse para exibir informações adicionais, se houver.
     * Desenha as linhas que representam a estrutura do cilindro.
     */
    @Override
    public void desenhar(Graphics g) {
        super.desenhar(g);  // Chama o método desenhar da superclasse para exibir informações adicionais.
        g.setColor(cor);  // Define a cor das linhas do cilindro.
        g.drawLine(x, y, x, y + altura);  // Linha vertical representando a altura do cilindro.
        g.drawLine(x + 2 * raio, y, x + 2 * raio, y + altura);  // Linha vertical paralela representando a altura.
        g.drawOval(x, y - 20, 2 * raio, 40);  // Desenha a parte superior do cilindro (elipse).
        g.drawOval(x, y + altura - 20, 2 * raio, 40);  // Desenha a parte inferior do cilindro (elipse).
    }

}