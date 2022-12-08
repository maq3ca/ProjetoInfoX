/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoinfox.modeldal;

import java.sql.*;

/**
 *
 * @author Marques
 */
public class ModuloConexao {
    //Módulo responsável em estabelecer a conexão com o banco de dados

    public static Connection conector() {
        Connection conexao = null;
        // A linha abaixo "chama" o driver
        // Aqui foi feita uma correção no driver, antes ==> "com.mysql.jdbc.Driver";
 
        String driver = "com.mysql.cj.jdbc.Driver";

        //Armazenado informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";

        //Estabelecendo a conexão com o banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;

        } catch (Exception e) {
            //A linha abaixo serve para esclarecer o erro
            //System.out.println(e);
            return null;

        }

    }

}
