/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import factory.Conexao;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Eleitor;

/**
 *
 * @author kaique
 */
public class EleitorDAO extends Conexao {

    public String cadastrarEleitor(Eleitor eleitor) {

        try {
            String sentenca;
            sentenca = "INSERT INTO ELEITOR VALUES (NULL, '"
                    + eleitor.getNome() + "','" + eleitor.getTituloEleitor() + "','"
                    + eleitor.getCpf() + "')";
            return this.atualizarBanco(sentenca);
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public String atualizarEleitor(Eleitor eleitor) {
        try {
            String sentenca;
            sentenca = "UPDATE ELEITOR SET NOME ='" + eleitor.getNome()
                    + "', TITULOELEITOR = '" + eleitor.getTituloEleitor() + "', CPF = '"
                    + eleitor.getCpf() + "'WHERE IDELEITOR";
            return this.atualizarBanco(sentenca);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public String excluirEleitor (String eleitor){
        try {
            String sentenca;
            sentenca = "DELETE FROM ELEITOR WHERE IDELEITOR =" + eleitor;
            return this.atualizarBanco(sentenca);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public ArrayList listarEleitores(){
        try {
            ArrayList eleitores = new ArrayList();
            String sentenca = "SELECT * FROM ELEITOR ORDER BY NOME";
            ResultSet rs = this.getResultSet(sentenca);
            while (rs.next()){
                Eleitor eleitor = new Eleitor();
                eleitor.setIdeleitor(rs.getInt("IDELEITOR"));                
                eleitor.setNome(rs.getString("NOME"));
                eleitor.setTituloEleitor(rs.getInt("TITULOELEITOR"));
                eleitor.setCpf(rs.getString("CPF"));
                eleitores.add(eleitor);
            }
            return eleitores;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        
    }

}
