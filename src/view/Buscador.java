package view;

import classes.AccionesExamen;
import icons.Question;
import icons.Shocked;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import classes.Conexion;
import classes.DatosPrincipales;
import static view.Consulta.cbxtipoiden;
import static view.Consulta.txtnumiden;
import static view.CreacionExamen.txtnoidexaminado;
import static view.MenuPrincipal.na;

/**
 *
 * @author Kevin Casas
 */
public class Buscador extends javax.swing.JFrame {

    Icon M = new ImageIcon(getClass().getResource("/images/pluma.png"));
    Image icon = new ImageIcon(getClass().getResource("/images/pluma.png")).getImage();

    public Buscador() {
        initComponents();
        this.setIconImage(icon);
        this.setLocationRelativeTo(null);
    }

    public String tipoid_creacion;
    public String tipobuscador;

    Shocked iconShocked = new Shocked();
    Question iconQuestion = new Question();

    public void CentrarVentana(JInternalFrame internalframe) {
        int x = (na.getWidth() / 2) - internalframe.getWidth() / 2;
        int y = (na.getHeight() / 2) - internalframe.getHeight() / 2;
        if (internalframe.isShowing()) {
            internalframe.setLocation(x, y);
        } else {
            na.add(internalframe);
            internalframe.setLocation(x, y);
            internalframe.show();
        }
    }

    public void listarRegistros() {
        DefaultTableModel modelo = (DefaultTableModel) this.tablac.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        int a = 0;
        String sql = "SELECT nombre, t_identificacion, no_id, tipoexamen, motivoexamen, estadoexamen, fechacreacion FROM  datos_generales_poli WHERE no_id = " + txtnumiden.getText() + " AND t_identificacion = '" + cbxtipoiden.getSelectedItem().toString() + "' ";
        String filas[] = new String[7];
        try {
            Connection con = Conexion.connection;
            Statement st = con.createStatement();
            ResultSet r = st.executeQuery(sql);
            while (r.next()) {
                filas[0] = r.getString("nombre");
                filas[1] = r.getString("t_identificacion");
                filas[2] = r.getString("no_id");
                filas[3] = r.getString("tipoexamen");
                filas[4] = r.getString("motivoexamen");
                filas[5] = r.getString("estadoexamen");
                filas[6] = r.getString("fechacreacion");
                a++;
                modelo.addRow(filas);
            }
        } catch (SQLException ex) {
        }

    }

    public void listarRegistros2() {
        System.out.println("está dentro  de listar y los dato son: " + txtnoidexaminado.getText() + "y tipo id == " + tipoid_creacion);
        DefaultTableModel modelo2 = (DefaultTableModel) this.tablac.getModel();

        while (modelo2.getRowCount() > 0) {
            modelo2.removeRow(0);
        }
        int a = 0;
        String sql = "SELECT nombre, t_identificacion, no_id, tipoexamen, motivoexamen, estadoexamen, fechacreacion FROM  datos_generales_poli WHERE no_id = " + txtnoidexaminado.getText() + " and t_identificacion = '" + tipoid_creacion + "' ";
        String filas[] = new String[7];
        try {
            Connection con = Conexion.connection;
            Statement st = con.createStatement();
            ResultSet r = st.executeQuery(sql);
            while (r.next()) {
                filas[0] = r.getString("nombre");
                filas[1] = r.getString("t_identificacion");
                filas[2] = r.getString("no_id");
                filas[3] = r.getString("tipoexamen");
                filas[4] = r.getString("motivoexamen");
                filas[5] = r.getString("estadoexamen");
                filas[6] = r.getString("fechacreacion");
                a++;
                modelo2.addRow(filas);
            }
        } catch (SQLException ex) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloexamenpre = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablac = new javax.swing.JTable();

        setTitle("Datos de examen realizado sin conexión al servidor");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tituloexamenpre.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        tituloexamenpre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloexamenpre.setText("Registro de exámenes");

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cerrar");
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel2MouseMoved(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel70))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Registro de exámenes de la persona buscada:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Si desea ver el examen completo, seleccione el registro.");

