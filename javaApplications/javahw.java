package com.mycompany.calc;

public class Background extends javax.swing.JFrame {

    public Background() {
        initComponents();
    }

    private void initComponents() {
        textField1 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textField1.addActionListener(evt -> textField1ActionPerformed(evt));

        textField2.addActionListener(evt -> textField2ActionPerformed(evt));

        jLabel1.setText("Result");

        jButton1.setText("Add");
        jButton1.addActionListener(evt -> jButton1ActionPerformed(evt));

        jButton2.setText("Sub");
        jButton2.addActionListener(evt -> jButton2ActionPerformed(evt));

        jButton3.setText("Div");
        jButton3.addActionListener(evt -> jButton3ActionPerformed(evt));

        jButton4.setText("Mult");
        jButton4.addActionListener(evt -> jButton4ActionPerformed(evt));
    }

   

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        int a = Integer.parseInt(textField1.getText());
        int b = Integer.parseInt(textField2.getText());
        int res = a - b;
        String r = Integer.toString(res);
        jLabel1.setText(r);
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        int a = Integer.parseInt(textField1.getText());
        int b = Integer.parseInt(textField2.getText());
        int res = a * b;
        String r = Integer.toString(res);
        jLabel1.setText(r);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        int a = Integer.parseInt(textField1.getText());
        int b = Integer.parseInt(textField2.getText());
        int res = a + b;
        String r = Integer.toString(res);
        jLabel1.setText(r);
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        int a = Integer.parseInt(textField1.getText());
        int b = Integer.parseInt(textField2.getText());
        if (b != 0) {
            int res = a / b;
            String r = Integer.toString(res);
            jLabel1.setText(r);
        } else {
            jLabel1.setText("Cannot divide  By  Zero");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Background().setVisible(true));
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
}