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
import java.util.Random;

public class Spray extends Ponto{
    public int densidade = 30;
    public int raio = 15;
    @Override
    public void desenhar(Graphics g) {
        int i = 0;
        Random random = new Random();
        g.setColor(cor);
        while(i < densidade) {
            int xRandom = (int) ((random.nextDouble() * 2 * raio) - raio + x);
            int yRandom = (int) ((random.nextDouble() * 2 * raio) - raio + y);
            double distancia = Math.sqrt(Math.pow(xRandom - x, 2) + Math.pow(yRandom - y, 2));
            if(distancia < raio) {
                g.drawLine(xRandom, yRandom, xRandom, yRandom);
                i++;
            } 
        }
    }
}
