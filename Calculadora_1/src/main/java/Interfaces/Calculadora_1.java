/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author ANÁLISIS
 */
public class Calculadora_1 extends javax.swing.JFrame {
    
    String n1, n2, signo;
    
    public Calculadora_1() {
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

        jPanel1 = new javax.swing.JPanel();
        input_operacion = new javax.swing.JTextField();
        bt_0 = new javax.swing.JButton();
        bt_1 = new javax.swing.JButton();
        bt_2 = new javax.swing.JButton();
        bt_3 = new javax.swing.JButton();
        bt_7 = new javax.swing.JButton();
        bt_4 = new javax.swing.JButton();
        bt_5 = new javax.swing.JButton();
        bt_6 = new javax.swing.JButton();
        bt_8 = new javax.swing.JButton();
        bt_9 = new javax.swing.JButton();
        bt_punto = new javax.swing.JButton();
        bt_seno = new javax.swing.JButton();
        bt_coseno = new javax.swing.JButton();
        bt_tangente = new javax.swing.JButton();
        bt_cambiar = new javax.swing.JButton();
        bt_suma = new javax.swing.JButton();
        bt_resta = new javax.swing.JButton();
        bt_multiplicacion = new javax.swing.JButton();
        bt_division = new javax.swing.JButton();
        bt_raiz = new javax.swing.JButton();
        bt_potencia = new javax.swing.JButton();
        bt_igual = new javax.swing.JButton();
        bt_borar_todo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_historial = new javax.swing.JTextArea();
        txt_op = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(692, 338));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(61, 61, 61));
        jPanel1.setMaximumSize(null);
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(692, 308));

        input_operacion.setEditable(false);
        input_operacion.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        input_operacion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        input_operacion.setToolTipText("");
        input_operacion.setName(""); // NOI18N
        input_operacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_operacionActionPerformed(evt);
            }
        });

        bt_0.setBackground(new java.awt.Color(61, 61, 61));
        bt_0.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bt_0.setText("0");
        bt_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_0ActionPerformed(evt);
            }
        });

        bt_1.setBackground(new java.awt.Color(61, 61, 61));
        bt_1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bt_1.setText("1");
        bt_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_1ActionPerformed(evt);
            }
        });

        bt_2.setBackground(new java.awt.Color(61, 61, 61));
        bt_2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bt_2.setText("2");
        bt_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_2ActionPerformed(evt);
            }
        });

        bt_3.setBackground(new java.awt.Color(61, 61, 61));
        bt_3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bt_3.setText("3");
        bt_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_3ActionPerformed(evt);
            }
        });

        bt_7.setBackground(new java.awt.Color(61, 61, 61));
        bt_7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bt_7.setText("7");
        bt_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_7ActionPerformed(evt);
            }
        });

        bt_4.setBackground(new java.awt.Color(61, 61, 61));
        bt_4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bt_4.setText("4");
        bt_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_4ActionPerformed(evt);
            }
        });

        bt_5.setBackground(new java.awt.Color(61, 61, 61));
        bt_5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bt_5.setText("5");
        bt_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_5ActionPerformed(evt);
            }
        });

        bt_6.setBackground(new java.awt.Color(61, 61, 61));
        bt_6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bt_6.setText("6");
        bt_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_6ActionPerformed(evt);
            }
        });

        bt_8.setBackground(new java.awt.Color(61, 61, 61));
        bt_8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bt_8.setText("8");
        bt_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_8ActionPerformed(evt);
            }
        });

        bt_9.setBackground(new java.awt.Color(61, 61, 61));
        bt_9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bt_9.setText("9");
        bt_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_9ActionPerformed(evt);
            }
        });

        bt_punto.setBackground(new java.awt.Color(61, 61, 61));
        bt_punto.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bt_punto.setText(".");
        bt_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_puntoActionPerformed(evt);
            }
        });

        bt_seno.setBackground(new java.awt.Color(61, 61, 61));
        bt_seno.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bt_seno.setText("Sin");
        bt_seno.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bt_seno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_senoActionPerformed(evt);
            }
        });

        bt_coseno.setBackground(new java.awt.Color(61, 61, 61));
        bt_coseno.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bt_coseno.setText("Cos");
        bt_coseno.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bt_coseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cosenoActionPerformed(evt);
            }
        });

        bt_tangente.setBackground(new java.awt.Color(61, 61, 61));
        bt_tangente.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bt_tangente.setText("Tan");
        bt_tangente.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bt_tangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tangenteActionPerformed(evt);
            }
        });

        bt_cambiar.setBackground(new java.awt.Color(61, 61, 61));
        bt_cambiar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bt_cambiar.setText("-/x");
        bt_cambiar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bt_cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cambiarActionPerformed(evt);
            }
        });

        bt_suma.setBackground(new java.awt.Color(61, 61, 61));
        bt_suma.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bt_suma.setText("+");
        bt_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sumaActionPerformed(evt);
            }
        });

        bt_resta.setBackground(new java.awt.Color(61, 61, 61));
        bt_resta.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bt_resta.setText("-");
        bt_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_restaActionPerformed(evt);
            }
        });

        bt_multiplicacion.setBackground(new java.awt.Color(61, 61, 61));
        bt_multiplicacion.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bt_multiplicacion.setText("*");
        bt_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_multiplicacionActionPerformed(evt);
            }
        });

        bt_division.setBackground(new java.awt.Color(61, 61, 61));
        bt_division.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bt_division.setText("/");
        bt_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_divisionActionPerformed(evt);
            }
        });

        bt_raiz.setBackground(new java.awt.Color(61, 61, 61));
        bt_raiz.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bt_raiz.setText("ʸ√x");
        bt_raiz.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bt_raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_raizActionPerformed(evt);
            }
        });

        bt_potencia.setBackground(new java.awt.Color(61, 61, 61));
        bt_potencia.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bt_potencia.setText("xʸ");
        bt_potencia.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bt_potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_potenciaActionPerformed(evt);
            }
        });

        bt_igual.setBackground(new java.awt.Color(61, 61, 61));
        bt_igual.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bt_igual.setText("=");
        bt_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_igualActionPerformed(evt);
            }
        });

        bt_borar_todo.setBackground(new java.awt.Color(61, 61, 61));
        bt_borar_todo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bt_borar_todo.setText("AC");
        bt_borar_todo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bt_borar_todo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bt_borar_todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_borar_todoActionPerformed(evt);
            }
        });

        txt_historial.setEditable(false);
        txt_historial.setColumns(20);
        txt_historial.setRows(5);
        jScrollPane1.setViewportView(txt_historial);

        txt_op.setEditable(false);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(input_operacion, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_op))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bt_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bt_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bt_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bt_0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bt_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(bt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(bt_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bt_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bt_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bt_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bt_multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bt_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(bt_division, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bt_seno, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_cambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bt_borar_todo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(bt_tangente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_coseno, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bt_raiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(input_operacion, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(txt_op))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bt_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt_division, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bt_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt_multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bt_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bt_0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(bt_borar_todo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bt_seno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt_cambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bt_coseno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt_raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bt_tangente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt_potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        bt_2.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_operacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_operacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_operacionActionPerformed

    private void bt_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_2ActionPerformed
        input_operacion.setText(input_operacion.getText() + "2"); txt_op.setText(txt_op.getText() + "2");
    }//GEN-LAST:event_bt_2ActionPerformed
         
    private void bt_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_1ActionPerformed
        input_operacion.setText(input_operacion.getText() + "1"); txt_op.setText(txt_op.getText() + "1");
    }//GEN-LAST:event_bt_1ActionPerformed

    private void bt_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_3ActionPerformed
        input_operacion.setText(input_operacion.getText() + "3"); txt_op.setText(txt_op.getText() + "3");
    }//GEN-LAST:event_bt_3ActionPerformed

    private void bt_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_4ActionPerformed
        input_operacion.setText(input_operacion.getText() + "4"); txt_op.setText(txt_op.getText() + "4");
    }//GEN-LAST:event_bt_4ActionPerformed

    private void bt_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_5ActionPerformed
        input_operacion.setText(input_operacion.getText() + "5"); txt_op.setText(txt_op.getText() + "5");
    }//GEN-LAST:event_bt_5ActionPerformed

    private void bt_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_6ActionPerformed
        input_operacion.setText(input_operacion.getText() + "6"); txt_op.setText(txt_op.getText() + "6");
    }//GEN-LAST:event_bt_6ActionPerformed

    private void bt_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_7ActionPerformed
        input_operacion.setText(input_operacion.getText() + "7"); txt_op.setText(txt_op.getText() + "7");
    }//GEN-LAST:event_bt_7ActionPerformed

    private void bt_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_8ActionPerformed
        input_operacion.setText(input_operacion.getText() + "8"); txt_op.setText(txt_op.getText() + "8");
    }//GEN-LAST:event_bt_8ActionPerformed

    private void bt_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_9ActionPerformed
        input_operacion.setText(input_operacion.getText() + "9"); txt_op.setText(txt_op.getText() + "9");
    }//GEN-LAST:event_bt_9ActionPerformed

    private void bt_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_0ActionPerformed
        input_operacion.setText(input_operacion.getText() + "0"); txt_op.setText(txt_op.getText() + "0");
    }//GEN-LAST:event_bt_0ActionPerformed

    private void bt_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_puntoActionPerformed
        String operacion_char = input_operacion.getText();
        if(operacion_char.length() <= 0){
            input_operacion.setText(input_operacion.getText() + "0."); txt_op.setText(txt_op.getText() + "0.");
        }else{
            if(!operacion_char.contains(".")){
                input_operacion.setText(input_operacion.getText() + "."); txt_op.setText(txt_op.getText() + ".");
            }
        }
    }//GEN-LAST:event_bt_puntoActionPerformed

    private void bt_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_igualActionPerformed
        n2 = input_operacion.getText();
        String rt = operaciones(n1, n2, signo);
        input_operacion.setText("");
        txt_historial.setText(txt_historial.getText() + txt_op.getText() + " = " + String.valueOf(rt) + "\n");
        txt_op.setText("");
    }//GEN-LAST:event_bt_igualActionPerformed

    private void bt_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sumaActionPerformed
        signo = "+"; n1 = input_operacion.getText(); txt_op.setText(txt_op.getText() + " + ");
        input_operacion.setText("");
    }//GEN-LAST:event_bt_sumaActionPerformed

    private void bt_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_divisionActionPerformed
        signo = "/"; n1 = input_operacion.getText(); txt_op.setText(txt_op.getText() + " / ");
        input_operacion.setText("");
    }//GEN-LAST:event_bt_divisionActionPerformed

    private void bt_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_multiplicacionActionPerformed
        signo = "*"; n1 = input_operacion.getText(); txt_op.setText(txt_op.getText() + " * ");
        input_operacion.setText("");
    }//GEN-LAST:event_bt_multiplicacionActionPerformed

    private void bt_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_restaActionPerformed
        signo = "-"; n1 = input_operacion.getText(); txt_op.setText(txt_op.getText() + " - ");
        input_operacion.setText("");
    }//GEN-LAST:event_bt_restaActionPerformed

    private void bt_borar_todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_borar_todoActionPerformed
        input_operacion.setText("");  txt_op.setText("");
    }//GEN-LAST:event_bt_borar_todoActionPerformed

    private void bt_cosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cosenoActionPerformed
        n1 = input_operacion.getText();
        txt_historial.setText(txt_historial.getText() + String.valueOf("Cos(" + n1 + ") = " + Math.cos(Double.parseDouble(n1))) + "\n");
        input_operacion.setText("");
    }//GEN-LAST:event_bt_cosenoActionPerformed

    private void bt_senoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_senoActionPerformed
        n1 = input_operacion.getText();
        txt_historial.setText(txt_historial.getText() + String.valueOf("Sin(" + n1 + ") = " + Math.sin(Double.parseDouble(n1))) + "\n");
        input_operacion.setText(""); txt_op.setText("");
    }//GEN-LAST:event_bt_senoActionPerformed

    private void bt_tangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tangenteActionPerformed
        n1 = input_operacion.getText();
        txt_historial.setText(txt_historial.getText() + String.valueOf("Tan(" + n1 + ") = " + Math.tan(Double.parseDouble(n1))) + "\n");
        input_operacion.setText(""); txt_op.setText("");
    }//GEN-LAST:event_bt_tangenteActionPerformed

    private void bt_raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_raizActionPerformed
        signo = "raiz"; n1 = input_operacion.getText(); txt_op.setText(txt_op.getText() + "√");
        input_operacion.setText(""); 
        txt_op.setText(txt_op.getText().replaceFirst("2", "²"));
        txt_op.setText(txt_op.getText().replaceFirst("3", "³"));
    }//GEN-LAST:event_bt_raizActionPerformed

    private void bt_cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cambiarActionPerformed
        String text_char = input_operacion.getText();
        if(text_char.length() > 0){
            if(text_char.contains("-")){
                input_operacion.setText(text_char.replaceFirst("-", ""));
            }else{
                input_operacion.setText("-" + text_char);
            }
        }
    }//GEN-LAST:event_bt_cambiarActionPerformed

    private void bt_potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_potenciaActionPerformed
        signo = "potencia"; n1 = input_operacion.getText(); txt_op.setText(txt_op.getText() + "^");
        input_operacion.setText("");
    }//GEN-LAST:event_bt_potenciaActionPerformed

    public static void main(String args[]) {
        /*
        FlatLightLaf.setup();
        UIManager.put( "Button.arc", 10 );
        UIManager.put( "Component.arc", 10 );
        UIManager.put( "ProgressBar.arc", 10 );
        UIManager.put( "TextComponent.arc", 10 );
        */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora_1().setVisible(true);
            }
        });
    }    
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_0;
    private javax.swing.JButton bt_1;
    private javax.swing.JButton bt_2;
    private javax.swing.JButton bt_3;
    private javax.swing.JButton bt_4;
    private javax.swing.JButton bt_5;
    private javax.swing.JButton bt_6;
    private javax.swing.JButton bt_7;
    private javax.swing.JButton bt_8;
    private javax.swing.JButton bt_9;
    private javax.swing.JButton bt_borar_todo;
    private javax.swing.JButton bt_cambiar;
    private javax.swing.JButton bt_coseno;
    private javax.swing.JButton bt_division;
    private javax.swing.JButton bt_igual;
    private javax.swing.JButton bt_multiplicacion;
    private javax.swing.JButton bt_potencia;
    private javax.swing.JButton bt_punto;
    private javax.swing.JButton bt_raiz;
    private javax.swing.JButton bt_resta;
    private javax.swing.JButton bt_seno;
    private javax.swing.JButton bt_suma;
    private javax.swing.JButton bt_tangente;
    private javax.swing.JTextField input_operacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea txt_historial;
    private javax.swing.JTextField txt_op;
    // End of variables declaration//GEN-END:variables

    public static String operaciones(String n1, String n2, String signo) {
        Double resultadocal = 0.0;
        String respuesta;
        if(signo.equals("+")){
            System.out.println("Primer valor: " + n1 + "\nSegundo valor: " + n2);
            resultadocal = Double.parseDouble(n1) + Double.parseDouble(n2); 
        }else{
            if(signo.equals("-")){
                resultadocal = Double.parseDouble(n1) - Double.parseDouble(n2); 
            }else{
                if(signo.equals("*")){
                    resultadocal = Double.parseDouble(n1) * Double.parseDouble(n2); 
                }else{
                    if(signo.equals("/")){
                        resultadocal = Double.parseDouble(n1) / Double.parseDouble(n2); 
                    }
                }
            }
        }
        
        if(signo.equals("cos")){
            resultadocal = Math.cos(Double.parseDouble(n1));
        }else{
            if(signo.equals("tan")){
                resultadocal = Math.tan(Double.parseDouble(n1));
            }else{
                if(signo.equals("sin")){
                    resultadocal = Math.sin(Double.parseDouble(n1));
                }
            }
        }
        
        if(signo.equals("raiz")){
            resultadocal = Math.pow(Double.parseDouble(n2), (1.0 / Double.parseDouble(n1)));
        }else{
            if(signo.equals("potencia")){
                resultadocal = Math.pow(Double.parseDouble(n1), Double.parseDouble(n2));
            }
        }
        
        
        
        respuesta = resultadocal.toString();
        return respuesta;
    }
}
