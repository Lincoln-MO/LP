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


public class Reta extends _1D{
    public int x1, y1;
    public boolean exibirCompr = false;
    
    @Override
    public float comprimento() {
        float distancia_X = Math.abs(x1 - x);
        float distancia_Y = Math.abs(y1 - y);
        float comprimento = (float) Math.sqrt(distancia_X * distancia_X + distancia_Y * distancia_Y);
        return comprimento;
    }
    
    @Override
    public void desenhar(Graphics g) {
        if(exibirCompr) g.drawString(Float.toString(comprimento()), x, y);
        g.setColor(cor);
        g.drawLine(x, y, x1, y1);
    }
}
    
