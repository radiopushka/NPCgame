/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package npc;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author root
 */
public class NPCmain extends javax.swing.JFrame {
static Image emotion_norm;
static Image emotion_mad;
static Image emotion_happy;
static Image emotion_trigger;
    /**
     * Creates new form NPCmain
     */
    public NPCmain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Emotion = new javax.swing.JLabel();
        Response = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Reply = new javax.swing.JEditorPane();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Emotion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/npc/npc.jpeg"))); // NOI18N

        Response.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResponseActionPerformed(evt);
            }
        });
        Response.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ResponseKeyPressed(evt);
            }
        });

        Reply.setEditable(false);
        Reply.setText("ASK ME ANYTHING! \n\nI WILL PROTEST AGAINST DRUMPF!");
        jScrollPane1.setViewportView(Reply);

        jButton1.setText("enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Emotion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Response)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Emotion, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(Response, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResponseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResponseActionPerformed
        // TODO add your handling code here:
            
    }//GEN-LAST:event_ResponseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        runnpc();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ResponseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ResponseKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        runnpc();
        }
    }//GEN-LAST:event_ResponseKeyPressed

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
            java.util.logging.Logger.getLogger(NPCmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NPCmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NPCmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NPCmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    emotion_norm=ImageIO.read(NPC.class.getResourceAsStream("npc.jpeg"));
                    emotion_mad=ImageIO.read(NPC.class.getResourceAsStream("npc_mad.jpg"));
                    emotion_happy=ImageIO.read(NPC.class.getResourceAsStream("npc_happy.jpg"));
                    emotion_trigger=ImageIO.read(NPC.class.getResourceAsStream("npc_trigger.jpg"));
                } catch (Exception ex) {
                    Logger.getLogger(NPCmain.class.getName()).log(Level.SEVERE, null, ex);
                }
                NPCmain m=new NPCmain();
                 Random rand=new Random();
                 m.setTitle("NPC_"+Integer.toString(rand.nextInt(100000)));
                m.setVisible(true);
            }
        });
    }
public void runnpc(){
 try {
        String response = Response.getText();
        NPCprocess npc=new NPCprocess(response);
        String react=npc.work();
        Reply.setText(react);
        Image i=npc.getEmotion();
        Image dim=ImageIO.read(NPC.class.getResourceAsStream("npc.jpeg"));
   BufferedImage im=new BufferedImage(dim.getWidth(null),dim.getHeight(null),BufferedImage.TYPE_4BYTE_ABGR);
   Graphics2D g=im.createGraphics();
   g.drawImage(i, 0, 0, im.getWidth(), im.getHeight(), null);
        Emotion.setIcon(new ImageIcon(im));
         } catch (Exception ex) {
        Logger.getLogger(NPCmain.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Emotion;
    private javax.swing.JEditorPane Reply;
    public static javax.swing.JTextField Response;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

