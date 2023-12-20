/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author khalifardy
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;

    // Constructor
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Getter for nama
    public String getNama() {
        return nama;
    }

    // Getter for nim
    public String getNim() {
        return nim;
    }

    // Getter for prodi
    public String getProdi() {
        return prodi;
    }
    
    public void insert_mahasiswa() throws SQLException{
        Database db = new Database();
        String sql = "insert into tabel_mahasiswa (nama, nim, prodi) values ('"+this.getNama()+"',"
                + "'"+this.getNim()+"','"+this.getProdi()+"')";
        db.query(sql);              
    }
}
