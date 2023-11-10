/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbrush_lp;

/**
 * A classe principal que inicia a aplicação PaintBrush_LP.
 * Estende a classe JFrame para criar a janela principal.
 * @author Lincoln
 */

import javax.swing.JFrame;

public class PaintBrush_LP extends JFrame{

    /**
     * O método principal (main) que inicia a aplicação.
     * Cria uma instância da classe frmPaint e a torna visível.
     * @param args Os argumentos da linha de comando (não utilizados neste caso).
     */
    public static void main(String[] args) {
        frmPaint frm = new frmPaint(); // Cria uma instância da classe frmPaint
        frm.setVisible(true); // Torna a janela visível
    }
}
