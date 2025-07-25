/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaa.dao;

import sintaa.model.Anggota;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LABSIDOSEN
 */
public class AnggotaDao {

    public void insert(Anggota anggota) throws Exception {
        Connection con = new Koneksi().getKoneksi();
        String sql = "insert into anggota values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, anggota.getKode());
        ps.setString(2, anggota.getNama());
        ps.setString(3, anggota.getJekel());
        ps.setString(4, anggota.getAlamat());
        ps.executeUpdate();
    }

    public void update(Anggota anggota) throws Exception {
        Connection con = new Koneksi().getKoneksi();
        String sql = "update anggota set nama=?, alamat=?, jekel=? where kode=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(4, anggota.getKode());
        ps.setString(1, anggota.getNama());
        ps.setString(2, anggota.getAlamat());
        ps.setString(3, anggota.getJekel());
        ps.executeUpdate();
    }

    public void delete(Anggota anggota) throws Exception {
        Connection con = new Koneksi().getKoneksi();
        String sql = "delete from anggota where kode=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, anggota.getKode());
        ps.executeUpdate();
    }

    public Anggota getAnggota(String kode) throws Exception {
        Connection con = new Koneksi().getKoneksi();
        String sql = "select * from anggota where kode = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kode);
        ResultSet rs = ps.executeQuery();
        Anggota anggota = null;
        if (rs.next()) {
            anggota = new Anggota();
            anggota.setKode(rs.getString(1));
            anggota.setNama(rs.getString(2));
            anggota.setJekel(rs.getString(3));
            anggota.setAlamat(rs.getString(4));
        }
        return anggota;
    }

    public List<Anggota> getAllAnggota() throws Exception {
        Connection con = new Koneksi().getKoneksi();
        String sql = "select * from anggota";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Anggota anggota = null;
        List<Anggota> anggotaList = new ArrayList<>();
        while (rs.next()) {
            anggota = new Anggota();
            anggota.setKode(rs.getString(1));
            anggota.setNama(rs.getString(2));
            anggota.setJekel(rs.getString(3));
            anggota.setAlamat(rs.getString(4));
            anggotaList.add(anggota);
        }
        return anggotaList;
    }
}
