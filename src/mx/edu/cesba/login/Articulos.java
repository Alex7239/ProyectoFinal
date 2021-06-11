/*
 Nombre: Valenzuela Romero Manuel Alejandro
Matricula:2022742
 */
package mx.edu.cesba.login;
import conexion.Cone;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 
 */
public class Articulos extends javax.swing.JFrame {

   Cone con =new Cone();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    
    
    public Articulos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Menu");
        this.setResizable(false);
        listar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        btn_consultar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_sabor = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        txt_fecha = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("INVENTARIO DE BOLIS GOURMET");

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_consultar.setText("Consultar");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        btn_eliminar.setForeground(new java.awt.Color(255, 0, 51));
        btn_eliminar.setText("Borrar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        jLabel2.setText("Id");

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nombre", "sabor", "cantidad", "precio", "fecha"
            }
        ));
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatos);

        jLabel3.setText("Nombre del Bolis");

        jLabel4.setText("Sabor del Bolis");

        jLabel5.setText("Cantidad");

        jLabel6.setText("Precio");

        jLabel7.setText("Fecha de Cad");

        txt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idKeyTyped(evt);
            }
        });

        txt_sabor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_saborKeyTyped(evt);
            }
        });

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        txt_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cantidadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cantidadKeyTyped(evt);
            }
        });

        txt_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_precioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_precioKeyTyped(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Ice-Cream-Strawberry-icon-512_icon-icons.com_52579.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(89, 89, 89))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(61, 61, 61)
                            .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sabor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_eliminar)
                            .addComponent(btn_agregar)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_consultar)
                            .addComponent(btn_actualizar)
                            .addComponent(btn_regresar))
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(72, 72, 72))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar)
                    .addComponent(btn_consultar)
                    .addComponent(jLabel2)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_eliminar)
                            .addComponent(btn_actualizar))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_limpiar)
                            .addComponent(btn_regresar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_sabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
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

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txt_id.setText("");
        txt_nombre.setText("");
        txt_sabor.setText("");
        txt_cantidad.setText("");
        txt_precio.setText("");
        txt_fecha.setText("");
        
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        limpiartable();
        listar();
        
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        Agregar();
        limpiartable();
        listar();
        
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        eliminar();
        listar();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
       int fila=TablaDatos.getSelectedRow();
        
        if (fila == -1){
            JOptionPane.showMessageDialog(null,"NO HAS SELECCIONADO EL BOLIS"); 
        
        }else {
            int row=Integer.parseInt((String)TablaDatos.getValueAt(fila, 0).toString());
            int id=Integer.parseInt((String)TablaDatos.getValueAt(fila, 0).toString());
            
            String nombre=(String)TablaDatos.getValueAt(fila,1);
            String sabor=(String)TablaDatos.getValueAt(fila,2);
            int cantidad=Integer.parseInt((String)TablaDatos.getValueAt(fila, 3).toString());
            
            double precio=Double.parseDouble((String)TablaDatos.getValueAt(fila,4).toString());
            String fecha=(String)TablaDatos.getValueAt(fila,5);
            
            txt_id.setText(""+id);
            txt_nombre.setText(nombre);
            txt_sabor.setText(sabor);
            txt_cantidad.setText(""+cantidad);
            txt_precio.setText(""+precio);
            txt_fecha.setText(fecha);
           
            
                    
            
            
        }
    }//GEN-LAST:event_TablaDatosMouseClicked

    
     void actualizar(){
        int id= Integer.parseInt(txt_id.getText());
        String nombre =txt_nombre.getText();
        String sabor =txt_sabor.getText();
        int cantidad=Integer.parseInt(txt_cantidad.getText());
        Double precio=Double.parseDouble(txt_precio.getText());
        String fecha =(txt_fecha.getText().trim());
        String sql= "UPDATE bolis set id='"+id+"', nombre='"+nombre+"',sabor='"+sabor+"',cantidad='"+cantidad+"', precio='"+precio+"',fecha='"+fecha+"'where id="+id;
        
        try{
            cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    
                    JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
                    limpiartable();
                    
        }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Datos no se guardaron correctamente");
                    limpiartable();
        
                    
        }
       
       
       }
    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        actualizar();
        listar();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        Menu read = new Menu();
        read.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void txt_cantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadKeyPressed
        
    }//GEN-LAST:event_txt_cantidadKeyPressed

    private void txt_precioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioKeyPressed

    private void txt_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadKeyTyped
        char solonumero=evt.getKeyChar();
                if (Character.isLetter(solonumero)){
                    getToolkit().beep();
                    evt.consume();
                    JOptionPane.showMessageDialog(null,"Ingresa solo numeros");
                }
    }//GEN-LAST:event_txt_cantidadKeyTyped

    private void txt_precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precioKeyTyped
        char solonumero=evt.getKeyChar();
                if (Character.isLetter(solonumero)){
                    getToolkit().beep();
                    evt.consume();
                    JOptionPane.showMessageDialog(null,"Ingresa solo numeros");
                }
    }//GEN-LAST:event_txt_precioKeyTyped

    private void txt_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyTyped
        char solonumero=evt.getKeyChar();
                if (Character.isLetter(solonumero)){
                    getToolkit().beep();
                    evt.consume();
                    JOptionPane.showMessageDialog(null,"Ingresa solo numeros");
                }
    }//GEN-LAST:event_txt_idKeyTyped

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        char c=evt.getKeyChar();
       if(Character.isLowerCase(c)){
           String cad=(""+c).toUpperCase();
           c=cad.charAt(0);
           evt.setKeyChar(c);
           
       }
       if (Character.isDigit(c)){
           getToolkit().beep();
           evt.consume();
           JOptionPane.showMessageDialog(null,"Ingresa solo texto");
       }
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_saborKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_saborKeyTyped
        char c=evt.getKeyChar();
       if(Character.isLowerCase(c)){
           String cad=(""+c).toUpperCase();
           c=cad.charAt(0);
           evt.setKeyChar(c);
           
       }
       if (Character.isDigit(c)){
           getToolkit().beep();
           evt.consume();
           JOptionPane.showMessageDialog(null,"Ingresa solo texto");
       }
    }//GEN-LAST:event_txt_saborKeyTyped

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
            java.util.logging.Logger.getLogger(Articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Articulos().setVisible(true);
            }
        });
    }
    void listar (){
        String sql = "select * from bolis";
        try{
            cn=con.getConnection();
            st =cn.createStatement();
            rs=st.executeQuery(sql);
            Object [] arti= new Object [6];
            modelo=(DefaultTableModel)TablaDatos.getModel();
            while(rs.next()){
                arti[0]=rs.getInt("id");
                arti[1]=rs.getString("nombre");
                arti[2]=rs.getString("sabor");
                arti[3]=rs.getInt("cantidad");
                arti[4]=rs.getDouble("precio");
                arti[5]=rs.getString("fecha");
                modelo.addRow(arti);
            
                
            }
            TablaDatos.setModel(modelo);
            
        }catch (Exception e){
    }
    }
    void Agregar(){
        int id=Integer.parseInt(txt_id.getText());
        String nombre =txt_nombre.getText();
        String sabor =txt_sabor.getText();
        int cantidad=Integer.parseInt(txt_cantidad.getText());
        Double precio=Double.parseDouble(txt_precio.getText());
        String fecha =(txt_fecha.getText().trim());
        try{
            String sql = "INSERT INTO bolis (id,nombre,sabor,cantidad,precio,fecha)values('"+ id +"', '"+nombre+"','"+sabor+"','"+cantidad+"','"+precio+"','"+fecha+"')";
                    
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    
                    JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
                    
                    
        }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Datos no se guardaron correctamente");
                    limpiartable();
        
                    
        }
    }
    void limpiartable(){
        for (int i=0; 1<=TablaDatos.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;
        }
    }
    void eliminar(){
        int fila=TablaDatos.getRowCount();
        int id=Integer.parseInt(txt_id.getText());
        
        if(fila==-1){
            JOptionPane.showMessageDialog(null, "SELECCIONE FILA PARA BORRAR REGISTRO");
        
        }else {
            try{
                String sql="DELETE FROM BOLIS WHERE id="+id;
                cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    
                    JOptionPane.showMessageDialog(null, "Datos borrados correctamente");
                    limpiartable();
            }catch(Exception e){
                
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_sabor;
    // End of variables declaration//GEN-END:variables
}
