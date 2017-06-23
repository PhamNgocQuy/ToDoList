package uet.vnu.java.spring.model;

import java.sql.*;
public class AccountService {
	
	public AccountService() {
    }

    public static Boolean checkUser(String user, String passworld) {
        System.out.println("Checking");
        try {
            Statement statement = DatabaseService.getConnection().createStatement();
            String query = "SELECT * FROM account";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
                if (resultSet.getString(2).equals(user) && resultSet.getString(3).equals(passworld)) {
                    System.out.printf("correct");
                    return true;
                }

            }
        } catch (ClassNotFoundException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    public static int getIdUser(String user, String passworld) {
        int idUser = 0;
        try {
            Statement statement = DatabaseService.getConnection().createStatement();
            String query = "SELECT * FROM account";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                if (resultSet.getString(2).equals(user) && resultSet.getString(3).equals(passworld)) {
                    idUser = resultSet.getInt(1);
                }
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return idUser;
    }

}
