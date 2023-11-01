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

public class Circulo extends _2D{
    
    public int raio;
    public static final float PI = 3.14f;
    
    @Override
    public float area() { return PI * raio * raio;}
    
    @Override
    public float perimetro() { return 2 * PI * raio;}
    
    @Override public void desenhar(Graphics g){
       if(exibir_Area) g.drawString("Área = " + Float.toString(area()), x - raio, y - raio);
       if(exibir_Perimetro) g.drawString("Perímetro = " + Float.toString(area()), x - raio, y - raio - 10);
       g.setColor(cor_Interna);
       g.fillOval(x - raio, y - raio, 2 * raio, 2 * raio);
       g.setColor(cor);
       g.drawOval(x - raio, y - raio, 2 * raio, 2 * raio);
    }
}
