/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.*;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ViewProductosModificacion extends javax.swing.JPanel {

    /**
     * Creates new form View_Productos_Modificacion
     */
    public ViewProductosModificacion() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTidproducto = new javax.swing.JTextField();
        jtproducto = new javax.swing.JTextField();
        jtdescricion = new javax.swing.JTextField();
        jtpreciocompra = new javax.swing.JTextField();
        jtprecioventa = new javax.swing.JTextField();
        jtexistencias = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jbsiguiente = new javax.swing.JButton();
        jbultimo = new javax.swing.JButton();
        jbprimero = new javax.swing.JButton();
        jbanterior = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jbagregar = new javax.swing.JButton();
        jbborrar = new javax.swing.JButton();
        jBsaveeditar = new javax.swing.JButton();
        jbeditar = new javax.swing.JButton();
        jBsaveeditar1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbledetalle = new javax.swing.JTable();
        jBuscar = new javax.swing.JButton();
        jTbuscar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setLayout(null);

        jPanel1.setBackground(new Color(0,0,0,125));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "PRODUCTO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("ID_Producto");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Producto");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Descripcion");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Precio_Compra");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Precio_Venta");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Existencias");

        jTidproducto.setBackground(new java.awt.Color(204, 204, 255));
        jTidproducto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTidproducto.setForeground(new java.awt.Color(0, 0, 153));
        jTidproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTidproductoActionPerformed(evt);
            }
        });

        jtproducto.setBackground(new java.awt.Color(204, 204, 255));
        jtproducto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtproducto.setForeground(new java.awt.Color(0, 0, 153));

        jtdescricion.setBackground(new java.awt.Color(204, 204, 255));
        jtdescricion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtdescricion.setForeground(new java.awt.Color(0, 0, 153));

        jtpreciocompra.setBackground(new java.awt.Color(204, 204, 255));
        jtpreciocompra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtpreciocompra.setForeground(new java.awt.Color(0, 0, 153));
        jtpreciocompra.setToolTipText("precio en peso");

        jtprecioventa.setBackground(new java.awt.Color(204, 204, 255));
        jtprecioventa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtprecioventa.setForeground(new java.awt.Color(0, 0, 153));
        jtprecioventa.setToolTipText("precio en peso ");

        jtexistencias.setBackground(new java.awt.Color(204, 204, 255));
        jtexistencias.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtexistencias.setForeground(new java.awt.Color(0, 0, 153));
        jtexistencias.setToolTipText("numero de productos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtpreciocompra, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtprecioventa, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtexistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtdescricion, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jTidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jtproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtdescricion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtpreciocompra, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addGap(11, 11, 11)
                        .addComponent(jtprecioventa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jtexistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        add(jPanel1);
        jPanel1.setBounds(10, 10, 380, 270);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "OPCION", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 2147483647));
        jPanel2.setOpaque(false);

        jbsiguiente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbsiguiente.setText(">>");
        jbsiguiente.setToolTipText("Siguiente");
        jbsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsiguienteActionPerformed(evt);
            }
        });

        jbultimo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbultimo.setText(">|");
        jbultimo.setToolTipText("Último");

        jbprimero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbprimero.setText("|<");
        jbprimero.setToolTipText("Primero");

        jbanterior.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbanterior.setText("<<");
        jbanterior.setToolTipText("Anterior");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jbprimero, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbanterior, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbsiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbprimero)
                    .addComponent(jbanterior)
                    .addComponent(jbsiguiente)
                    .addComponent(jbultimo))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        add(jPanel2);
        jPanel2.setBounds(10, 280, 380, 60);

        jPanel3.setBackground(new Color(0,0,0,125));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Botton", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(0, 0, 153)))); // NOI18N
        jPanel3.setOpaque(false);

        jbagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/agr2.png"))); // NOI18N
        jbagregar.setText("Agregar");
        jbagregar.setBorder(null);
        jbagregar.setBorderPainted(false);
        jbagregar.setContentAreaFilled(false);
        jbagregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbagregar.setIconTextGap(-3);
        jbagregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/agr3.png"))); // NOI18N
        jbagregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/agr1.png"))); // NOI18N
        jbagregar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbagregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbagregarActionPerformed(evt);
            }
        });

        jbborrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/del2.png"))); // NOI18N
        jbborrar.setText("Borrar");
        jbborrar.setBorder(null);
        jbborrar.setBorderPainted(false);
        jbborrar.setContentAreaFilled(false);
        jbborrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbborrar.setIconTextGap(-3);
        jbborrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/del3.png"))); // NOI18N
        jbborrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/del1.png"))); // NOI18N
        jbborrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbborrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jBsaveeditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sav2.png"))); // NOI18N
        jBsaveeditar.setText("Save");
        jBsaveeditar.setBorder(null);
        jBsaveeditar.setBorderPainted(false);
        jBsaveeditar.setContentAreaFilled(false);
        jBsaveeditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBsaveeditar.setIconTextGap(-3);
        jBsaveeditar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sav3.png"))); // NOI18N
        jBsaveeditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sav1.png"))); // NOI18N
        jBsaveeditar.setVerifyInputWhenFocusTarget(false);
        jBsaveeditar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jBsaveeditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jbeditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ed2.png"))); // NOI18N
        jbeditar.setText(" Editar");
        jbeditar.setBorder(null);
        jbeditar.setBorderPainted(false);
        jbeditar.setContentAreaFilled(false);
        jbeditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbeditar.setIconTextGap(-3);
        jbeditar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ed3.png"))); // NOI18N
        jbeditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ed1.png"))); // NOI18N
        jbeditar.setVerifyInputWhenFocusTarget(false);
        jbeditar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbeditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jBsaveeditar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/2.png"))); // NOI18N
        jBsaveeditar1.setText("Save Edit");
        jBsaveeditar1.setBorder(null);
        jBsaveeditar1.setBorderPainted(false);
        jBsaveeditar1.setContentAreaFilled(false);
        jBsaveeditar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBsaveeditar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBsaveeditar1.setIconTextGap(-3);
        jBsaveeditar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/3.png"))); // NOI18N
        jBsaveeditar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/images.png"))); // NOI18N
        jBsaveeditar1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jBsaveeditar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbborrar)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBsaveeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbeditar)
                            .addComponent(jBsaveeditar1))
                        .addGap(28, 28, 28)
                        .addComponent(jbagregar)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jbborrar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jbeditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBsaveeditar1)
                            .addComponent(jbagregar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBsaveeditar)
                .addGap(31, 31, 31))
        );

        add(jPanel3);
        jPanel3.setBounds(400, 10, 250, 220);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Detalle de los Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel4.setOpaque(false);

        jtbledetalle.setBackground(new java.awt.Color(204, 204, 255));
        jtbledetalle.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jtbledetalle.setForeground(new java.awt.Color(0, 0, 102));
        jtbledetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID_Producto", "Producto", "Descripcion", "Precio_Venta", "Precio_Compra", "Existencias"
            }
        ));
        jtbledetalle.setColumnSelectionAllowed(true);
        jtbledetalle.setGridColor(new java.awt.Color(0, 0, 102));
        jtbledetalle.getTableHeader().setResizingAllowed(false);
        jScrollPane1.setViewportView(jtbledetalle);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        add(jPanel4);
        jPanel4.setBounds(10, 350, 660, 170);

        jBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bs2.png"))); // NOI18N
        jBuscar.setBorder(null);
        jBuscar.setBorderPainted(false);
        jBuscar.setContentAreaFilled(false);
        jBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBuscar.setIconTextGap(-3);
        jBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/b1.png"))); // NOI18N
        jBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/b1.png"))); // NOI18N
        jBuscar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(jBuscar);
        jBuscar.setBounds(580, 240, 51, 50);
        add(jTbuscar);
        jTbuscar.setBounds(420, 250, 140, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        add(jLabel7);
        jLabel7.setBounds(214, 74, 340, 250);
    }// </editor-fold>//GEN-END:initComponents

    private void jTidproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTidproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTidproductoActionPerformed

    private void jbsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbsiguienteActionPerformed

    private void jbagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbagregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbagregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBsaveeditar;
    public javax.swing.JButton jBsaveeditar1;
    public javax.swing.JButton jBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTbuscar;
    public javax.swing.JTextField jTidproducto;
    public javax.swing.JButton jbagregar;
    public javax.swing.JButton jbanterior;
    public javax.swing.JButton jbborrar;
    public javax.swing.JButton jbeditar;
    public javax.swing.JButton jbprimero;
    public javax.swing.JButton jbsiguiente;
    public javax.swing.JButton jbultimo;
    public javax.swing.JTable jtbledetalle;
    public javax.swing.JTextField jtdescricion;
    public javax.swing.JTextField jtexistencias;
    public javax.swing.JTextField jtpreciocompra;
    public javax.swing.JTextField jtprecioventa;
    public javax.swing.JTextField jtproducto;
    // End of variables declaration//GEN-END:variables
}
