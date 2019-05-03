package tarealp1;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
public class VentanaRegistro extends javax.swing.JFrame {
    //Listas donde se almacenan los datos de los futbolistas
    public static List <Futbolista> grupoFutbolistas = new ArrayList<>();
    public static List <String> listaLugares = new ArrayList<>();
    public static List <String> listaEntrenadores = new ArrayList<>();
    public static List <String> listaMasajista = new ArrayList<>();
    
    //Definicion del modelo de datos del Jlist
    DefaultListModel modelo = new DefaultListModel();
    
    public VentanaRegistro() {
        initComponents();
        if(grupoFutbolistas.isEmpty()){
            btnEditar.setEnabled(false);
            btnEliminar.setEnabled(false);
        }
        deshabilitarCampos();
        listaActualizada();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoEdad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoDorsal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campoDemarcacion = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbEntrenador = new javax.swing.JComboBox();
        cmbMasajista = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        cmbLugar = new javax.swing.JComboBox();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(55, 77, 102));

        jPanel2.setBackground(new java.awt.Color(31, 98, 98));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRO DE FUTBOLISTAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setText("DATOS PERSONALES");

        jPanel3.setBackground(new java.awt.Color(53, 108, 108));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nombres");

        campoNombre.setBackground(new java.awt.Color(153, 153, 153));
        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Apellidos");

        campoApellido.setBackground(new java.awt.Color(153, 153, 153));
        campoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoApellidoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("DNI");

        campoID.setBackground(new java.awt.Color(153, 153, 153));
        campoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIDActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Edad");

        campoEdad.setBackground(new java.awt.Color(153, 153, 153));
        campoEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEdadActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Dorsal");

        campoDorsal.setBackground(new java.awt.Color(153, 153, 153));
        campoDorsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDorsalActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Demarcación");

