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
 * A classe abstrata _3D representa objetos tridimensionais no contexto de um programa de pintura.
 * Ela estende a classe Ponto, indicando que _3D herda as propriedades e comportamentos da classe Ponto.
 */
public abstract class _3D extends Ponto{
    // Atributos públicos que armazenam a altura do objeto tridimensional e flags para exibir informações.
    public int altura;
    public boolean exibir_Perimetro = false;
    public boolean exibir_Area = false;
    public boolean exibir_Volume = false;

    /**
     * Método abstrato para calcular o perímetro do objeto tridimensional.
     * Subclasses devem implementar este método para fornecer a lógica específica.
     */
    abstract public float perimetro();
    
    /**
     * Método abstrato para calcular a área da superfície do objeto tridimensional.
     * Subclasses devem implementar este método para fornecer a lógica específica.
     */
    abstract public float area();
    
    /**
     * Método abstrato para calcular o volume do objeto tridimensional.
     * Subclasses devem implementar este método para fornecer a lógica específica.
     */
    abstract public float volume();
    
    /**
     * Sobrescrita do método desenhar da classe pai (Ponto).
     * Se as flags exibir_Perimetro, exibir_Area ou exibir_Volume estiverem ativadas, exibe as informações na tela.
     */
    @Override
    public void desenhar (Graphics g) {
        if(exibir_Perimetro) g.drawString("Perímetro = " + Float.toString(perimetro()), x, y);
        if(exibir_Area) g.drawString("Área = " + Float.toString(area()), x, y);
        if(exibir_Volume) g.drawString("Volume = " + Float.toString(volume()), x, y);
    }
}
