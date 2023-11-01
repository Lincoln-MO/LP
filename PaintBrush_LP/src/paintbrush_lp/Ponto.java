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

import java.awt.Color;
import java.awt.Graphics;

public class Ponto {
    
    public int x, y;
    public Color cor;
    
    public void desenhar(Graphics g) {
        g.setColor(cor);
        g.drawLine(x, y, x, y);        
    } 
    
}


