package uet.vnu.java.spring.model;

import java.sql.*;
import java.sql.Statement;
import java.util.ArrayList;

public class TodoService {
	
 
	public ArrayList<Todo> getListTodos(int userId) {
        ArrayList<Todo> listTodo = new ArrayList<Todo>();
        try {
            Statement statement = DatabaseService.getConnection().createStatement();
            String query = "SELECT * FROM todolist WHERE userid LiKE" + "'" + userId + "'";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                int userid = resultSet.getInt(2);
                String job = resultSet.getString(3);
                Date date = resultSet.getDate(4);
                Boolean isDone = resultSet.getBoolean(5);
                listTodo.add(new Todo(id, userid, job, date, isDone));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listTodo;
    }

    public void addTodo(Todo todo) {
        try {
            String sql = "INSERT INTO todolist (userid,job,date,isdone)" + "VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = DatabaseService.getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, todo.getUserid());
            preparedStatement.setString(2, todo.getJob());
            preparedStatement.setBoolean(4, todo.getDone());

            preparedStatement.setDate(3, new Date(todo.getDate().getTime()));

            Date date = new Date(todo.getDate().getTime());
            System.out.println("time");
            System.out.println(date.toString());
            System.out.printf(todo.getDate().toString());

            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }

    public void upDateTodo(Todo todo) {
        String query = "UPDATE todolist SET job = ? , date = ?, isdone = ? WHERE id = ?";
        try {
            PreparedStatement preparedStatement = DatabaseService.getConnection().prepareStatement(query);
            preparedStatement.setString(1, todo.getJob());
            preparedStatement.setDate(2, new Date(todo.getDate().getTime()));
            preparedStatement.setBoolean(3, todo.getDone());
            preparedStatement.setInt(4, todo.getId());
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Update Error");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Update Error");
            e.printStackTrace();
        }
    }

    public void deleteToto(int id) {
        String query = "DELETE FROM todolist WHERE id = ?";
        try {
            PreparedStatement preparedStatement = DatabaseService.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Delete Error");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Delete Error");
            e.printStackTrace();
        }
    }

    public Todo getItemTodo(int id) {
        try {
            Statement statement = DatabaseService.getConnection().createStatement();
            String query = "SElECT *FROM todolist WHERE id =" + id;
            ResultSet resultSet = statement.executeQuery(query);
            Todo todo = new Todo();
            while (resultSet.next()) {
                todo.setId(resultSet.getInt(1));
                todo.setUserid(resultSet.getInt(2));
                todo.setJob(resultSet.getString(3));
                todo.setDate(resultSet.getDate(4));
                todo.setDone(resultSet.getBoolean(5));
            }
            return todo;
        } catch (SQLException e) {
            System.out.println("Not Found Object by id");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Not Found Object by id");
            e.printStackTrace();
        }
        return null;
    }
}
