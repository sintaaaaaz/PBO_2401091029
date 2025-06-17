/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinta.dao;
import java.sql.Connection;
import sinta.model.Anggota;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author user
 */

public class AnggotaDao {
    public void insert(Anggota anggota) throws Exception{
        Connection con = new Koneksi().getKoneksi();
        String sql = "insert into anggota values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, anggota.getKode());
        ps.setString(1, anggota.getNama());
        ps.setString(1, anggota.getAlamat() );
        ps.setString(1, anggota.getJekel());
        ps.executeUpdate();
    }
    
 public void update(Anggota anggota)throws Exception{
        Connection con = new Koneksi().getKoneksi();
        String sql = 
           "update anggota set nama=?, alamat=?, jekel=?, where kodeanggota=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, anggota.getKode());
        ps.setString(2, anggota.getNama());
        ps.setString(3,anggota.getAlamat());
        ps.setString(4, anggota.getJekel());
        ps.executeUpdate();
    } 
 
 public void delete(Anggota anggota)throws Exception{
        Connection con = new Koneksi().getKoneksi();
        String sql = 
           "delete from anggota where kodeanggota=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, anggota.getKode());
        ps.executeUpdate();
    } 
 
public Anggota getAnggota(String kode) throws Exception{
        Connection con = new Koneksi().getKoneksi();
        String sql = "select * from anggota where kodeamggota=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kode);
        ResultSet rs = ps.executeQuery();
        Anggota anggota = null;
        if(rs.next()){
            anggota = new Anggota();
            anggota.setKode(rs.getString(1));
            anggota.setNama(rs.getString(2));
            anggota.setAlamat(rs.getString(3));
            anggota.setJekel(rs.getString(4));
        }
        return anggota;
    }
public List<Anggota> getAllAnggota() throws Exception{
    Connection con = new Koneksi().getKoneksi();
    String sql = "select * from anggota";
    PreparedStatement ps = con.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    List <Anggota> anggota = new ArrayList<>();
    while(rs.next()){
        Anggota angg = new Anggota();
        angg.setKode(rs.getString(1));
        angg.setNama(rs.getString(2));
        angg.setAlamat(rs.getString(3));
        angg.setJekel(rs.getString(4));
        anggota.add(angg);
    }
    return anggota;
}
}