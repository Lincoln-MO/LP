/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paintbrush_lp;

import java.awt.Color;
import java.awt.event.MouseEvent;
;

/**
 *
 * @author Lincoln
 */

public class frmPaint extends javax.swing.JFrame {

    private enum TipoFigura {tfPonto, tfReta, tfCirculo, tfRetangulo, tfSpray, tfBorracha, tfCilindro, tfPiramide, tfDesenhar, tfPoligono};
   
    private TipoFigura tipoFigura = TipoFigura.tfPonto; // variavel global controladora do tipo figura
    
    
    private Retangulo retangulo = new Retangulo();
    private Reta reta = new Reta();
    private Circulo circulo = new Circulo();
    private Borracha borracha = new Borracha(50);
    private Spray spray = new Spray();
    private Cilindro cilindro = new Cilindro();
    private Piramide piramide = new Piramide();
    private Poligono poligono = new Poligono();
    /**
     * Creates new form frmPaint
     */
    public frmPaint() {
        initComponents();
        this.setSize(1200, 800); // Defina o tamanho fixo da janela (por exemplo, 800x600 pixels).
        this.setLocationRelativeTo(null); // Centralize a janela na tela.
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setTitle("PaintBrush");
        
        pnlPaint.setBackground(Color.WHITE);
        
        btnDesenhar.setBackground(Color.LIGHT_GRAY);
        
    }
    
