package vista;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;

public class frmMaquina extends javax.swing.JFrame {

    InternalFrameSolicitudes internalSolicitudes;
    InternalFrameProgramacionMant progMant;
    InternalFrameAlquiler alquiler;
    InternalFrameCotizaciones cotizaciones;
    InternalFrameVentas ventas;
    InternalFrameServicios servicios;
    InternalFrameFacturas facturas;
    InternalFramePersonalMant personalMant;
    InternalFramePersonalPro personalPro;
    InternalFrameGestionProveedores proveedores;
    InternalFrameGestionMaquinas maquinas;

    public frmMaquina() {

        internalSolicitudes = new InternalFrameSolicitudes();
        add(internalSolicitudes);
        progMant = new InternalFrameProgramacionMant();
        add(progMant);
        alquiler = new InternalFrameAlquiler();
        add(alquiler);
        cotizaciones = new InternalFrameCotizaciones();
        add(cotizaciones);
        ventas = new InternalFrameVentas();
        add(ventas);
        servicios = new InternalFrameServicios();
        add(servicios);
        facturas = new InternalFrameFacturas();
        add(facturas);
        personalMant = new InternalFramePersonalMant();
        add(personalMant);
        personalPro = new InternalFramePersonalPro();
        add(personalPro);
        proveedores = new InternalFrameGestionProveedores();
        add(proveedores);
        maquinas = new InternalFrameGestionMaquinas();
        add(maquinas);
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelProveedores = new javax.swing.JPanel();
        btnMostrarAlquiler = new javax.swing.JButton();
        btnBuscarProveedor = new javax.swing.JButton();
        btnMostrarServicios = new javax.swing.JButton();
        btnMostrarVentas = new javax.swing.JButton();
        btnMostrarCotizaciones = new javax.swing.JButton();
        btnMostrarFacturas = new javax.swing.JButton();
        PanelProduccion = new javax.swing.JPanel();
        btnMostrarPersonalProduccion = new javax.swing.JButton();
        btnBuscarSolicitudes = new javax.swing.JButton();
        PanelMantenimiento = new javax.swing.JPanel();
        btnBuscarMaquinas = new javax.swing.JButton();
        btnMostrarMantenimientos = new javax.swing.JButton();
        btnMostrarPersonalMant = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMaquinas = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuMantenimiento = new javax.swing.JMenu();
        MenuItemGestionMaquinas = new javax.swing.JMenuItem();
        MenuItemPersonalMant = new javax.swing.JMenuItem();
        MenuItemProgMant = new javax.swing.JMenuItem();
        MenuProduccion = new javax.swing.JMenu();
        MenuItemPersonalPro = new javax.swing.JMenuItem();
        MenuItemSolicitudes = new javax.swing.JMenuItem();
        MenuProveedores = new javax.swing.JMenu();
        MenuItemAlquiler = new javax.swing.JMenuItem();
        MenuItemCotizaciones = new javax.swing.JMenuItem();
        MenuItemFacturas = new javax.swing.JMenuItem();
        MenuItemGestionProveedores = new javax.swing.JMenuItem();
        MenuItemServicios = new javax.swing.JMenuItem();
        MenuItemVentas = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setBackground(java.awt.SystemColor.control);

        jDesktopPane1.setBackground(java.awt.SystemColor.controlHighlight);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("ÍNDICE DE BÚSQUEDA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        PanelProveedores.setBackground(java.awt.SystemColor.control);
        PanelProveedores.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnMostrarAlquiler.setBackground(java.awt.SystemColor.controlHighlight);
        btnMostrarAlquiler.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnMostrarAlquiler.setText("Alquiler");
        btnMostrarAlquiler.setBorder(null);
        btnMostrarAlquiler.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarAlquiler.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMostrarAlquiler.setMaximumSize(new java.awt.Dimension(200, 20));
        btnMostrarAlquiler.setMinimumSize(new java.awt.Dimension(200, 20));
        btnMostrarAlquiler.setPreferredSize(new java.awt.Dimension(200, 20));
        btnMostrarAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarAlquilerActionPerformed(evt);
            }
        });

        btnBuscarProveedor.setBackground(java.awt.SystemColor.controlHighlight);
        btnBuscarProveedor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnBuscarProveedor.setText("Gestión Proveedores");
        btnBuscarProveedor.setBorder(null);
        btnBuscarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarProveedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarProveedor.setMaximumSize(new java.awt.Dimension(200, 20));
        btnBuscarProveedor.setMinimumSize(new java.awt.Dimension(200, 20));
        btnBuscarProveedor.setPreferredSize(new java.awt.Dimension(200, 20));
        btnBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProveedorActionPerformed(evt);
            }
        });

        btnMostrarServicios.setBackground(java.awt.SystemColor.controlHighlight);
        btnMostrarServicios.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnMostrarServicios.setText("Servicios");
        btnMostrarServicios.setBorder(null);
        btnMostrarServicios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarServicios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMostrarServicios.setMaximumSize(new java.awt.Dimension(200, 20));
        btnMostrarServicios.setMinimumSize(new java.awt.Dimension(200, 20));
        btnMostrarServicios.setPreferredSize(new java.awt.Dimension(200, 20));
        btnMostrarServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarServiciosActionPerformed(evt);
            }
        });

        btnMostrarVentas.setBackground(java.awt.SystemColor.controlHighlight);
        btnMostrarVentas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnMostrarVentas.setText("Ventas");
        btnMostrarVentas.setBorder(null);
        btnMostrarVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMostrarVentas.setMaximumSize(new java.awt.Dimension(200, 20));
        btnMostrarVentas.setMinimumSize(new java.awt.Dimension(200, 20));
        btnMostrarVentas.setPreferredSize(new java.awt.Dimension(200, 20));
        btnMostrarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarVentasActionPerformed(evt);
            }
        });

        btnMostrarCotizaciones.setBackground(java.awt.SystemColor.controlHighlight);
        btnMostrarCotizaciones.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnMostrarCotizaciones.setText("Cotizaciones");
        btnMostrarCotizaciones.setBorder(null);
        btnMostrarCotizaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarCotizaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMostrarCotizaciones.setMaximumSize(new java.awt.Dimension(200, 20));
        btnMostrarCotizaciones.setMinimumSize(new java.awt.Dimension(200, 20));
        btnMostrarCotizaciones.setPreferredSize(new java.awt.Dimension(200, 20));
        btnMostrarCotizaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarCotizacionesActionPerformed(evt);
            }
        });

        btnMostrarFacturas.setBackground(java.awt.SystemColor.controlHighlight);
        btnMostrarFacturas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnMostrarFacturas.setText("Facturas");
        btnMostrarFacturas.setBorder(null);
        btnMostrarFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarFacturas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMostrarFacturas.setMaximumSize(new java.awt.Dimension(200, 20));
        btnMostrarFacturas.setMinimumSize(new java.awt.Dimension(200, 20));
        btnMostrarFacturas.setPreferredSize(new java.awt.Dimension(200, 20));
        btnMostrarFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarFacturasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelProveedoresLayout = new javax.swing.GroupLayout(PanelProveedores);
        PanelProveedores.setLayout(PanelProveedoresLayout);
        PanelProveedoresLayout.setHorizontalGroup(
            PanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelProveedoresLayout.createSequentialGroup()
                        .addGroup(PanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMostrarAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMostrarCotizaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMostrarServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                    .addGroup(PanelProveedoresLayout.createSequentialGroup()
                        .addComponent(btnMostrarFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        PanelProveedoresLayout.setVerticalGroup(
            PanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProveedoresLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarCotizaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelProduccion.setBackground(java.awt.SystemColor.control);
        PanelProduccion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnMostrarPersonalProduccion.setBackground(java.awt.SystemColor.controlHighlight);
        btnMostrarPersonalProduccion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnMostrarPersonalProduccion.setText("Gestión Personal Producción");
        btnMostrarPersonalProduccion.setBorder(null);
        btnMostrarPersonalProduccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarPersonalProduccion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMostrarPersonalProduccion.setMaximumSize(new java.awt.Dimension(200, 20));
        btnMostrarPersonalProduccion.setMinimumSize(new java.awt.Dimension(200, 20));
        btnMostrarPersonalProduccion.setPreferredSize(new java.awt.Dimension(200, 20));
        btnMostrarPersonalProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPersonalProduccionActionPerformed(evt);
            }
        });

        btnBuscarSolicitudes.setBackground(java.awt.SystemColor.controlHighlight);
        btnBuscarSolicitudes.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnBuscarSolicitudes.setText(" Solicitudes de Mantenimiento");
        btnBuscarSolicitudes.setBorder(null);
        btnBuscarSolicitudes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarSolicitudes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarSolicitudes.setMaximumSize(new java.awt.Dimension(200, 20));
        btnBuscarSolicitudes.setMinimumSize(new java.awt.Dimension(200, 20));
        btnBuscarSolicitudes.setPreferredSize(new java.awt.Dimension(200, 20));
        btnBuscarSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarSolicitudesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelProduccionLayout = new javax.swing.GroupLayout(PanelProduccion);
        PanelProduccion.setLayout(PanelProduccionLayout);
        PanelProduccionLayout.setHorizontalGroup(
            PanelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProduccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMostrarPersonalProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelProduccionLayout.setVerticalGroup(
            PanelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProduccionLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnMostrarPersonalProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelMantenimiento.setBackground(java.awt.SystemColor.control);
        PanelMantenimiento.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnBuscarMaquinas.setBackground(java.awt.SystemColor.controlHighlight);
        btnBuscarMaquinas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnBuscarMaquinas.setText("Gestión Máquinas");
        btnBuscarMaquinas.setBorder(null);
        btnBuscarMaquinas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarMaquinas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarMaquinas.setMaximumSize(new java.awt.Dimension(200, 20));
        btnBuscarMaquinas.setMinimumSize(new java.awt.Dimension(200, 20));
        btnBuscarMaquinas.setPreferredSize(new java.awt.Dimension(200, 20));
        btnBuscarMaquinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMaquinasActionPerformed(evt);
            }
        });

        btnMostrarMantenimientos.setBackground(java.awt.SystemColor.controlHighlight);
        btnMostrarMantenimientos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnMostrarMantenimientos.setText("Programación Mantenimientos");
        btnMostrarMantenimientos.setBorder(null);
        btnMostrarMantenimientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarMantenimientos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMostrarMantenimientos.setMaximumSize(new java.awt.Dimension(60, 20));
        btnMostrarMantenimientos.setMinimumSize(new java.awt.Dimension(60, 20));
        btnMostrarMantenimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarMantenimientosActionPerformed(evt);
            }
        });

        btnMostrarPersonalMant.setBackground(java.awt.SystemColor.controlHighlight);
        btnMostrarPersonalMant.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnMostrarPersonalMant.setText("Gestión Personal  Mantenimiento");
        btnMostrarPersonalMant.setBorder(null);
        btnMostrarPersonalMant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarPersonalMant.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMostrarPersonalMant.setMaximumSize(new java.awt.Dimension(60, 20));
        btnMostrarPersonalMant.setMinimumSize(new java.awt.Dimension(60, 20));
        btnMostrarPersonalMant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPersonalMantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMantenimientoLayout = new javax.swing.GroupLayout(PanelMantenimiento);
        PanelMantenimiento.setLayout(PanelMantenimientoLayout);
        PanelMantenimientoLayout.setHorizontalGroup(
            PanelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMantenimientoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMostrarPersonalMant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarMantenimientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarMaquinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87))
        );
        PanelMantenimientoLayout.setVerticalGroup(
            PanelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMantenimientoLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(btnBuscarMaquinas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMostrarPersonalMant, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMostrarMantenimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tablaMaquinas.setAutoCreateRowSorter(true);
        tablaMaquinas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaMaquinas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tablaMaquinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", ""
            }
        ));
        tablaMaquinas.setShowGrid(true);
        jScrollPane1.setViewportView(tablaMaquinas);

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(PanelProveedores, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(PanelProduccion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(PanelMantenimiento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(PanelMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PanelProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(PanelProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelProduccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        MenuMantenimiento.setText("Mantenimiento");
        MenuMantenimiento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        MenuMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMantenimientoActionPerformed(evt);
            }
        });

        MenuItemGestionMaquinas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        MenuItemGestionMaquinas.setText("Gestión de Máquinas");
        MenuItemGestionMaquinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemGestionMaquinasActionPerformed(evt);
            }
        });
        MenuMantenimiento.add(MenuItemGestionMaquinas);

        MenuItemPersonalMant.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        MenuItemPersonalMant.setText("Gestión de Personal");
        MenuItemPersonalMant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemPersonalMantActionPerformed(evt);
            }
        });
        MenuMantenimiento.add(MenuItemPersonalMant);

        MenuItemProgMant.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        MenuItemProgMant.setText("Programación de Mantenimientos");
        MenuItemProgMant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemProgMantActionPerformed(evt);
            }
        });
        MenuMantenimiento.add(MenuItemProgMant);

        jMenuBar1.add(MenuMantenimiento);

        MenuProduccion.setText("Produccion");
        MenuProduccion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        MenuProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProduccionActionPerformed(evt);
            }
        });

        MenuItemPersonalPro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        MenuItemPersonalPro.setText("Gestión de Personal");
        MenuItemPersonalPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemPersonalProActionPerformed(evt);
            }
        });
        MenuProduccion.add(MenuItemPersonalPro);

        MenuItemSolicitudes.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        MenuItemSolicitudes.setText("Solicitudes de Mantenimiento");
        MenuItemSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemSolicitudesActionPerformed(evt);
            }
        });
        MenuProduccion.add(MenuItemSolicitudes);

        jMenuBar1.add(MenuProduccion);

        MenuProveedores.setText("Proveedores");
        MenuProveedores.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        MenuProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProveedoresActionPerformed(evt);
            }
        });

        MenuItemAlquiler.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        MenuItemAlquiler.setText("Alquiler");
        MenuItemAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAlquilerActionPerformed(evt);
            }
        });
        MenuProveedores.add(MenuItemAlquiler);

        MenuItemCotizaciones.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        MenuItemCotizaciones.setText("Cotizaciones");
        MenuItemCotizaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCotizacionesActionPerformed(evt);
            }
        });
        MenuProveedores.add(MenuItemCotizaciones);

        MenuItemFacturas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        MenuItemFacturas.setText("Facturas");
        MenuItemFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemFacturasActionPerformed(evt);
            }
        });
        MenuProveedores.add(MenuItemFacturas);

        MenuItemGestionProveedores.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        MenuItemGestionProveedores.setText("Gestión de Proveedores");
        MenuItemGestionProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemGestionProveedoresActionPerformed(evt);
            }
        });
        MenuProveedores.add(MenuItemGestionProveedores);

        MenuItemServicios.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        MenuItemServicios.setText("Servicios");
        MenuItemServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemServiciosActionPerformed(evt);
            }
        });
        MenuProveedores.add(MenuItemServicios);

        MenuItemVentas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        MenuItemVentas.setText("Ventas");
        MenuItemVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemVentasActionPerformed(evt);
            }
        });
        MenuProveedores.add(MenuItemVentas);

        jMenuBar1.add(MenuProveedores);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrarMaquinas(String tabla) {
        String sql = ("SELECT * FROM " + tabla);
        Statement st;
        Conexion con = new Conexion();
        Connection Conexion = con.getConexion();
        System.out.println(sql);
        DefaultTableModel tmaquina = new DefaultTableModel();

        tmaquina.addColumn("");
        tmaquina.addColumn("ID");
        tmaquina.addColumn("Codigo");
        tmaquina.addColumn("Maquina");
        tmaquina.addColumn("Marca");
        tmaquina.addColumn("");

        tablaMaquinas.setModel(tmaquina);

        String[] datos = new String[5];

        try {
            st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[1] = rs.getString(1);
                datos[2] = rs.getString(2);
                datos[3] = rs.getString(3);
                datos[4] = rs.getString(4);

                tmaquina.addRow(datos);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " " + "Error");
        }

    }

    public void mostrarSolicitudes(String tabla) {
        String sql = ("SELECT * FROM " + tabla);
        Statement st;
        Conexion con = new Conexion();
        Connection Conexion = con.getConexion();
        System.out.println(sql);
        DefaultTableModel tmaquina = new DefaultTableModel();

        tmaquina.addColumn("");
        tmaquina.addColumn("ID");
        tmaquina.addColumn("Codigo");
        tmaquina.addColumn("Maquina");
        tmaquina.addColumn("Area");
        tmaquina.addColumn("Falla");
        tmaquina.addColumn("");

        tablaMaquinas.setModel(tmaquina);

        String[] datos = new String[6];

        try {
            st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[1] = rs.getString(1);
                datos[2] = rs.getString(2);
                datos[3] = rs.getString(3);
                datos[4] = rs.getString(4);
                datos[5] = rs.getString(5);
                
                tmaquina.addRow(datos);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }

    }

    public void mostrarProveedor(String tabla) {
        String sql = ("SELECT * FROM " + tabla);
        Statement st;
        Conexion con = new Conexion();
        Connection Conexion = con.getConexion();
        System.out.println(sql);
        DefaultTableModel tmaquina = new DefaultTableModel();

        tmaquina.addColumn("");
        tmaquina.addColumn("ID");
        tmaquina.addColumn("Codigo Proveedor");
        tmaquina.addColumn("Nombre");
        tmaquina.addColumn("Ciudad");
        tmaquina.addColumn("Telefono");
        tmaquina.addColumn("Correo");
        tmaquina.addColumn("Direccion");
        tmaquina.addColumn("");

        tablaMaquinas.setModel(tmaquina);

        String[] datos = new String[9];    // Inicio del arreglo Datos

        try {
            st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[1] = rs.getString(1);    // --> Estos son los indices del arreglo, su numero debe ser menor al inicializado en el arreglo datos, = datos=                                                 9, ciclo while = 7, cuando el numero de indices del ciclo while supere a los impuestos al inicio del arreglo,                                                    se presentara un error
                datos[2] = rs.getString(2);
                datos[3] = rs.getString(3);
                datos[4] = rs.getString(4);
                datos[5] = rs.getString(5);
                datos[6] = rs.getString(6);
                datos[7] = rs.getString(7);

                tmaquina.addRow(datos);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }

    }

    public void mostrarMantenimientos(String tabla) {
        String sql = ("SELECT * FROM " + tabla);
        Statement st;
        Conexion con = new Conexion();
        Connection Conexion = con.getConexion();
        System.out.println(sql);
        DefaultTableModel tmaquina = new DefaultTableModel();

        tmaquina.addColumn("");
        tmaquina.addColumn("ID");
        tmaquina.addColumn("Codigo Maquina");
        tmaquina.addColumn("Maquina");
        tmaquina.addColumn("Fecha Inicio");
        tmaquina.addColumn("Fecha fin");
        tmaquina.addColumn("Ejecuta");
        tmaquina.addColumn("Mantenimiento");
        tmaquina.addColumn("");

        tablaMaquinas.setModel(tmaquina);

        String[] datos = new String[9];    // Inicio del arreglo Datos

        try {
            st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[1] = rs.getString(1);
                datos[2] = rs.getString(2);
                datos[3] = rs.getString(3);
                datos[4] = rs.getString(4);
                datos[5] = rs.getString(5);
                datos[6] = rs.getString(6);
                datos[7] = rs.getString(7);

                tmaquina.addRow(datos);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }

    }

    public void mostrarPersonalMant(String tabla) {
        String sql = ("SELECT * FROM " + tabla);
        Statement st;
        Conexion con = new Conexion();
        Connection Conexion = con.getConexion();
        System.out.println(sql);
        DefaultTableModel tmaquina = new DefaultTableModel();

        tmaquina.addColumn("");
        tmaquina.addColumn("ID");
        tmaquina.addColumn("Codigo Empleado");
        tmaquina.addColumn("Nombres");
        tmaquina.addColumn("Apellidos");
        tmaquina.addColumn("Cargo");
        tmaquina.addColumn("Género");
        tmaquina.addColumn("");

        tablaMaquinas.setModel(tmaquina);

        String[] datos = new String[8];    // Inicio del arreglo Datos

        try {
            st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[1] = rs.getString(1);
                datos[2] = rs.getString(2);
                datos[3] = rs.getString(3);
                datos[4] = rs.getString(4);
                datos[5] = rs.getString(5);
                datos[6] = rs.getString(6);

                tmaquina.addRow(datos);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }

    }

    public void mostrarPersonalProd(String tabla) {
        String sql = ("SELECT * FROM " + tabla);
        Statement st;
        Conexion con = new Conexion();
        Connection Conexion = con.getConexion();
        System.out.println(sql);
        DefaultTableModel tmaquina = new DefaultTableModel();

        tmaquina.addColumn("");
        tmaquina.addColumn("ID");
        tmaquina.addColumn("Codigo Empleado");
        tmaquina.addColumn("Nombres");
        tmaquina.addColumn("Apellidos");
        tmaquina.addColumn("Cargo");
        tmaquina.addColumn("Género");
        tmaquina.addColumn("");

        tablaMaquinas.setModel(tmaquina);

        String[] datos = new String[8];    // Inicio del arreglo Datos

        try {
            st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[1] = rs.getString(1);
                datos[2] = rs.getString(2);
                datos[3] = rs.getString(3);
                datos[4] = rs.getString(4);
                datos[5] = rs.getString(5);
                datos[6] = rs.getString(6);

                tmaquina.addRow(datos);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }

    }

    public void mostrarCotizaciones(String tabla) {
        String sql = ("SELECT * FROM " + tabla);
        Statement st;
        Conexion con = new Conexion();
        Connection Conexion = con.getConexion();
        System.out.println(sql);
        DefaultTableModel tmaquina = new DefaultTableModel();

        tmaquina.addColumn("");
        tmaquina.addColumn("ID");
        tmaquina.addColumn("Codigo Cotización");
        tmaquina.addColumn("Concepto");
        tmaquina.addColumn("Proveedor");
        tmaquina.addColumn("Fecha Cotización");
        tmaquina.addColumn("Valor");
        tmaquina.addColumn("");

        tablaMaquinas.setModel(tmaquina);

        String[] datos = new String[8];    // Inicio del arreglo Datos

        try {
            st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[1] = rs.getString(1);
                datos[2] = rs.getString(2);
                datos[3] = rs.getString(3);
                datos[4] = rs.getString(4);
                datos[5] = rs.getString(5);
                datos[6] = rs.getString(6);

                tmaquina.addRow(datos);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }

    }

    public void mostrarAlquiler(String tabla) {
        String sql = ("SELECT * FROM " + tabla);
        Statement st;
        Conexion con = new Conexion();
        Connection Conexion = con.getConexion();
        System.out.println(sql);
        DefaultTableModel tmaquina = new DefaultTableModel();

        tmaquina.addColumn("");
        tmaquina.addColumn("ID");
        tmaquina.addColumn("Codigo");
        tmaquina.addColumn("Concepto");
        tmaquina.addColumn("Fecha Alquiler");
        tmaquina.addColumn("Fecha Devolución");
        tmaquina.addColumn("Proveedor");
        tmaquina.addColumn("Valor");
        tmaquina.addColumn("");

        tablaMaquinas.setModel(tmaquina);

        String[] datos = new String[9];    // Inicio del arreglo Datos

        try {
            st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[1] = rs.getString(1);
                datos[2] = rs.getString(2);
                datos[3] = rs.getString(3);
                datos[4] = rs.getString(4);
                datos[5] = rs.getString(5);
                datos[6] = rs.getString(6);
                datos[7] = rs.getString(7);

                tmaquina.addRow(datos);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }

    }

    public void mostrarVentas(String tabla) {
        String sql = ("SELECT * FROM " + tabla);
        Statement st;
        Conexion con = new Conexion();
        Connection Conexion = con.getConexion();
        System.out.println(sql);
        DefaultTableModel tmaquina = new DefaultTableModel();

        tmaquina.addColumn("");
        tmaquina.addColumn("ID");
        tmaquina.addColumn("Código Venta");
        tmaquina.addColumn("Concepto");
        tmaquina.addColumn("Proveedor");
        tmaquina.addColumn("Fecha");
        tmaquina.addColumn("Valor");
        tmaquina.addColumn("");

        tablaMaquinas.setModel(tmaquina);

        String[] datos = new String[8];    // Inicio del arreglo Datos

        try {
            st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[1] = rs.getString(1);
                datos[2] = rs.getString(2);
                datos[3] = rs.getString(3);
                datos[4] = rs.getString(4);
                datos[5] = rs.getString(5);
                datos[6] = rs.getString(6);

                tmaquina.addRow(datos);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }

    }

    public void mostrarServicios(String tabla) {
        String sql = ("SELECT * FROM " + tabla);
        Statement st;
        Conexion con = new Conexion();
        Connection Conexion = con.getConexion();
        System.out.println(sql);
        DefaultTableModel tmaquina = new DefaultTableModel();

        tmaquina.addColumn("");
        tmaquina.addColumn("ID");
        tmaquina.addColumn("Código Servicio");
        tmaquina.addColumn("Concepto");
        tmaquina.addColumn("Proveedor");
        tmaquina.addColumn("Fecha");
        tmaquina.addColumn("Valor");
        tmaquina.addColumn("");

        tablaMaquinas.setModel(tmaquina);

        String[] datos = new String[8];    // Inicio del arreglo Datos

        try {
            st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[1] = rs.getString(1);
                datos[2] = rs.getString(2);
                datos[3] = rs.getString(3);
                datos[4] = rs.getString(4);
                datos[5] = rs.getString(5);
                datos[6] = rs.getString(6);

                tmaquina.addRow(datos);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }

    }

    public void mostrarFacturas(String tabla) {
        String sql = ("SELECT * FROM " + tabla);
        Statement st;
        Conexion con = new Conexion();
        Connection Conexion = con.getConexion();
        System.out.println(sql);
        DefaultTableModel tmaquina = new DefaultTableModel();

        tmaquina.addColumn("");
        tmaquina.addColumn("ID");
        tmaquina.addColumn("Código Factura");
        tmaquina.addColumn("Concepto");
        tmaquina.addColumn("Proveedor");
        tmaquina.addColumn("Fecha");
        tmaquina.addColumn("Valor");
        tmaquina.addColumn("");

        tablaMaquinas.setModel(tmaquina);

        String[] datos = new String[8];    // Inicio del arreglo Datos

        try {
            st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[1] = rs.getString(1);
                datos[2] = rs.getString(2);
                datos[3] = rs.getString(3);
                datos[4] = rs.getString(4);
                datos[5] = rs.getString(5);
                datos[6] = rs.getString(6);

                tmaquina.addRow(datos);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }

    }


    private void MenuItemProgMantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemProgMantActionPerformed
        progMant.setVisible(true);


    }//GEN-LAST:event_MenuItemProgMantActionPerformed


    private void MenuMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMantenimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuMantenimientoActionPerformed

    private void MenuProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuProduccionActionPerformed

    private void MenuProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuProveedoresActionPerformed


    private void MenuItemSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSolicitudesActionPerformed
        internalSolicitudes.setVisible(true);

    }//GEN-LAST:event_MenuItemSolicitudesActionPerformed

    private void MenuItemCotizacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCotizacionesActionPerformed

        cotizaciones.setVisible(true);
    }//GEN-LAST:event_MenuItemCotizacionesActionPerformed

    private void MenuItemVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemVentasActionPerformed

        ventas.setVisible(true);

    }//GEN-LAST:event_MenuItemVentasActionPerformed

    private void MenuItemAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAlquilerActionPerformed
        alquiler.setVisible(true);


    }//GEN-LAST:event_MenuItemAlquilerActionPerformed

    private void MenuItemServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemServiciosActionPerformed
        servicios.setVisible(true);

    }//GEN-LAST:event_MenuItemServiciosActionPerformed

    private void MenuItemFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemFacturasActionPerformed
        facturas.setVisible(true);

    }//GEN-LAST:event_MenuItemFacturasActionPerformed

    private void MenuItemPersonalMantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemPersonalMantActionPerformed
        personalMant.setVisible(true);

    }//GEN-LAST:event_MenuItemPersonalMantActionPerformed

    private void MenuItemPersonalProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemPersonalProActionPerformed
        personalPro.setVisible(true);

    }//GEN-LAST:event_MenuItemPersonalProActionPerformed

    private void MenuItemGestionProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemGestionProveedoresActionPerformed
        proveedores.setVisible(true);
    }//GEN-LAST:event_MenuItemGestionProveedoresActionPerformed

    private void MenuItemGestionMaquinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemGestionMaquinasActionPerformed

        maquinas.setVisible(true);

    }//GEN-LAST:event_MenuItemGestionMaquinasActionPerformed

    private void btnBuscarMaquinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMaquinasActionPerformed

        mostrarMaquinas("maquinas");

    }//GEN-LAST:event_btnBuscarMaquinasActionPerformed

    private void btnBuscarSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarSolicitudesActionPerformed
        mostrarSolicitudes("solicitudes");

    }//GEN-LAST:event_btnBuscarSolicitudesActionPerformed

    private void btnBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProveedorActionPerformed

        mostrarProveedor("gestion_proveedores");

    }//GEN-LAST:event_btnBuscarProveedorActionPerformed

    private void btnMostrarMantenimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarMantenimientosActionPerformed

        mostrarMantenimientos("pro_mant");

    }//GEN-LAST:event_btnMostrarMantenimientosActionPerformed

    private void btnMostrarPersonalMantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPersonalMantActionPerformed

        mostrarPersonalMant("personal_mant");

    }//GEN-LAST:event_btnMostrarPersonalMantActionPerformed

    private void btnMostrarPersonalProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPersonalProduccionActionPerformed

        mostrarPersonalProd("personal_pro");

    }//GEN-LAST:event_btnMostrarPersonalProduccionActionPerformed

    private void btnMostrarCotizacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCotizacionesActionPerformed
        mostrarCotizaciones("cotizaciones");


    }//GEN-LAST:event_btnMostrarCotizacionesActionPerformed

    private void btnMostrarAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarAlquilerActionPerformed
        mostrarAlquiler("alquiler");


    }//GEN-LAST:event_btnMostrarAlquilerActionPerformed

    private void btnMostrarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarVentasActionPerformed
        mostrarVentas("ventas");
    }//GEN-LAST:event_btnMostrarVentasActionPerformed

    private void btnMostrarServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarServiciosActionPerformed
        mostrarServicios("servicios");

    }//GEN-LAST:event_btnMostrarServiciosActionPerformed

    private void btnMostrarFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarFacturasActionPerformed
        mostrarFacturas("facturas");

    }//GEN-LAST:event_btnMostrarFacturasActionPerformed

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
            java.util.logging.Logger.getLogger(frmMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmMaquina().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem MenuItemAlquiler;
    public javax.swing.JMenuItem MenuItemCotizaciones;
    public javax.swing.JMenuItem MenuItemFacturas;
    public javax.swing.JMenuItem MenuItemGestionMaquinas;
    public javax.swing.JMenuItem MenuItemGestionProveedores;
    public javax.swing.JMenuItem MenuItemPersonalMant;
    public javax.swing.JMenuItem MenuItemPersonalPro;
    public javax.swing.JMenuItem MenuItemProgMant;
    public javax.swing.JMenuItem MenuItemServicios;
    public javax.swing.JMenuItem MenuItemSolicitudes;
    public javax.swing.JMenuItem MenuItemVentas;
    public javax.swing.JMenu MenuMantenimiento;
    public javax.swing.JMenu MenuProduccion;
    public javax.swing.JMenu MenuProveedores;
    private javax.swing.JPanel PanelMantenimiento;
    private javax.swing.JPanel PanelProduccion;
    private javax.swing.JPanel PanelProveedores;
    private javax.swing.JButton btnBuscarMaquinas;
    private javax.swing.JButton btnBuscarProveedor;
    private javax.swing.JButton btnBuscarSolicitudes;
    private javax.swing.JButton btnMostrarAlquiler;
    private javax.swing.JButton btnMostrarCotizaciones;
    private javax.swing.JButton btnMostrarFacturas;
    private javax.swing.JButton btnMostrarMantenimientos;
    private javax.swing.JButton btnMostrarPersonalMant;
    private javax.swing.JButton btnMostrarPersonalProduccion;
    private javax.swing.JButton btnMostrarServicios;
    private javax.swing.JButton btnMostrarVentas;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablaMaquinas;
    // End of variables declaration//GEN-END:variables
}
