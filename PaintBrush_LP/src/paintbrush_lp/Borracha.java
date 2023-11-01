/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbrush_lp;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Lincoln
 */

public class Borracha extends Retangulo {
    
    public Borracha(int largura) {
        this.largura = largura;
    }
    
    @Override
    public void desenhar(Graphics g){
        g.setColor (Color.WHITE);
        g.fillRect(super.x - largura/2, super.y - largura/2, largura, largura);
    }    
}
