/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paintbrush;

import java.awt.Graphics;

/**
 *
 * @author Lincoln
 */
public class Retangulo extends D2 {
    public int base, largura;
    
    @Override public float area() { return base * largura;}
    
    @Override public float perimetro() { return 2 * (base + largura);}
    
    @Override public void desenhar(Graphics g) {
        
        super.desenhar(g); // para plotar a area
        g.setColor(corInterna);
        g.fillRect(x, y, base, largura);              
        g.setColor(cor);
        g.drawRect(x, y, base, largura);              
        
    }
    
    
    
    
    
    
}
