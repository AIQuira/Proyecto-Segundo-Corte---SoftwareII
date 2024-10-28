package co.edu.unicauca.mvc.vistas.evaluar;

//import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoArticulos;
import co.edu.unicauca.isii.services.RevisionServices;
import co.edu.unicauca.mvc.modelos.Revision;
import co.edu.unicauca.mvc.utilidades.Utilidades;
import co.edu.unicauca.mvc.vistas.GUIOpciones;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author earea
 */
public class panelEvaluacion extends javax.swing.JPanel {

    private RevisionServices objServicioRevision;
    /**
     * Creates new form panelEvaluacion
     * @param nombreConferencia
     */
    public panelEvaluacion(String nombreConferencia, RevisionServices objServicioRevision) {
        initComponents();
        txtNomConfeE.setText(nombreConferencia);
        this.objServicioRevision = objServicioRevision;
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
        txtCriterios = new javax.swing.JLabel();
        txtNiveles = new javax.swing.JLabel();
        txtNomConfeE = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtResumen3 = new javax.swing.JLabel();
        selObjetivo = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        txtResumen5 = new javax.swing.JLabel();
        selResultados = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        txtResumen8 = new javax.swing.JLabel();
        selPalabras = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        txtResumen9 = new javax.swing.JLabel();
        selResumen = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        txtResumen11 = new javax.swing.JLabel();
        selDescripcion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();

        setBackground(new java.awt.Color(236, 236, 236));
        setPreferredSize(new java.awt.Dimension(620, 450));

        jPanel1.setBackground(new java.awt.Color(236, 236, 236));

        txtCriterios.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtCriterios.setText("Criterios");

        txtNiveles.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtNiveles.setText("   Niveles de Logro");

        txtNomConfeE.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtNomConfeE.setText("Titulo Trabajo");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        txtResumen3.setText("Objetivo general");

        selObjetivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "0 (Deficiente)", "1 (Insuficiente)", "2 (Sufuciente)", "3 (Bueno)", "4 (Excente)" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResumen3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(197, 197, 197)
                .addComponent(selObjetivo, 0, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtResumen3)
            .addComponent(selObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        txtResumen5.setText("Resultados");

        selResultados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "0 (Deficiente)", "1 (Insuficiente)", "2 (Sufuciente)", "3 (Bueno)", "4 (Excente)" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResumen5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(197, 197, 197)
                .addComponent(selResultados, 0, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtResumen5)
            .addComponent(selResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        txtResumen8.setText("Palabras clave");

        selPalabras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "0 (Deficiente)", "1 (Insuficiente)", "2 (Sufuciente)", "3 (Bueno)", "4 (Excente)" }));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResumen8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(197, 197, 197)
                .addComponent(selPalabras, 0, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtResumen8)
            .addComponent(selPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        txtResumen9.setText("Resumen");

        selResumen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "0 (Deficiente)", "1 (Insuficiente)", "2 (Sufuciente)", "3 (Bueno)", "4 (Excente)" }));
        selResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selResumenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResumen9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(197, 197, 197)
                .addComponent(selResumen, 0, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtResumen9)
            .addComponent(selResumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        txtResumen11.setText("Descripción");

        selDescripcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "0 (Deficiente)", "1 (Insuficiente)", "2 (Sufuciente)", "3 (Bueno)", "4 (Excente)" }));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResumen11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(197, 197, 197)
                .addComponent(selDescripcion, 0, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtResumen11)
            .addComponent(selDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        txtObservaciones.setText("Escribir observación");
        jScrollPane1.setViewportView(txtObservaciones);

        btnEnviar.setBackground(new java.awt.Color(235, 236, 236));
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCriterios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(348, 348, 348)
                        .addComponent(txtNiveles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(txtNomConfeE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(242, 242, 242))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(247, 247, 247))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtNomConfeE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNiveles)
                    .addComponent(txtCriterios))
                .addGap(2, 2, 2)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnviar)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        Integer calificacionTitulo, calificacionDescripcion, calificacionResumen, calificacionKeyword;
        String comentarios;
        
        calificacionDescripcion = Integer.valueOf((String) this.selDescripcion.getSelectedItem());
        calificacionResumen = Integer.valueOf((String) this.selResumen.getSelectedItem());
        calificacionKeyword = Integer.valueOf((String) this.selPalabras.getSelectedItem()) ;
        comentarios = this.txtObservaciones.getText();
        
        Revision objRevision = new Revision();
        objRevision.setCalificacionDescripcion(calificacionDescripcion);
        objRevision.setCalificacionKeyword(calificacionKeyword);
        objRevision.setCalificacionResumen(calificacionResumen);
        objRevision.setComentarios(comentarios);
        
        Revision objRevisionRegistrada = this.objServicioRevision.registrarRevision(objRevision);
        
        if(objRevisionRegistrada != null){
            JOptionPane.showMessageDialog(this, "Revisión guardada exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error al registrar la revisión", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        if (selResumen.getSelectedItem().equals("Seleccione una opción") ||
            selPalabras.getSelectedItem().equals("Seleccione una opción") ||
            selDescripcion.getSelectedItem().equals("Seleccione una opción") ||
            selObjetivo.getSelectedItem().equals("Seleccione una opción") ||
            selResultados.getSelectedItem().equals("Seleccione una opción")) {

            // Muestra mensaje de error si falta alguna selección
            Utilidades.mensajeAdvertencia("Es obligatorio asignar una puntuación", "Error");
        } else {
            // Si todas las opciones fueron seleccionadas, muestra mensaje de éxito
            Utilidades.mensajeInformacion("Se ha evaluado exitosamente", "Información");
            
            // Volver a la ventana principal (GUIOpciones)
            GUIOpciones gui = (GUIOpciones) getTopLevelAncestor(); // Obtener la ventana principal
            //gui.mostrarPanel(new panelArticulosAsignados(objServicioArticulos)); // Regresar al panel inicial o cualquier otro que elijas
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void selResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selResumenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selResumenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> selDescripcion;
    private javax.swing.JComboBox<String> selObjetivo;
    private javax.swing.JComboBox<String> selPalabras;
    private javax.swing.JComboBox<String> selResultados;
    private javax.swing.JComboBox<String> selResumen;
    private javax.swing.JLabel txtCriterios;
    private javax.swing.JLabel txtNiveles;
    private javax.swing.JLabel txtNomConfeE;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JLabel txtResumen11;
    private javax.swing.JLabel txtResumen3;
    private javax.swing.JLabel txtResumen5;
    private javax.swing.JLabel txtResumen8;
    private javax.swing.JLabel txtResumen9;
    // End of variables declaration//GEN-END:variables

}
