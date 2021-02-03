package vistas;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelosDAO.Album;
import modelosDAO.AlbumDAO;
import modelosDAO.PrepareTransaccionDAO;
import utiles.Conexion;
import utiles.ManejadorImagenes;
import utiles.PreparaTransaccion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author igorr
 */
public class iPrincipal extends javax.swing.JFrame {

    AlbumDAO miAlbumDAO = new AlbumDAO();
    PrepareTransaccionDAO miPTDAO = new PrepareTransaccionDAO();
    Album miAlbum = new Album();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    int id;
    boolean permiso = false;
    String miImagen;
    String url = "src//sql//discografia2.sql";
    String url_album = "src//sql//album.txt";
    String url_cancion = "src//sql//cancion.txt";
    String parametro_busqueda;

    /**
     * Creates new form iPrincipal
     */
    public iPrincipal() {

        initComponents();
        ventanaInformacion.setEditable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jScrolPanel = new javax.swing.JScrollPane();
        ventanaInformacion = new javax.swing.JTextArea();
        AddAlbum = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fomrNombreAlbum = new javax.swing.JTextField();
        fomrAnnoPublicacion = new javax.swing.JTextField();
        formGrupoMusical = new javax.swing.JTextField();
        botonAddAlbum = new javax.swing.JButton();
        botonActualizarAlbum = new javax.swing.JButton();
        botonBorrarAlbum = new javax.swing.JButton();
        botonBorrarAlbum1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        formIMagen = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAlbum = new javax.swing.JTable();
        comboBoxSeleccionsBusqueda = new javax.swing.JComboBox<>();
        formParametroBusqueda = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        desconexion = new javax.swing.JMenuItem();
        conexion = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ventanaInformacion.setColumns(20);
        ventanaInformacion.setRows(5);
        jScrolPanel.setViewportView(ventanaInformacion);

        jLabel1.setText("Año de publicacion: ");

        jLabel2.setText("Nombre de album: ");

        jLabel3.setText("Grupo: ");

        botonAddAlbum.setText("Add Album");
        botonAddAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAddAlbumActionPerformed(evt);
            }
        });

        botonActualizarAlbum.setText("Actualizar");
        botonActualizarAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarAlbumActionPerformed(evt);
            }
        });

        botonBorrarAlbum.setText("Borrar");
        botonBorrarAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarAlbumActionPerformed(evt);
            }
        });

        botonBorrarAlbum1.setText("Añadir Cancion");
        botonBorrarAlbum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarAlbum1ActionPerformed(evt);
            }
        });

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Imagen:");

        javax.swing.GroupLayout AddAlbumLayout = new javax.swing.GroupLayout(AddAlbum);
        AddAlbum.setLayout(AddAlbumLayout);
        AddAlbumLayout.setHorizontalGroup(
            AddAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddAlbumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AddAlbumLayout.createSequentialGroup()
                        .addGroup(AddAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AddAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fomrNombreAlbum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                            .addComponent(formGrupoMusical)))
                    .addGroup(AddAlbumLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(fomrAnnoPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddAlbumLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(formIMagen, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(AddAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonBorrarAlbum1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAddAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonActualizarAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBorrarAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        AddAlbumLayout.setVerticalGroup(
            AddAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddAlbumLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(AddAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonAddAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addGroup(AddAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fomrNombreAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonActualizarAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(fomrAnnoPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AddAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddAlbumLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(AddAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botonBorrarAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AddAlbumLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(formIMagen, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(AddAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formGrupoMusical, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBorrarAlbum1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );

        tablaAlbum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre de album", "Año publicacion", "Imagen", "Grupo musical"
            }
        ));
        tablaAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAlbumMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaAlbum);

        comboBoxSeleccionsBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona categoria", "anno", "nombre_album" }));

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jScrolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(comboBoxSeleccionsBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(formParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxSeleccionsBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(formParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );

        jMenu1.setText("File");

        desconexion.setText("Desconexion");
        desconexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desconexionActionPerformed(evt);
            }
        });
        jMenu1.add(desconexion);

        conexion.setText("Conexion");
        conexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conexionActionPerformed(evt);
            }
        });
        jMenu1.add(conexion);

        jMenuItem1.setText("Reiniciar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void conexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conexionActionPerformed
       limpiarTabla();
        if (permiso == false) {
            Conexion miConexion = new Conexion();
            miConexion.abreConexion();
            dameTodo();
            permiso =true;
            ventanaInformacion.append("Se ha abierto conexion!\n");
        } else {
            ventanaInformacion.append("no se ha podido abrir la conexion!\n");
        }
    }//GEN-LAST:event_conexionActionPerformed

    private void desconexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desconexionActionPerformed
       limpiarTabla();
        if (permiso == true) {
            Conexion miConexion = new Conexion();
            miConexion.cierraConexion();
            permiso = false;
            ventanaInformacion.setText("");
            ventanaInformacion.append("Se ha cerrado la conexion!!!\n");
        } else {
            ventanaInformacion.append("no se ha podido cerrar la conexion!!!\n");
        }

    }//GEN-LAST:event_desconexionActionPerformed

    private void botonAddAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAddAlbumActionPerformed
        agregar();
        limpiarTabla();
        dameTodo();
        limpiaForms();

    }//GEN-LAST:event_botonAddAlbumActionPerformed

    private void botonActualizarAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarAlbumActionPerformed
        actualizar();
        limpiarTabla();
        dameTodo();
    }//GEN-LAST:event_botonActualizarAlbumActionPerformed

    private void botonBorrarAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarAlbumActionPerformed
        borrar();
        limpiarTabla();
        dameTodo();
    }//GEN-LAST:event_botonBorrarAlbumActionPerformed

    private void tablaAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAlbumMouseClicked
        int fila = tablaAlbum.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "no se ha seleccionado ninguna fila");
        } else {
            id = Integer.parseInt(tablaAlbum.getValueAt(fila, 0).toString());
            String nombre = tablaAlbum.getValueAt(fila, 1).toString();
            String anno = tablaAlbum.getValueAt(fila, 2).toString();
            miImagen = tablaAlbum.getValueAt(fila, 3).toString();
            String grupo_musical = tablaAlbum.getValueAt(fila, 4).toString();

            fomrNombreAlbum.setText(nombre);
            fomrAnnoPublicacion.setText(anno);
            formIMagen.setText(miImagen);
            formGrupoMusical.setText(grupo_musical);
        }
    }//GEN-LAST:event_tablaAlbumMouseClicked

    private void botonBorrarAlbum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarAlbum1ActionPerformed
        int fila = tablaAlbum.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "no has seleccionado ningun album");
        } else {
            id = Integer.parseInt(tablaAlbum.getValueAt(fila, 0).toString());
            iAddCancion cancion = new iAddCancion(id, miImagen);
            System.out.println(miImagen + "<<<<<=========");
            cancion.setVisible(true);

        }

    }//GEN-LAST:event_botonBorrarAlbum1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ManejadorImagenes mi = new ManejadorImagenes();

        try {
            miImagen = mi.copiaFile(mi.dameFile());
            formIMagen.setText(miImagen);
        } catch (IOException ex) {
            Logger.getLogger(iPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        PreparaTransaccion pt = new PreparaTransaccion(url);
        miPTDAO.reiniciarBBDD(pt.getMiLista());
        PreparaTransaccion pt_album = new PreparaTransaccion(url_album);
        miPTDAO.rellenarAlbum(pt_album.getMiLista());
        PreparaTransaccion pt_cancion = new PreparaTransaccion(url_cancion);
        miPTDAO.rellenarAlbum(pt_cancion.getMiLista());


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (comboBoxSeleccionsBusqueda.getSelectedItem().toString().equals("Selecciona categoria")) {
            JOptionPane.showMessageDialog(this, "no has seleccionado categoria de busqueda");
        } else if (comboBoxSeleccionsBusqueda.getSelectedItem().toString().equals("nombre_album")) {
            getParametroBusqueda();
            limpiarTabla();
            dameBusquedaAlbum(miAlbumDAO.buscarAlbumPorNombre_Album(parametro_busqueda));
        } else if (comboBoxSeleccionsBusqueda.getSelectedItem().toString().equals("anno")) {
            getParametroBusqueda();
            int anno=Integer.parseInt(parametro_busqueda);
            limpiarTabla();
            dameBusquedaAlbum( miAlbumDAO.buscarAlbumPorAnno(anno));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(iPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iPrincipal().setVisible(true);
            }
        });
    }

    void getParametroBusqueda() {
        parametro_busqueda = formParametroBusqueda.getText();
        formParametroBusqueda.setText("");
    }

    void dameTodo() {
        List<Album> miListaAlbumes = miAlbumDAO.dameTodo();
        modeloTabla = (DefaultTableModel) tablaAlbum.getModel();
        Object[] ob = new Object[5];
        for (int i = 0; i < miListaAlbumes.size(); i++) {
            ob[0] = miListaAlbumes.get(i).getId();
            ob[1] = miListaAlbumes.get(i).getNombre();
            ob[2] = miListaAlbumes.get(i).getAnno();
            ob[3] = miListaAlbumes.get(i).getImagen();
            ob[4] = miListaAlbumes.get(i).getGrupo_musical();
            modeloTabla.addRow(ob);

        }
        tablaAlbum.setModel(modeloTabla);

    }

    void dameBusquedaAlbum(List<Album> miAlbum) {
        modeloTabla = (DefaultTableModel) tablaAlbum.getModel();
        Object[] ob = new Object[5];
        for (int i = 0; i < miAlbum.size(); i++) {
            ob[0] = miAlbum.get(i).getId();
            ob[1] = miAlbum.get(i).getNombre();
            ob[2] = miAlbum.get(i).getAnno();
            ob[3] = miAlbum.get(i).getImagen();
            ob[4] = miAlbum.get(i).getGrupo_musical();
            modeloTabla.addRow(ob);

        }
        tablaAlbum.setModel(modeloTabla);
    }

    private void limpiaForms() {
        fomrNombreAlbum.setText("");
        fomrAnnoPublicacion.setText("");
        formGrupoMusical.setText("");
        formIMagen.setText("");
        fomrNombreAlbum.requestFocus();
    }

    private void agregar() {
        String nombre = fomrNombreAlbum.getText();
        String anno = fomrAnnoPublicacion.getText();
        String imagen = formIMagen.getText();
        String grupo_musical = formGrupoMusical.getText();

        Object[] ob = new Object[5];
        ob[0] = nombre;
        ob[1] = anno;
        if (formIMagen.getText().isEmpty()) {
            ob[2] = new Album().getImagen();
        } else {
            ob[2] = imagen;
            System.out.println(imagen + "aqui que pasa?");
        }
        ob[3] = grupo_musical;
        System.out.println(nombre + " " + anno + " " + grupo_musical);
        miAlbumDAO.guardar(ob);
        limpiaForms();
        ventanaInformacion.append("se ha guardado correctamente el album nuevo!!!\n");

    }

    private void actualizar() {
        int fila = tablaAlbum.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "no has seleccionado nada para actualizar, selecciona!!!");
        } else {
            String nombre = fomrNombreAlbum.getText();
            String anno = fomrAnnoPublicacion.getText();
            String imagen = formIMagen.getText();
            String grupo_musical = formGrupoMusical.getText();

            Object[] ob = new Object[5];
            ob[0] = nombre;
            ob[1] = anno;
            ob[2] = imagen;
            ob[3] = grupo_musical;
            ob[4] = id;
            miAlbumDAO.actuaizar(ob);
            limpiaForms();
            ventanaInformacion.append("Se ha actualizado correctamente!\n");
        }

    }

    private void borrar() {
        int fila = tablaAlbum.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "no has seleccionado nada para actualizar, selecciona!!!");
        } else {
            miAlbumDAO.eliminar(id);
            limpiaForms();
            ventanaInformacion.append("se ha borrado el registro correctamente!!!\n");
        }
    }

    void limpiarTabla() {
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            modeloTabla.removeRow(i);
            i = i - 1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddAlbum;
    private javax.swing.JButton botonActualizarAlbum;
    private javax.swing.JButton botonAddAlbum;
    private javax.swing.JButton botonBorrarAlbum;
    private javax.swing.JButton botonBorrarAlbum1;
    private javax.swing.JComboBox<String> comboBoxSeleccionsBusqueda;
    private javax.swing.JMenuItem conexion;
    private javax.swing.JMenuItem desconexion;
    private javax.swing.JTextField fomrAnnoPublicacion;
    private javax.swing.JTextField fomrNombreAlbum;
    private javax.swing.JTextField formGrupoMusical;
    private javax.swing.JTextField formIMagen;
    private javax.swing.JTextField formParametroBusqueda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrolPanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tablaAlbum;
    private javax.swing.JTextArea ventanaInformacion;
    // End of variables declaration//GEN-END:variables

}
