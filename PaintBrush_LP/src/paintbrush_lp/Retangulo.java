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
 * A classe Retangulo representa um retângulo no contexto de um programa de pintura.
 * Ela estende a classe _2D, indicando que Retangulo herda as propriedades e comportamentos da classe _2D.
 */
public class Retangulo extends _2D{
    // Atributos públicos que armazenam a base e largura do retângulo.
    public int base, largura;
    
    /**
     * Método para calcular a área do retângulo.
     * Retorna o produto da base pela largura.
     */
    @Override
    public float area() { return base * largura;}
    
    /**
     * Método para calcular o perímetro do retângulo.
     * Retorna o dobro da soma da base com a largura.
     */
    @Override
    public float perimetro() { return 2 * (base + largura); }
    
    /**
     * Sobrescrita do método desenhar da classe pai (_2D).
     * Chama o método desenhar da superclasse para exibir informações adicionais, se houver.
     * Desenha o retângulo usando as coordenadas (x, y), a base e largura especificadas.
     */
    @Override public void desenhar(Graphics g){
        
        super.desenhar(g);  // Chama o método desenhar da superclasse para exibir informações adicionais.
        g.setColor(cor_Interna);  // Define a cor interna do retângulo.
        g.fillRect(super.x, super.y, base, largura);  // Desenha o retângulo preenchido.
        g.setColor(cor);  // Define a cor da borda do retângulo.
        g.drawRect(super.x, super.y, base, largura);  // Desenha a borda do retângulo.
    }
}
