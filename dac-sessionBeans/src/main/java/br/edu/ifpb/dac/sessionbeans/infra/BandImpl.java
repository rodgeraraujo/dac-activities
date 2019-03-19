package br.edu.ifpb.dac.sessionbeans.infra;

import br.edu.ifpb.dac.sessionBeans.interfaces.IBand;
import br.edu.ifpb.dac.sessionBeans.model.Band;

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Resource;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


@Stateless
@Remote(IBand.class)
public class BandImpl implements IBand{
    @Resource(lookup = "java:app/jdbc/sessionbeans")
    private DataSource dataSource;

    @Override
    public boolean saveBand(Band band) {
        try (Connection conn = dataSource.getConnection()) {
            PreparedStatement createStatement = conn.prepareStatement(
                    "INSERT INTO band (originPlace, name) VALUES (?,?);"
            );
            createStatement.setString(1, band.getOriginPlace());
            createStatement.setString(2, band.getName());
            int executeUpdate = createStatement.executeUpdate();
            createStatement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteBand(int id) {
        try (Connection conn = dataSource.getConnection()) {
            Statement createStatement = conn.createStatement();
            int result = createStatement.executeUpdate(
                    "DELETE FROM band WHERE id = " + id
            );
            createStatement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateBand(Band band) {
        try (Connection conn = dataSource.getConnection()) {
            PreparedStatement createStatement = conn.prepareStatement(
                    "UPDATE banda SET localdeorigem = ?, nomefantasia = ? WHERE id = ?"
            );
            createStatement.setString(1, band.getOriginPlace());
            createStatement.setString(2, band.getName());
            createStatement.setInt(3, band.getId());
            int executeUpdate = createStatement.executeUpdate();
            createStatement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Band> allBands() {
        List<Band> lista = new ArrayList<>();
        try (Connection conn = dataSource.getConnection()) {
            Statement createStatement = conn.createStatement();
            ResultSet result = createStatement.executeQuery("SELECT * FROM band;");
            iteraractWithBands(result, lista);
            createStatement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    private void iteraractWithBands(ResultSet result, List<Band> lista) {
        try {
            while (result.next()) {
                lista.add(
                        createBand(result)
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(BandImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Band createBand(ResultSet result) {
        String originPlace = null, name = null;
        int id = 0;
        
//        String integrantes = result.getString("");

        try {
            originPlace = result.getString("originPlace");
            name = result.getString("name");
            id = result.getInt("id");
        } catch (SQLException ex) {
            Logger.getLogger(BandImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        Band band = new Band(id, originPlace, name);
        return band;
    }
    
}
