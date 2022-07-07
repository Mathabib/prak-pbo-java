/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jar_file_manipulasi_database;

/**
 *
 * @author Ahmad Habib
 */
import java.sql.*; //<-- untuk connection ke database , ini importnya
import javax.swing.*; // ini untuk yang lain lain seperti table joption pane dll
import javax.swing.table.DefaultTableModel; // ini juga sama buat table 

public class insert_data extends javax.swing.JFrame {
Connection conn; // <-- untuk koneksi 
Statement stmt; // untuk mengantarkan data dari database ke program , yah bisa dibilang execute unit lah 
ResultSet rs; // ini untuk menampung nilai dari Statement 



    /**
     * Creates new form insert_data
     */
    public insert_data() {

try{

Class.forName("com.mysql.jdbc.Driver");
conn = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan","root","");// root adalah nama user , dan setelah root itu adalah paswordnya
stmt = conn.createStatement();
}catch(Exception e){

JOptionPane.showMessageDialog(null,e);
}
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ID_BUKU = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JUDUL = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PENGARANG = new javax.swing.JTextField();
        radio_button_keislaman = new javax.swing.JRadioButton();
        radio_button_iptek = new javax.swing.JRadioButton();
        INSERT = new javax.swing.JToggleButton();
        LIHAT_DAFTAR = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TABLE = new javax.swing.JTable();
        HAPUS = new javax.swing.JButton();
        MENU = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        QTY = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("INPUT DATA BUKU BARU");

        jLabel2.setText("ID BUKU  :");

        ID_BUKU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_BUKUActionPerformed(evt);
            }
        });

        jLabel3.setText("   JUDUL  :");

        jLabel4.setText("PENGARANG  :");

        jLabel5.setText("KRITERIA  :");

        buttonGroup1.add(radio_button_keislaman);
        radio_button_keislaman.setText("KEISLAMAN");

        buttonGroup1.add(radio_button_iptek);
        radio_button_iptek.setText("IPTEK");

        INSERT.setText("INSERT");
        INSERT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERTActionPerformed(evt);
            }
        });

        LIHAT_DAFTAR.setText("LIHAT SEMUA DAFTAR");
        LIHAT_DAFTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIHAT_DAFTARActionPerformed(evt);
            }
        });

        TABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TABLE);

        HAPUS.setText("HAPUS");
        HAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HAPUSActionPerformed(evt);
            }
        });

        MENU.setText("KEMBALI KE MENU ");
        MENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUActionPerformed(evt);
            }
        });

        jLabel6.setText("QTY   :");

        jLabel7.setText("batas 20 char");

        jLabel8.setText("batas 10 char");

        jLabel9.setText("batas 20 char");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(26, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(QTY, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(JUDUL, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ID_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(PENGARANG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radio_button_keislaman)
                                        .addGap(59, 59, 59)
                                        .addComponent(radio_button_iptek)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(INSERT, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(14, 14, 14))
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))))))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(MENU)
                        .addGap(92, 92, 92)
                        .addComponent(HAPUS))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(LIHAT_DAFTAR)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ID_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JUDUL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PENGARANG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(radio_button_keislaman)
                    .addComponent(radio_button_iptek)
                    .addComponent(INSERT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(QTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(LIHAT_DAFTAR)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MENU)
                    .addComponent(HAPUS))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

public void datatabel(){ // ini fungsi untuk menampilakn data dalam tabel , tapi bedanya gak pakai tombol aja gitu 
Object[] baris ={"id_buku","judul","pegarang","kategori","qty"};
DefaultTableModel tabmode = new DefaultTableModel(null,baris);
TABLE.setModel(tabmode);

try{
rs = stmt.executeQuery("select * from buku");
while(rs.next()){
String a = rs.getString("id_buku");   // disini salah nulis nama kolom aja gak bakal ketampil semua datanya
String b = rs.getString("judul_buku"); // misal kalau judul_buku salah tulis jadi judul_buqu gak bakal kebaca semua nilainya 
String c = rs.getString("pengarang");// typo satu huruf fatal 
String d = rs.getString("kategori");// disini nama nama judul kolom nya harus sama kayak yang ada di database 
String e = Integer.toString(rs.getInt("qty"));
String [] data = {a,b,c,d,e};
tabmode.addRow(data);

}
}catch(Exception e){
}
} 


    private void LIHAT_DAFTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIHAT_DAFTARActionPerformed
        // TODO add your handling code here:
