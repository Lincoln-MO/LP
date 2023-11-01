/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbrush_lp;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Lincoln
 */


public class Poligono extends _2D{

    public ArrayList<Ponto> Pontos;
    
    public Poligono() {
        Pontos = new ArrayList();
    }
    
    @Override
    public float area() {
        return -1;
    }

    @Override
    public float perimetro() {
        return -1;
    }
    
    public void adicionarPonto(int x, int y){
        Ponto p = new Ponto();
        p.x = x;
        p.y = y;
        Pontos.add(p);
    }
        
    public void removerPontos(){
        Pontos.clear();
    }
    
    @Override
    public void desenhar(Graphics g){
        int[] pontosX = new int[Pontos.size()];
        int[] pontosY = new int[Pontos.size()];
        for(int i = 0; i <Pontos.size(); i++){
            pontosX[i] = Pontos.get(i).x;
            pontosY[i] = Pontos.get(i).y;
        }
        g.setColor(cor_Interna);
        g.fillPolygon(pontosX, pontosY,Pontos.size());
        g.setColor(cor);
        g.drawPolygon(pontosX, pontosY,Pontos.size());
        removerPontos();
    }
}
