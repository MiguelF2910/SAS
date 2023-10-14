/*Compra de productos por parte de los clientes */
package SAS;
 //importacion de librerias para generar pdfs
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
//importacion de librerias para sql 
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.lang.Object;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author Miguel Angle Flores Reyes, Johan Emmanuel Roberto Mendoza Gasca 
 */
public class Pantalla_Clientes extends javax.swing.JFrame 
{
    //VARIABLES GLOBALES 
    DefaultTableModel dtm=new DefaultTableModel();  
    DefaultTableModel m=new DefaultTableModel();    
    double calcula=0;
    float x;
    float p1,t;
    String n, ma,cantidad,p,id,tf;
    
    public Pantalla_Clientes() throws SQLException 
    { //constructor que inicilizara mis elemtnos  
        initComponents();
        //cargartabla();
        //asiganemos un modelo a nuestra primer tabla 
        String[] a=new String []{"ID","Nombre","Precio","Marca"};
        dtm.setColumnIdentifiers(a);
        T1.setModel(dtm);
        ct();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TOTALFINAL = new javax.swing.JTextField();
        generar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        T2 = new javax.swing.JTable();
        L = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        T1 = new javax.swing.JTable();
        cant = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú de Clientes");
        setBackground(new java.awt.Color(255, 102, 102));

        Panel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Piezas ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("TOTAL GENERAL ");

        generar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        generar.setText("Generar Ticket");
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });

        T2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Marca", "Precio ", "Unidades", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(T2);
        if (T2.getColumnModel().getColumnCount() > 0) {
            T2.getColumnModel().getColumn(4).setResizable(false);
        }

        L.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        L.setText("Limpiar lista");
        L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delete.setText("Eliminar");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1082, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("CERRAR SESIÓN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(TOTALFINAL, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(generar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(L)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TOTALFINAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generar)
                    .addComponent(L)
                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("SISTEMA DE COMPRA DE PRODUCTOS -  MENU DE CLIENTES ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jLabel4)
                .addContainerGap(409, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Panel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Búsqueda por Nombre");

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchKeyTyped(evt);
            }
        });

        T1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio ", "Marca"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(T1);

        cant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Añadir al carrito");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("PIEZAS");

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(44, 44, 44)
                        .addComponent(cant, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
    
        
    }//GEN-LAST:event_searchActionPerformed

    private void cantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        //seleccion 
        int s=T1.getSelectedRow();
        if(s==-1)
        {
            //en caso de que no hallamos seleccionado un valor en mi tabla 
            JOptionPane.showMessageDialog(null,"Debes seleccionar algo primero!");
        }
        else
        {
            cantidad=cant.getText();//obtendremos el valor de mi textfield para hacer operaciones 
            p1=Integer.parseInt(cantidad);
            if(p1<=0)
            {
                JOptionPane.showMessageDialog(null,"Dato no permitido");
            }
            else
            {
                //dar un modelo a mi tabla 1
            m=(DefaultTableModel) T1.getModel();
            //obtener los valores de mi tabla 1
            id= T1.getValueAt(s,0).toString();
            n=  T1.getValueAt(s,1).toString();
            p=  T1.getValueAt(s,2).toString();
            ma= T1.getValueAt(s,3).toString();
            cantidad=cant.getText();
            //conversion y operaciones 
            x=Float.parseFloat(p);
            p1=Integer.parseInt(cantidad);
            t=x*p1;
            tf=String.valueOf(t);
            m=(DefaultTableModel)T2.getModel();
            //guardar mi informacion 
            String fil[]={id,n,ma,p,cantidad,tf};
            m.addRow(fil);
        
       // f= Double.parseDouble(p)*Integer.parseInt(cantidad);
        calcula+=t;
       TOTALFINAL.setText(""+calcula);
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed
        // Generacion de ticker por medio de un pdf 
        
        String path="";
        JFileChooser j=new JFileChooser();
        //nos menciona donde guardaremos nuestro archivo 
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x=j.showSaveDialog(this);
        if(x==JFileChooser.APPROVE_OPTION)
        {
            path=j.getSelectedFile().getPath();
        }
        //generacion de un nuevo documento 
        Document doc = new Document();
        try 
        {
            //String ruta =System.getProperty("user.home");
            PdfWriter.getInstance(doc, new FileOutputStream(path+"TICKET.pdf"));
            doc.open(); //abrir el documento 
            PdfPTable tabla= new PdfPTable(6);
            //nombre de mis celdas
            tabla.addCell("ID");
            tabla.addCell("NOMBRE");
            tabla.addCell("MARCA");
            tabla.addCell("PRECIO");
            tabla.addCell("UNIDADES");
            tabla.addCell("TOTAL DEL ART");
            for(int i=0;i<T2.getRowCount();i++)
            {
                //obtener todos mis valores por medio de un bucle 
                 String id= T2.getValueAt(i, 0).toString();
                 String n=  T2.getValueAt(i, 1).toString();
                 String ma= T2.getValueAt(i, 2).toString();
                 String p=  T2.getValueAt(i, 3).toString();
                 String u=  T2.getValueAt(i, 4).toString();
                 String t=  T2.getValueAt(i, 5).toString();
                 tabla.addCell(id);
                 tabla.addCell(n);
                 tabla.addCell(ma);
                 tabla.addCell(p);
                 tabla.addCell(u);
                 tabla.addCell(t);
            }
            doc.add(tabla);
        }
        catch(FileNotFoundException ex)
        {
            Logger.getLogger(Pantalla_Clientes.class.getName()).log(Level.SEVERE, null,ex);
        } catch (DocumentException ex) {
        Logger.getLogger(Pantalla_Clientes.class.getName()).log(Level.SEVERE, null, ex);
    }
        doc.close();
    }//GEN-LAST:event_generarActionPerformed

    private void LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LActionPerformed
        // va a borrar todo 
        m.getDataVector().removeAllElements();
        T2.updateUI();
        //al borrar todo incluye las variables que tengan cantidades 
        calcula=0;
         TOTALFINAL.setText(""+calcula);
    }//GEN-LAST:event_LActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
   /*   DefaultTableModel modelo1= new DefaultTableModel();
        if (T2.getSelectedRow()==-1)
        return; 
        m.removeRow(T2.getSelectedRow());*/
       
        //funcion que eliminar una fila de mi tabla 2
        int s=T2.getSelectedRow();
        if(s==-1)
        {
            JOptionPane.showMessageDialog(null,"Debes seleccionar algo primero!");
        }
        else
        {
            //calculos para restar a mi total 
        p=  T2.getValueAt(s,5).toString();
             x=Float.parseFloat(p);
        p1=Integer.parseInt(cantidad);
        t=x*1;
        calcula-=t;
        TOTALFINAL.setText(""+calcula);
        m.removeRow(T2.getSelectedRow());
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        //*EVENTO QUE SUCEDERA AL MOMENTO DE TECLEAR* 
        
        dtm.getDataVector().removeAllElements();
        T1.updateUI();
        SQLServerDataSource con = new SQLServerDataSource();
        con.setServerName("localhost");
        con.setDatabaseName("SAS1"); //nombre de mi base de datos 
        con.setUser("SASAdmin");
        con.setPassword("oxxo12");
        con.setPortNumber(1433);
  
        String producto = search.getText();//obtendra mi valor en string de mi textfield
        //consulta 
        String url = "select * from P where NOM like '%"+producto+"%' ";
        
        try{
            //conexion 
          Connection cn = con.getConnection();
          PreparedStatement ps = cn.prepareStatement(url);
          ResultSet rs = ps.executeQuery();
          //imprimira mis valores que sean parecidos en mi tabla 
          while(rs.next()){
              String pid = rs.getString("PID");
              String nom = rs.getString("NOM");
              String pre = rs.getString("PRE");
              String mar = rs.getString("TPID1");
              
                 dtm.addRow(new Object[]{
            pid,
            nom,
            pre,
            mar
            });
             if(search.getText() == null){
                 dtm.getDataVector().removeAllElements();
                  T1.updateUI();
                  ct();
             }
          }
        }catch(SQLException ex) {
          JOptionPane.showMessageDialog(null,ex.toString());
      }
    }//GEN-LAST:event_searchKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // En caso de que solicitemos salir de esta pantalla 
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_searchKeyTyped


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
      


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Pantalla_Clientes().setVisible(true);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Pantalla_Clientes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    //*IMPRIMIR DATOS EN MI PRIMER TABLA --FUNCION IMPORTANTE *
    private void ct() throws SQLException
    {
        //conexion 
        Statement stm=Conexion.getConexion().createStatement();
        //consulta 
        ResultSet rst=stm.executeQuery("SELECT PID, NOM, PRE, TPID1 FROM P");
        //impresion en mi tabla 
        while(rst.next())
        {
            dtm.addRow(new Object[]{
            rst.getInt(1),
            rst.getString(2),
            rst.getFloat(3),
            rst.getInt(4)
            });
            
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton L;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JTable T1;
    private javax.swing.JTable T2;
    private javax.swing.JTextField TOTALFINAL;
    private javax.swing.JTextField cant;
    private javax.swing.JButton delete;
    private javax.swing.JButton generar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
