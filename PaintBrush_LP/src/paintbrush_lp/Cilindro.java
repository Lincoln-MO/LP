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

public class Cilindro extends _3D{
    
    public int raio;
    public static final float PI = 3.14f;
    
    @Override
    public float perimetro() {
        return -1;
    }

    @Override
    public float area() {
        return 2*(PI*raio*(raio+altura));
    }
  
    
    @Override
    public float volume() {
        return Circulo.PI * raio * raio * altura;
    }
    
    @Override
    public void desenhar(Graphics g){
        super.desenhar(g);
        g.setColor(cor);
        g.drawLine(x, y, x, y + altura);
        g.drawLine(x + 2*raio, y, x + 2*raio, y + altura);
        g.drawOval(x, y - 15, 2 * raio, 30);
        g.drawOval(x, y + altura - 15, 2 * raio, 30);
    }

} 