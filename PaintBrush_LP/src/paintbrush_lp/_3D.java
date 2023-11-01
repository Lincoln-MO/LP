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

public abstract class _3D extends Ponto{
    public int altura;
    public boolean exibir_Perimetro = false;
    public boolean exibir_Area = false;
    public boolean exibir_Volume = false;

    
    abstract public float perimetro();
    abstract public float area();
    abstract public float volume();
    
    @Override
    public void desenhar (Graphics g) {
        if(exibir_Perimetro) g.drawString("Perímetro = " + Float.toString(perimetro()), x, y);
        if(exibir_Area) g.drawString("Área = " + Float.toString(area()), x, y);
        if(exibir_Volume) g.drawString("Volume = " + Float.toString(volume()), x, y);
    }
}
