package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    
    public Connection conectarBD(){
        /*5*/Connection conn = null;
        /*6*/try {
            /*7*/Class.forName("com.mysql.Driver.Manager").newInstance();
            /*8*/String url = "jdbc.mysql://127.0.0.1/test?user=lopes&password=123";
            /*9*/conn = DriverManager.getConnection(url);
        } 
        /*10*/catch (Exception e) {
        }
        /*11*/return conn;
    }

    /*1*/public String nome = "";
    /*2*/public boolean result = false;

    public boolean verificarUsuario(String login, String senha){
        /*3*/String sql = "";
        /*4*/Connection conn = conectarBD();
        //INSTRUÇÃO SQL
        /*12*/sql += "select nome from usuarios ";
        /*12*/sql += "where login ='" + login + "' ";
        /*12*/sql += "and senha ='" + senha + "';";
        /*13*/try {
            /*14*/Statement st = conn.createStatement();
            /*15*/ResultSet rs = st.executeQuery(sql);
            /*16*/if (rs.next()) {
                /*17*/result = true;
                /*18*/nome = rs.getString(nome);
            }
        } /*19*/catch (Exception e) {
        }
        /*20*/return result;
    }
}//fim da class
