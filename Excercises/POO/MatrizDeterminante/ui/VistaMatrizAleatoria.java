package ui;

import javax.swing.JOptionPane;
import logica.Matriz;
import logica.Operacion;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class VistaMatrizAleatoria extends javax.swing.JFrame {

    private Matriz matrizA;
    private Matriz matrizB;
    private Matriz matrizC;
    private Matriz matrizC1;

    public VistaMatrizAleatoria() {
        initComponents();
        iniciarComponentesVentana();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxaMatrizB = new javax.swing.JTextArea();
        jtxfMatrizBNroFilas = new javax.swing.JTextField();
        jtxfMatrizBNroColumnas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtnGenerarAleatoriamenteMatrizB = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxaMatrizA = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxfMatrizANroFilas = new javax.swing.JTextField();
        jtxfMatrizANroColumnas = new javax.swing.JTextField();
        jbtnGenerarAleatoriamenteMatrizA = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtxaMatrizC = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtxaMatrizC1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 74, 145));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(
                javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Matriz B",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jtxaMatrizB.setBackground(new java.awt.Color(0, 0, 0));
        jtxaMatrizB.setColumns(20);
        jtxaMatrizB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxaMatrizB.setForeground(new java.awt.Color(255, 255, 255));
        jtxaMatrizB.setRows(5);
        jScrollPane1.setViewportView(jtxaMatrizB);

        jtxfMatrizBNroFilas.setBackground(new java.awt.Color(0, 0, 0));
        jtxfMatrizBNroFilas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxfMatrizBNroFilas.setForeground(new java.awt.Color(255, 255, 255));

        jtxfMatrizBNroColumnas.setBackground(new java.awt.Color(0, 0, 0));
        jtxfMatrizBNroColumnas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxfMatrizBNroColumnas.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("#COLUMNAS:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("#FILAS:");

        jbtnGenerarAleatoriamenteMatrizB.setBackground(new java.awt.Color(0, 0, 0));
        jbtnGenerarAleatoriamenteMatrizB.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbtnGenerarAleatoriamenteMatrizB.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGenerarAleatoriamenteMatrizB.setText("Generar matriz B aleatoriamente");
        jbtnGenerarAleatoriamenteMatrizB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGenerarAleatoriamenteMatrizBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel3).addGap(18, 18, 18)
                                .addComponent(jtxfMatrizBNroFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18).addComponent(jLabel4).addGap(18, 18, 18)
                                .addComponent(jtxfMatrizBNroColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jbtnGenerarAleatoriamenteMatrizB, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1)).addContainerGap()));
        jPanel2Layout
                .setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3)
                                .addComponent(jtxfMatrizBNroFilas, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4).addComponent(jtxfMatrizBNroColumnas,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnGenerarAleatoriamenteMatrizB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                .addContainerGap()));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(
                javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Matriz A",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jtxaMatrizA.setBackground(new java.awt.Color(0, 0, 0));
        jtxaMatrizA.setColumns(20);
        jtxaMatrizA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxaMatrizA.setForeground(new java.awt.Color(255, 255, 255));
        jtxaMatrizA.setRows(5);
        jtxaMatrizA.setCaretColor(new java.awt.Color(255, 51, 0));
        jScrollPane2.setViewportView(jtxaMatrizA);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("#FILAS:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("#COLUMNAS:");

        jtxfMatrizANroFilas.setBackground(new java.awt.Color(0, 0, 0));
        jtxfMatrizANroFilas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxfMatrizANroFilas.setForeground(new java.awt.Color(255, 255, 255));

        jtxfMatrizANroColumnas.setBackground(new java.awt.Color(0, 0, 0));
        jtxfMatrizANroColumnas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxfMatrizANroColumnas.setForeground(new java.awt.Color(255, 255, 255));

        jbtnGenerarAleatoriamenteMatrizA.setBackground(new java.awt.Color(0, 0, 0));
        jbtnGenerarAleatoriamenteMatrizA.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbtnGenerarAleatoriamenteMatrizA.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGenerarAleatoriamenteMatrizA.setText("Generar matriz A aleatoriamente");
        jbtnGenerarAleatoriamenteMatrizA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGenerarAleatoriamenteMatrizAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel1).addGap(18, 18, 18)
                                        .addComponent(jtxfMatrizANroFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18).addComponent(jLabel2).addGap(18, 18, 18)
                                        .addComponent(jtxfMatrizANroColumnas, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2).addComponent(jbtnGenerarAleatoriamenteMatrizA,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel3Layout
                .setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel1)
                                .addComponent(jtxfMatrizANroFilas, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2).addComponent(jtxfMatrizANroColumnas,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnGenerarAleatoriamenteMatrizA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                .addContainerGap()));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(
                javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 102)), "Resultado",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 255, 102))); // NOI18N

        jtxaMatrizC.setEditable(false);
        jtxaMatrizC.setBackground(new java.awt.Color(0, 0, 0));
        jtxaMatrizC.setColumns(20);
        jtxaMatrizC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxaMatrizC.setForeground(new java.awt.Color(0, 255, 102));
        jtxaMatrizC.setRows(5);
        jScrollPane3.setViewportView(jtxaMatrizC);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup().addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                        .addContainerGap()));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup().addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                        .addContainerGap()));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Sumar");
        jButton4.setPreferredSize(new java.awt.Dimension(95, 20));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Determinante");
        jButton5.setPreferredSize(new java.awt.Dimension(95, 20));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Multiplicar");
        jButton6.setPreferredSize(new java.awt.Dimension(95, 20));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(
                javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Formula aplicada",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jtxaMatrizC1.setEditable(false);
        jtxaMatrizC1.setBackground(new java.awt.Color(0, 0, 0));
        jtxaMatrizC1.setColumns(20);
        jtxaMatrizC1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jtxaMatrizC1.setForeground(new java.awt.Color(255, 255, 255));
        jtxaMatrizC1.setRows(5);
        jScrollPane4.setViewportView(jtxaMatrizC1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup().addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                        .addContainerGap()));
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout
                        .createSequentialGroup().addContainerGap().addComponent(jScrollPane4).addContainerGap()));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(
                "<html>Instrucciones:<br>\n1 .- Ingresar el numero de filas y columnas en ambas matrices.<br>\n2.- Generar el valor de las matrices aleatoriamente.<br>\n3.- Presionar el boton del calculo deseado.<br></html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                        jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel4,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 185,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 192,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18).addComponent(jButton5,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 185,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGenerarAleatoriamenteMatrizAActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbtnGenerarAleatoriamenteMatrizAActionPerformed
        this.jtxaMatrizA.setText("");
        String strNroFilas = this.jtxfMatrizANroFilas.getText();
        String strNroColumnas = this.jtxfMatrizANroColumnas.getText();

        if (strNroFilas.length() != 0 && strNroColumnas.length() != 0) {
            Integer intNroFilas = Integer.parseInt(strNroFilas);// Integer.parseInt -> esto convierte la cadena a entero
            Integer intNroColumnas = Integer.parseInt(strNroColumnas);

            // creamos un objeto de Matriz A
            // matrizA=new Matriz();
            matrizA = new Matriz(intNroFilas, intNroColumnas);

            for (int i = 0; i < intNroFilas; i++) {
                for (int j = 0; j < intNroColumnas; j++) {
                    Integer valorAleatorio = (int) (Math.random() * 100);

                    matrizA.setValor(i, j, valorAleatorio);

                    // para que de un salto de linea
                    if (j == (intNroColumnas - 1)) {
                        this.jtxaMatrizA.append("[" + valorAleatorio + "]\n");
                    } else {
                        this.jtxaMatrizA.append("[" + valorAleatorio + "] ");
                    }
                }
            }
        } else {
            if (strNroFilas.length() == 0) {
                JOptionPane.showMessageDialog(this, "Matriz A: Ingrese el Nro de Filas", "Datos Incompletos", 2);
            } else {
                if (strNroColumnas.length() == 0) {
                    JOptionPane.showMessageDialog(this, "Matriz A: Ingrese el Nro de Columnas", "Datos Incompletos", 2);
                }
            }

        }
    }// GEN-LAST:event_jbtnGenerarAleatoriamenteMatrizAActionPerformed

    private void jbtnGenerarAleatoriamenteMatrizBActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbtnGenerarAleatoriamenteMatrizBActionPerformed
        this.jtxaMatrizB.setText("");
        String strNroFilas = this.jtxfMatrizBNroFilas.getText();
        String strNroColumnas = this.jtxfMatrizBNroColumnas.getText();
        if (strNroFilas.length() != 0 && strNroColumnas.length() != 0) {
            Integer intNroFilas = Integer.parseInt(strNroFilas);
            Integer intNroColumnas = Integer.parseInt(strNroColumnas);

            // creamos un objeto de Matriz B
            matrizB = new Matriz(intNroFilas, intNroColumnas);
            matrizB.setNroFilas(intNroFilas);
            matrizB.setNroColumnas(intNroColumnas);

            for (int i = 0; i < intNroFilas; i++) {
                for (int j = 0; j < intNroColumnas; j++) {
                    Integer valorAleatorio = (int) (Math.random() * 100);

                    matrizB.setValor(i, j, valorAleatorio);

                    if (j == (intNroColumnas - 1)) {
                        this.jtxaMatrizB.append("[" + valorAleatorio + "]\n");
                    } else {
                        this.jtxaMatrizB.append("[" + valorAleatorio + "] ");
                    }
                }
            }
        } else {
            if (strNroFilas.length() == 0) {
                JOptionPane.showMessageDialog(this, "Matriz B: Ingrese el Nro de Filas", "Datos Incompletos", 2);
            } else {
                if (strNroColumnas.length() == 0) {
                    JOptionPane.showMessageDialog(this, "Matriz B: Ingrese el Nro de Columnas", "Datos Incompletos", 2);
                }
            }

        }
    }// GEN-LAST:event_jbtnGenerarAleatoriamenteMatrizBActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        // SUMA DE UNA MATRIZ
        matrizC = new Matriz(matrizB.getNroFilas(), matrizB.getNroColumnas()); // Crear objeto de resultado
        matrizC = Operacion.suma(matrizA, matrizB); // Operacion de resultado
        matrizC1 = new Matriz(matrizB.getNroFilas(), matrizB.getNroColumnas()); // Crear objeto de Proceso
        matrizC1 = Operacion.suma(matrizA, matrizB); // Operacion de Proceso
        this.mostrarResultadoEnMatrizC(); // Mostrar Resultado
        this.jtxaMatrizC1.setText("\nSUMA : M1 (i , j) + M2 (i , j)"); // Mostrar Proceso
    }// GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
        // DETERMINANTE DE UNA MATRIZ
        this.jtxaMatrizC.setText(Operacion.determinante(matrizA)); // Mostrar Resultado
        this.jtxaMatrizC1.setText("\nDETERMINANTE : M1 (i , j) = M1 (i , k) * M1 (k , j) / M1 (k , k) \n"); // Mostrar
                                                                                                            // Proceso
    }// GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed
        // MULTIPLICACION DE UNA MATRIZ
        matrizC = new Matriz(matrizB.getNroFilas(), matrizB.getNroColumnas()); // Crear objeto de resultado
        matrizC = Operacion.multiplicacion(matrizA, matrizB); // Operacion de resultado
        matrizC1 = new Matriz(matrizB.getNroFilas(), matrizB.getNroColumnas()); // Crear objeto de Proceso
        matrizC1 = Operacion.multiplicacion(matrizA, matrizB); // Operacion de Proceso
        this.mostrarResultadoEnMatrizC(); // Mostrar Resultado
        this.jtxaMatrizC1.setText("\nMULTIPLICACION : M1 (i , j) * M2 (i , j)"); // Mostrar Proceso
    }// GEN-LAST:event_jButton6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbtnGenerarAleatoriamenteMatrizA;
    private javax.swing.JButton jbtnGenerarAleatoriamenteMatrizB;
    private javax.swing.JTextArea jtxaMatrizA;
    private javax.swing.JTextArea jtxaMatrizB;
    private javax.swing.JTextArea jtxaMatrizC;
    private javax.swing.JTextArea jtxaMatrizC1;
    private javax.swing.JTextField jtxfMatrizANroColumnas;
    private javax.swing.JTextField jtxfMatrizANroFilas;
    private javax.swing.JTextField jtxfMatrizBNroColumnas;
    private javax.swing.JTextField jtxfMatrizBNroFilas;
    // End of variables declaration//GEN-END:variables

    private void iniciarComponentesVentana() {
        tituloVentana();
        centrarVentana();
    }

    private void tituloVentana() {
        this.setTitle("MATRIZ DETERMINANTE - FERNANDO CALMET");
    }

    private void centrarVentana() {
        this.setLocationRelativeTo(null);
    }

    // MOSTRAR RESULTADO
    private void mostrarResultadoEnMatrizC() {
        this.jtxaMatrizC.setText("");
        for (int i = 0; i < matrizC.getNroFilas(); i++) {
            for (int j = 0; j < matrizC.getNroColumnas(); j++) {

                if (j == (matrizC.getNroColumnas() - 1)) {
                    this.jtxaMatrizC.append("[" + matrizC.getValor(i, j) + "]\n");
                } else {
                    this.jtxaMatrizC.append("[" + matrizC.getValor(i, j) + "] ");
                }
            }
        }
    }

}
