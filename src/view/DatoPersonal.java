package view;

import classes.Admisiones;
import classes.DatosPersonales;
import classes.DatosPrincipales;
import icons.Thinking_uh;
import java.awt.Color;
import java.awt.Image;
import static java.awt.event.ActionEvent.CTRL_MASK;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.InputMap;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Kevin Casas
 */
public class DatoPersonal extends javax.swing.JInternalFrame {

    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

    public DatoPersonal() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        initComponents();
        guiasdatos_per();
        txtfamiliape1.setVisible(false);
        jLabel36.setVisible(false);
    }

    String laedad = "";
    String ruta = "";
    String ruta2 = "";

    public static byte[] icono;
    public static byte[] imagenpu;

    public void guiasdatos_per() {
        CorrectorOrtografia p = new CorrectorOrtografia("Dirección/Apt/Casa/Bloque/Conjunto/Piso", txtdireccion);
    }

    public void edadExaminado() {

        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        String fechanac = date.format(DatoPersonal.fechanaci.getDate());

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(fechanac, fmt);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);

        laedad = Integer.toString(periodo.getYears());
        txtedad.setText(laedad);
        DatosPersonales.setEdad(laedad);
        DatosPersonales.setFecha_nac(fechanac);
        laedad = "";
    }

    public static void limpiar() {
        System.out.println("hijueputa via");
        txtnombre.setText("");
        cbxtipoiden.setSelectedItem("Seleccione");
        txtnoiden.setText("");
        txtexpedidos.setText("");
        txtlugarnaci.setText("");
        fechanaci.setCalendar(null);
        txtdireccion.setText("");
        txtbarrio.setText("");
        txtlocalidad.setText("");
        cbxestrato.setSelectedItem("-");
        txtedad.setText("");
        txttelcelu.setText("");
        txttelfijo.setText("");
        txtemail.setText("");
        txtcargoactual.setText("");
        txtareaactual.setText("");
        txtcargoaspira.setText("");
        txtareaaspira.setText("");
        txtpersonasolicitante.setText("");
        txtcargosolicitante.setText("");
        txtfamiliape1.setText("");
        chbxmasculino.setSelected(false);
        chbxfemenino.setSelected(false);
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        

    }
    
    public void cargarFoto(){
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        j.setFileFilter(fil);

        int s = j.showOpenDialog(this);
        if (s == JFileChooser.APPROVE_OPTION) {
            ruta = j.getSelectedFile().getAbsolutePath();
            ruta2 = j.getSelectedFile().getName();
        }

        DatosPersonales.setRutaFoto(ruta);
        System.out.println("la ruta es  " + ruta);
        System.out.println("el nombre es  " + ruta2);

        try {
            byte[] icono = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(icono);
            try {
                Image iconon = ImageIO.read(j.getSelectedFile()).getScaledInstance(fotoexaminado.getWidth(), fotoexaminado.getHeight(), Image.SCALE_DEFAULT);

                fotoexaminado.setIcon(new ImageIcon(iconon));
                fotoexaminado.updateUI();
                imagenpu = icono;
                DatosPersonales.setEstadoFoto("cargada");
                ruta = "";
                ruta2 = "";

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, "imagen: " + ex);
            }
        } catch (Exception ex) {
            limpiarFoto();
            System.out.println("no se asignó imagen");
            DatosPersonales.setEstadoFoto("nocargada");
        }
    }

    public void limpiarFoto() {
        Image image = new ImageIcon(getClass().getResource("/images/question.png")).getImage();
        fotoexaminado.setIcon(new ImageIcon(image));
        fotoexaminado.updateUI();
    }
    
    public void renuncio(){
        
    }

    Thinking_uh iconThinking_uh = new Thinking_uh();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cbxtipoiden = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtnoiden = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtexpedidos = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtlugarnaci = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtbarrio = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtlocalidad = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        fechanaci = new com.toedter.calendar.JDateChooser();
        jLabel39 = new javax.swing.JLabel();
        txttelfijo = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txttelcelu = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        fotoexaminado = new javax.swing.JLabel();
        personasolicitante = new javax.swing.JLabel();
        rtxtpersonasolicitante = new javax.swing.JLabel();
        txtpersonasolicitante = new javax.swing.JTextField();
        areaaspira1 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtfamiliape1 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        chbxmasculino = new javax.swing.JCheckBox();
        chbxfemenino = new javax.swing.JCheckBox();
        rtxtpersonasolicitante1 = new javax.swing.JLabel();
        txtcargosolicitante = new javax.swing.JTextField();
        personasolicitante1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rtxtcargoactual = new javax.swing.JLabel();
        txtcargoactual = new javax.swing.JTextField();
        rtxtareaactual = new javax.swing.JLabel();
        txtareaactual = new javax.swing.JTextField();
        areaactual = new javax.swing.JLabel();
        cargoactual = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        rtxtareaaspira = new javax.swing.JLabel();
        txtareaaspira = new javax.swing.JTextField();
        rtxtcargoaspira = new javax.swing.JLabel();
        txtcargoaspira = new javax.swing.JTextField();
        cargoaspira = new javax.swing.JLabel();
        areaaspira = new javax.swing.JLabel();
        cbxestrato = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(975, 550));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(975, 550));

        jLabel16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel16.setText("Nombre completo:");

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel15.setText("Número de Identificación: ");

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel17.setText("Lugar de expedición:");

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel18.setText("Tipo de identificación:");

        cbxtipoiden.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        cbxtipoiden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "CC", "TI", "CE", "PEP", "PASS" }));
        cbxtipoiden.setBorder(null);
        cbxtipoiden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxtipoiden.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxtipoidenItemStateChanged(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel19.setText("Lugar y fecha de nacimiento del examinado: ");

        jLabel20.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel20.setText("Edad examinado:");

        jLabel21.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel21.setText("Dirección examinado:");

        jLabel22.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel22.setText("Barrio:");

        jLabel23.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel23.setText("Localidad donde vive:");

        jLabel24.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel24.setText("Teléfono fijo: ");

        jLabel25.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel25.setText("Teléfono celular:");

        jLabel27.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel27.setText("Email:");

        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtnoiden.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtnoiden.setBorder(null);
        txtnoiden.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtnoidenCaretUpdate(evt);
            }
        });
        txtnoiden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnoidenKeyTyped(evt);
            }
        });

        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtexpedidos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtexpedidos.setBorder(null);
        txtexpedidos.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtexpedidosCaretUpdate(evt);
            }
        });
        txtexpedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexpedidosActionPerformed(evt);
            }
        });
        txtexpedidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtexpedidosKeyTyped(evt);
            }
        });

        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtlugarnaci.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtlugarnaci.setBorder(null);
        txtlugarnaci.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtlugarnaciCaretUpdate(evt);
            }
        });
        txtlugarnaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlugarnaciActionPerformed(evt);
            }
        });
        txtlugarnaci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtlugarnaciKeyTyped(evt);
            }
        });

        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtedad.setEditable(false);
        txtedad.setBackground(new java.awt.Color(255, 255, 255));
        txtedad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtedad.setBorder(null);

        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtdireccion.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtdireccion.setBorder(null);
        txtdireccion.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtdireccionCaretUpdate(evt);
            }
        });
        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdireccionKeyTyped(evt);
            }
        });

        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtbarrio.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtbarrio.setBorder(null);
        txtbarrio.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtbarrioCaretUpdate(evt);
            }
        });
        txtbarrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbarrioActionPerformed(evt);
            }
        });
        txtbarrio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbarrioKeyTyped(evt);
            }
        });

        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtlocalidad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtlocalidad.setBorder(null);
        txtlocalidad.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtlocalidadCaretUpdate(evt);
            }
        });
        txtlocalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtlocalidadKeyTyped(evt);
            }
        });

        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtemail.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtemail.setBorder(null);
        txtemail.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtemailCaretUpdate(evt);
            }
        });
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtemailKeyTyped(evt);
            }
        });

        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtnombre.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtnombre.setBorder(null);
        txtnombre.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtnombreCaretUpdate(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        fechanaci.setDateFormatString("dd/MM/yyyy");
        fechanaci.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                fechanaciCaretPositionChanged(evt);
            }
        });
        fechanaci.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechanaciPropertyChange(evt);
            }
        });
        fechanaci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fechanaciKeyTyped(evt);
            }
        });

        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txttelfijo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txttelfijo.setBorder(null);
        txttelfijo.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txttelfijoCaretUpdate(evt);
            }
        });
        txttelfijo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelfijoKeyTyped(evt);
            }
        });

        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txttelcelu.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txttelcelu.setBorder(null);
        txttelcelu.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txttelceluCaretUpdate(evt);
            }
        });
        txttelcelu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelceluKeyTyped(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel71.setText("Estrato:");

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));
        jPanel17.setForeground(new java.awt.Color(255, 255, 255));
        jPanel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel17.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel17MouseMoved(evt);
            }
        });
        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel17MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel17MouseExited(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Cargar imagen");
        jLabel63.setAlignmentX(1.0F);
        jLabel63.setAlignmentY(1.0F);
        jLabel63.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel63MouseMoved(evt);
            }
        });
        jLabel63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel63MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel63MouseExited(evt);
            }
        });

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add (1).png"))); // NOI18N
        jLabel62.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel62MouseMoved(evt);
            }
        });
        jLabel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel62MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel62MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
            .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        fotoexaminado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/question.png"))); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fotoexaminado, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(fotoexaminado, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );

        personasolicitante.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        personasolicitante.setText("Nombre del solicitante:");

        rtxtpersonasolicitante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtpersonasolicitante.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtpersonasolicitante.setBorder(null);
        txtpersonasolicitante.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtpersonasolicitanteCaretUpdate(evt);
            }
        });
        txtpersonasolicitante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpersonasolicitanteKeyTyped(evt);
            }
        });

        areaaspira1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        areaaspira1.setText("Género:");

        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtfamiliape1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtfamiliape1.setBorder(null);
        txtfamiliape1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtfamiliape1CaretUpdate(evt);
            }
        });
        txtfamiliape1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfamiliape1KeyTyped(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel45.setText("¿Existen admisiones en esta categoría?");

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jCheckBox1.setText("Sí");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jCheckBox2.setText("No");
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });

        chbxmasculino.setBackground(new java.awt.Color(255, 255, 255));
        chbxmasculino.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxmasculino.setText("Masculino");
        chbxmasculino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxmasculinoItemStateChanged(evt);
            }
        });

        chbxfemenino.setBackground(new java.awt.Color(255, 255, 255));
        chbxfemenino.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chbxfemenino.setText("Femenino");
        chbxfemenino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbxfemeninoItemStateChanged(evt);
            }
        });

        rtxtpersonasolicitante1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcargosolicitante.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcargosolicitante.setBorder(null);
        txtcargosolicitante.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcargosolicitanteCaretUpdate(evt);
            }
        });
        txtcargosolicitante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcargosolicitanteKeyTyped(evt);
            }
        });

        personasolicitante1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        personasolicitante1.setText("Cargo del solicitante:");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        rtxtcargoactual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcargoactual.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcargoactual.setBorder(null);
        txtcargoactual.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcargoactualCaretUpdate(evt);
            }
        });
        txtcargoactual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcargoactualKeyTyped(evt);
            }
        });

        rtxtareaactual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtareaactual.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtareaactual.setBorder(null);
        txtareaactual.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtareaactualCaretUpdate(evt);
            }
        });
        txtareaactual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtareaactualActionPerformed(evt);
            }
        });
        txtareaactual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtareaactualKeyTyped(evt);
            }
        });

        areaactual.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        areaactual.setText("Área Actual: ");

        cargoactual.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        cargoactual.setText("Cargo Actual: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rtxtareaactual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cargoactual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rtxtcargoactual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcargoactual, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(areaactual)
                        .addGap(15, 15, 15)
                        .addComponent(txtareaactual, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(areaactual)
                                .addComponent(txtareaactual, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, 0)
                            .addComponent(rtxtareaactual, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargoactual)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtcargoactual, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(rtxtcargoactual, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        rtxtareaaspira.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtareaaspira.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtareaaspira.setBorder(null);
        txtareaaspira.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtareaaspiraCaretUpdate(evt);
            }
        });
        txtareaaspira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtareaaspiraActionPerformed(evt);
            }
        });
        txtareaaspira.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtareaaspiraKeyTyped(evt);
            }
        });

        rtxtcargoaspira.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtcargoaspira.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcargoaspira.setBorder(null);
        txtcargoaspira.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcargoaspiraCaretUpdate(evt);
            }
        });
        txtcargoaspira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcargoaspiraActionPerformed(evt);
            }
        });
        txtcargoaspira.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcargoaspiraKeyTyped(evt);
            }
        });

        cargoaspira.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        cargoaspira.setText("Cargo (aspira): ");

        areaaspira.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        areaaspira.setText("Área (aspira): ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(614, 614, 614)
                        .addComponent(rtxtareaaspira, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(cargoaspira)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rtxtcargoaspira, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcargoaspira, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(areaaspira)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtareaaspira, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtareaaspira, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areaaspira)
                    .addComponent(txtcargoaspira, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargoaspira))
                .addGap(0, 0, 0)
                .addComponent(rtxtareaaspira, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rtxtcargoaspira, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        cbxestrato.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        cbxestrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6" }));
        cbxestrato.setBorder(null);
        cbxestrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxestrato.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxestratoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel23)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtlocalidad)))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel21)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel71)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cbxestrato, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(jLabel20)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel22)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtbarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtlugarnaci, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35)
                                        .addComponent(fechanaci, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtnombre)
                                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtnoiden))
                                                .addGap(21, 21, 21)))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(63, 63, 63)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cbxtipoiden, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtexpedidos)
                                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addGap(597, 597, 597)
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txttelcelu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txttelfijo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel27))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(personasolicitante)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rtxtpersonasolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtpersonasolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(areaaspira1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chbxmasculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chbxfemenino))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(personasolicitante1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rtxtpersonasolicitante1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtcargosolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtfamiliape1)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel18)
                                        .addComponent(cbxtipoiden, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel16))
                                .addGap(30, 30, 30))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtnoiden, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel17))
                                .addGap(0, 0, 0)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtexpedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechanaci, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtlugarnaci, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19))
                                .addGap(0, 0, 0)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtbarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22))
                                .addGap(0, 0, 0)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel71)
                                    .addComponent(cbxestrato, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21))
                                .addGap(0, 0, 0)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtlocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23))
                                .addGap(0, 0, 0)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(areaaspira1)
                            .addComponent(chbxmasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chbxfemenino, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttelcelu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txttelfijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24)
                        .addComponent(jLabel27)))
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personasolicitante)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtcargosolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(personasolicitante1)))
                        .addGap(0, 0, 0)
                        .addComponent(rtxtpersonasolicitante1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfamiliape1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtpersonasolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(rtxtpersonasolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtexpedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexpedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtexpedidosActionPerformed

    private void txtlugarnaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlugarnaciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlugarnaciActionPerformed

    private void txtbarrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbarrioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbarrioActionPerformed

    private void jPanel17MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseMoved
        jPanel17.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jPanel17MouseMoved

    private void jPanel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseExited
        jPanel17.setBackground(Color.BLACK);
    }//GEN-LAST:event_jPanel17MouseExited

    private void txtcargoaspiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcargoaspiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcargoaspiraActionPerformed

    private void txtareaactualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtareaactualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtareaactualActionPerformed

    private void txtareaaspiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtareaaspiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtareaaspiraActionPerformed

    private void fechanaciPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechanaciPropertyChange

        Date cock = fechanaci.getDate();

        if (cock == null) {
        } else {
            edadExaminado();
        }
    }//GEN-LAST:event_fechanaciPropertyChange

    private void fechanaciKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechanaciKeyTyped
        InputMap map = fechanaci.getInputMap(JTextField.WHEN_FOCUSED);
        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_fechanaciKeyTyped

    private void fechanaciCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_fechanaciCaretPositionChanged

    }//GEN-LAST:event_fechanaciCaretPositionChanged

    private void txtnoidenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnoidenKeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 32 && k < 48 || k > 57 && k != 127) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡Solamente se aceptan números!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        if (k == 10) {
            txtnoiden.transferFocus();
        }

        InputMap map = txtnoiden.getInputMap(JTextField.WHEN_FOCUSED);
