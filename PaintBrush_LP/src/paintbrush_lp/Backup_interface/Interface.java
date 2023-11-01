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
import java.awt.Polygon;
import java.util.ArrayList;

public class Interface extends javax.swing.JFrame {

    Graphics graficos;
        private int tipoFigura;
        private int xInicial;
        private int yInicial;
        private int xFinal;
        private int yFinal;
        private boolean sprayAtivo;
        private String figura;
    public Interface(){
        initComponents();
        graficos = getGraphics();
        this.xInicial = 0;
        this.xFinal = 0;
        this.yInicial = 0;
        this.yFinal = 0;
        this.figura = " ";
        this.sprayAtivo=false;
        this.tipoFigura=1;
        }
        
        
    public int getxInicial(){
        return this.xInicial;
    }
    public void setxInicial(int xInicial){
        this.xInicial = xInicial;
    }
    public int getxFinal(){
        return this.xFinal;
    }
    public void setxFinal(int xFinal){
        this.xFinal = xFinal;
    }
    public int getyInicial(){
        return this.yInicial;
    }
    public void setyInicial(int yInicial){
        this.yInicial = yInicial;
    }
    public int getyFinal(){
        return this.yFinal;
    }
    public void setyFinal(int yFinal){
        this.yFinal = yFinal;
    }

    ArrayList<Integer> posicoesX = new ArrayList<Integer>();
        ArrayList<Integer> posicoesY = new ArrayList<Integer>();

