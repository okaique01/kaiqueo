/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import factory.Conexao;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Candidato;

/**
 *
 * @author kaique
 */
public class CandidatoDAO extends Conexao {

    public String cadastrarCandidato(Candidato candidato) {

        try {
            String sentenca;
            sentenca = "INSERT INTO CANDIDATO VALUES (NULL, '"
                    + candidato.getNome() + "','" + candidato.getPartido() + "','" 
                    + candidato.getNumero() + "','" + candidato.getCargo() + "')";
            return this.atualizarBanco(sentenca);
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public String atualizarCandidato(Candidato candidato) {
        try {
            String sentenca;
            sentenca = "UPDATE CANDIDATO SET NOME ='" + candidato.getNome() + 
                    "', PARTIDO = '" + candidato.getPartido() + "', NUMERO = '" 
                    + candidato.getNumero() + "', CARGO = '" + candidato.getCargo() + "'WHERE IDCANDIDATO";
            return this.atualizarBanco(sentenca);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public String excluirCandidato (String candidato){
        try {
            String sentenca;
            sentenca = "DELETE FROM CANDIDATO WHERE IDCANDIDATO =" + candidato;
            return this.atualizarBanco(sentenca);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public ArrayList listarCandidatos(){
        try {
            ArrayList candidatos = new ArrayList();
            String sentenca = "SELECT * FROM CANDIDATO ORDER BY NOME";
            ResultSet rs = this.getResultSet(sentenca);
            while (rs.next()){
                Candidato candidato = new Candidato();
                candidato.setIdcandidato(rs.getInt("IDCANDIDATO"));                
                candidato.setNome(rs.getString("NOME"));
                candidato.setPartido(rs.getString("PARTIDO"));
                candidato.setNumero(rs.getInt("NUMERO"));
                candidato.setCargo(rs.getString("CARGO"));
                candidatos.add(candidato);
            }
            return candidatos;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        
    }

}
