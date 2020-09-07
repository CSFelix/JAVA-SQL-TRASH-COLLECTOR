package frames;

// Imports

import java.awt.Image;
import javax.swing.ImageIcon;


public class Informacoes_Lixeiras extends Frame_Template2 {

    /* Construtor */
    public Informacoes_Lixeiras() {}
    
    public Informacoes_Lixeiras(String titulo, String descricao, String lixo0, String lixo1, String lixo2, String imagem) {
        // Iicialização dos componenets
        initComponents();
        
        // Passagem das informações às labels
        this.lbl_titulo.setText(titulo);
        this.lbl_descricao.setText(descricao);
        this.lbl_lixo0.setText(lixo0);
        this.lbl_lixo1.setText(lixo1);
        this.lbl_lixo2.setText(lixo2);
        
        // Passagem da imagem à label de imagem
        ImageIcon img = new ImageIcon(imagem); // seleciona diretório da imagem
        Image image = img.getImage(); // transformação de ImageIcon em Image
        Image alvo = image.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH); // define tamanho da imagem
        lbl_imagem.setIcon(new ImageIcon(alvo)); // envia imagem para label
        
        // Configurações Padrões
        super.Config_Padrao();
    }

    // Personalização dos componentes
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_descricao = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_lixo0 = new javax.swing.JLabel();
        lbl_lixo1 = new javax.swing.JLabel();
        lbl_lixo2 = new javax.swing.JLabel();
        lbl_imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_descricao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_descricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_descricao.setText("DESCRICAO");

        lbl_titulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("TIPO - COR");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tipos de Lixos Descartados:");

        lbl_lixo0.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_lixo0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_lixo0.setText("LIXO 0");

        lbl_lixo1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_lixo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_lixo1.setText("LIXO 1");

        lbl_lixo2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_lixo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_lixo2.setText("LIXO 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_descricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_lixo1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_lixo0, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_lixo2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(lbl_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbl_titulo)
                .addGap(29, 29, 29)
                .addComponent(lbl_descricao)
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbl_lixo0)
                        .addGap(28, 28, 28)
                        .addComponent(lbl_lixo1)
                        .addGap(27, 27, 27)
                        .addComponent(lbl_lixo2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lbl_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Informacoes_Lixeiras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informacoes_Lixeiras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informacoes_Lixeiras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informacoes_Lixeiras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informacoes_Lixeiras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_descricao;
    private javax.swing.JLabel lbl_imagem;
    private javax.swing.JLabel lbl_lixo0;
    private javax.swing.JLabel lbl_lixo1;
    private javax.swing.JLabel lbl_lixo2;
    private javax.swing.JLabel lbl_titulo;
    // End of variables declaration//GEN-END:variables
}
