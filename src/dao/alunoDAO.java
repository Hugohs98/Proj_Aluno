/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author hugoh
 */
import factory.ConnectionFactory;
import gui.AlunoGUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Aluno;

/**
 *
 * @author hugoh
 */
public class alunoDAO {
    private Connection connection;
    private ArrayList<Aluno> lista;
    private ResultSet rs;
    
    public alunoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Aluno aluno) {
        String sql = "INSERT INTO alunos(name_student, cpf, birth_student, weight, height) VALUES(?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getCpf());
            stmt.setString(3, aluno.getDataDeNascimento());
            stmt.setInt(4, aluno.getPeso());
            stmt.setDouble(5, aluno.getAltura());
            stmt.execute();
            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()){
                aluno.setId(rs.getInt(1));
            }
            stmt.close();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public ArrayList<Aluno> getAllAlunos() {
        this.connection = new ConnectionFactory().getConnection();
        String sql = "SELECT * FROM alunos";
        this.lista = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            this.connection = new ConnectionFactory().getConnection();
            rs = stmt.executeQuery();
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setCpf(rs.getString("cpf"));
                aluno.setNome(rs.getString("name_student"));
                aluno.setDataDeNascimento(rs.getString("birth_student"));
                aluno.setPeso(rs.getInt("weight"));
                aluno.setAltura(rs.getDouble("height"));

                this.lista.add(aluno);
            }
            connection.close();
        } catch (SQLException exception) {
            // TODO: handle exception
            throw new RuntimeException(exception);
        }

        return this.lista;
    }
    
    public void excluir(Aluno aluno) {
        String sql = "DELETE FROM alunos WHERE cpf = ?";
        connection = new ConnectionFactory().getConnection();

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, aluno.getCpf());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }    
    }
    
    
    public void atualizar(Aluno aluno) {
        String sql = "UPDATE alunos SET name_student = ?, cpf = ?, birth_student = ?, weight = ?, height = ? WHERE id_student = ?";
        connection = new ConnectionFactory().getConnection();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getCpf());
            stmt.setString(3, aluno.getDataDeNascimento());
            stmt.setInt(4, aluno.getPeso());
            stmt.setDouble(5, aluno.getAltura());
            stmt.setInt(6, aluno.getId());
            stmt.execute();
            stmt.close();
            System.out.println("ahsaushaisuhdasiudahsiuduhasd");
        }catch(SQLException e){
            throw new RuntimeException(e);
        } finally {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            }
        }
    }
}


    

    

    
