package view;

import icons.Checked;
import icons.Close;
import icons.List;
import icons.Location;
import icons.Sad;
import icons.Shocked;
import icons.Thinking_uh;
import icons.Warning;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import classes.Conexion;
import classes.DatosPrincipales;
import org.apache.commons.codec.digest.DigestUtils;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import java.awt.Color;
import static java.awt.event.ActionEvent.CTRL_MASK;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.InputMap;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import icons.Happier;
import icons.Noti1;
import icons.Noti2;
import icons.Question;
import icons.Thinking;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import sininternet.Datos;

/**
 *
 * @author Kevin Casas
 */
public class MenuPrincipal extends javax.swing.JFrame implements Runnable {

    Thread hilo;

    Image icon = new ImageIcon(getClass().getResource("/images/pluma.png")).getImage();

    public MenuPrincipal() throws ParseException {
        Conexion.getInstance();
        initComponents();
        //this.setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        hilo = new Thread((Runnable) this);
        hilo.start();
        this.setIconImage(icon);
        Login.setLocationRelativeTo(null);
        Login.setVisible(true);
        Login.setSize(285, 395);
        Login.setIconImage(icon);
        MenuPrincipal.na.add(consult);
        consult.show(false);
        MenuPrincipal.na.add(creacionE);
        creacionE.show(false);

        validarModOffline();
    }

    List iconList = new List();
    Location iconLocation = new Location();
    Question iconQuestion = new Question();
    Happier iconHappy = new Happier();
    Shocked iconShocked = new Shocked();
    Thinking iconThinking = new Thinking();
    Thinking_uh iconThinking_uh = new Thinking_uh();
    Warning iconWarning = new Warning();
    Checked iconChecked = new Checked();
    Close iconClose = new Close();
    Sad iconSad = new Sad();
    Noti1 iconNoti1 = new Noti1();
    Noti2 iconNoti2 = new Noti2();

    public void run() {
        Thread lola = Thread.currentThread();
        while (lola == hilo) {
            hora();
        }
    }
    static int contador_notifi = 0;

    public void validarModOffline() {
        if ("Conconexion".equals(classes.Conexion.importante)) {
            Desconectado des = new Desconectado();
            des.cargar_txt();
            if (Datos.getHayNotificacion().equals("hay")) {
                tarea();
//                MenuPrincipal.espacioSuperior.setVisible(false);
                MenuPrincipal.notificacion.setVisible(true);
            } else if (Datos.getHayNotificacion().equals("nohay")) {
//                MenuPrincipal.espacioSuperior.setVisible(true);
                MenuPrincipal.notificacion.setVisible(false);
            }
        } else if ("Sinconexion".equals(classes.Conexion.importante)) {
//            MenuPrincipal.espacioSuperior.setVisible(true);
            MenuPrincipal.notificacion.setVisible(false);
        }
    }

    public void tarea() {
        int velocidad = 1;
        Timer timer;
        TimerTask tarea;
        int velmil = velocidad * 1000;
        tarea = new TimerTask() {
            @Override
            public void run() {
                switch (contador_notifi) {
                    case 0:
                        contador_notifi = 1;
                        MenuPrincipal.notificacion.setIcon(iconNoti1);
                        break;
                    case 1:
                        contador_notifi = 0;
                        MenuPrincipal.notificacion.setIcon(iconNoti2);
                        break;
                }
            }
        };
        timer = new Timer();
        timer.scheduleAtFixedRate(tarea, velmil, velmil);
    }

    public static String fecha() {
        java.util.Date fecha = new java.util.Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        return formato.format(fecha);
    }

    public void hora() {
        Calendar calendario = new GregorianCalendar();
        java.util.Date horaactual = new java.util.Date();
        calendario.setTime(horaactual);
        hora = calendario.get(Calendar.HOUR) > 9 ? "" + calendario.get(Calendar.HOUR) : "0" + calendario.get(Calendar.HOUR);
        minuto = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundo = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "am" : "pm";
    }