//        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtnoidenKeyTyped

    private void jLabel63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel63MouseClicked
        cargarFoto();

    }//GEN-LAST:event_jLabel63MouseClicked

    private void jLabel62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseClicked
        cargarFoto();
    }//GEN-LAST:event_jLabel62MouseClicked

    private void txtfamiliape1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtfamiliape1CaretUpdate
        DatosPersonales.setAdmisionDatosPersonales(txtfamiliape1.getText());
    }//GEN-LAST:event_txtfamiliape1CaretUpdate

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        if (jCheckBox1.isSelected()) {
            jCheckBox2.setSelected(false);
            txtfamiliape1.setVisible(true);
            jLabel36.setVisible(true);
            Admisiones.setAdmDP("hay");
        } else {
            Admisiones.setAdmDP("nohay");
            txtfamiliape1.setVisible(false);
            jLabel36.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
        if (jCheckBox2.isSelected()) {
            jCheckBox1.setSelected(false);
            txtfamiliape1.setVisible(false);
            jLabel36.setVisible(false);
            Admisiones.setAdmDP("nohay");
        }
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void chbxmasculinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxmasculinoItemStateChanged
        if (chbxmasculino.isSelected()) {
            chbxfemenino.setSelected(false);
            DatosPersonales.setGenero("Masculino");
        } else {
            DatosPersonales.setGenero("-");
        }
    }//GEN-LAST:event_chbxmasculinoItemStateChanged

    private void chbxfemeninoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbxfemeninoItemStateChanged
        if (chbxfemenino.isSelected()) {
            chbxmasculino.setSelected(false);
            DatosPersonales.setGenero("Femenino");
        } else {
            DatosPersonales.setGenero("-");
        }
    }//GEN-LAST:event_chbxfemeninoItemStateChanged

    private void txttelceluKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelceluKeyTyped
        int k = (int) evt.getKeyChar();

        if (k >= 32 && k < 48 || k > 57 && k != 127) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡Solamente se aceptan números!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txttelcelu.getInputMap(JTextField.WHEN_FOCUSED);