    public void Tipos_Desenho(){
        switch(this.tipoFigura){
            case 1 : {
                Retangulo r = new Retangulo(this.xInicial,this.yInicial,this.xFinal,this.yFinal,corPreenchimento.getBackground());
                r.paint(graficos,corBorda.getBackground());
                r.preenche(graficos, corPreenchimento.getBackground());
                this.posicoesX.clear();
                this.posicoesY.clear();
            }
            case 2 : {
                Ponto p = new Ponto(this.xInicial,this.yInicial);
                p.paint(graficos,corBorda.getBackground());
            }
            case 3 : {
                Piramide pi = new Piramide(this.xInicial, this.yInicial,this.xFinal,this.yFinal,corBorda.getBackground());
                pi.paint(graficos,corBorda.getBackground());
                this.posicoesX.clear();
                this.posicoesY.clear();
            }
            case 4 : {
                Circulo c = new Circulo(xInicial,yInicial,xFinal,yFinal,corPreenchimento.getBackground());
                c.paint(graficos,corBorda.getBackground());
                c.preenche(graficos,corPreenchimento.getBackground());
                this.posicoesX.clear();
                this.posicoesY.clear();
            }
            case 5 : {
                Cilindro cl = new Cilindro(this.xInicial, this.yInicial,this.xFinal,this.yFinal,corBorda.getBackground());
                cl.paint(graficos,corBorda.getBackground());
                this.posicoesX.clear();
                this.posicoesY.clear();
            }
            case 6 :{
                Spray s = new Spray(this.xInicial, this.yInicial);
                s.paint(graficos, corBorda.getBackground());
                this.posicoesX.clear();
                this.posicoesY.clear();
            }
        }
    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaDesenhos = new javax.swing.JPanel();
        desenhaRetangulo = new javax.swing.JButton();
        colorChooser = new javax.swing.JColorChooser();
        corBorda = new javax.swing.JPanel();
        corPreenchimento = new javax.swing.JPanel();
        Cor_borda = new javax.swing.JLabel();
        Cor_preenchimento = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        desenhaCirculo = new javax.swing.JButton();
        desenhaPonto = new javax.swing.JButton();
        Cilindro = new javax.swing.JButton();
        Piramide = new javax.swing.JButton();
        desenharPoligonos = new javax.swing.JButton();
        Spray = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaDesenhos.setBackground(new java.awt.Color(255, 255, 255));
        areaDesenhos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                areaDesenhosMouseDragged(evt);
            }
        });
        areaDesenhos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exemplo(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pegarPosicaoPressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pegarPosicaoReleased(evt);
            }
        });

        javax.swing.GroupLayout areaDesenhosLayout = new javax.swing.GroupLayout(areaDesenhos);
        areaDesenhos.setLayout(areaDesenhosLayout);
        areaDesenhosLayout.setHorizontalGroup(
            areaDesenhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        areaDesenhosLayout.setVerticalGroup(
            areaDesenhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );

        desenhaRetangulo.setText("Retangulo");
        desenhaRetangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desenhaRetanguloActionPerformed(evt);
            }
        });

        corBorda.setBackground(new java.awt.Color(255, 204, 204));
        corBorda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selecionaCorBorda(evt);
            }
        });

        javax.swing.GroupLayout corBordaLayout = new javax.swing.GroupLayout(corBorda);
        corBorda.setLayout(corBordaLayout);
        corBordaLayout.setHorizontalGroup(
            corBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        corBordaLayout.setVerticalGroup(
            corBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        corPreenchimento.setBackground(new java.awt.Color(255, 204, 204));
        corPreenchimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selecionaCorPreenchimento(evt);
            }
        });

        javax.swing.GroupLayout corPreenchimentoLayout = new javax.swing.GroupLayout(corPreenchimento);
        corPreenchimento.setLayout(corPreenchimentoLayout);
        corPreenchimentoLayout.setHorizontalGroup(
            corPreenchimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        corPreenchimentoLayout.setVerticalGroup(
            corPreenchimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Cor_borda.setText("Cor da borda:");

        Cor_preenchimento.setText("Cor do preenchimento:");

        jLabel3.setText("Ferramentas:");

        desenhaCirculo.setText("Círculo");
        desenhaCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desenhaCirculoActionPerformed(evt);
            }
        });

        desenhaPonto.setText("Ponto");
        desenhaPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desenhaPontoActionPerformed(evt);
            }
        });

        Cilindro.setText("Cilindro");
        Cilindro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CilindroActionPerformed(evt);
            }
        });

        Piramide.setText("Pirâmide");
        Piramide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PiramideActionPerformed(evt);
            }
        });

        desenharPoligonos.setText("Poligono");
        desenharPoligonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desenharPoligonosActionPerformed(evt);
            }
        });

        Spray.setText("Spray");
        Spray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SprayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaDesenhos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(corBorda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cor_borda))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cor_preenchimento)
                                    .addComponent(corPreenchimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Spray, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Piramide, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                        .addComponent(desenhaPonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(desenhaRetangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(desenharPoligonos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(desenhaCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cilindro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(colorChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(areaDesenhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desenhaPonto)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(desenhaCirculo)
                            .addComponent(desenhaRetangulo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Piramide)
                            .addComponent(Cilindro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Spray)
                            .addComponent(desenharPoligonos))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Cor_preenchimento)
                            .addComponent(Cor_borda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(corBorda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(corPreenchimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void desenhaRetanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desenhaRetanguloActionPerformed
        this.tipoFigura=1;
        this.Tipos_Desenho();
    }//GEN-LAST:event_desenhaRetanguloActionPerformed

    private void exemplo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exemplo

    }//GEN-LAST:event_exemplo

    private void pegarPosicaoPressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pegarPosicaoXpressed
        this.xInicial= evt.getX();
        this.yInicial= evt.getY();

        posicoesX.add(this.xInicial);
        posicoesY.add(this.yInicial);
    }//GEN-LAST:event_pegarPosicaoXpressed

    private void pegarPosicaoReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pegarPosicaoXreleased
        this.xFinal=evt.getX();

        this.yFinal= evt.getY();

        this.Tipos_Desenho();

        this.xInicial=0;
        this.xFinal=0;
        this.yInicial=0;
        this.yFinal=0;
    }//GEN-LAST:event_pegarPosicaoXreleased


    private void selecionaCorBorda(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selecionaCorBorda
        Color cor = colorChooser.getColor();
        corBorda.setBackground(cor);
        System.out.println(cor);
    }//GEN-LAST:event_selecionaCorBorda

    private void selecionaCorPreenchimento(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selecionaCorPreenchimento
        Color cor = colorChooser.getColor();
        corPreenchimento.setBackground(cor);
        System.out.println(cor);
    }//GEN-LAST:event_selecionaCorPreenchimento

    private void desenhaCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desenhaCirculoActionPerformed
        this.tipoFigura=4;
        this.Tipos_Desenho();

    }//GEN-LAST:event_desenhaCirculoActionPerformed

    private void desenhaPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desenhaPontoActionPerformed
        this.tipoFigura=2;
        this.Tipos_Desenho();
    }//GEN-LAST:event_desenhaPontoActionPerformed

    private void CilindroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CilindroActionPerformed
        this.tipoFigura=5;
        this.Tipos_Desenho();

    }//GEN-LAST:event_CilindroActionPerformed

    private void PiramideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PiramideActionPerformed
        this.tipoFigura=3;
        this.Tipos_Desenho();
        
    }//GEN-LAST:event_PiramideActionPerformed

    private void desenharPoligonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desenharPoligonosActionPerformed
        System.out.println(posicoesX);
        System.out.println(posicoesY);        
        int []posicoesDoArrayListX = new int[posicoesX.size()];
        int []posicoesDoArrayListY = new int[posicoesY.size()];
        int i = 0;
        while (i < posicoesX.size()){
            posicoesDoArrayListX[i] = posicoesX.get(i);
            posicoesDoArrayListY[i] = posicoesY.get(i);   
            i++;
        }
        Polygon poligono = new Polygon(posicoesDoArrayListX,posicoesDoArrayListY, posicoesX.size());
        graficos.setColor(corBorda.getBackground());
        graficos.drawPolygon(poligono);
        graficos.setColor(corPreenchimento.getBackground());
        graficos.fillPolygon(poligono);
        posicoesX.clear();
        posicoesY.clear();

    }//GEN-LAST:event_desenharPoligonosActionPerformed

    private void SprayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SprayActionPerformed
        this.tipoFigura=6;
        this.Tipos_Desenho();
    }//GEN-LAST:event_SprayActionPerformed

    private void areaDesenhosMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areaDesenhosMouseDragged
        if (this.tipoFigura==6){
            this.xInicial=evt.getX();
            this.yInicial=evt.getY();
            this.Tipos_Desenho();
        }else if(this.tipoFigura == 2){
            this.xInicial=evt.getX();
            this.yInicial=evt.getY();
            this.Tipos_Desenho();
        }
        
    }//GEN-LAST:event_areaDesenhosMouseDragged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cilindro;
    private javax.swing.JLabel Cor_borda;
    private javax.swing.JLabel Cor_preenchimento;
    private javax.swing.JButton Piramide;
    private javax.swing.JButton Spray;
    private javax.swing.JPanel areaDesenhos;
    private javax.swing.JColorChooser colorChooser;
    private javax.swing.JPanel corBorda;
    private javax.swing.JPanel corPreenchimento;
    private javax.swing.JButton desenhaCirculo;
    private javax.swing.JButton desenhaPonto;
    private javax.swing.JButton desenhaRetangulo;
    private javax.swing.JButton desenharPoligonos;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}