/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFileChooser;

/**
 *
 * @author hugoh
 */
public class Aluno {
    private int id;
    private String cpf;
    private String nome;
    private String dataDeNascimento;
    private int peso;
    private double altura;

    public Aluno() {
    }

    public Aluno(int id, String cpf, String nome, String dataDeNascimento, int peso, double altura) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.peso = peso;
        this.altura = altura;
    }

    public int getId() {
        return id;
    }
   
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public int getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String calculaImc() {
        double imc = (peso / (altura * altura)) * 10000; 
        String result = String.format("%.2f", imc);
        return result;
    }
     
    public void salvarArquivo() {
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File("C:/downloads"));
        
        double imc = (peso / (altura * altura)) * 10000;
        
        LocalDate dataAtual = LocalDate.now();
        String dataFormatada = dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        String interpretacao;
        if (imc < 18.5) {
            interpretacao = "Abaixo do peso";
        } else if (imc < 25) {
            interpretacao = "Peso normal";
        } else if (imc < 30) {
            interpretacao = "Sobrepeso";
        } else {
            interpretacao = "Obesidade";
        }

        String resultado = String.format("Data do cálculo: %s\nCPF: %s\nNome: %s\nÍndice IMC: %.2f\nInterpretação: %s", dataFormatada, cpf, nome, imc, interpretacao);

        try {
            int resp = fc.showSaveDialog(null);
            if (resp == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                FileWriter writer = new FileWriter(file);
                writer.write(resultado + "\n");
                writer.close();
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
}
