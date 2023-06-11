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
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getCpf());
            stmt.setString(3, aluno.getDataDeNascimento());
            stmt.setInt(4, aluno.getPeso());
            stmt.setDouble(5, aluno.getAltura());
            stmt.execute();
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
    
    public static void excluir(Aluno aluno) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            String query = "DELETE FROM alunos WHERE name_student = ?";
            statement = connection.prepareStatement(query);
            statement.setString(1, aluno.getNome());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void atualizar(Aluno aluno) {
        this.connection = new ConnectionFactory().getConnection();
        try {
            String query = "UPDATE alunos SET name_student = ?, birth_student = ?, weight = ?, height = ? WHERE cpf = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getCpf());
            stmt.setString(3, aluno.getDataDeNascimento());
            stmt.setInt(4, aluno.getPeso());
            stmt.setDouble(5, aluno.getAltura());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            }
        }
    }


    

    

    