        campoDemarcacion.setBackground(new java.awt.Color(153, 153, 153));
        campoDemarcacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDemarcacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoDorsal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(campoDemarcacion, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(134, 134, 134))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDorsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDemarcacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(53, 108, 108));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Entrenador");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Masajista");

        cmbEntrenador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        cmbEntrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEntrenadorActionPerformed(evt);
            }
        });

        cmbMasajista.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Lugar");

        cmbLugar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbEntrenador, 0, 112, Short.MAX_VALUE)
                    .addComponent(cmbMasajista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbLugar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbMasajista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cmbLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnGuardar.setText("Agregar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lista);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("DNI | NOMBRE | APELLIDOS | EDAD | DORSAL | DEMARCACION | ENTRENADOR | MASAJISTA | LUGAR");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAtras.setText("Atras");
        btnAtras.setToolTipText("");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnGuardar)
                                        .addGap(39, 39, 39)
                                        .addComponent(btnEditar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEliminar))
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1))
                            .addComponent(btnAtras))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(75, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnEditar)
                            .addComponent(btnEliminar)
                            .addComponent(btnAtras))
                        .addGap(28, 28, 28))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void listaActualizada(){
        cmbEntrenador.removeAllItems();
        cmbEntrenador.addItem("");
        for (int i = 0; i < RegistroEntrenadores.listaEntrenadores.size(); i++) {
            cmbEntrenador.addItem(RegistroEntrenadores.listaEntrenadores.get(i).getNombre());
        }
        cmbMasajista.removeAllItems();
        cmbMasajista.addItem("");
        for (int i = 0; i < RegistroMasajista.listaMasajistas.size(); i++) {
            cmbMasajista.addItem(RegistroMasajista.listaMasajistas.get(i).getNombre());
        }
        String lugares[]=new String[3];
        lugares[0]="Peru";
        lugares[1]="Argentina";
        lugares[2]="Bolivia";
        for (int i = 0; i < lugares.length; i++) {
            cmbLugar.addItem(lugares[i]);
        }
        modelo.removeAllElements();
        lista.setModel(modelo);
        for (int i = 0; i < grupoFutbolistas.size(); i++) {
            modelo.add(i,patronMensaje(i));
            lista.setModel(modelo);
        }
    }
    public void habilitarCampos(){
        campoNombre.setEditable(true);
        campoNombre.requestFocus();
        campoApellido.setEditable(true);
        campoDemarcacion.setEditable(true);
        campoDorsal.setEditable(true);
        campoEdad.setEditable(true);
        campoID.setEditable(true);
        campoNombre.setEditable(true);
        cmbEntrenador.setEnabled(true);
        cmbLugar.setEnabled(true);
        cmbMasajista.setEnabled(true);
    }
    public void deshabilitarCampos(){
        campoNombre.setEditable(false);
        campoApellido.setEditable(false);
        campoDemarcacion.setEditable(false);
        campoDorsal.setEditable(false);
        campoEdad.setEditable(false);
        campoID.setEditable(false);
        cmbEntrenador.setEnabled(false);
        cmbLugar.setEnabled(false);
        cmbMasajista.setEnabled(false);
    }
    public void resetearCampos(){
        campoNombre.setText("");
        campoApellido.setText("");
        campoDemarcacion.setText("");
        campoDorsal.setText("");
        campoEdad.setText("");
        campoID.setText("");
        cmbEntrenador.setSelectedIndex(0);
        cmbLugar.setSelectedIndex(0);
        cmbMasajista.setSelectedIndex(0);
    }
    public String patronMensaje(int indice){
        return grupoFutbolistas.get(indice).getId()+" | "+grupoFutbolistas.get(indice).getNombre().toUpperCase()+" "+grupoFutbolistas.get(indice).getApellido().toUpperCase()+" | "+grupoFutbolistas.get(indice).getEdad()+" | "+grupoFutbolistas.get(indice).getDorsal()+" | "+grupoFutbolistas.get(indice).getDemarcacion().toUpperCase()+" | "+listaEntrenadores.get(indice).toUpperCase()+" | "+listaMasajista.get(indice).toUpperCase()+" | "+listaLugares.get(indice).toUpperCase();
    }
    int indice=0;
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
            if(lista.isSelectionEmpty()){
                JOptionPane.showMessageDialog(null, "seleccione un elemento para editar");
            }else{
                if(btnEditar.getText().equals("Editar")){
                    indice=lista.getSelectedIndex();
                    btnEliminar.setEnabled(false);
                    btnGuardar.setEnabled(false);
                    btnEditar.setText("Guardar");
                    habilitarCampos();
                    campoNombre.setText(grupoFutbolistas.get(indice).getNombre());
                    campoApellido.setText(grupoFutbolistas.get(indice).getApellido());
                    campoDemarcacion.setText(grupoFutbolistas.get(indice).getDemarcacion());
                    campoID.setText(grupoFutbolistas.get(indice).getId()+"");
                    campoEdad.setText(grupoFutbolistas.get(indice).getEdad()+"");
                    campoDorsal.setText(grupoFutbolistas.get(indice).getDorsal()+"");
                    for (int j = 0; j < cmbEntrenador.getItemCount(); j++) {
                        if(listaEntrenadores.get(indice).equals(cmbEntrenador.getItemAt(j))){
                            cmbEntrenador.setSelectedIndex(j);
                        }
                    }
                    for (int j = 0; j < cmbLugar.getItemCount(); j++) {
                        if(listaLugares.get(indice).equals(cmbLugar.getItemAt(j))){
                            cmbLugar.setSelectedIndex(j);
                        }
                    }
                    for (int j = 0; j < cmbMasajista.getItemCount(); j++) {
                        if(listaMasajista.get(indice).equals(cmbMasajista.getItemAt(j))){
                            cmbMasajista.setSelectedIndex(j);
                        }
                    }
                }else{
                    modelo.removeAllElements();
                    lista.setModel(modelo);
                    Futbolista modificadoFutbolista=new Futbolista(Integer.parseInt(campoID.getText()), campoNombre.getText(), campoApellido.getText(), Integer.parseInt(campoEdad.getText()),Integer.parseInt(campoDorsal.getText()) , campoDemarcacion.getText());
                    grupoFutbolistas.set(indice, modificadoFutbolista);
                    listaEntrenadores.set(indice, cmbEntrenador.getSelectedItem().toString());
                    listaLugares.set(indice, cmbLugar.getSelectedItem().toString());
                    listaMasajista.set(indice, cmbMasajista.getSelectedItem().toString());
                    for (int i = 0; i < grupoFutbolistas.size(); i++) {
                        modelo.add(i,patronMensaje(i));
                        lista.setModel(modelo);
                    }
                    deshabilitarCampos();
                    resetearCampos();
                    btnEditar.setText("Editar");
                    btnGuardar.setEnabled(true);
                    btnEliminar.setEnabled(true);
                }
            }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(btnGuardar.getText().equals("Agregar")){
            //listaActualizada();
            btnGuardar.setText("Guardar");
            habilitarCampos();
        }else{
            if(campoNombre.getText().equals("")||campoApellido.getText().equals("")||campoDemarcacion.getText().equals("")
                || campoDorsal.getText().equals("") || campoEdad.getText().equals("") || campoID.getText().equals("")
                || cmbEntrenador.getSelectedIndex()==0 ||cmbMasajista.getSelectedIndex()==0||cmbLugar.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(null, "Llene todo el formulario");
            }else{
                Futbolista nuevoFutbolista=new Futbolista(Integer.parseInt(campoID.getText()), campoNombre.getText(), campoApellido.getText(), Integer.parseInt(campoEdad.getText()),Integer.parseInt(campoDorsal.getText()) , campoDemarcacion.getText());
                grupoFutbolistas.add(nuevoFutbolista);
                listaLugares.add(cmbLugar.getSelectedItem().toString());
                listaEntrenadores.add(cmbEntrenador.getSelectedItem().toString());
                listaMasajista.add(cmbMasajista.getSelectedItem().toString());
                JOptionPane.showMessageDialog(null, "El jugador "+nuevoFutbolista.getNombre()+", tiene como entrenador a "+cmbEntrenador.getSelectedItem()+", le toca el masaje con "+cmbMasajista.getSelectedItem()+" y debe viajar a "+cmbLugar.getSelectedItem());
                modelo.addElement(patronMensaje(grupoFutbolistas.size()-1));
                lista.setModel(modelo);
                btnEditar.setEnabled(true);
                btnEliminar.setEnabled(true);
                resetearCampos();
                btnGuardar.setText("Agregar");
                deshabilitarCampos();
                System.out.println(lista.getModel().getSize());
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbEntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEntrenadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEntrenadorActionPerformed

    private void campoDemarcacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDemarcacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDemarcacionActionPerformed

    private void campoDorsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDorsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDorsalActionPerformed

    private void campoEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEdadActionPerformed

    private void campoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIDActionPerformed

    private void campoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoApellidoActionPerformed

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(lista.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Seleccione un jugador para eliminar");
        }else{
            int elemento=lista.getSelectedIndex();
            grupoFutbolistas.remove(elemento);
            listaEntrenadores.remove(elemento);
            listaLugares.remove(elemento);
            listaMasajista.remove(elemento);
            modelo.removeAllElements();
            lista.setModel(modelo);
            for (int i = 0; i < grupoFutbolistas.size(); i++) {
                modelo.add(i,patronMensaje(i));
                lista.setModel(modelo);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
//int indice=0;
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoDemarcacion;
    private javax.swing.JTextField campoDorsal;
    private javax.swing.JTextField campoEdad;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JComboBox cmbEntrenador;
    private javax.swing.JComboBox cmbLugar;
    private javax.swing.JComboBox cmbMasajista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lista;
    // End of variables declaration//GEN-END:variables
}
