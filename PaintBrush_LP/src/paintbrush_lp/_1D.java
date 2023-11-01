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

public abstract class _1D extends Ponto{
    public int x1, y1;
    public boolean exibir_Compr = false;
    
    public float comprimento() {
        float distanciaX = Math.abs(x1 - x);
        float distanciaY = Math.abs(y1 - y);
        float comprimento = (float) Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
        return comprimento;
    }
    
    @Override
    public void desenhar(Graphics g) {
        if(exibir_Compr) g.drawString(Float.toString(comprimento()), x, y);
        g.setColor(cor);
        g.drawLine(x, y, x1, y1);
    }
}
