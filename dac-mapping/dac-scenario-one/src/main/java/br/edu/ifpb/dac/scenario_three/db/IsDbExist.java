package br.edu.ifpb.dac.scenario_three.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rodger
 */
public final class IsDbExist {

//    private Connection con = null;
//    private ResultSet rs = null;
//
//    private final String url = "jdbc:postgresql://localhost:5432/";
//    private final String user = "postgres";
//    private final String password = "12345678";
//
//    String dbName = "";
//
//    public IsDbExist() {
//    }
//
//    public IsDbExist(String dbName) {
//        this.createDb(dbName);
//    }
//
//    public void createDb(String dbName) {
//        try {
//
//            Class.forName("org.postgresql.Driver");
//
//            con = DriverManager.getConnection(url, user, password);
//
////            if (con != null) {
////
////                rs = con.getMetaData().getCatalogs();
////
////                while (rs.next()) {
////                    String catalogs = rs.getString(1);
////
////                    if (!dbName.equals(catalogs)) {
////                        Statement s = con.createStatement();
////                        s.executeUpdate("CREATE DATABASE IF NOT EXISTS " + dbName);
////                    }
////                }
////
////            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        } finally {
//            if (rs != null) {
//                try {
//                    rs.close();
//                } catch (SQLException ex) {
//                    ex.printStackTrace();
//                }
//            }
//            if (con != null) {
//                try {
//                    con.close();
//                } catch (SQLException ex) {
//                    ex.printStackTrace();
//                }
//            }
//        }
//    }
}
