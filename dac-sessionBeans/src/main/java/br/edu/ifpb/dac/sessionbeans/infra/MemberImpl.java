package br.edu.ifpb.dac.sessionbeans.infra;

import br.edu.ifpb.dac.sessionbeans.interfaces.IMember;
import br.edu.ifpb.dac.sessionbeans.model.CPF;
import br.edu.ifpb.dac.sessionbeans.model.Member;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Resource;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(IMember.class)
public class MemberImpl implements IMember {
    
    @Resource(lookup = "java:app/jdbc/sessionbeans")
    private DataSource dataSource;
    
    @Override
    public boolean saveMember(Member member) {
        try (Connection conn = dataSource.getConnection()) {
            PreparedStatement createStatement = conn.prepareStatement(
                    "INSERT INTO member (name, birthday, cpf) VALUES(?,?,?);"
            );
            createStatement.setString(1, member.getName());
            createStatement.setDate(
                    2, Date.valueOf(member.getBirthday())
            );
            createStatement.setString(3, member.getCpf().number());

            int executeUpdate = createStatement.executeUpdate();
            createStatement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteMember(int id) {
        try (Connection conn = dataSource.getConnection()) {
            Statement createStatement = conn.createStatement();
            ResultSet result = createStatement.executeQuery(
                    "DELETE CASCADE FROM member WHERE id = " + id
            );
            createStatement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateMember(Member member) {
        try (Connection conn = dataSource.getConnection()) {
            PreparedStatement createStatement = conn.prepareStatement(
                    "UPDATE band SET originPlace = ?, name = ? WHERE id = ?"
            );
            createStatement.setString(1, member.getName());
            createStatement.setString(2, member.getBirthday()+ "");
            createStatement.setString(3, member.getCpf().number());
            createStatement.executeUpdate();
            createStatement.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Member> allMembers() {
        List<Member> lista = new ArrayList<>();
        try (Connection conn = dataSource.getConnection()) {
            Statement createStatement = conn.createStatement();
            ResultSet result = createStatement.executeQuery(
                    "SELECT * FROM Integrante;"
            );
            iteraractWithBands(result, lista);
            createStatement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    private void iteraractWithBands(ResultSet result, List<Member> lista) {
            try {
            while (result.next()) {          
                lista.add(
                    createNewMember(result)
                );
            }
            } catch (SQLException ex) {
                Logger.getLogger(MemberImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }

    private Member createNewMember(ResultSet result) throws SQLException {
        String name = result.getString("name");

        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Date birth = result.getDate("birthday");
        LocalDate birthday = birth.toLocalDate();

        CPF cpf = new CPF(result.getString("cpf"));
        int id = result.getInt("id");

        return new Member(id, name, birthday, cpf);
    }

    
}
