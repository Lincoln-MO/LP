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

import java.awt.*;

public abstract class _2D extends Ponto{

    public Color cor_Interna;
    public boolean exibir_Area = false;
    public boolean exibir_Perimetro = false;
    
    abstract public float area();
    abstract  public float perimetro();
    
    @Override
    public void desenhar (Graphics g) {
        if(exibir_Area) g.drawString("Área = " + Float.toString(area()), x, y);
        if(exibir_Perimetro) g.drawString("Perímetro = " + Float.toString(perimetro()), x, y);
    }
}

