package view;

import icons.Shocked;
import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sininternet.Datos;
import sininternet.Proceso;
import static view.DatoPersonal.cbxtipoiden;
import static view.DatoPersonal.txtnoiden;
import static view.DatoPersonal.txtnombre;

/**
 *
 * @author Kevin Casas
 */
public class Desconectado extends javax.swing.JFrame {

    Icon M = new ImageIcon(getClass().getResource("/images/pluma.png"));
    Image icon = new ImageIcon(getClass().getResource("/images/pluma.png")).getImage();

    public Desconectado() {
        initComponents();
        this.setIconImage(icon);
        this.setLocationRelativeTo(null);
        rp = new Proceso();

        try {
            cargar_txt();
            listarRegistro();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "¡Error! No existe el archivo txt");
        }
    }

    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    java.util.Date fecha = new java.util.Date();
    public String fechanow = date.format(fecha);

    Shocked iconShocked = new Shocked();

    private String directorio = System.getProperty("user.dir");

    private String ruta_txt = directorio + "\\registro\\registroDatosGenerales.txt";

    Datos p;
    Proceso rp;

    int clic_tabla;

    public void cargar_txt() {
        File ruta = new File(ruta_txt);
        try {

            String lineap = null;
            FileReader fip = new FileReader(ruta);

            BufferedReader bup = new BufferedReader(fip);
            if ((lineap = bup.readLine()) == null) {
                Datos.setHayNotificacion("nohay");
            } else {
                Datos.setHayNotificacion("hay");
                FileReader fi = new FileReader(ruta);
                BufferedReader bu = new BufferedReader(fi);
                String linea = null;
                while ((linea = bu.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    p = new Datos();
                    p.setNombre(st.nextToken());
                    p.setTipoid(st.nextToken());
                    p.setNoid(st.nextToken());
                    p.setTipoexamen(st.nextToken());
                    p.setMotivoexamen(st.nextToken());
                    p.setEstadoexamen(st.nextToken());
                    p.setFechaexamen(st.nextToken());
                    rp.agregarRegistro(p);

                }
                bu.close();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "¡Error al cargar el archivo!");
            System.out.println(ex.getMessage());
        }
    }

    public void grabar_txt() {
        FileWriter fw;
        PrintWriter pw;
        try {
            fw = new FileWriter(ruta_txt);
            pw = new PrintWriter(fw);

            for (int i = 0; i < rp.cantidadRegistro(); i++) {
                p = rp.obtenerRegistro(i);
                pw.println(String.valueOf(p.getNombre() + ", " + p.getTipoid() + ", " + p.getNoid() + ", " + p.getTipoexamen() + ", " + p.getMotivoexamen() + ", " + p.getEstadoexamen() + ", " + p.getFechaexamen()));
            }
            pw.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "¡Error al grabar el archivo!");
            System.out.println(ex.getMessage());
        }
    }

    public void ingresarRegistro(File ruta) {
        try {

            p = new Datos(leerNombre(), leerTipoId(), leerNoId(), leerTipoExamen(), leerMotivoExamen(), leerEstadoExamen(), fechanow);
            rp.agregarRegistro(p);

            grabar_txt();
            listarRegistro();
//                lt.limpiar_texto(panel); 

        } catch (Exception ex) {
//            mensaje(ex.getMessage());
        }
    }

    public void modificarRegistro(File ruta) {
        try {

//                int codigo = rp.buscaCodigo(leerCodigo());
            p = new Datos(leerNombre(), leerTipoId(), leerNoId(), leerTipoExamen(), leerMotivoExamen(), leerEstadoExamen(), fechanow);

//                if(codigo == -1)rp.agregarRegistro(p);
            rp.modificarRegistro(Integer.parseInt(txtnoiden.getText()), p);

            grabar_txt();
            listarRegistro();
//                lt.limpiar_texto(panel);

        } catch (Exception ex) {
//            mensaje(ex.getMessage());
        }
    }

    public void eliminarRegistro() {
        try {

//                int codigo = rp.buscaCodigo(txtnoiden.getText());
            int s = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar este producto", "Si/No", 0);
            if (s == 0) {
//                        rp.eliminarRegistro(codigo);

                grabar_txt();
                listarRegistro();
//                        lt.limpiar_texto(panel);
            }

        } catch (Exception ex) {
//            mensaje(ex.getMessage());
        }
    }

    public void listarRegistro() {
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        dt.addColumn("Nombre");
        dt.addColumn("Tipo Id");
        dt.addColumn("N° Id");
        dt.addColumn("Tipo examen");
        dt.addColumn("Motivo examen");
        dt.addColumn("Estado examen");
        dt.addColumn("Fecha creación");

        System.out.println("pasa por acá");

//        tablac.setDefaultRenderer(Object.class, new imgTabla);
        Object fila[] = new Object[dt.getColumnCount()];
        for (int i = 0; i < rp.cantidadRegistro(); i++) {
            System.out.println("si entró");
            p = rp.obtenerRegistro(i);
            fila[0] = p.getNombre();
            fila[1] = p.getTipoid();
            fila[2] = p.getNoid();
            fila[3] = p.getTipoexamen();
            fila[4] = p.getMotivoexamen();
            fila[5] = p.getEstadoexamen();
            fila[6] = p.getFechaexamen();
            dt.addRow(fila);
            System.out.println("se supone ya añadió");
        }
        tablac.setModel(dt);
        tablac.setRowHeight(60);
    }

    public String leerNoId() {
        try {
            String noid = txtnoiden.getText().trim();
            return noid;
        } catch (Exception ex) {
            return null;
        }
    }

    public String leerNombre() {
        try {
            String nombre = txtnombre.getText().trim();
//                    .replace(" ", "_");
            return nombre;
        } catch (Exception ex) {
            return null;
        }
    }

    public String leerTipoId() {
        try {
            String nombre = cbxtipoiden.getSelectedItem().toString().trim();
//                    .replace(" ", "_");
            return nombre;
        } catch (Exception ex) {
            return null;
        }
    }

    public String leerTipoExamen() {
        try {
            String nombre = "Pre-empleo".trim();
//                    .replace(" ", "_");
            return nombre;
        } catch (Exception ex) {
            return null;
        }
    }

    public String leerMotivoExamen() {
        try {
            String motivoexamen = "Pre".trim();
//                    .replace(" ", "_");
            return motivoexamen;
        } catch (Exception ex) {
            return null;
        }
    }

    public String leerEstadoExamen() {
        try {
            String estadoexamen = "Incompleto".trim();
//                    .replace(" ", "_");
            return estadoexamen;
        } catch (Exception ex) {
            return null;
        }
    }

    public String leerFechaExamen() {
        try {
            String fechaexamen = fechanow.trim();
//                    .replace(" ", "_");
            return fechaexamen;
        } catch (Exception ex) {
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloexamenpre = new javax.swing.JLabel();
        btnsave = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablac = new javax.swing.JTable();

        setTitle("Datos de examen realizado sin conexión al servidor");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tituloexamenpre.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        tituloexamenpre.setText("Datos examen sin conexión");

        btnsave.setBackground(new java.awt.Color(89, 172, 63));
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setToolTipText("Guardar y finalizar");
        btnsave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsave.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnsaveMouseMoved(evt);
            }
        });
        btnsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsaveMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsaveMouseExited(evt);
            }
        });

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jLabel51.setToolTipText("Guardar y finalizar");
        jLabel51.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel51MouseMoved(evt);
            }
        });
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel51MouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cargar datos al servidor");

        javax.swing.GroupLayout btnsaveLayout = new javax.swing.GroupLayout(btnsave);
        btnsave.setLayout(btnsaveLayout);
        btnsaveLayout.setHorizontalGroup(
            btnsaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnsaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51)
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnsaveLayout.setVerticalGroup(
            btnsaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnsaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnsaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel3.setText("A continuación el listado de personas que fueron entrevistadas sin conexión al servidor:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel4.setText("Si desea ver el examen completo, seleccione la persona y acepte el solicitud. De lo contrario, si desea");

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel5.setText("cargar la información directamente al servidor, seleccione el botón de la parte inferior izquierda.");

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 2, 12)); // NOI18N
        jLabel6.setText("NOTA: Una vez la información sea cargada al servidor, se borrará del almacenamiento local.");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tituloexamenpre)
                        .addGap(238, 238, 238))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(438, 438, 438)
                                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1))
                        .addGap(33, 33, 33))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tituloexamenpre)
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addContainerGap())
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel51MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseMoved
        btnsave.setBackground(Color.decode("#1B5E20"));
    }//GEN-LAST:event_jLabel51MouseMoved

    private void jLabel51MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseExited
        btnsave.setBackground(Color.decode("#59AC3F"));
    }//GEN-LAST:event_jLabel51MouseExited

    private void btnsaveMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseMoved
        btnsave.setBackground(Color.decode("#1B5E20"));
    }//GEN-LAST:event_btnsaveMouseMoved

    private void btnsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseClicked

    }//GEN-LAST:event_btnsaveMouseClicked

    private void btnsaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseExited
        btnsave.setBackground(Color.decode("#59AC3F"));
    }//GEN-LAST:event_btnsaveMouseExited

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

