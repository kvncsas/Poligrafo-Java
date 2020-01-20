package view;

import icons.Thinking_uh;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import classes.Conexion;

/**
 *
 * @author Kevin Casas
 */
public class Novedad extends javax.swing.JInternalFrame {

    public Novedad() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        initComponents();
        //1 año amarllo
        //gris novedades que le pasó
        //rojo es excluido
        //verde apta
        validarnovedad();
    }

    public void validarnovedad() {
        jLabel138.setVisible(false);
        jLabel27.setVisible(false);
        txtcampactnove.setVisible(false);
        jLabel37.setVisible(false);
        jLabel139.setVisible(false);
        jLabel26.setVisible(false);
        txtcargactnove.setVisible(false);
        jLabel38.setVisible(false);

        jLabel140.setVisible(false);
        jLabel23.setVisible(false);
        txtcampaspnove.setVisible(false);
        jLabel35.setVisible(false);
        jLabel141.setVisible(false);
        jLabel25.setVisible(false);
        txtcargoaspnove.setVisible(false);
        jLabel36.setVisible(false);
        
        jLabel21.setVisible(false);
        cbxcolornovedad.setVisible(false);
        
        
    }

    public void limpiarnovedad() {

        cbxidennovedad.setSelectedItem("Seleccione");
        txtidennovedad.setText("");
        txtnomnovedad.setText("");
        txtrazonnovedad.setText("");
        cbxtipoexmnovedad.setSelectedItem("Seleccione");
        cbxmotivoexam.setSelectedItem("-");
        txtcampactnove.setText("");
        txtcargactnove.setText("");
        txtcampaspnove.setText("");
        txtcargoaspnove.setText("");
        txtsolicinovedad.setText("");
        cbxcolornovedad.setSelectedItem("Seleccione");
        validarnovedad();
    }

    Thinking_uh iconThinking_uh = new Thinking_uh();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        tituloexamenpre = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        cbxidennovedad = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cbxcolornovedad = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        txtidennovedad = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtnomnovedad = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtrazonnovedad = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtsolicinovedad = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        cbxtipoexmnovedad = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        txtcampaspnove = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtcargoaspnove = new javax.swing.JTextField();
        cbxmotivoexam = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtcargactnove = new javax.swing.JTextField();
        txtcampactnove = new javax.swing.JTextField();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel16.setText("Tipo de Identificación:");

        tituloexamenpre.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        tituloexamenpre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloexamenpre.setText("Creación de novedad");

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel17.setText("Número de Identificación:");

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel18.setText("Nombre del Examinado:");

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel9MouseMoved(evt);
            }
        });
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
        });

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Guardar");
        jLabel47.setAlignmentX(1.0F);
        jLabel47.setAlignmentY(1.0F);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addGap(51, 51, 51))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jLabel50))
                .addContainerGap())
        );

        cbxidennovedad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        cbxidennovedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "CC", "TI", "CE", "PEP", "PASS" }));
        cbxidennovedad.setBorder(null);
        cbxidennovedad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxidennovedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxidennovedadActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel19.setText("Razón:");

        jLabel20.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel20.setText("Solicitante de examen:");

        jPanel22.setBackground(java.awt.Color.red);
        jPanel22.setForeground(new java.awt.Color(255, 255, 255));
        jPanel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel22.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel22MouseMoved(evt);
            }
        });
        jPanel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel22MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel22MouseExited(evt);
            }
        });

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/multiply.png"))); // NOI18N
        jLabel70.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel70MouseMoved(evt);
            }
        });
        jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel70MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel70MouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cancelar");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel70)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel21.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel21.setText("Color:");

        cbxcolornovedad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        cbxcolornovedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Rojo", "Verde" }));
        cbxcolornovedad.setBorder(null);
        cbxcolornovedad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxcolornovedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxcolornovedadActionPerformed(evt);
            }
        });

        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtidennovedad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtidennovedad.setBorder(null);
        txtidennovedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidennovedadKeyTyped(evt);
            }
        });

        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtnomnovedad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtnomnovedad.setBorder(null);
        txtnomnovedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomnovedadKeyTyped(evt);
            }
        });

        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtrazonnovedad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtrazonnovedad.setBorder(null);
        txtrazonnovedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrazonnovedadKeyTyped(evt);
            }
        });

        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtsolicinovedad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtsolicinovedad.setBorder(null);
        txtsolicinovedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsolicinovedadActionPerformed(evt);
            }
        });
        txtsolicinovedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsolicinovedadKeyTyped(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel22.setText("Tipo de motivo:");

        jLabel23.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel23.setText("Campaña (aspira):");

        jLabel24.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel24.setText("Tipo de examen:");

        jLabel25.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel25.setText("Cargo (aspira):");

        cbxtipoexmnovedad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        cbxtipoexmnovedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Ingreso", "Procedimiento", "Ascenso", "Caso específico" }));
        cbxtipoexmnovedad.setBorder(null);
        cbxtipoexmnovedad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxtipoexmnovedad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxtipoexmnovedadItemStateChanged(evt);
            }
        });
        cbxtipoexmnovedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxtipoexmnovedadActionPerformed(evt);
            }
        });

        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcampaspnove.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcampaspnove.setBorder(null);
        txtcampaspnove.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcampaspnoveKeyTyped(evt);
            }
        });

        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcargoaspnove.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcargoaspnove.setBorder(null);
        txtcargoaspnove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcargoaspnoveActionPerformed(evt);
            }
        });
        txtcargoaspnove.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcargoaspnoveKeyTyped(evt);
            }
        });

        cbxmotivoexam.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        cbxmotivoexam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cbxmotivoexam.setBorder(null);
        cbxmotivoexam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxmotivoexam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxmotivoexamActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel26.setText("Cargo (actual):");

        jLabel27.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel27.setText("Campaña (actual):");

        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcargactnove.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcargactnove.setBorder(null);
        txtcargactnove.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcargactnoveKeyTyped(evt);
            }
        });

        txtcampactnove.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcampactnove.setBorder(null);
        txtcampactnove.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcampactnoveKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel142, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel141, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel140, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel139, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel138, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcampactnove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtcargactnove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxmotivoexam, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxtipoexmnovedad, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidennovedad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnomnovedad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxidennovedad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxcolornovedad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtsolicinovedad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtrazonnovedad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtcampaspnove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtcargoaspnove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloexamenpre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tituloexamenpre)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxidennovedad, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtidennovedad, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnomnovedad, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrazonnovedad, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxtipoexmnovedad, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxmotivoexam, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcampactnove, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel139, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcargactnove, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcampaspnove, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcargoaspnove, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtsolicinovedad, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxcolornovedad, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseMoved
        jPanel9.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jPanel9MouseMoved

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
        jPanel9.setBackground(Color.black);
    }//GEN-LAST:event_jPanel9MouseExited

    private void cbxidennovedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxidennovedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxidennovedadActionPerformed

    private void jLabel70MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseMoved

    }//GEN-LAST:event_jLabel70MouseMoved

    private void jLabel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseClicked
        int salir = JOptionPane.showConfirmDialog(null, "¿Desea cancelar y cerrar el examen?", "Cancelación de creación de examen", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (salir == 0) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel70MouseClicked

    private void jLabel70MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseExited

    }//GEN-LAST:event_jLabel70MouseExited

    private void jPanel22MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseMoved

    }//GEN-LAST:event_jPanel22MouseMoved

    private void jPanel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseClicked
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (resp == 0) {
            this.setVisible(false);
            MenuPrincipal.jPanel9.setVisible(true);
            MenuPrincipal.jPanel10.setVisible(true);
            limpiarnovedad();
            CreacionExamen.limpiar_e();
            MenuPrincipal.na.remove(this);
        }
    }//GEN-LAST:event_jPanel22MouseClicked

    private void jPanel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseExited

    }//GEN-LAST:event_jPanel22MouseExited

    private void cbxcolornovedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxcolornovedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxcolornovedadActionPerformed

    private void txtidennovedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidennovedadKeyTyped
        int k = (int) evt.getKeyChar();

        //validación para números
        if (k >= 32 && k < 48 || k > 57 && k != 127) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡Solamente se aceptan números!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtidennovedadKeyTyped

    private void txtnomnovedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomnovedadKeyTyped
        int k = (int) evt.getKeyChar();

        //validación para letras
        if (k > 32 && k < 65 || k > 90 && k < 97 || k > 165 && k != 225 && k != 233 && k != 237 && k != 241 && k != 243 && k != 250 && k != 193 && k != 209 && k != 201 && k != 205 && k != 211 && k != 218) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtnomnovedadKeyTyped

    private void txtrazonnovedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrazonnovedadKeyTyped
        int k = (int) evt.getKeyChar();

        if (k > 32 && k < 65 && k != 44 && k != 45 && k != 46 && k != 47 && k != 48 && k != 49 && k != 50 && k != 51 && k != 52 && k != 53 && k != 54 && k != 55 && k != 56 && k != 57 && k != 58 && k != 59 || k > 90 && k < 97 || k > 165) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtrazonnovedadKeyTyped

    private void txtsolicinovedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsolicinovedadKeyTyped
        int k = (int) evt.getKeyChar();

        //validación para letras
        if (k > 32 && k < 65 || k > 90 && k < 97 || k > 165 && k != 225 && k != 233 && k != 237 && k != 241 && k != 243 && k != 250 && k != 193 && k != 209 && k != 201 && k != 205 && k != 211 && k != 218) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtsolicinovedadKeyTyped

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        if (cbxtipoexmnovedad.getSelectedItem().equals("Seleccione") || cbxmotivoexam.getSelectedItem().equals("Seleccione") || cbxmotivoexam.getSelectedItem().equals("-") || cbxidennovedad.getSelectedItem().equals("Seleccione") || (txtidennovedad.getText().equals("") || "".equals(txtidennovedad.getText())) || (txtnomnovedad.getText().equals("") || "".equals(txtnomnovedad.getText())) || (txtrazonnovedad.getText().equals("") || "".equals(txtrazonnovedad.getText())) || (txtsolicinovedad.getText().equals("") || "".equals(txtsolicinovedad.getText()))) {
            JOptionPane.showMessageDialog(null, "¡Debe completar todos los parámetros para registrar la novedad!", "Registro de datos examinado", JOptionPane.ERROR_MESSAGE);
        } else {
          
            try {
                PreparedStatement sqlestud = Conexion.connection.prepareStatement("INSERT INTO datos_generales_poli "
                        + "(t_identificacion, no_id, nombre, razon_novedad, cargoactual,  areaactual, cargoaspira, areaaspira, solicitador, ciudadexamen, fechacreacion, tipoexamen, motivoexamen, estadoexamen)"
                        + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                sqlestud.setString(1, (String) cbxidennovedad.getSelectedItem());
                sqlestud.setString(2, txtidennovedad.getText());
                sqlestud.setString(3, txtnomnovedad.getText());
                sqlestud.setString(4, txtrazonnovedad.getText());
                sqlestud.setString(5, txtcargactnove.getText());
                sqlestud.setString(6, txtcampactnove.getText());
                sqlestud.setString(7, txtcargoaspnove.getText());
                sqlestud.setString(8, txtcampaspnove.getText());
                sqlestud.setString(9, txtsolicinovedad.getText());
                sqlestud.setString(10, CreacionExamen.place.getText());
                sqlestud.setString(11, CreacionExamen.txtfechadeexam.getText());
//                sqlestud.setString(12, (String) cbxcolornovedad.getSelectedItem());
                sqlestud.setString(12, (String) cbxtipoexmnovedad.getSelectedItem());
                sqlestud.setString(13, (String) cbxmotivoexam.getSelectedItem());
                sqlestud.setString(14, "Novedad");
                sqlestud.executeUpdate();
                JOptionPane.showMessageDialog(null, "¡Los datos de la novedad fueron registrados exitosamente!  :D", "Registro de datos examinado", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                limpiarnovedad();
                CreacionExamen.limpiar_e();
                MenuPrincipal.na.remove(this);
                MenuPrincipal.jPanel9.setVisible(true);
                MenuPrincipal.jPanel10.setVisible(true);
                
//                try {
//                PreparedStatement sqlnov = Conexion.connection.prepareStatement("INSERT INTO datos_gen");
//                sqlnov.executeUpdate();
//                JOptionPane.showMessageDialog(null, "¡Se creo la notificación!  :D", "Registro de datos examinado", JOptionPane.INFORMATION_MESSAGE);
//                this.setVisible(false);
//                limpiarnovedad();
//                CreacionExamen.limpiarcreacion_e();
//                MenuPrincipal.na.remove(this);
//                MenuPrincipal.jPanel9.setVisible(true);
//                MenuPrincipal.jPanel10.setVisible(true);
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, "¡Error! No se agregaron los datos de novedad" + e);
//            }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "¡Error! No se agregaron los datos de novedad" + e);
            }
        }

    }//GEN-LAST:event_jPanel9MouseClicked

    private void cbxtipoexmnovedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxtipoexmnovedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxtipoexmnovedadActionPerformed

    private void txtcampaspnoveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcampaspnoveKeyTyped
        int k = (int) evt.getKeyChar();

        if (k > 32 && k < 65 && k != 44 && k != 45 && k != 46 && k != 47 && k != 48 && k != 49 && k != 50 && k != 51 && k != 52 && k != 53 && k != 54 && k != 55 && k != 56 && k != 57 && k != 58 && k != 59 || k > 90 && k < 97 || k > 165 && k != 225 && k != 233 && k != 237 && k != 241 && k != 243 && k != 250 && k != 193 && k != 209 && k != 201 && k != 205 && k != 211 && k != 218) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtcampaspnoveKeyTyped

    private void txtcargoaspnoveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcargoaspnoveKeyTyped
        int k = (int) evt.getKeyChar();

        if (k > 32 && k < 65 && k != 44 && k != 45 && k != 46 && k != 47 && k != 48 && k != 49 && k != 50 && k != 51 && k != 52 && k != 53 && k != 54 && k != 55 && k != 56 && k != 57 && k != 58 && k != 59 || k > 90 && k < 97 || k > 165 && k != 225 && k != 233 && k != 237 && k != 241 && k != 243 && k != 250 && k != 193 && k != 209 && k != 201 && k != 205 && k != 211 && k != 218) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtcargoaspnoveKeyTyped

    private void cbxmotivoexamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxmotivoexamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxmotivoexamActionPerformed

    private void txtcargactnoveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcargactnoveKeyTyped
        int k = (int) evt.getKeyChar();

        if (k > 32 && k < 65 && k != 44 && k != 45 && k != 46 && k != 47 && k != 48 && k != 49 && k != 50 && k != 51 && k != 52 && k != 53 && k != 54 && k != 55 && k != 56 && k != 57 && k != 58 && k != 59 || k > 90 && k < 97 || k > 165 && k != 225 && k != 233 && k != 237 && k != 241 && k != 243 && k != 250 && k != 193 && k != 209 && k != 201 && k != 205 && k != 211 && k != 218) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtcargactnoveKeyTyped

    private void txtcampactnoveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcampactnoveKeyTyped
        int k = (int) evt.getKeyChar();

        if (k > 32 && k < 65 && k != 44 && k != 45 && k != 46 && k != 47 && k != 48 && k != 49 && k != 50 && k != 51 && k != 52 && k != 53 && k != 54 && k != 55 && k != 56 && k != 57 && k != 58 && k != 59 || k > 90 && k < 97 || k > 165 && k != 225 && k != 233 && k != 237 && k != 241 && k != 243 && k != 250 && k != 193 && k != 209 && k != 201 && k != 205 && k != 211 && k != 218) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
    }//GEN-LAST:event_txtcampactnoveKeyTyped

    private void cbxtipoexmnovedadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxtipoexmnovedadItemStateChanged
        String p = cbxtipoexmnovedad.getSelectedItem().toString();
        if (p.equals("Ingreso")) {
            cbxmotivoexam.removeAllItems();
            cbxmotivoexam.addItem("Seleccione");
            cbxmotivoexam.addItem("Pre-empleo");
            cbxmotivoexam.setSelectedItem("Seleccione");

            jLabel138.setVisible(false);
            jLabel27.setVisible(false);
            txtcampactnove.setVisible(false);
            jLabel37.setVisible(false);
            jLabel139.setVisible(false);
            jLabel26.setVisible(false);
            txtcargactnove.setVisible(false);
            jLabel38.setVisible(false);

            jLabel140.setVisible(true);
            jLabel23.setVisible(true);
            txtcampaspnove.setVisible(true);
            jLabel35.setVisible(true);
            jLabel141.setVisible(true);
            jLabel25.setVisible(true);
            txtcargoaspnove.setVisible(true);
            jLabel36.setVisible(true);

            txtcampaspnove.setText(CreacionExamen.txtareaexaminado.getText());
            txtcampactnove.setText("");
        } else if (p.equals("Seleccione")) {
            cbxmotivoexam.removeAllItems();
            cbxmotivoexam.addItem("-");
            cbxmotivoexam.setSelectedItem("-");

            jLabel138.setVisible(false);
            jLabel27.setVisible(false);
            txtcampactnove.setVisible(false);
            jLabel37.setVisible(false);
            jLabel139.setVisible(false);
            jLabel26.setVisible(false);
            txtcargactnove.setVisible(false);
            jLabel38.setVisible(false);

            jLabel140.setVisible(false);
            jLabel23.setVisible(false);
            txtcampaspnove.setVisible(false);
            jLabel35.setVisible(false);
            jLabel141.setVisible(false);
            jLabel25.setVisible(false);
            txtcargoaspnove.setVisible(false);
            jLabel36.setVisible(false);

            txtcampaspnove.setText(CreacionExamen.txtareaexaminado.getText());
            txtcampactnove.setText("");
        } else if (p.equals("Procedimiento")) {
            cbxmotivoexam.removeAllItems();
            cbxmotivoexam.addItem("Seleccione");
            cbxmotivoexam.addItem("Rutina (admitivos)");
            cbxmotivoexam.addItem("Rutina (operaciones)");
            cbxmotivoexam.setSelectedItem("Seleccione");

            jLabel138.setVisible(true);
            jLabel27.setVisible(true);
            txtcampactnove.setVisible(true);
            jLabel37.setVisible(true);
            jLabel139.setVisible(true);
            jLabel26.setVisible(true);
            txtcargactnove.setVisible(true);
            jLabel38.setVisible(true);

            jLabel140.setVisible(false);
            jLabel23.setVisible(false);
            txtcampaspnove.setVisible(false);
            jLabel35.setVisible(false);
            jLabel141.setVisible(false);
            jLabel25.setVisible(false);
            txtcargoaspnove.setVisible(false);
            jLabel36.setVisible(false);

            txtcampaspnove.setText(CreacionExamen.txtareaexaminado.getText());
            txtcampactnove.setText("");
        } else if (p.equals("Ascenso")) {
            cbxmotivoexam.removeAllItems();
            cbxmotivoexam.addItem("Seleccione");
            cbxmotivoexam.addItem("Rutina (admitivos)");
            cbxmotivoexam.addItem("Rutina (operaciones)");
            cbxmotivoexam.setSelectedItem("Seleccione");

            jLabel138.setVisible(true);
            jLabel27.setVisible(true);
            txtcampactnove.setVisible(true);
            jLabel37.setVisible(true);
            jLabel139.setVisible(true);
            jLabel26.setVisible(true);
            txtcargactnove.setVisible(true);
            jLabel38.setVisible(true);

            jLabel140.setVisible(true);
            jLabel23.setVisible(true);
            txtcampaspnove.setVisible(true);
            jLabel35.setVisible(true);
            jLabel141.setVisible(true);
            jLabel25.setVisible(true);
            txtcargoaspnove.setVisible(true);
            jLabel36.setVisible(true);

            txtcampaspnove.setText(CreacionExamen.txtareaexaminado.getText());
            txtcampactnove.setText("");
        } else if (p.equals("Caso específico")) {
            cbxmotivoexam.removeAllItems();
            cbxmotivoexam.addItem("Seleccione");
            cbxmotivoexam.addItem("Específico");
            cbxmotivoexam.setSelectedItem("Seleccione");

            jLabel138.setVisible(true);
            jLabel27.setVisible(true);
            txtcampactnove.setVisible(true);
            jLabel37.setVisible(true);
            jLabel139.setVisible(true);
            jLabel26.setVisible(true);
            txtcargactnove.setVisible(true);
            jLabel38.setVisible(true);

            jLabel140.setVisible(false);
            jLabel23.setVisible(false);
            txtcampaspnove.setVisible(false);
            jLabel35.setVisible(false);
            jLabel141.setVisible(false);
            jLabel25.setVisible(false);
            txtcargoaspnove.setVisible(false);
            jLabel36.setVisible(false);

            txtcampactnove.setText(CreacionExamen.txtareaexaminado.getText());
            txtcampaspnove.setText("");
        }
    }//GEN-LAST:event_cbxtipoexmnovedadItemStateChanged

    private void txtcargoaspnoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcargoaspnoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcargoaspnoveActionPerformed

    private void txtsolicinovedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsolicinovedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsolicinovedadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxcolornovedad;
    public static javax.swing.JComboBox<String> cbxidennovedad;
    public static javax.swing.JComboBox<String> cbxmotivoexam;
    public static javax.swing.JComboBox<String> cbxtipoexmnovedad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel tituloexamenpre;
    public static javax.swing.JTextField txtcampactnove;
    public static javax.swing.JTextField txtcampaspnove;
    public static javax.swing.JTextField txtcargactnove;
    public static javax.swing.JTextField txtcargoaspnove;
    public static javax.swing.JTextField txtidennovedad;
    public static javax.swing.JTextField txtnomnovedad;
    public static javax.swing.JTextField txtrazonnovedad;
    public static javax.swing.JTextField txtsolicinovedad;
    // End of variables declaration//GEN-END:variables
}
