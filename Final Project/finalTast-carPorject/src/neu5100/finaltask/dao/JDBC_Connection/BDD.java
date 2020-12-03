package neu5100.finaltask.dao.JDBC_Connection;

import java.sql.*;

/**
 *
 * @author Administrator
 */
public class BDD {
    Connection conn ;
    Statement stmt;
    ResultSet rs;
    String SQL;

    String url;
    String username;
    String password;

    public BDD(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;

    }

    //get datamase connection
    public Connection connectionDatabase(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //2 获取连接
            conn = DriverManager.getConnection(url,username,password);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return conn;
    }


    public Connection closeconnection(){
        try{
            conn.close();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        return conn;
    }

    public ResultSet executionQuery(String sql){
        connectionDatabase();
        ResultSet resultSet = null;
        try{
            stmt = conn.createStatement();
            resultSet = stmt.executeQuery(sql);
            System.out.println(sql);

        }catch(Exception ex){
            System.err.println(ex);
        }
        return resultSet;
    }

    //select all Cardata
    public ResultSet querySelectAll(String nomTable){
        connectionDatabase();
        SQL = "SELECT * FROM " + nomTable;
        System.out.println(SQL);
        return this.executionQuery(SQL);

    }

    public ResultSet querySelectAll(String nomTable,String etat){
        connectionDatabase();
        SQL = "SELECT * FROM " + nomTable + " WHERE " + etat;
        return this.executionQuery(SQL);

    }

    public ResultSet querySelect(String[] nomColonne,String nomTable){
        connectionDatabase();
        int i ;
        SQL = "SELECT ";
        for(i = 0; i <= nomColonne.length - 1 ; i++ ){
            SQL += nomColonne[i];
            if(i < nomColonne.length - 1){
                SQL += ",";
            }
        }

        SQL += "FROM" + nomTable;
        return this.executionQuery(SQL);

    }

}