//        Novedad nove = new Novedad();
//        int clic_tabla = 0;
//        clic_tabla = tablac.rowAtPoint(evt.getPoint());
//
//        String nombreR = "" + tablac.getValueAt(clic_tabla, 0);
//        String tipoidR = "" + tablac.getValueAt(clic_tabla, 1);
//        String noidR = "" + tablac.getValueAt(clic_tabla, 2);
//        String tipoeR = "" + tablac.getValueAt(clic_tabla, 3);
//        String motivoeR = "" + tablac.getValueAt(clic_tabla, 4);
//        String estadoR = "" + tablac.getValueAt(clic_tabla, 5);
//        String fechacreaR = "" + tablac.getValueAt(clic_tabla, 6);
//        if (tipobuscador.equals("creacion")) {
//            if (estadoR.equals("Novedad")) {
//                int ans = JOptionPane.showConfirmDialog(null, "¡La persona presenta una novedad!\n ¿Desea verla?", "Busqueda de datos examinado", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconQuestion);
//                if (ans == 0) {
//                    this.setVisible(false);
//                    MenuPrincipal.na.add(nove);
//                    nove.show();
//                    CentrarVentana(nove);
//                }
//            } else if (estadoR.equals("Completo")) {
//                int ans = JOptionPane.showConfirmDialog(null, "¡La persona tiene un examen completo!\n ¿Desea verlo?", "Busqueda de datos examinado", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconQuestion);
//                if (ans == 0) {
//                    DatoGeneral datosge = new DatoGeneral();
//                    DatoPersonal datosper = new DatoPersonal();
//                    int anchoprograma = (na.getWidth() + MenuPrincipal.jDesktopPane1.getWidth()) - MenuPrincipal.jDesktopPane1.getWidth();
//                    int altoprograma = (na.getHeight());
//                    datosge.setSize(anchoprograma, altoprograma);
//                    MenuPrincipal.na.add(datosge);
//                    datosge.show();
//
//                    DatoGeneral.paratodo.add(datosper);
//                    datosper.show();
//
//                    DatoGeneral.examtype.setText("Ingreso");
//                    DatoGeneral.btneditar.setVisible(true);
//                    DatoGeneral.btnsave.setVisible(false);
//                    DatoGeneral.setBtnsave("noesvisible");
//                    //                                setNombreSoli(respuesta);
//                    //                                setCargoSoli(respuesta2);
//                    //                                DatoPersonal.txtpersonasolicitante.setText(getNombreSoli());
//                    MenuPrincipal.jPanel9.setVisible(false);
//                    MenuPrincipal.jPanel10.setVisible(false);
//
//                    //                            DatoPersonal.txtareaaspira.setText(txtareaexaminado.getText());
//                    DatoGeneral.jLabel2.setForeground(Color.red);
//                    DatoGeneral.fechaizquierda.setVisible(false);
//                    DatoGeneral.fechaderecha.setVisible(true);
//                    DatoPersonal.cargoactual.setVisible(false);
//                    DatoPersonal.txtcargoactual.setVisible(false);
//                    DatoPersonal.rtxtcargoactual.setVisible(false);
//                    DatoPersonal.areaactual.setVisible(false);
//                    DatoPersonal.txtareaactual.setVisible(false);
//                    DatoPersonal.rtxtareaactual.setVisible(false);
//                    DatoPersonal.cargoaspira.setVisible(true);
//                    DatoPersonal.txtcargoaspira.setVisible(true);
//                    DatoPersonal.rtxtcargoaspira.setVisible(true);
//                    DatoPersonal.areaaspira.setVisible(true);
//                    DatoPersonal.txtareaaspira.setVisible(true);
//                    DatoPersonal.rtxtareaaspira.setVisible(true);
//                    DatoPersonal.personasolicitante.setVisible(true);
//                    DatoPersonal.rtxtpersonasolicitante.setVisible(true);
//
//                    DatoGeneral.tituloexamenpre.setVisible(true);
//                    DatoGeneral.tituloexamenespe.setVisible(false);
//                    DatoGeneral.tituloexamenru.setVisible(false);
//                    DatoGeneral.tituloexamenruadmi.setVisible(false);
//                    DatoGeneral.tituloexamenruope.setVisible(false);
//                    DatoGeneral.tituloblanco.setVisible(false);
//                    DatoGeneral.btnpre_empleo.setVisible(false);
//                    DatoGeneral.btnrutina.setVisible(false);
//                    DatoGeneral.btnespeci.setVisible(false);
//                    DatoGeneral.btnoperaciones.setVisible(false);
//                    DatoGeneral.btnadmitivos.setVisible(false);
//                    try {
//                        PreparedStatement sql = Conexion.connection.prepareStatement("SELECT * FROM datos_generales_poli WHERE no_id = " + txtnoidexaminado.getText() + " and t_identificacion = '" + tipoid_creacion + "' ");
//                        ResultSet rs = sql.executeQuery();
//                        rs.next();
//                        DatoPersonal.txtnombre.setText(rs.getString("nombre"));
//                        DatoPersonal.cbxtipoiden.setSelectedItem(rs.getString("t_identificacion"));
//                        DatoPersonal.txtnoiden.setText(rs.getString("no_id"));
//                        DatoPersonal.txtexpedidos.setText(rs.getString("lugar_exp"));
//                        DatoPersonal.txtlugarnaci.setText(rs.getString("lugar_naci"));
//                        DatoPersonal.fechanaci.setDate(rs.getDate("fecha_naci"));
//                        DatoPersonal.txtdireccion.setText(rs.getString("direccion"));
//                        DatoPersonal.txtbarrio.setText(rs.getString("barrio"));
//                        DatoPersonal.txtlocalidad.setText(rs.getString("localidad"));
//                        DatoPersonal.spinestrato.setValue(rs.getString("estrato"));
//                        DatoPersonal.txtedad.setText(rs.getString("edad"));
//                        DatoPersonal.txttelcelu.setText(rs.getString("tel_celular"));
//                        DatoPersonal.txttelfijo.setText(rs.getString("tel_fijo"));
//                        DatoPersonal.txtemail.setText(rs.getString("email"));
//                        DatoPersonal.txtcargoactual.setText(rs.getString("cargoactual"));
//                        DatoPersonal.txtareaactual.setText(rs.getString("areaactual"));
//                        DatoPersonal.txtcargoaspira.setText(rs.getString("cargoaspira"));
//                        DatoPersonal.txtareaaspira.setText(rs.getString("areaaspira"));
//                        DatoPersonal.txtpersonasolicitante.setText(rs.getString("solicitador"));
//                        String g = rs.getString("genero");
//                        if (g.equals("Masculino")){
//                            DatoPersonal.chbxmasculino.setSelected(true);
//                        } else if (g.equals("Femenino")){
//                            DatoPersonal.chbxfemenino.setSelected(true);
//                        }
//                    } catch (SQLException ex) {
//                        JOptionPane.showMessageDialog(null, "Error al buscar: " + ex.getMessage());
//                    }
//                }
//            } else if (estadoR.equals("Incompleto")) {
//                int ans = JOptionPane.showConfirmDialog(null, "¡La persona tiene un examen incompleto!\n ¿Desea verlo?", "Busqueda de datos examinado", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconQuestion);
//                if (ans == 0) {
//                    DatoGeneral datosge = new DatoGeneral();
//                    DatoPersonal datosper = new DatoPersonal();
//                    int anchoprograma = (na.getWidth() + MenuPrincipal.jDesktopPane1.getWidth()) - MenuPrincipal.jDesktopPane1.getWidth();
//                    int altoprograma = (na.getHeight());
//                    datosge.setSize(anchoprograma, altoprograma);
//                    MenuPrincipal.na.add(datosge);
//                    datosge.show();
//
//                    DatoGeneral.paratodo.add(datosper);
//                    datosper.show();
//
//                    DatoGeneral.examtype.setText("Ingreso");
//                    DatoGeneral.btneditar.setVisible(true);
//                    DatoGeneral.btnsave.setVisible(false);
//                    DatoGeneral.setBtnsave("noesvisible");
//                    //                                setNombreSoli(respuesta);
//                    //                                setCargoSoli(respuesta2);
//                    //                                DatoPersonal.txtpersonasolicitante.setText(getNombreSoli());
//                    MenuPrincipal.jPanel9.setVisible(false);
//                    MenuPrincipal.jPanel10.setVisible(false);
//
//                    //                            DatoPersonal.txtareaaspira.setText(txtareaexaminado.getText());
//                    DatoGeneral.jLabel2.setForeground(Color.red);
//                    DatoGeneral.fechaizquierda.setVisible(false);
//                    DatoGeneral.fechaderecha.setVisible(true);
//                    DatoPersonal.cargoactual.setVisible(false);
//                    DatoPersonal.txtcargoactual.setVisible(false);
//                    DatoPersonal.rtxtcargoactual.setVisible(false);
//                    DatoPersonal.areaactual.setVisible(false);
//                    DatoPersonal.txtareaactual.setVisible(false);
//                    DatoPersonal.rtxtareaactual.setVisible(false);
//                    DatoPersonal.cargoaspira.setVisible(true);
//                    DatoPersonal.txtcargoaspira.setVisible(true);
//                    DatoPersonal.rtxtcargoaspira.setVisible(true);
//                    DatoPersonal.areaaspira.setVisible(true);
//                    DatoPersonal.txtareaaspira.setVisible(true);
//                    DatoPersonal.rtxtareaaspira.setVisible(true);
//                    DatoPersonal.personasolicitante.setVisible(true);
//                    DatoPersonal.rtxtpersonasolicitante.setVisible(true);
//
//                    DatoGeneral.tituloexamenpre.setVisible(true);
//                    DatoGeneral.tituloexamenespe.setVisible(false);
//                    DatoGeneral.tituloexamenru.setVisible(false);
//                    DatoGeneral.tituloexamenruadmi.setVisible(false);
//                    DatoGeneral.tituloexamenruope.setVisible(false);
//                    DatoGeneral.tituloblanco.setVisible(false);
//                    DatoGeneral.btnpre_empleo.setVisible(false);
//                    DatoGeneral.btnrutina.setVisible(false);
//                    DatoGeneral.btnespeci.setVisible(false);
//                    DatoGeneral.btnoperaciones.setVisible(false);
//                    DatoGeneral.btnadmitivos.setVisible(false);
//                    try {
//                        PreparedStatement sql = Conexion.connection.prepareStatement("SELECT * FROM datos_generales_poli WHERE no_id = " + txtnoidexaminado.getText() + " and t_identificacion = '" + tipoid_creacion + "' ");
//                        ResultSet rs = sql.executeQuery();
//                        rs.next();
//                        DatoPersonal.txtnombre.setText(rs.getString("nombre"));
//                    } catch (SQLException ex) {
//                        JOptionPane.showMessageDialog(null, "Error al buscar: " + ex.getMessage());
//                    }
//
//                }
//            }
//        } else if (tipobuscador.equals("consultas")) {
//            if (estadoR.equals("Novedad")) {
//                int ans = JOptionPane.showConfirmDialog(null, "¡La persona presenta una novedad!\n ¿Desea verla?", "Busqueda de datos examinado", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconQuestion);
//                if (ans == 0) {
//                    this.setVisible(false);
//                    MenuPrincipal.na.add(nove);
//                    nove.show();
//                    CentrarVentana(nove);
//                }
//            } else if (estadoR.equals("Completo")) {
//                int ans = JOptionPane.showConfirmDialog(null, "¡La persona tiene un examen completo!\n ¿Desea verlo?", "Busqueda de datos examinado", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconQuestion);
//                if (ans == 0) {
//                    DatoGeneral datosge = new DatoGeneral();
//                    DatoPersonal datosper = new DatoPersonal();
//                    int anchoprograma = (na.getWidth() + MenuPrincipal.jDesktopPane1.getWidth()) - MenuPrincipal.jDesktopPane1.getWidth();
//                    int altoprograma = (na.getHeight());
//                    datosge.setSize(anchoprograma, altoprograma);
//                    MenuPrincipal.na.add(datosge);
//                    datosge.show();
//
//                    DatoGeneral.paratodo.add(datosper);
//                    datosper.show();
//
//                    DatoGeneral.examtype.setText("Ingreso");
//                    DatoGeneral.btneditar.setVisible(true);
//                    DatoGeneral.btnsave.setVisible(false);
//                    DatoGeneral.setBtnsave("noesvisible");
//                    //                                setNombreSoli(respuesta);
//                    //                                setCargoSoli(respuesta2);
//                    //                                DatoPersonal.txtpersonasolicitante.setText(getNombreSoli());
//                    MenuPrincipal.jPanel9.setVisible(false);
//                    MenuPrincipal.jPanel10.setVisible(false);
//
//                    //                            DatoPersonal.txtareaaspira.setText(txtareaexaminado.getText());
//                    DatoGeneral.jLabel2.setForeground(Color.red);
//                    DatoGeneral.fechaizquierda.setVisible(false);
//                    DatoGeneral.fechaderecha.setVisible(true);
//                    DatoPersonal.cargoactual.setVisible(false);
//                    DatoPersonal.txtcargoactual.setVisible(false);
//                    DatoPersonal.rtxtcargoactual.setVisible(false);
//                    DatoPersonal.areaactual.setVisible(false);
//                    DatoPersonal.txtareaactual.setVisible(false);
//                    DatoPersonal.rtxtareaactual.setVisible(false);
//                    DatoPersonal.cargoaspira.setVisible(true);
//                    DatoPersonal.txtcargoaspira.setVisible(true);
//                    DatoPersonal.rtxtcargoaspira.setVisible(true);
//                    DatoPersonal.areaaspira.setVisible(true);
//                    DatoPersonal.txtareaaspira.setVisible(true);
//                    DatoPersonal.rtxtareaaspira.setVisible(true);
//                    DatoPersonal.personasolicitante.setVisible(true);
//                    DatoPersonal.rtxtpersonasolicitante.setVisible(true);
//
//                    DatoGeneral.tituloexamenpre.setVisible(true);
//                    DatoGeneral.tituloexamenespe.setVisible(false);
//                    DatoGeneral.tituloexamenru.setVisible(false);
//                    DatoGeneral.tituloexamenruadmi.setVisible(false);
//                    DatoGeneral.tituloexamenruope.setVisible(false);
//                    DatoGeneral.tituloblanco.setVisible(false);
//                    DatoGeneral.btnpre_empleo.setVisible(false);
//                    DatoGeneral.btnrutina.setVisible(false);
//                    DatoGeneral.btnespeci.setVisible(false);
//                    DatoGeneral.btnoperaciones.setVisible(false);
//                    DatoGeneral.btnadmitivos.setVisible(false);
//                    try {
//                        PreparedStatement sql = Conexion.connection.prepareStatement("SELECT * FROM datos_generales_poli WHERE no_id = " + txtnumiden.getText());
//                        ResultSet rs = sql.executeQuery();
//                        rs.next();
//                        DatoPersonal.txtnombre.setText(rs.getString("nombre"));
//                    } catch (SQLException ex) {
//                        JOptionPane.showMessageDialog(null, "Error al buscar: " + ex.getMessage());
//                    }
//                }
//                JOptionPane.showMessageDialog(this, "Es un examen completo");
//            } else if (estadoR.equals("Incompleto")) {
//                int ans = JOptionPane.showConfirmDialog(null, "¡La persona tiene un examen incompleto!\n ¿Desea verlo?", "Busqueda de datos examinado", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconQuestion);
//                if (ans == 0) {
//                    DatoGeneral datosge = new DatoGeneral();
//                    DatoPersonal datosper = new DatoPersonal();
//                    int anchoprograma = (na.getWidth() + MenuPrincipal.jDesktopPane1.getWidth()) - MenuPrincipal.jDesktopPane1.getWidth();
//                    int altoprograma = (na.getHeight());
//                    datosge.setSize(anchoprograma, altoprograma);
//                    MenuPrincipal.na.add(datosge);
//                    datosge.show();
//
//                    DatoGeneral.paratodo.add(datosper);
//                    datosper.show();
//
//                    DatoGeneral.examtype.setText("Ingreso");
//                    DatoGeneral.btneditar.setVisible(true);
//                    DatoGeneral.btnsave.setVisible(false);
//                    DatoGeneral.setBtnsave("noesvisible");
//                    //                                setNombreSoli(respuesta);
//                    //                                setCargoSoli(respuesta2);
//                    //                                DatoPersonal.txtpersonasolicitante.setText(getNombreSoli());
//                    MenuPrincipal.jPanel9.setVisible(false);
//                    MenuPrincipal.jPanel10.setVisible(false);
//
//                    //                            DatoPersonal.txtareaaspira.setText(txtareaexaminado.getText());
//                    DatoGeneral.jLabel2.setForeground(Color.red);
//                    DatoGeneral.fechaizquierda.setVisible(false);
//                    DatoGeneral.fechaderecha.setVisible(true);
//                    DatoPersonal.cargoactual.setVisible(false);
//                    DatoPersonal.txtcargoactual.setVisible(false);
//                    DatoPersonal.rtxtcargoactual.setVisible(false);
//                    DatoPersonal.areaactual.setVisible(false);
//                    DatoPersonal.txtareaactual.setVisible(false);
//                    DatoPersonal.rtxtareaactual.setVisible(false);
//                    DatoPersonal.cargoaspira.setVisible(true);
//                    DatoPersonal.txtcargoaspira.setVisible(true);
//                    DatoPersonal.rtxtcargoaspira.setVisible(true);
//                    DatoPersonal.areaaspira.setVisible(true);
//                    DatoPersonal.txtareaaspira.setVisible(true);
//                    DatoPersonal.rtxtareaaspira.setVisible(true);
//                    DatoPersonal.personasolicitante.setVisible(true);
//                    DatoPersonal.rtxtpersonasolicitante.setVisible(true);
//
//                    DatoGeneral.tituloexamenpre.setVisible(true);
//                    DatoGeneral.tituloexamenespe.setVisible(false);
//                    DatoGeneral.tituloexamenru.setVisible(false);
//                    DatoGeneral.tituloexamenruadmi.setVisible(false);
//                    DatoGeneral.tituloexamenruope.setVisible(false);
//                    DatoGeneral.tituloblanco.setVisible(false);
//                    DatoGeneral.btnpre_empleo.setVisible(false);
//                    DatoGeneral.btnrutina.setVisible(false);
//                    DatoGeneral.btnespeci.setVisible(false);
//                    DatoGeneral.btnoperaciones.setVisible(false);
//                    DatoGeneral.btnadmitivos.setVisible(false);
//                    try {
//                        PreparedStatement sql = Conexion.connection.prepareStatement("SELECT * FROM datos_generales_poli WHERE no_id = " + txtnumiden.getText());
//                        ResultSet rs = sql.executeQuery();
//                        rs.next();
//                        DatoPersonal.txtnombre.setText(rs.getString("nombre"));
//                    } catch (SQLException ex) {
//                        JOptionPane.showMessageDialog(null, "Error al buscar: " + ex.getMessage());
//                    }
//
//                }
//                JOptionPane.showMessageDialog(this, "Es un examen incompleto :|");
//            }
//        }
        //ñaña
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
            java.util.logging.Logger.getLogger(Desconectado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Desconectado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Desconectado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Desconectado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Desconectado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablac;
    private javax.swing.JLabel tituloexamenpre;
    // End of variables declaration//GEN-END:variables
}
