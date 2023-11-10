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

import java.awt.*; // Importação da classe Color do pacote java.awt.

/**
 * A classe abstrata _2D representa objetos bidimensionais no contexto de um programa de pintura.
 * Ela estende a classe Ponto, indicando que _2D herda as propriedades e comportamentos da classe Ponto.
 */
public abstract class _2D extends Ponto{
    // Atributos públicos que armazenam a cor interna do objeto bidimensional e flags para exibir área e perímetro.
    public Color cor_Interna;
    public boolean exibir_Area = false;
    public boolean exibir_Perimetro = false;
    
     /**
     * Método abstrato para calcular a área do objeto bidimensional.
     * Subclasses devem implementar este método para fornecer a lógica específica.
     */
    abstract public float area();
    
    /**
     * Método abstrato para calcular o perímetro do objeto bidimensional.
     * Subclasses devem implementar este método para fornecer a lógica específica.
     */
    abstract  public float perimetro();
    
    /**
     * Sobrescrita do método desenhar da classe pai (Ponto).
     * Se as flags exibir_Area ou exibir_Perimetro estiverem ativadas, exibe as informações na tela.
     */
    @Override
    public void desenhar (Graphics g) {
        if(exibir_Area) g.drawString("Área = " + Float.toString(area()), x, y); //Se Exibir_Area = Thrue entao mostra o valor da area.
        if(exibir_Perimetro) g.drawString("Perímetro = " + Float.toString(perimetro()), x, y); //Se Exibir_Perimetro = Thrue entao mostra o valor do perimetro.
    }
}