datatabel(); //ini fungsi untuk menampilkan data dalam tabel , fungsi sebelum nya tuh liat diatas void ini 
// ada fungsi datatabel()
    }//GEN-LAST:event_LIHAT_DAFTARActionPerformed

    private void INSERTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERTActionPerformed
        // TODO add your handling code here:
try{
if(radio_button_keislaman.isSelected()){
stmt.executeUpdate("insert into buku values ('"+ID_BUKU.getText()+"','"+JUDUL.getText()+"','"+PENGARANG.getText()+"','keislaman',"+QTY.getText()+")");

// JANGAN LUPA !!!!!!! kalau perintah execute untuk manipulasi memasukan data mengubah 
// pakainya executeUpdate BUKAN executeQuery  camkan itu hah nanti eror kesel

}else if(radio_button_iptek.isSelected()){
stmt.executeUpdate("insert into buku values ('"+ID_BUKU.getText()+"','"+JUDUL.getText()+"','"+PENGARANG.getText()+"','iptek',"+QTY.getText()+")");

// JANGAN LUPA !!!!!!! kalau perintah execute untuk manipulasi memasukan data mengubah 
// pakainya executeUpdate BUKAN executeQuery  camkan itu hah nanti eror kesel

datatabel();
JOptionPane.showMessageDialog(null, "data telah dimasukan horee");

}

}catch(Exception e){
JOptionPane.showMessageDialog(null,e);

}
    }//GEN-LAST:event_INSERTActionPerformed

    private void ID_BUKUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_BUKUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_BUKUActionPerformed

    private void MENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUActionPerformed
        // TODO add your handling code here:
new menu().setVisible(true);
dispose();
    }//GEN-LAST:event_MENUActionPerformed

    private void HAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HAPUSActionPerformed
        // TODO add your handling code here:
int hapus = TABLE.getSelectedRow(); // get selected row ini untuk memilih apa apa yang di klik pengguna  dia akan membaca apasih yang di klik oleh user 
                                    // dia akan memilih  baris apa yang dbaca oleh user pada tabel 
                                    // jadi dia mendeteksi baris keberapa gitu, kan ada kata selectedrow nya tuh 
String id = TABLE.getValueAt(hapus,0).toString(); //getVAlueAt(baris, kolom) liat aja kolom ke 0 itu isinya id_buku 
                                  //kenapa ditambahkan toString karena execute database ini cuman bisa menerima String
                                // sedangkan koordinat kolom berapa dan baris ke berapa ini dalam bentuk integer / angka
                                 // sehingga diperlukan lah toString()
String judul = TABLE.getValueAt(hapus, 1).toString(); // kolom ke 1 berisi kolom judul buku 
try{
stmt.executeUpdate("delete from buku where id_buku = '"+id+"'");
datatabel();
JOptionPane.showMessageDialog(null,"data buku "+judul+" dihapus ");
//JOptionPane itu untuk menampilkan text box berisi tulisan apa aja tergantung di isi nya apa 
}catch(Exception e){
}
    }//GEN-LAST:event_HAPUSActionPerformed

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
            java.util.logging.Logger.getLogger(insert_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insert_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insert_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insert_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insert_data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HAPUS;
    private javax.swing.JTextField ID_BUKU;
    private javax.swing.JToggleButton INSERT;
    private javax.swing.JTextField JUDUL;
    private javax.swing.JToggleButton LIHAT_DAFTAR;
    private javax.swing.JButton MENU;
    private javax.swing.JTextField PENGARANG;
    private javax.swing.JTextField QTY;
    private javax.swing.JTable TABLE;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radio_button_iptek;
    private javax.swing.JRadioButton radio_button_keislaman;
    // End of variables declaration//GEN-END:variables
}