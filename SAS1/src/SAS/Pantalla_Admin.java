// PANTALLA UNICAMENTE PARA LOS ADMINISTRADORES 
package SAS;
//importacion de librerias para sql 
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author:
 * Flores Reyes Miguel Angel
 * Mendoza Gasca Johan Emmanuel Roberto 
 */
public class Pantalla_Admin extends javax.swing.JFrame {
    //*VARIABLES GLOBALES* 
        //generacion de objeto para poder usar la tabla
        DefaultTableModel dtm=new DefaultTableModel();
        double calcula=0;
        float x;
        float p1,t;
        String n, ma,cantidad,p,id,tf;
	// mi conatructor 
    public Pantalla_Admin() throws SQLException 
    {
        initComponents();
        //cargartabla();
        String[] a=new String []{"ID","Nombre","Precio","Marca"};
        dtm.setColumnIdentifiers(a);// se le asignara el modelo que es perteneciente al objeto dtm 
        T1.setModel(dtm);
        ct();// inicia una funcion que muestra todos mis datos en pantalla 
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        T1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        T1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Marca", "Precio Unit."
            }
        ));
        jScrollPane1.setViewportView(T1);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MENÚ PRINCIPAL DE ADMINISTRADORES");

        jMenu1.setText("Productos");

        jMenuItem1.setText("Añadir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem5.setText("Eliminar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Editar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Buscar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Marcas");

        jMenuItem8.setText("Añadir");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Eliminar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("Usuarios");

        jMenuItem2.setText("Añadir");
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
        jMenu6.add(jMenuItem2);

        jMenuItem3.setText("Eliminar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem3);

        jMenuItem4.setText("Buscar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        jMenuBar1.add(jMenu6);

        jMenu2.setText("Cerrar Sesión");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//boton que actualizara todos los datos en tiempo real 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // funcion que removera elementos en caso de que se ejecute una busqueda 
        dtm.getDataVector().removeAllElements();
                  T1.updateUI();
            try 
            {
                ct(); //esta funcion es de suma importancia 
            } catch (SQLException ex) 
            {
                Logger.getLogger(Pantalla_Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //*Modificacion de un nuevo usuario*
        String nusuario = JOptionPane.showInputDialog("Ingrese el Nombre de Usuario", "Nombre de Usuario");
        String password = JOptionPane.showInputDialog("Ingrese la contraseña del usuario", "Contraseña");
        int rol = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de rol del usuario", "Rol de Usuario"));
        try 
        {
            //conexion 
            Statement stm=Conexion.getConexion().createStatement();
            //consulta en base de datos
            ResultSet rs=stm.executeQuery("insert into Usuarios (Nombre_Usuario, Password, Rol_ID) values ('"+nusuario+"','"+password+"',"+rol+")");
        } catch (SQLException ex) 
        {
            Logger.getLogger(Pantalla_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Modificacion de un producto desde la interfaz*
        String pnombre = JOptionPane.showInputDialog("Ingrese el nombre del producto", "Nombre de producto");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio unitario del produco", "Precio de Produco"));
        int marca = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la marca fabricante del producto", "Marca de Producto"));
        
        try 
        {
            //conexion 
            Statement stm=Conexion.getConexion().createStatement();
            //consulta en mi base de datos 
            ResultSet rs=stm.executeQuery("insert into P (NOM, PRE, TPID1) values ('"+pnombre+"','"+precio+"',"+marca+")");
        } catch (SQLException ex) 
        {
            Logger.getLogger(Pantalla_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // Obtendra un valor a partir del id que sera usada en mi conuslta 
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del producto que desee borrar", "0"));
        try 
        {
            //conexion
            Statement stm=Conexion.getConexion().createStatement();
            //consulta 
            ResultSet rs=stm.executeQuery("delete from P where PID = '"+id+"'");
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
       
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        //  evento que ocurrira al momento que salgamos de este JFrame 
         this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
        String nusuario = JOptionPane.showInputDialog("Ingrese el Nombre de Usuario", "Nombre de Usuario");
        String password = JOptionPane.showInputDialog("Ingrese la contraseña del usuario", "Contraseña");
        //Variables que me permiten generar un nuevo cliente para usar este programa  
        int rol = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de rol del usuario", "Rol de Usuario"));
        try 
        {
             //conexion 
            Statement stm=Conexion.getConexion().createStatement();
             //consulta en mi base de datos 
            ResultSet rs=stm.executeQuery("insert into Usuarios (Nombre_Usuario, Password, Rol_ID) values ('%"+nusuario+"%','%"+password+"%','%"+rol+"%')");
        } catch (SQLException ex) 
        {
            Logger.getLogger(Pantalla_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //por medio de mi variable eliminare una fila 
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del usuario que desee borrar", "ID a Borrar"));
        try 
        {
               //conexion 
            Statement stm=Conexion.getConexion().createStatement();
                //consulta en mi base de datos 
            ResultSet rs=stm.executeQuery("delete from Usuarios where Usuario_ID = '"+id+"'");
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // Agregar una nueva marca a mi base de datos 
        String mnombre = JOptionPane.showInputDialog("Ingrese el nombre de la marca", "Nombre de Marca");
     
        try 
        {
             //conexion 
            Statement stm=Conexion.getConexion().createStatement();
             //consulta en mi base de datos 
            ResultSet rs=stm.executeQuery("insert into TP (MARCA) values ('"+mnombre+"')");
        } catch (SQLException ex) 
        {
            Logger.getLogger(Pantalla_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // Obtendremos el id para modificar cualquier dato que este en nuestra base de datos 
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del producto que deseas Editar", "1"));
        try 
        {         
            //nueva conexion 
            Statement stm=Conexion.getConexion().createStatement();
            //consulta en mi base de datos 
            ResultSet rs=stm.executeQuery("select * from P where PID = '"+id+"'");
            //en cuanto encuentre un dato con el mismo id haremos moficaciones 
            if(rs.next())
            {
                String pnombre = JOptionPane.showInputDialog("Ingrese el nombre del producto", "Nombre de producto");
                double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio unitario del produco", "Precio de Produco"));
                int marca = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la marca fabricante del producto", "Marca de Producto"));
                
                 Statement stm1=Conexion.getConexion().createStatement();
                  ResultSet rs1=stm1.executeQuery("update P set NOM = '"+pnombre+"', PRE = "+precio+", TPID1 = '"+marca+"' where PID = "+id+"");
            } else 
            {
                //en caso de que agreguemos un id inexistente 
                JOptionPane.showMessageDialog(null,"Producto No existente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        //variable que me permitira hacer una busqueda     
        String pnombre = JOptionPane.showInputDialog("Ingrese el nombre del producto", "Nombre de producto");
            dtm.getDataVector().removeAllElements();
                  T1.updateUI();
           try {
               //conexion 
                Statement stm=Conexion.getConexion().createStatement();
               // consulta en mi base de datos donde pediremos un valor de tipo string  
                ResultSet rs=stm.executeQuery("select * from P where NOM like '%"+pnombre+"%'");
               //al encontrar datos PARECIDOS a lo que ingresamos los mostrara en pantalla 
                while(rs.next()){
              String pid = rs.getString("PID");
              String nom = rs.getString("NOM");
              String pre = rs.getString("PRE");
              String mar = rs.getString("TPID1");
              //impresion por columna 
                 dtm.addRow(new Object[]{
            pid,
            nom,
            pre,
            mar
            });
            
             }
            } catch (SQLException ex) {
                Logger.getLogger(Pantalla_Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // funciona de la misma manera al momento de eliminar un producto 
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la marca que quieres Borrar", "ID a Borrar"));
        try 
        {
            
            Statement stm=Conexion.getConexion().createStatement();
            
            ResultSet rs=stm.executeQuery("delete from TP where TPID = '"+id+"'");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

   private void ct() throws SQLException
    {
	//funcion que obtiene toda la informacion al momento de ejecutar una consulta 
        Statement stm=Conexion.getConexion().createStatement();
	 //consulta a ejecutar 
        ResultSet rst=stm.executeQuery("SELECT PID, NOM, PRE, TPID1 FROM P");
        while(rst.next())//funcionara como bucle para imprimir en cada columna un dato 
        {
            dtm.addRow(new Object[]{
            rst.getInt(1),
            rst.getString(2),
            rst.getFloat(3),
            rst.getInt(4)
            });
            
        }
    }
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
            java.util.logging.Logger.getLogger(Pantalla_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Pantalla_Admin().setVisible(true);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Pantalla_Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable T1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