        tablac.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        tablac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo Id", "N° Id", "Tipo examen", "Motivo examen", "Estado examen", "Fecha creación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablacMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablac);
        if (tablac.getColumnModel().getColumnCount() > 0) {
            tablac.getColumnModel().getColumn(0).setPreferredWidth(200);
            tablac.getColumnModel().getColumn(1).setPreferredWidth(40);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloexamenpre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tituloexamenpre)
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel70MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseMoved
jPanel22.setBackground(Color.decode("#D50000"));
    }//GEN-LAST:event_jLabel70MouseMoved

    private void jLabel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseClicked

    }//GEN-LAST:event_jLabel70MouseClicked

    private void jLabel70MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseExited
jPanel22.setBackground(Color.red);
    }//GEN-LAST:event_jLabel70MouseExited

    private void jPanel22MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseMoved
jPanel22.setBackground(Color.decode("#D50000"));
    }//GEN-LAST:event_jPanel22MouseMoved

    private void jPanel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseClicked
        int salir = JOptionPane.showConfirmDialog(null, "¿Desea cancelar la actualización de los exámenes realizados en modo offline?\n Tenga presente que la notificación seguirá activa en el menú principal", "Cargue de datos de modo offline", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconShocked);
        if (salir == 0) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jPanel22MouseClicked

    private void jPanel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseExited
