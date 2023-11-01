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

public class Retangulo extends _2D{
    public int base, largura;
    
    @Override
    public float area() { return base * largura;}
    
    @Override
    public float perimetro() { return 2 * (base + largura); }
    
    @Override public void desenhar(Graphics g){
        
        super.desenhar(g); 
        g.setColor (cor_Interna);
        g.fillRect(super.x, super.y, base, largura);
        g.setColor (cor);
        g.drawRect(super.x, super.y, base, largura);
    }
}
