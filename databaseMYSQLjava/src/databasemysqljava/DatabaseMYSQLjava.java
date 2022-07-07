/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package databasemysqljava;

/**
 *
 * @author Simath
 */
import java.sql.*;
import java.util.Scanner;
public class DatabaseMYSQLjava {

static Connection conn;
static Statement stmt;
static ResultSet rs;

public static void main(String[]args){

Scanner input1 = new Scanner(System.in);
Scanner input2 = new Scanner(System.in);

try{
Class.forName("com.mysql.jdbc.Driver");
conn = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan","root","");
stmt = conn.createStatement();
System.out.println("selemat datang di perspustakaan chamebert ");
System.out.print("menu pilihan : (1) lihat semua daftar buku "
 +               "\n             (2) mencari buku yang diinginkan "
 + "\nsilahkan pilih dengan angka 1 atau 2 : ");
int pilih1 = input1.nextInt();

if(pilih1 == 1){
rs = stmt.executeQuery("select * from buku"); //yang bagian execute nya itu "stmt" 
// sedangkan variable rs ini cuman wadah buat nampung hasil dari "stmt" yang berupa tampilan isi databasenya 
// biar bisa diprintln gitu 
}
else if(pilih1 == 2){
System.out.println("masukan id buku yang dicari : ");
String pilih2 =input2.nextLine();
rs = stmt.executeQuery("select * from buku WHERE id_buku = '"+pilih2+"'");

}else{
System.out.println("ngadi ngadi aje lu pencet 1 atau 2 aje gak ada yang laen");
}

while(rs.next()){
System.out.println("ID_BUKU  : "+rs.getString("id_buku"));
System.out.println("judul    : "+rs.getString("judul_buku"));
System.out.println("pengarang: "+rs.getString("pengarang"));
System.out.println("kategori : "+rs.getString("kategori"));
System.out.println("qty      : "+rs.getInt("qty"));
System.out.println();
System.out.println();
}
stmt.close();
conn.close();
}
catch(Exception e){
e.printStackTrace();
}

}    
}