    String hora, minuto, segundo, ampm;
    Solicitud soli = new Solicitud();
    CreacionExamen creacionE = new CreacionExamen();
    Consulta consult = new Consulta();

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

    public void consultarExamen() {
        if ("Sinconexion".equals(classes.Conexion.importante)) {
            JOptionPane.showMessageDialog(null, "¡No se puede utilizar la busqueda de datos en modo offline!", "Validación de parámetros", JOptionPane.DEFAULT_OPTION, iconThinking_uh);
        } else if ("Conconexion".equals(classes.Conexion.importante)) {
            if (consult.isVisible()) {
                JOptionPane.showMessageDialog(null, "¡La ventana ya se encuentra en uso!", "Validación de parámetros", JOptionPane.DEFAULT_OPTION, iconThinking_uh);
            } else if (!consult.isVisible() && creacionE.isVisible()) {
                JOptionPane.showMessageDialog(null, "¡Debe cerrar la ventana de registro de examen para pode usar la busqueda!", "Validación de parámetros", JOptionPane.DEFAULT_OPTION, iconThinking_uh);
            } else if (!consult.isVisible() && !creacionE.isVisible()) {
                DatosPrincipales.setOpcionExamen("consulta");
                consult.show();
                CentrarVentana(consult);
            }
        }
    }

    public static void userdata() {
        MenuPrincipal.usernames.setText(DatosPrincipales.getNombreUsuario());
        MenuPrincipal.rolus2.setText(DatosPrincipales.getRolUsuario());

    }

