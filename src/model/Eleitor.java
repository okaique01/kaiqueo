/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kaique
 */
public class Eleitor {

    /**
     * @return the ideleitor
     */
    public int getIdeleitor() {
        return ideleitor;
    }

    /**
     * @param ideleitor the ideleitor to set
     */
    public void setIdeleitor(int ideleitor) {
        this.ideleitor = ideleitor;
    }

    /**
     * @return the tituloEleitor
     */
    public int getTituloEleitor() {
        return tituloEleitor;
    }

    /**
     * @param tituloEleitor the tituloEleitor to set
     */
    public void setTituloEleitor(int tituloEleitor) {
        this.tituloEleitor = tituloEleitor;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    private int ideleitor, tituloEleitor;
    private String nome, cpf;
    
}
