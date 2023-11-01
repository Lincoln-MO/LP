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

public class Piramide extends _3D{
    public int base;
    public int largura;
    
    @Override
    public float perimetro() {
        return -1;
    }

    @Override
    public float area() {
        float A = base*largura;
        float P = 2*(base+largura);
        return((P*altura/2)+A) ;
    }
    
    @Override
    public float volume() {
        return (base * largura * altura)/3;
    }
     
    @Override
    public void desenhar(Graphics g){
        super.desenhar(g);
        g.setColor (cor);
        g.drawRect(x, y + 2*largura, base, largura);
        g.drawLine(x, y + 2*largura, x + base/2, y);
        g.drawLine(x, y + 3*largura, x + base/2, y);
        g.drawLine(x + base, y + 2*largura, x + base/2, y);
        g.drawLine(x + base, y + 3*largura, x + base/2, y);
    }
    
}