    public void creacionExa() {
        if (creacionE.isVisible()) {
            JOptionPane.showMessageDialog(null, "¡La ventana ya se encuentra en uso!", "Validación de parámetros", JOptionPane.DEFAULT_OPTION, iconThinking_uh);
        } else if (!creacionE.isVisible() && consult.isVisible()) {
            JOptionPane.showMessageDialog(null, "¡Debe cerrar la ventana de consulta para poder crear un nuevo registro!", "Validación de parámetros", JOptionPane.DEFAULT_OPTION, iconThinking_uh);
        } else if (!creacionE.isVisible() && !consult.isVisible()) {
            DatosPrincipales.setOpcionExamen("nuevo");
            creacionE.show();
            CentrarVentana(creacionE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        txtusuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtcontra = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        na = new javax.swing.JDesktopPane();
        notificacion = new javax.swing.JLabel();
        modoOffline = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        usernames = new javax.swing.JLabel();
        rolus2 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        Login.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Login.setTitle("Poligrafía TP");
        Login.setBackground(new java.awt.Color(51, 51, 51));
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Login.setFocusCycleRoot(false);
        Login.setForeground(new java.awt.Color(51, 51, 51));
        Login.setMaximumSize(new java.awt.Dimension(280, 390));
        Login.setMinimumSize(new java.awt.Dimension(280, 390));
        Login.setPreferredSize(new java.awt.Dimension(280, 390));
        Login.setResizable(false);
        Login.setSize(new java.awt.Dimension(280, 390));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setMaximumSize(new java.awt.Dimension(280, 390));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 390));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 390));

        txtusuario.setBackground(new java.awt.Color(0, 0, 0));
        txtusuario.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(255, 255, 255));
        txtusuario.setBorder(null);
        txtusuario.setCaretColor(new java.awt.Color(204, 204, 204));
        txtusuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusuarioKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Inicio de sesión");

        txtcontra.setBackground(new java.awt.Color(0, 0, 0));
        txtcontra.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtcontra.setForeground(new java.awt.Color(255, 255, 255));
        txtcontra.setBorder(null);
        txtcontra.setCaretColor(new java.awt.Color(204, 204, 204));
        txtcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraActionPerformed(evt);
            }
        });
        txtcontra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontraKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Digite CCMS:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(109, 109, 109));
        jLabel4.setAlignmentX(0.5F);
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(109, 109, 109));
        jLabel5.setAlignmentX(0.5F);
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Teleperformance - HR Analytics");

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setForeground(new java.awt.Color(255, 255, 255));
        jPanel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel14MouseMoved(evt);
            }
        });
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel14MouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jLabel7.setText("Ingresar");
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel7MouseMoved(evt);
            }
        });
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel7)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userforlog.png"))); // NOI18N

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lock.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(73, 73, 73))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel52)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel53))
                .addGap(32, 32, 32)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        Login.getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        Login.getAccessibleContext().setAccessibleDescription("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Poligrafía Teleperformance");
        setBackground(new java.awt.Color(255, 255, 255));

        na.setBackground(new java.awt.Color(255, 255, 255));
        na.setName("na"); // NOI18N
        na.setPreferredSize(new java.awt.Dimension(1168, 962));

        notificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/notification1_little.png"))); // NOI18N
        notificacion.setToolTipText("Notificación modo offline");
        notificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notificacionMouseClicked(evt);
            }
        });

        modoOffline.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        modoOffline.setForeground(new java.awt.Color(153, 153, 153));
        modoOffline.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modoOffline.setText("Modo Offline");

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
        });

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/file.png"))); // NOI18N

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("  NUEVO");
        jLabel47.setAlignmentX(1.0F);
        jLabel47.setAlignmentY(1.0F);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addGap(19, 19, 19))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel10MouseMoved(evt);
            }
        });
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel10MouseExited(evt);
            }
        });

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifier.png"))); // NOI18N
        jLabel51.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel51MouseMoved(evt);
            }
        });
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel51MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel51MouseExited(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("CONSULTAR");
        jLabel48.setAlignmentX(1.0F);
        jLabel48.setAlignmentY(1.0F);
        jLabel48.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel48MouseMoved(evt);
            }
        });
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel48MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel48MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel48)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );

        usernames.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        usernames.setToolTipText("Usuario");

        rolus2.setBackground(new java.awt.Color(255, 255, 255));
        rolus2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        rolus2.setToolTipText("Cargo");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man-user-black.png"))); // NOI18N
        jLabel42.setToolTipText("Usuario");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portfolio.png"))); // NOI18N
        jLabel44.setToolTipText("Cargo");

        na.setLayer(notificacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        na.setLayer(modoOffline, javax.swing.JLayeredPane.DEFAULT_LAYER);
        na.setLayer(jPanel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        na.setLayer(jPanel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        na.setLayer(usernames, javax.swing.JLayeredPane.DEFAULT_LAYER);
        na.setLayer(rolus2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        na.setLayer(jLabel42, javax.swing.JLayeredPane.DEFAULT_LAYER);
        na.setLayer(jLabel44, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout naLayout = new javax.swing.GroupLayout(na);
        na.setLayout(naLayout);
        naLayout.setHorizontalGroup(
            naLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(naLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(naLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 915, Short.MAX_VALUE)
                .addGroup(naLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modoOffline, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(naLayout.createSequentialGroup()
                        .addGroup(naLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(naLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernames, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rolus2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        naLayout.setVerticalGroup(
            naLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(naLayout.createSequentialGroup()
                .addGroup(naLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(naLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(modoOffline)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(naLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernames, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(naLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(rolus2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(naLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(notificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(142, 142, 142)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, Short.MAX_VALUE))
        );

        jMenu1.setText("Usuario");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/keys.png"))); // NOI18N
        jMenuItem1.setText("Editar contraseña");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aboutme.png"))); // NOI18N
        jMenuItem3.setText("Acerca de");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jMenuItem2.setText("Salir");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(na, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1287, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(na, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcontraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraKeyTyped
        if ((int) evt.getKeyChar() == KeyEvent.VK_ENTER) {
            login();
        }

        InputMap map = txtcontra.getInputMap(JTextField.WHEN_FOCUSED);
        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtcontraKeyTyped

    private void txtcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontraActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void jPanel14MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseMoved
        jPanel14.setBackground(Color.decode("#666666"));
    }//GEN-LAST:event_jPanel14MouseMoved

    private void jPanel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseExited
        jPanel14.setBackground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_jPanel14MouseExited

    private void txtusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyTyped
        int k = (int) evt.getKeyChar();

        if (k >= 32 && k < 48 || k > 57 && k != 127) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "¡Solamente se aceptan números!", "Error de datos ingresados", JOptionPane.ERROR_MESSAGE, iconThinking_uh);
        }

        InputMap map = txtusuario.getInputMap(JTextField.WHEN_FOCUSED);
        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, CTRL_MASK), "null");
    }//GEN-LAST:event_txtusuarioKeyTyped

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        login();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
        login();
    }//GEN-LAST:event_jPanel14MouseClicked

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jPanel14.setBackground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseMoved
        jPanel14.setBackground(Color.decode("#666666"));
    }//GEN-LAST:event_jLabel7MouseMoved

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked

    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro?", "CERRAR SESIÓN", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, iconThinking);
        if (resp == 0) {
            Login.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void notificacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificacionMouseClicked
        new Desconectado().setVisible(true);
    }//GEN-LAST:event_notificacionMouseClicked

    private void jPanel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseExited
         jPanel10.setBackground(Color.black);
    }//GEN-LAST:event_jPanel10MouseExited

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        consultarExamen();
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseMoved
        jPanel10.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jPanel10MouseMoved

    private void jLabel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseClicked
        consultarExamen();
    }//GEN-LAST:event_jLabel48MouseClicked

    private void jLabel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseClicked
        consultarExamen();
    }//GEN-LAST:event_jLabel51MouseClicked

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
        jPanel9.setBackground(Color.black);
    }//GEN-LAST:event_jPanel9MouseExited

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
    
        if (creacionE.isVisible()) {
            JOptionPane.showMessageDialog(null, "¡La ventana ya se encuentra en uso!", "Validación de parámetros", JOptionPane.DEFAULT_OPTION, iconThinking_uh);
        } else if (!creacionE.isVisible() && consult.isVisible()) {
            JOptionPane.showMessageDialog(null, "¡Debe cerrar la ventana de consulta para poder crear un nuevo registro!", "Validación de parámetros", JOptionPane.DEFAULT_OPTION, iconThinking_uh);
        } else if (!creacionE.isVisible() && !consult.isVisible()) {
            DatosPrincipales.setOpcionExamen("nuevo");
            creacionE.show();
            CentrarVentana(creacionE);
        }
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseMoved
        jPanel9.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jPanel9MouseMoved

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked

    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //        new CambioContraseña().setVisible(true);
        CambioContraseña cc = new CambioContraseña();
        cc.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        AcercaDe acerca = new AcercaDe();
        acerca.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jLabel48MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseExited
        jPanel10.setBackground(Color.black);
    }//GEN-LAST:event_jLabel48MouseExited

    private void jLabel51MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseExited
        jPanel10.setBackground(Color.black);
    }//GEN-LAST:event_jLabel51MouseExited

    private void jLabel51MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseMoved
        jPanel10.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jLabel51MouseMoved

    private void jLabel48MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseMoved
       jPanel10.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jLabel48MouseMoved

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    new MenuPrincipal().setVisible(false);
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException | ParseException ex) {
                    Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    void limpiar() {
        txtusuario.setText("");
        txtcontra.setText("");
        txtusuario.requestFocus();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    public static javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JPanel jPanel9;
    public static javax.swing.JLabel modoOffline;
    public static javax.swing.JDesktopPane na;
    public static javax.swing.JLabel notificacion;
    public static javax.swing.JLabel rolus2;
    private javax.swing.JPasswordField txtcontra;
    private javax.swing.JTextField txtusuario;
    public static javax.swing.JLabel usernames;
    // End of variables declaration//GEN-END:variables

    public void login() {
        if ("Sinconexion".equals(classes.Conexion.importante)) {
            if (txtusuario.getText().length() > 0 && txtcontra.getText().length() > 0) {
                if ("1".equals(txtusuario.getText()) && "1".equals(txtcontra.getText())) {
                    String respnombre = JOptionPane.showInputDialog(null, "Nombre del poligrafista:");
                    DatosPrincipales.setNombreUsuario(respnombre);
                    DatosPrincipales.setRolUsuario("Poligrafista");
                    userdata();

                    JOptionPane.showMessageDialog(null, "Acceso concedido a: \n" + respnombre, "INICIO DE SESIÓN", JOptionPane.DEFAULT_OPTION, iconHappy);
                    Login.setVisible(false);
                    this.setVisible(true);
                    limpiar();
                    MenuPrincipal.modoOffline.setVisible(true);
//                    MenuPrincipal.espacioSuperior.setVisible(true);
                    MenuPrincipal.notificacion.setVisible(false);
                    String[] sites = {
                        "TPCO Américas - Torre A",
                        "TPCO África - Torre B",
                        "TPCO Europa - Torre C",
                        "TPCO Oceanía - Torre F",
                        "TPCO BTS0",
                        "TPCO BTS3",
                        "TPCO BTS6",
                        "TPCO Barrio Colombia",
                        "TPCO Puerta del Sol",
                        "TPCO Amazonía",
                        "Wework",
                        "TPCO Andes1",
                        "TPCO Andes2",
                        "TPCO Antioquia",
                        "TPCO Andalucia",
                        "TPCO Pacífico - Lote 124(ZF)",
                        "TPCO Cataluña - Lote 30(ZF)"

                    };

                    String site = (String) JOptionPane.showInputDialog(null, "Seleccione su site: ", "Nombre de la ubicación", JOptionPane.DEFAULT_OPTION, iconLocation, sites, sites[0]);
                    if (null != site) {
                        switch (site) {
                            case "TPCO Andes1":
                            case "TPCO Andes2":
                            case "TPCO Antioquia":
                            case "TPCO Barrio Colombia":
                            case "TPCO Amazonía":
                                DatosPrincipales.setCiudadExamen("Medellín");
                                break;
                            case "TPCO Pacífico - Lote 124(ZF)":
                            case "TPCO Cataluña - Lote 30(ZF)":
                                DatosPrincipales.setCiudadExamen("Bogotá - Zona Franca");
                                break;
                            default:
                                DatosPrincipales.setCiudadExamen("Bogotá");
                                break;
                        }
                    }
                    if (null != DatosPrincipales.getCiudadExamen()) {
                        switch (DatosPrincipales.getCiudadExamen()) {
                            case "Medellín":
                                DatosPrincipales.setDireccionExamen("Calle 9C sur # 50 FF – 116 en la ciudad de Medellín");
                                break;
                            case "Bogotá - Zona Franca":
                                DatosPrincipales.setDireccionExamen("Carrera 106 No. 15 A 25 Zona Franca -  en la ciudad de Bogotá");

                                break;
                            case "Bogotá":
                                DatosPrincipales.setDireccionExamen("Calle 26 No. 92-32 en la Ciudad de Bogotá");
                                break;
                            default:
                                break;
                        }
                    }

                    CreacionExamen.place.setText(DatosPrincipales.getCiudadExamen());
                } else {
                    Login.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Campos vacios", "INICIO DE SESIÓN", JOptionPane.DEFAULT_OPTION, iconClose);
                    limpiar();
                    Login.setVisible(true);

                }
            } else {
                JOptionPane.showMessageDialog(null, "Datos no válidos para el ingreso sin conexión", "INICIO DE SESIÓN", JOptionPane.DEFAULT_OPTION, iconClose);
            }
        } else if ("Conconexion".equals(classes.Conexion.importante)) {
            if (txtusuario.getText().length() > 0 && txtcontra.getText().length() > 0) {
                String pass = DigestUtils.md5Hex(txtcontra.getText());
                try {
                    Connection con = Conexion.connection;
                    Statement s = con.createStatement();
                    ResultSet r = s.executeQuery("USE HR_Analytics; SELECT ccms,nombre,contra,rol from usuarios_polig where ccms=" + txtusuario.getText() + " and contra='" + pass + "'");
                    r.next();

                    int encuentra = r.getRow();

                    if (encuentra == 1) {

                        DatosPrincipales.setNombreUsuario(r.getString("nombre"));
                        DatosPrincipales.setRolUsuario(r.getString("rol"));
                        DatosPrincipales.setContraUsuario(pass);
                        DatosPrincipales.setCcmsUsuario(txtusuario.getText());

                        userdata();

                        //bloqueo();
                        JOptionPane.showMessageDialog(null, "Acceso concedido a: \n" + DatosPrincipales.getNombreUsuario(), "INICIO DE SESIÓN", JOptionPane.DEFAULT_OPTION, iconHappy);
                        Login.setVisible(false);
                        MenuPrincipal.modoOffline.setVisible(false);
                        this.setVisible(true);
                        limpiar();
                        String[] sites = {
                            "TPCO Américas - Torre A",
                            "TPCO África - Torre B",
                            "TPCO Europa - Torre C",
                            "TPCO Oceanía - Torre F",
                            "TPCO BTS0",
                            "TPCO BTS3",
                            "TPCO BTS6",
                            "TPCO Barrio Colombia",
                            "TPCO Puerta del Sol",
                            "TPCO Amazonía",
                            "Wework",
                            "TPCO Andes1",
                            "TPCO Andes2",
                            "TPCO Antioquia",
                            "TPCO Andalucia",
                            "TPCO Pacífico - Lote 124(ZF)",
                            "TPCO Cataluña - Lote 30(ZF)"

                        };

                        String site = (String) JOptionPane.showInputDialog(null, "Seleccione su site: ", "Nombre de la ubicación", JOptionPane.DEFAULT_OPTION, iconLocation, sites, sites[0]);
                        if (null != site) {
                            switch (site) {
                                case "TPCO Andes1":
                                case "TPCO Andes2":
                                case "TPCO Antioquia":
                                case "TPCO Barrio Colombia":
                                case "TPCO Amazonía":
                                    DatosPrincipales.setCiudadExamen("Medellín");
                                    break;
                                case "TPCO Pacífico - Lote 124(ZF)":
                                case "TPCO Cataluña - Lote 30(ZF)":
                                    DatosPrincipales.setCiudadExamen("Bogotá - Zona Franca");

                                    break;
                                default:
                                    DatosPrincipales.setCiudadExamen("Bogotá");
                                    break;
                            }
                        }
                        if (null != DatosPrincipales.getCiudadExamen()) {
                            switch (DatosPrincipales.getCiudadExamen()) {
                                case "Medellín":
                                    DatosPrincipales.setDireccionExamen("Calle 9C sur # 50 FF – 116 en la ciudad de Medellín");
                                    break;
                                case "Bogotá - Zona Franca":
                                    DatosPrincipales.setDireccionExamen("Carrera 106 No. 15 A 25 Zona Franca -  en la ciudad de Bogotá");

                                    break;
                                case "Bogotá":
                                    DatosPrincipales.setDireccionExamen("Calle 26 No. 92-32 en la Ciudad de Bogotá");
                                    break;
                                default:
                                    break;
                            }
                        }
                        CreacionExamen.place.setText(DatosPrincipales.getCiudadExamen());

                        if (site == null) {
                            JOptionPane.showMessageDialog(null, "¡Acceso no autorizado!\n Debe seleccionar un site para ingresar correctamente", "INICIO DE SESIÓN", JOptionPane.DEFAULT_OPTION, iconClose);
                            Login.setVisible(true);
                            this.setVisible(false);
                        }

                    } else {
                        Login.setVisible(false);
                        JOptionPane.showMessageDialog(null, "¡Acceso no autorizado!", "INICIO DE SESIÓN", JOptionPane.DEFAULT_OPTION, iconClose);
                        limpiar();
                        Login.setVisible(true);
                    }
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }

            } else {
                Login.setVisible(false);
                JOptionPane.showMessageDialog(null, "Campos vacios", "INICIO DE SESIÓN", JOptionPane.DEFAULT_OPTION, iconClose);
                limpiar();
                Login.setVisible(true);
            }
        }
    }
}