     private void limparSelecao() {
        btnDesenhar.setBackground(Color.WHITE);
        btnPonto.setBackground(Color.WHITE);
        btnReta.setBackground(Color.WHITE);
        btnSpray.setBackground(Color.WHITE);
        btnBorracha.setBackground(Color.WHITE);
        btnPoligono.setBackground(Color.WHITE);
        btnCirculo.setBackground(Color.WHITE);
        btnRetangulo.setBackground(Color.WHITE);
        btnPiramide.setBackground(Color.WHITE);
        btnCilindro.setBackground(Color.WHITE);
    }
     
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPaint = new javax.swing.JPanel();
        btnPonto = new javax.swing.JButton();
        btnReta = new javax.swing.JButton();
        btnCirculo = new javax.swing.JButton();
        btnRetangulo = new javax.swing.JButton();
        btnSpray = new javax.swing.JButton();
        btnCilindro = new javax.swing.JButton();
        btnPiramide = new javax.swing.JButton();
        btnBorracha = new javax.swing.JButton();
        chkArea = new javax.swing.JCheckBox();
        pnlCorExterna = new javax.swing.JPanel();
        pnlCorInterna = new javax.swing.JPanel();
        lblCor_externa = new javax.swing.JLabel();
        lblCor_interna = new javax.swing.JLabel();
        jColorChooser1 = new javax.swing.JColorChooser();
        btnDesenhar = new javax.swing.JButton();
        btnPoligono = new javax.swing.JButton();
        chkComprimento = new javax.swing.JCheckBox();
        chkPerimetro = new javax.swing.JCheckBox();
        chkVolume = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPaint.setBackground(new java.awt.Color(255, 255, 204));
        pnlPaint.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlPaintMouseDragged(evt);
            }
        });
        pnlPaint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlPaintMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlPaintMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlPaintLayout = new javax.swing.GroupLayout(pnlPaint);
        pnlPaint.setLayout(pnlPaintLayout);
        pnlPaintLayout.setHorizontalGroup(
            pnlPaintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlPaintLayout.setVerticalGroup(
            pnlPaintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );

        btnPonto.setText("Ponto");
        btnPonto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPontoMouseClicked(evt);
            }
        });

        btnReta.setText("Reta");
        btnReta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetaMouseClicked(evt);
            }
        });
        btnReta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetaActionPerformed(evt);
            }
        });

        btnCirculo.setText("Círculo");
        btnCirculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCirculoMouseClicked(evt);
            }
        });

        btnRetangulo.setText("Retângulo");
        btnRetangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetanguloMouseClicked(evt);
            }
        });

        btnSpray.setText("Spray");
        btnSpray.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSprayMouseClicked(evt);
            }
        });
        btnSpray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSprayActionPerformed(evt);
            }
        });

        btnCilindro.setText("Cilindro");
        btnCilindro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCilindroMouseClicked(evt);
            }
        });

        btnPiramide.setText("Pirâmide");
        btnPiramide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPiramideMouseClicked(evt);
            }
        });
        btnPiramide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiramideActionPerformed(evt);
            }
        });

        btnBorracha.setText("Borracha");
        btnBorracha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrachaMouseClicked(evt);
            }
        });

        chkArea.setText("exibir área");
        chkArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAreaActionPerformed(evt);
            }
        });

        pnlCorExterna.setBackground(new java.awt.Color(0, 153, 51));
        pnlCorExterna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCorExternaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCorExternaLayout = new javax.swing.GroupLayout(pnlCorExterna);
        pnlCorExterna.setLayout(pnlCorExternaLayout);
        pnlCorExternaLayout.setHorizontalGroup(
            pnlCorExternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlCorExternaLayout.setVerticalGroup(
            pnlCorExternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        pnlCorInterna.setBackground(new java.awt.Color(255, 0, 0));
        pnlCorInterna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCorInternaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCorInternaLayout = new javax.swing.GroupLayout(pnlCorInterna);
        pnlCorInterna.setLayout(pnlCorInternaLayout);
        pnlCorInternaLayout.setHorizontalGroup(
            pnlCorInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlCorInternaLayout.setVerticalGroup(
            pnlCorInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        lblCor_externa.setText("cor externa");

        lblCor_interna.setText("cor interna");

        btnDesenhar.setText("Desenhar");
        btnDesenhar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDesenharMouseClicked(evt);
            }
        });
        btnDesenhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesenharActionPerformed(evt);
            }
        });

        btnPoligono.setText("Poligono");
        btnPoligono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPoligonoMouseClicked(evt);
            }
        });
        btnPoligono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoligonoActionPerformed(evt);
            }
        });

        chkComprimento.setText("exibir comprimento");
        chkComprimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkComprimentoActionPerformed(evt);
            }
        });

        chkPerimetro.setText("exibir perimetro");

        chkVolume.setText("exibir volume");
        chkVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkVolumeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkArea)
                            .addComponent(chkComprimento)
                            .addComponent(chkPerimetro)
                            .addComponent(chkVolume))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCor_externa)
                            .addComponent(lblCor_interna))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlCorInterna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlCorExterna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pnlPaint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPiramide, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDesenhar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCilindro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRetangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSpray, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPoligono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorracha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPiramide)
                    .addComponent(btnDesenhar)
                    .addComponent(btnPonto)
                    .addComponent(btnReta)
                    .addComponent(btnCirculo)
                    .addComponent(btnPoligono)
                    .addComponent(btnCilindro)
                    .addComponent(btnRetangulo)
                    .addComponent(btnSpray)
                    .addComponent(btnBorracha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPaint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(chkComprimento)
                        .addGap(2, 2, 2)
                        .addComponent(chkPerimetro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkArea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkVolume)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlCorExterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCor_externa)
                                .addGap(28, 28, 28)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlCorInterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblCor_interna)
                                .addGap(36, 36, 36))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetaActionPerformed

    private void btnPiramideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiramideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPiramideActionPerformed

    private void pnlCorExternaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCorExternaMouseClicked
        // TODO add your handling code here:
        pnlCorExterna.setBackground(jColorChooser1.getColor());
    }//GEN-LAST:event_pnlCorExternaMouseClicked

    private void pnlCorInternaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCorInternaMouseClicked
        // TODO add your handling code here:
        pnlCorInterna.setBackground(jColorChooser1.getColor());
    }//GEN-LAST:event_pnlCorInternaMouseClicked

    private void btnPontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPontoMouseClicked
        // TODO add your handling code here:
        tipoFigura = TipoFigura.tfPonto;
        limparSelecao();
        btnPonto.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnPontoMouseClicked

    private void pnlPaintMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPaintMousePressed
        // TODO add your handling code here:
        
        if (tipoFigura == TipoFigura.tfPonto) {
            Ponto p = new Ponto();
            p.cor = pnlCorExterna.getBackground();
            p.x  = evt.getX();
            p.y  = evt.getY();
            p.desenhar(pnlPaint.getGraphics());
        }
        else if (tipoFigura == TipoFigura.tfRetangulo) {
            retangulo.cor = pnlCorExterna.getBackground();
            retangulo.cor_Interna = pnlCorInterna.getBackground();
            retangulo.exibir_Perimetro = chkPerimetro.isSelected();
            retangulo.exibir_Area = chkArea.isSelected();
            retangulo.x  = evt.getX();
            retangulo.y  = evt.getY();                       
        }
        else if(tipoFigura == TipoFigura.tfReta) {
            reta.cor = pnlCorExterna.getBackground();
            reta.exibirCompr = chkComprimento.isSelected();
            reta.x = evt.getX();
            reta.y = evt.getY();
        }
        else if(tipoFigura == TipoFigura.tfCirculo) {
            circulo.exibir_Area = chkArea.isSelected();
            circulo.exibir_Perimetro = chkPerimetro.isSelected();
            circulo.x = evt.getX();
            circulo.y = evt.getY();
        }
        else if(tipoFigura == TipoFigura.tfPoligono) {
            if(poligono.Pontos.size() >= 2 && evt.getButton() == MouseEvent.BUTTON3) poligono.desenhar(pnlPaint.getGraphics());
            else {
                poligono.cor = pnlCorExterna.getBackground();
                poligono.cor_Interna = pnlCorInterna.getBackground();
                poligono.adicionarPonto(evt.getX(), evt.getY());
            }
        }
        else if(tipoFigura == TipoFigura.tfCilindro) {
            cilindro.cor = pnlCorExterna.getBackground();
            cilindro.exibir_Area = chkArea.isSelected();
            cilindro.exibir_Volume = chkVolume.isSelected();
            cilindro.x = evt.getX();
            cilindro.y = evt.getY();
        }
        else if(tipoFigura == TipoFigura.tfPiramide) {
            piramide.cor = pnlCorExterna.getBackground();
            piramide.exibir_Area = chkArea.isSelected();
            piramide.exibir_Volume = chkVolume.isSelected();
            piramide.x = evt.getX();
            piramide.y = evt.getY();
        }
        
        
        
    }//GEN-LAST:event_pnlPaintMousePressed

    private void btnRetanguloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetanguloMouseClicked
        // TODO add your handling code here:
        tipoFigura = TipoFigura.tfRetangulo;
        limparSelecao();
        btnRetangulo.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnRetanguloMouseClicked

    private void pnlPaintMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPaintMouseReleased
        // TODO add your handling code here:
        if (tipoFigura == TipoFigura.tfRetangulo) {
            retangulo.base = evt.getX() - retangulo.x;
            retangulo.largura = evt.getY() - retangulo.y;
            retangulo.desenhar(pnlPaint.getGraphics());                         
        }else if(tipoFigura == TipoFigura.tfReta) {
            reta.x1 = evt.getX();
            reta.y1 = evt.getY();
            reta.desenhar(pnlPaint.getGraphics());
        } else if(tipoFigura == TipoFigura.tfCirculo) {
            circulo.raio = (int) Math.sqrt(Math.pow(evt.getX() - circulo.x, 2) + Math.pow(evt.getY() - circulo.y, 2));
            circulo.cor_Interna = pnlCorInterna.getBackground();
            circulo.cor = pnlCorExterna.getBackground();
            circulo.desenhar(pnlPaint.getGraphics());
        } else if(tipoFigura == TipoFigura.tfCilindro) {
            cilindro.raio = Math.abs(evt.getX() - cilindro.x)/2;
            cilindro.altura = Math.abs(evt.getY() - cilindro.y);
            if(evt.getX() < cilindro.x) cilindro.x = evt.getX();
            if(evt.getY() < cilindro.y) cilindro.y = evt.getY();
            cilindro.desenhar(pnlPaint.getGraphics());
        } else if(tipoFigura == TipoFigura.tfPiramide) {
            piramide.base = Math.abs(evt.getX() - piramide.x);
            piramide.altura = Math.abs(evt.getY() - piramide.y);
            piramide.largura = piramide.altura/3;
            if(evt.getX() < piramide.x) piramide.x = evt.getX();
            if(evt.getY() < piramide.y) piramide.y = evt.getY();
            piramide.desenhar(pnlPaint.getGraphics());
        }
    }//GEN-LAST:event_pnlPaintMouseReleased

    private void chkAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAreaActionPerformed

    private void btnRetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetaMouseClicked
        // TODO add your handling code here:
        tipoFigura = tipoFigura.tfReta;
        limparSelecao();
        btnReta.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnRetaMouseClicked

    private void btnCirculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCirculoMouseClicked
        // TODO add your handling code here:
        tipoFigura = tipoFigura.tfCirculo;
        limparSelecao();
        btnCirculo.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnCirculoMouseClicked

    private void btnSprayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSprayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSprayActionPerformed

    private void pnlPaintMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPaintMouseDragged
        // TODO add your handling code here:
        if(tipoFigura == TipoFigura.tfBorracha){
            borracha.cor_Interna = pnlCorInterna.getBackground();
            borracha.x = evt.getX();
            borracha.y = evt.getY();
            borracha.desenhar(pnlPaint.getGraphics());
        } else if(tipoFigura == TipoFigura.tfDesenhar) {
            Ponto p = new Ponto();
            p.cor = pnlCorExterna.getBackground();
            p.x = evt.getX();
            p.y = evt.getY();
            p.desenhar(pnlPaint.getGraphics());
        } else if(tipoFigura == TipoFigura.tfSpray) {
            spray.cor = pnlCorExterna.getBackground();
            spray.x = evt.getX();
            spray.y = evt.getY();
            spray.desenhar(pnlPaint.getGraphics());
        }
    }//GEN-LAST:event_pnlPaintMouseDragged

    private void btnDesenharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesenharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDesenharActionPerformed

    private void btnPoligonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoligonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPoligonoActionPerformed

    private void chkComprimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkComprimentoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_chkComprimentoActionPerformed

    private void btnSprayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSprayMouseClicked
        // TODO add your handling code here:]
        tipoFigura = tipoFigura.tfSpray;
        limparSelecao();
        btnSpray.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnSprayMouseClicked

    private void btnCilindroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCilindroMouseClicked
        // TODO add your handling code here:
        tipoFigura = tipoFigura.tfCilindro;
        limparSelecao();
        btnCilindro.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnCilindroMouseClicked

    private void btnPiramideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPiramideMouseClicked
        // TODO add your handling code here:
        tipoFigura = tipoFigura.tfPiramide;
        limparSelecao();
        btnPiramide.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnPiramideMouseClicked

    private void btnPoligonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPoligonoMouseClicked
        // TODO add your handling code here:
        tipoFigura = TipoFigura.tfPoligono;
        limparSelecao();
        btnPoligono.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnPoligonoMouseClicked

    private void btnDesenharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesenharMouseClicked
        // TODO add your handling code here:
        tipoFigura = TipoFigura.tfDesenhar;
        limparSelecao();
        btnDesenhar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnDesenharMouseClicked

    private void btnBorrachaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrachaMouseClicked
        // TODO add your handling code here:
        tipoFigura = tipoFigura.tfBorracha;
        limparSelecao();
        btnBorracha.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnBorrachaMouseClicked

    private void chkVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkVolumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkVolumeActionPerformed

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
            java.util.logging.Logger.getLogger(frmPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorracha;
    private javax.swing.JButton btnCilindro;
    private javax.swing.JButton btnCirculo;
    private javax.swing.JButton btnDesenhar;
    private javax.swing.JButton btnPiramide;
    private javax.swing.JButton btnPoligono;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnReta;
    private javax.swing.JButton btnRetangulo;
    private javax.swing.JButton btnSpray;
    private javax.swing.JCheckBox chkArea;
    private javax.swing.JCheckBox chkComprimento;
    private javax.swing.JCheckBox chkPerimetro;
    private javax.swing.JCheckBox chkVolume;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel lblCor_externa;
    private javax.swing.JLabel lblCor_interna;
    private javax.swing.JPanel pnlCorExterna;
    private javax.swing.JPanel pnlCorInterna;
    private javax.swing.JPanel pnlPaint;
    // End of variables declaration//GEN-END:variables
}