//map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txttelceluKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        int k = (int) evt.getKeyChar();

        if (k > 32 && k < 65 || k > 90 && k < 97 || k > 165) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }

        InputMap map = txtnombre.getInputMap(JTextField.WHEN_FOCUSED);
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtexpedidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtexpedidosKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }

        InputMap map = txtexpedidos.getInputMap(JTextField.WHEN_FOCUSED);
//        if (k== 239){
//             JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
//        }

//            if (k > 32 && k < 65 && k != 44 && k != 45 && k != 46 && k != 47 && k != 48 && k != 49 && k != 50 && k != 51 && k != 52 && k != 53 && k != 54 && k != 55 && k != 56 && k != 57 && k != 58 && k != 59 || k > 90 && k < 97 && k != 160 && k != 130 && k != 161 && k != 162 && k != 163 && k != 164 && k != 165||  k > 165 && k!= 239) {
//                evt.setKeyChar((char) KeyEvent.VK_CLEAR);
//                JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
//            }
    }//GEN-LAST:event_txtexpedidosKeyTyped

    private void txtlugarnaciKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlugarnaciKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }

        InputMap map = txtlugarnaci.getInputMap(JTextField.WHEN_FOCUSED);
    }//GEN-LAST:event_txtlugarnaciKeyTyped

    private void txtdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtdireccion.getInputMap(JTextField.WHEN_FOCUSED);
    }//GEN-LAST:event_txtdireccionKeyTyped

    private void txtbarrioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbarrioKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtbarrio.getInputMap(JTextField.WHEN_FOCUSED);
    }//GEN-LAST:event_txtbarrioKeyTyped

    private void txtlocalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlocalidadKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtlocalidad.getInputMap(JTextField.WHEN_FOCUSED);
    }//GEN-LAST:event_txtlocalidadKeyTyped

    private void txttelfijoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelfijoKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txttelfijo.getInputMap(JTextField.WHEN_FOCUSED);
    }//GEN-LAST:event_txttelfijoKeyTyped

    private void txtemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtemail.getInputMap(JTextField.WHEN_FOCUSED);
    }//GEN-LAST:event_txtemailKeyTyped

    private void txtcargoactualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcargoactualKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtcargoactual.getInputMap(JTextField.WHEN_FOCUSED);
    }//GEN-LAST:event_txtcargoactualKeyTyped

    private void txtareaactualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtareaactualKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtareaactual.getInputMap(JTextField.WHEN_FOCUSED);
    }//GEN-LAST:event_txtareaactualKeyTyped

    private void txtcargoaspiraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcargoaspiraKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtcargoaspira.getInputMap(JTextField.WHEN_FOCUSED);
    }//GEN-LAST:event_txtcargoaspiraKeyTyped

    private void txtareaaspiraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtareaaspiraKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtareaaspira.getInputMap(JTextField.WHEN_FOCUSED);
    }//GEN-LAST:event_txtareaaspiraKeyTyped

    private void txtpersonasolicitanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpersonasolicitanteKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtpersonasolicitante.getInputMap(JTextField.WHEN_FOCUSED);
    }//GEN-LAST:event_txtpersonasolicitanteKeyTyped

    private void txtfamiliape1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfamiliape1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtfamiliape1.getInputMap(JTextField.WHEN_FOCUSED);
    }//GEN-LAST:event_txtfamiliape1KeyTyped

    private void txtnombreCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtnombreCaretUpdate
        DatosPrincipales.setNombreExaminado(txtnombre.getText());
    }//GEN-LAST:event_txtnombreCaretUpdate

    private void cbxtipoidenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxtipoidenItemStateChanged
        DatosPrincipales.setTipoIdenExaminado(cbxtipoiden.getSelectedItem().toString());
    }//GEN-LAST:event_cbxtipoidenItemStateChanged

    private void txtnoidenCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtnoidenCaretUpdate
        DatosPrincipales.setNoIdenExaminado(txtnoiden.getText());
    }//GEN-LAST:event_txtnoidenCaretUpdate

    private void txtpersonasolicitanteCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtpersonasolicitanteCaretUpdate
        DatosPrincipales.setNombreSolicitante(txtpersonasolicitante.getText());
    }//GEN-LAST:event_txtpersonasolicitanteCaretUpdate

    private void txtlugarnaciCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtlugarnaciCaretUpdate
        DatosPersonales.setLugar_naci(txtlugarnaci.getText());
    }//GEN-LAST:event_txtlugarnaciCaretUpdate

    private void txtexpedidosCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtexpedidosCaretUpdate
        DatosPersonales.setLugar_exp(txtexpedidos.getText());
    }//GEN-LAST:event_txtexpedidosCaretUpdate

    private void txtdireccionCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtdireccionCaretUpdate
        DatosPersonales.setDireccion(txtdireccion.getText());
    }//GEN-LAST:event_txtdireccionCaretUpdate

    private void txtbarrioCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtbarrioCaretUpdate
        DatosPersonales.setBarrio(txtbarrio.getText());
    }//GEN-LAST:event_txtbarrioCaretUpdate

    private void txtlocalidadCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtlocalidadCaretUpdate
        DatosPersonales.setLocalidad(txtlocalidad.getText());
    }//GEN-LAST:event_txtlocalidadCaretUpdate

    private void txttelceluCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txttelceluCaretUpdate
        DatosPersonales.setTel_celular(txttelcelu.getText());
    }//GEN-LAST:event_txttelceluCaretUpdate

    private void txttelfijoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txttelfijoCaretUpdate
        DatosPersonales.setTel_fijo(txttelfijo.getText());
    }//GEN-LAST:event_txttelfijoCaretUpdate

    private void txtemailCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtemailCaretUpdate
        DatosPersonales.setEmail(txtemail.getText());
    }//GEN-LAST:event_txtemailCaretUpdate

    private void txtcargoactualCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcargoactualCaretUpdate
        DatosPersonales.setCargoactual(txtcargoactual.getText());
    }//GEN-LAST:event_txtcargoactualCaretUpdate

    private void txtareaactualCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtareaactualCaretUpdate
        DatosPersonales.setAreaactual(txtareaactual.getText());
    }//GEN-LAST:event_txtareaactualCaretUpdate

    private void txtcargoaspiraCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcargoaspiraCaretUpdate
        DatosPersonales.setCargoaspira(txtcargoaspira.getText());
    }//GEN-LAST:event_txtcargoaspiraCaretUpdate

    private void txtareaaspiraCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtareaaspiraCaretUpdate
        DatosPersonales.setAreaaspira(txtareaaspira.getText());
    }//GEN-LAST:event_txtareaaspiraCaretUpdate

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtcargosolicitanteCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcargosolicitanteCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcargosolicitanteCaretUpdate

    private void txtcargosolicitanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcargosolicitanteKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 39) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡No se acepta ese tipo de carácter!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }
        InputMap map = txtpersonasolicitante.getInputMap(JTextField.WHEN_FOCUSED);
    }//GEN-LAST:event_txtcargosolicitanteKeyTyped

    private void cbxestratoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxestratoItemStateChanged
        String p = (String) cbxestrato.getSelectedItem();
        DatosPersonales.setEstrato(p);
    }//GEN-LAST:event_cbxestratoItemStateChanged

    private void jLabel63MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel63MouseMoved
        jPanel17.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jLabel63MouseMoved

    private void jLabel63MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel63MouseExited
         jPanel17.setBackground(Color.BLACK);
    }//GEN-LAST:event_jLabel63MouseExited

    private void jPanel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseClicked
        cargarFoto();
    }//GEN-LAST:event_jPanel17MouseClicked

    private void jLabel62MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseExited
         jPanel17.setBackground(Color.BLACK);
    }//GEN-LAST:event_jLabel62MouseExited

    private void jLabel62MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseMoved
          jPanel17.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jLabel62MouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel areaactual;
    public static javax.swing.JLabel areaaspira;
    public static javax.swing.JLabel areaaspira1;
    public static javax.swing.JLabel cargoactual;
    public static javax.swing.JLabel cargoaspira;
    public static javax.swing.JComboBox<String> cbxestrato;
    public static javax.swing.JComboBox<String> cbxtipoiden;
    public static javax.swing.JCheckBox chbxfemenino;
    public static javax.swing.JCheckBox chbxmasculino;
    public static com.toedter.calendar.JDateChooser fechanaci;
    public static javax.swing.JLabel fotoexaminado;
    public static javax.swing.JCheckBox jCheckBox1;
    public static javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    public static javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel71;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    public javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel personasolicitante;
    public static javax.swing.JLabel personasolicitante1;
    public static javax.swing.JLabel rtxtareaactual;
    public static javax.swing.JLabel rtxtareaaspira;
    public static javax.swing.JLabel rtxtcargoactual;
    public static javax.swing.JLabel rtxtcargoaspira;
    public static javax.swing.JLabel rtxtpersonasolicitante;
    public static javax.swing.JLabel rtxtpersonasolicitante1;
    public static javax.swing.JTextField txtareaactual;
    public static javax.swing.JTextField txtareaaspira;
    public static javax.swing.JTextField txtbarrio;
    public static javax.swing.JTextField txtcargoactual;
    public static javax.swing.JTextField txtcargoaspira;
    public static javax.swing.JTextField txtcargosolicitante;
    public static javax.swing.JTextField txtdireccion;
    public static javax.swing.JTextField txtedad;
    public static javax.swing.JTextField txtemail;
    public static javax.swing.JTextField txtexpedidos;
    public static javax.swing.JTextField txtfamiliape1;
    public static javax.swing.JTextField txtlocalidad;
    public static javax.swing.JTextField txtlugarnaci;
    public static javax.swing.JTextField txtnoiden;
    public static javax.swing.JTextField txtnombre;
    public static javax.swing.JTextField txtpersonasolicitante;
    public static javax.swing.JTextField txttelcelu;
    public static javax.swing.JTextField txttelfijo;
    // End of variables declaration//GEN-END:variables
}