jPanel22.setBackground(Color.red);
    }//GEN-LAST:event_jPanel22MouseExited

    private void tablacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablacMouseClicked

        Novedad nove = new Novedad();
        int clic_tabla = 0;
        clic_tabla = tablac.rowAtPoint(evt.getPoint());

        String nombreR = "" + tablac.getValueAt(clic_tabla, 0);
        String tipoidR = "" + tablac.getValueAt(clic_tabla, 1);
        String noidR = "" + tablac.getValueAt(clic_tabla, 2);
        String tipoeR = "" + tablac.getValueAt(clic_tabla, 3);
        String motivoeR = "" + tablac.getValueAt(clic_tabla, 4);
        String estadoR = "" + tablac.getValueAt(clic_tabla, 5);
        String fechacreaR = "" + tablac.getValueAt(clic_tabla, 6);
        if (tipobuscador.equals("creacion")) {
            if (estadoR.equals("Novedad")) {
                int ans = JOptionPane.showConfirmDialog(null, "¡La persona presenta una novedad!\n ¿Desea verla?", "Busqueda de datos examinado", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconQuestion);
                if (ans == 0) {
                    this.setVisible(false);
                    MenuPrincipal.na.add(nove);
                    nove.show();
                    CentrarVentana(nove);
                }
            } else if (estadoR.equals("Completo")) {
                int ans = JOptionPane.showConfirmDialog(null, "¡La persona tiene un examen completo!\n ¿Desea verlo?", "Busqueda de datos examinado", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconQuestion);
                if (ans == 0) {
                    DatoGeneral datosge = new DatoGeneral();
                    DatoPersonal datosper = new DatoPersonal();
//                    int anchoprograma = (na.getWidth() + MenuPrincipal.jDesktopPane1.getWidth()) - MenuPrincipal.jDesktopPane1.getWidth();
//                    int altoprograma = (na.getHeight());
//                    datosge.setSize(anchoprograma, altoprograma);
                    MenuPrincipal.na.add(datosge);
                    datosge.show();

                    DatoGeneral.paratodo.add(datosper);
                    datosper.show();

//                    DatoGeneral.examtype.setText("Ingreso");
                    DatoGeneral.btneditar.setVisible(true);
                    DatoGeneral.btnsave.setVisible(false);
//                                setNombreSoli(respuesta);
//                                setCargoSoli(respuesta2);
//                                DatoPersonal.txtpersonasolicitante.setText(getNombreSoli());
                    MenuPrincipal.jPanel9.setVisible(false);
                    MenuPrincipal.jPanel10.setVisible(false);

//                            DatoPersonal.txtareaaspira.setText(txtareaexaminado.getText());
                    DatoGeneral.jLabel2.setForeground(Color.red);
                    DatoGeneral.fechaizquierda.setVisible(false);
                    DatoGeneral.fechaderecha.setVisible(true);
                    DatoPersonal.cargoactual.setVisible(false);
                    DatoPersonal.txtcargoactual.setVisible(false);
                    DatoPersonal.rtxtcargoactual.setVisible(false);
                    DatoPersonal.areaactual.setVisible(false);
                    DatoPersonal.txtareaactual.setVisible(false);
                    DatoPersonal.rtxtareaactual.setVisible(false);
                    DatoPersonal.cargoaspira.setVisible(true);
                    DatoPersonal.txtcargoaspira.setVisible(true);
                    DatoPersonal.rtxtcargoaspira.setVisible(true);
                    DatoPersonal.areaaspira.setVisible(true);
                    DatoPersonal.txtareaaspira.setVisible(true);
                    DatoPersonal.rtxtareaaspira.setVisible(true);
                    DatoPersonal.personasolicitante.setVisible(true);
                    DatoPersonal.rtxtpersonasolicitante.setVisible(true);

                    DatoGeneral.tituloexamenpre.setVisible(true);

                    try {
                        PreparedStatement sql = Conexion.connection.prepareStatement("SELECT * FROM datos_generales_poli WHERE no_id = " + txtnoidexaminado.getText() + " and t_identificacion = '" + tipoid_creacion + "' ");
                        ResultSet rs = sql.executeQuery();
                        rs.next();
                        DatoPersonal.txtnombre.setText(rs.getString("nombre"));
                        DatoPersonal.cbxtipoiden.setSelectedItem(rs.getString("t_identificacion"));
                        DatoPersonal.txtnoiden.setText(rs.getString("no_id"));
                        DatoPersonal.txtexpedidos.setText(rs.getString("lugar_exp"));
                        DatoPersonal.txtlugarnaci.setText(rs.getString("lugar_naci"));
                        DatoPersonal.fechanaci.setDate(rs.getDate("fecha_naci"));
                        DatoPersonal.txtdireccion.setText(rs.getString("direccion"));
                        DatoPersonal.txtbarrio.setText(rs.getString("barrio"));
                        DatoPersonal.txtlocalidad.setText(rs.getString("localidad"));
                        DatoPersonal.cbxestrato.setSelectedItem(rs.getString("estrato"));
                        DatoPersonal.txtedad.setText(rs.getString("edad"));
                        DatoPersonal.txttelcelu.setText(rs.getString("tel_celular"));
                        DatoPersonal.txttelfijo.setText(rs.getString("tel_fijo"));
                        DatoPersonal.txtemail.setText(rs.getString("email"));
                        DatoPersonal.txtcargoactual.setText(rs.getString("cargoactual"));
                        DatoPersonal.txtareaactual.setText(rs.getString("areaactual"));
                        DatoPersonal.txtcargoaspira.setText(rs.getString("cargoaspira"));
                        DatoPersonal.txtareaaspira.setText(rs.getString("areaaspira"));
                        DatoPersonal.txtpersonasolicitante.setText(rs.getString("solicitador"));
                        String g = rs.getString("genero");
                        if (g.equals("Masculino")) {
                            DatoPersonal.chbxmasculino.setSelected(true);
                        } else if (g.equals("Femenino")) {
                            DatoPersonal.chbxfemenino.setSelected(true);
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error al buscar: " + ex.getMessage());
                    }
                }
            } else if (estadoR.equals("Incompleto")) {
                int ans = JOptionPane.showConfirmDialog(null, "¡La persona tiene un examen incompleto!\n ¿Desea verlo?", "Busqueda de datos examinado", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconQuestion);
                if (ans == 0) {
                    DatoGeneral datosge = new DatoGeneral();
                    DatoPersonal datosper = new DatoPersonal();
//                    int anchoprograma = (na.getWidth() + MenuPrincipal.jDesktopPane1.getWidth()) - MenuPrincipal.jDesktopPane1.getWidth();
//                    int altoprograma = (na.getHeight());
//                    datosge.setSize(anchoprograma, altoprograma);
                    MenuPrincipal.na.add(datosge);
                    datosge.show();

                    DatoGeneral.paratodo.add(datosper);
                    datosper.show();

//                    DatoGeneral.examtype.setText("Ingreso");
                    DatoGeneral.btneditar.setVisible(true);
                    DatoGeneral.btnsave.setVisible(false);
//                                setNombreSoli(respuesta);
//                                setCargoSoli(respuesta2);
//                                DatoPersonal.txtpersonasolicitante.setText(getNombreSoli());
                    MenuPrincipal.jPanel9.setVisible(false);
                    MenuPrincipal.jPanel10.setVisible(false);

//                            DatoPersonal.txtareaaspira.setText(txtareaexaminado.getText());
                    DatoGeneral.jLabel2.setForeground(Color.red);
                    DatoGeneral.fechaizquierda.setVisible(false);
                    DatoGeneral.fechaderecha.setVisible(true);
                    DatoPersonal.cargoactual.setVisible(false);
                    DatoPersonal.txtcargoactual.setVisible(false);
                    DatoPersonal.rtxtcargoactual.setVisible(false);
                    DatoPersonal.areaactual.setVisible(false);
                    DatoPersonal.txtareaactual.setVisible(false);
                    DatoPersonal.rtxtareaactual.setVisible(false);
                    DatoPersonal.cargoaspira.setVisible(true);
                    DatoPersonal.txtcargoaspira.setVisible(true);
                    DatoPersonal.rtxtcargoaspira.setVisible(true);
                    DatoPersonal.areaaspira.setVisible(true);
                    DatoPersonal.txtareaaspira.setVisible(true);
                    DatoPersonal.rtxtareaaspira.setVisible(true);
                    DatoPersonal.personasolicitante.setVisible(true);
                    DatoPersonal.rtxtpersonasolicitante.setVisible(true);

                    DatoGeneral.tituloexamenpre.setVisible(true);

                    try {
                        PreparedStatement sql = Conexion.connection.prepareStatement("SELECT * FROM datos_generales_poli WHERE no_id = " + txtnoidexaminado.getText() + " and t_identificacion = '" + tipoid_creacion + "' ");
                        ResultSet rs = sql.executeQuery();
                        rs.next();
                        DatoPersonal.txtnombre.setText(rs.getString("nombre"));
                        DatoPersonal.cbxtipoiden.setSelectedItem(rs.getString("t_identificacion"));
                        DatoPersonal.txtnoiden.setText(rs.getString("no_id"));
                        DatoPersonal.txtexpedidos.setText(rs.getString("lugar_exp"));
                        DatoPersonal.txtlugarnaci.setText(rs.getString("lugar_naci"));
                        DatoPersonal.fechanaci.setDate(rs.getDate("fecha_naci"));
                        DatoPersonal.txtdireccion.setText(rs.getString("direccion"));
                        DatoPersonal.txtbarrio.setText(rs.getString("barrio"));
                        DatoPersonal.txtlocalidad.setText(rs.getString("localidad"));
                        DatoPersonal.cbxestrato.setSelectedItem(rs.getString("estrato"));
                        DatoPersonal.txtedad.setText(rs.getString("edad"));
                        DatoPersonal.txttelcelu.setText(rs.getString("tel_celular"));
                        DatoPersonal.txttelfijo.setText(rs.getString("tel_fijo"));
                        DatoPersonal.txtemail.setText(rs.getString("email"));
                        DatoPersonal.txtcargoactual.setText(rs.getString("cargoactual"));
                        DatoPersonal.txtareaactual.setText(rs.getString("areaactual"));
                        DatoPersonal.txtcargoaspira.setText(rs.getString("cargoaspira"));
                        DatoPersonal.txtareaaspira.setText(rs.getString("areaaspira"));
                        DatoPersonal.txtpersonasolicitante.setText(rs.getString("solicitador"));
                        
                        
                     
                        String g = rs.getString("genero");
                        if (g.equals("Masculino")) {
                            DatoPersonal.chbxmasculino.setSelected(true);
                        } else if (g.equals("Femenino")) {
                            DatoPersonal.chbxfemenino.setSelected(true);
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error al buscar: " + ex.getMessage());
                    }

                }
            }
        } else if (tipobuscador.equals("consultas")) {
            if (estadoR.equals("Novedad")) {
                int ans = JOptionPane.showConfirmDialog(null, "¡La persona presenta una novedad!\n ¿Desea verla?", "Busqueda de datos examinado", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconQuestion);
                if (ans == 0) {
                    this.setVisible(false);
                    MenuPrincipal.na.add(nove);
                    nove.show();
                    CentrarVentana(nove);
                }
            } else if (estadoR.equals("Completo")) {
                int ans = JOptionPane.showConfirmDialog(null, "¡La persona tiene un examen completo!\n ¿Desea verlo?", "Busqueda de datos examinado", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconQuestion);
                if (ans == 0) {
                    DatoGeneral datosge = new DatoGeneral();
                    DatoPersonal datosper = new DatoPersonal();
//                    int anchoprograma = (na.getWidth() + MenuPrincipal.jDesktopPane1.getWidth()) - MenuPrincipal.jDesktopPane1.getWidth();
//                    int altoprograma = (na.getHeight());
//                    datosge.setSize(anchoprograma, altoprograma);
                    MenuPrincipal.na.add(datosge);
                    datosge.show();

                    DatoGeneral.paratodo.add(datosper);
                    datosper.show();

//                    DatoGeneral.examtype.setText("Ingreso");
                    DatoGeneral.btneditar.setVisible(true);
                    DatoGeneral.btnsave.setVisible(false);
//                                setNombreSoli(respuesta);
//                                setCargoSoli(respuesta2);
//                                DatoPersonal.txtpersonasolicitante.setText(getNombreSoli());
                    MenuPrincipal.jPanel9.setVisible(false);
                    MenuPrincipal.jPanel10.setVisible(false);

//                            DatoPersonal.txtareaaspira.setText(txtareaexaminado.getText());
                    DatoGeneral.jLabel2.setForeground(Color.red);
                    DatoGeneral.fechaizquierda.setVisible(false);
                    DatoGeneral.fechaderecha.setVisible(true);
                    DatoPersonal.cargoactual.setVisible(false);
                    DatoPersonal.txtcargoactual.setVisible(false);
                    DatoPersonal.rtxtcargoactual.setVisible(false);
                    DatoPersonal.areaactual.setVisible(false);
                    DatoPersonal.txtareaactual.setVisible(false);
                    DatoPersonal.rtxtareaactual.setVisible(false);
                    DatoPersonal.cargoaspira.setVisible(true);
                    DatoPersonal.txtcargoaspira.setVisible(true);
                    DatoPersonal.rtxtcargoaspira.setVisible(true);
                    DatoPersonal.areaaspira.setVisible(true);
                    DatoPersonal.txtareaaspira.setVisible(true);
                    DatoPersonal.rtxtareaaspira.setVisible(true);
                    DatoPersonal.personasolicitante.setVisible(true);
                    DatoPersonal.rtxtpersonasolicitante.setVisible(true);

                    DatoGeneral.tituloexamenpre.setVisible(true);

                    try {
                        PreparedStatement sql = Conexion.connection.prepareStatement("SELECT * FROM datos_generales_poli WHERE no_id = " + noidR + " AND t_identificacion = '" + tipoidR + "' AND tipoexamen = '" + tipoeR + "' AND motivoexamen = '" + motivoeR + "' AND estadoexamen  = '" + estadoR + "' AND fechacreacion = '" + fechacreaR + "'");
                        ResultSet rs = sql.executeQuery();
                        rs.next();
                        DatoPersonal.txtnombre.setText(rs.getString("nombre"));
                        DatoPersonal.cbxtipoiden.setSelectedItem(rs.getString("t_identificacion"));
                        DatoPersonal.txtnoiden.setText(rs.getString("no_id"));
                        DatoPersonal.txtexpedidos.setText(rs.getString("lugar_exp"));
                        DatoPersonal.txtlugarnaci.setText(rs.getString("lugar_naci"));
                        DatoPersonal.fechanaci.setDate(rs.getDate("fecha_naci"));
                        DatoPersonal.txtdireccion.setText(rs.getString("direccion"));
                        DatoPersonal.txtbarrio.setText(rs.getString("barrio"));
                        DatoPersonal.txtlocalidad.setText(rs.getString("localidad"));
                        DatoPersonal.cbxestrato.setSelectedItem(rs.getString("estrato"));
                        DatoPersonal.txtedad.setText(rs.getString("edad"));
                        DatoPersonal.txttelcelu.setText(rs.getString("tel_celular"));
                        DatoPersonal.txttelfijo.setText(rs.getString("tel_fijo"));
                        DatoPersonal.txtemail.setText(rs.getString("email"));
                        DatoPersonal.txtcargoactual.setText(rs.getString("cargoactual"));
                        DatoPersonal.txtareaactual.setText(rs.getString("areaactual"));
                        DatoPersonal.txtcargoaspira.setText(rs.getString("cargoaspira"));
                        DatoPersonal.txtareaaspira.setText(rs.getString("areaaspira"));
                        DatoPersonal.txtpersonasolicitante.setText(rs.getString("solicitador"));
                        String g = rs.getString("genero");
                        if (g.equals("Masculino")) {
                            DatoPersonal.chbxmasculino.setSelected(true);
                        } else if (g.equals("Femenino")) {
                            DatoPersonal.chbxfemenino.setSelected(true);
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error al buscar: " + ex.getMessage());
                    }
                }
                JOptionPane.showMessageDialog(this, "Es un examen completo");
            } else if (estadoR.equals("Incompleto")) {
                int ans = JOptionPane.showConfirmDialog(null, "¡La persona tiene un examen incompleto!\n ¿Desea verlo?", "Busqueda de datos examinado", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconQuestion);
                if (ans == 0) {
                    DatoGeneral datosge = new DatoGeneral();
                    DatoPersonal datosper = new DatoPersonal();
//                    int anchoprograma = (na.getWidth() + MenuPrincipal.jDesktopPane1.getWidth()) - MenuPrincipal.jDesktopPane1.getWidth();
//                    int altoprograma = (na.getHeight());
//                    datosge.setSize(anchoprograma, altoprograma);
                    MenuPrincipal.na.add(datosge);
                    datosge.show();

                    DatoGeneral.paratodo.add(datosper);
                    datosper.show();

//                    DatoGeneral.examtype.setText("Ingreso");
                    DatoGeneral.btneditar.setVisible(true);
                    DatoGeneral.btnsave.setVisible(false);
//                                setNombreSoli(respuesta);
//                                setCargoSoli(respuesta2);
//                                DatoPersonal.txtpersonasolicitante.setText(getNombreSoli());
                    MenuPrincipal.jPanel9.setVisible(false);
                    MenuPrincipal.jPanel10.setVisible(false);

//                            DatoPersonal.txtareaaspira.setText(txtareaexaminado.getText());
                    DatoGeneral.jLabel2.setForeground(Color.red);
                    DatoGeneral.fechaizquierda.setVisible(false);
                    DatoGeneral.fechaderecha.setVisible(true);
                    DatoPersonal.cargoactual.setVisible(false);
                    DatoPersonal.txtcargoactual.setVisible(false);
                    DatoPersonal.rtxtcargoactual.setVisible(false);
                    DatoPersonal.areaactual.setVisible(false);
                    DatoPersonal.txtareaactual.setVisible(false);
                    DatoPersonal.rtxtareaactual.setVisible(false);
                    DatoPersonal.cargoaspira.setVisible(true);
                    DatoPersonal.txtcargoaspira.setVisible(true);
                    DatoPersonal.rtxtcargoaspira.setVisible(true);
                    DatoPersonal.areaaspira.setVisible(true);
                    DatoPersonal.txtareaaspira.setVisible(true);
                    DatoPersonal.rtxtareaaspira.setVisible(true);
                    DatoPersonal.personasolicitante.setVisible(true);
                    DatoPersonal.rtxtpersonasolicitante.setVisible(true);

                    DatoGeneral.tituloexamenpre.setVisible(true);

                    try {
                        PreparedStatement sql = Conexion.connection.prepareStatement("SELECT * FROM datos_generales_poli WHERE no_id = " + noidR + " AND t_identificacion = '" + tipoidR + "' AND tipoexamen = '" + tipoeR + "' AND motivoexamen = '" + motivoeR + "' AND estadoexamen  = '" + estadoR + "' AND fechacreacion = '" + fechacreaR + "'");
                        ResultSet rs = sql.executeQuery();
                        rs.next();
                        DatoPersonal.txtnombre.setText(rs.getString("nombre"));
                        DatoPersonal.cbxtipoiden.setSelectedItem(rs.getString("t_identificacion"));
                        DatoPersonal.txtnoiden.setText(rs.getString("no_id"));
                        DatoPersonal.txtexpedidos.setText(rs.getString("lugar_exp"));
                        DatoPersonal.txtlugarnaci.setText(rs.getString("lugar_naci"));
                        DatoPersonal.fechanaci.setDate(rs.getDate("fecha_naci"));
                        DatoPersonal.txtdireccion.setText(rs.getString("direccion"));
                        DatoPersonal.txtbarrio.setText(rs.getString("barrio"));
                        DatoPersonal.txtlocalidad.setText(rs.getString("localidad"));
                        DatoPersonal.cbxestrato.setSelectedItem(rs.getString("estrato"));
                        DatoPersonal.txtedad.setText(rs.getString("edad"));
                        DatoPersonal.txttelcelu.setText(rs.getString("tel_celular"));
                        DatoPersonal.txttelfijo.setText(rs.getString("tel_fijo"));
                        DatoPersonal.txtemail.setText(rs.getString("email"));
                        DatoPersonal.txtcargoactual.setText(rs.getString("cargoactual"));
                        DatoPersonal.txtareaactual.setText(rs.getString("areaactual"));
                        DatoPersonal.txtcargoaspira.setText(rs.getString("cargoaspira"));
                        DatoPersonal.txtareaaspira.setText(rs.getString("areaaspira"));
                        DatoPersonal.txtpersonasolicitante.setText(rs.getString("solicitador"));
                        String g = rs.getString("genero");
                        if (g.equals("Masculino")) {
                            DatoPersonal.chbxmasculino.setSelected(true);
                        } else if (g.equals("Femenino")) {
                            DatoPersonal.chbxfemenino.setSelected(true);
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error al buscar: " + ex.getMessage());
                    }

                }
            }
        }

//        txtCodigo.setText(String.valueOf(codigo));
//        txtNombre.setText(nombre);
//        txtPrecio.setText(String.valueOf(precio));
//        txtDescripcion.setText(String.valueOf(descripcion));
//        try {
//            JLabel lbl = (JLabel) tabla.getValueAt(clic_tabla, 4);
//            lblFoto.setIcon(lbl.getIcon());
//        } catch (Exception ex) {
//        }
    }//GEN-LAST:event_tablacMouseClicked

    private void jLabel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseMoved
      jPanel22.setBackground(Color.decode("#D50000"));
    }//GEN-LAST:event_jLabel2MouseMoved

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
       jPanel22.setBackground(Color.red);
    }//GEN-LAST:event_jLabel2MouseExited

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
            java.util.logging.Logger.getLogger(Buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablac;
    private javax.swing.JLabel tituloexamenpre;
    // End of variables declaration//GEN-END:variables
}
