import java.util.Scanner;
import java.io.IOException;
import java.sql.*;

public class Menu {
	static Connection conn = null;
	
	static String SQLGetMenu = "SELECT * FROM items";
	static String SQLGetItem = "SELECT * FROM items WHERE id=?";
	static String SQLInsertItem = "INSERT INTO items (name, category, price) VALUES (?, ?, ?)";
	static String SQLDeleteItem = "DELETE FROM items WHERE id=?";
	static String SQLUpdateItem = "UPDATE items SET name=?, category=?, price=? WHERE id=?";
	
	public static void createConnection() {
		String JDBCURL = "jdbc:mysql://localhost:3306/menu";
		String JDBCUsername = "root";
		String JDBCPassword = "rayanajmera";
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(JDBCURL, JDBCUsername, JDBCPassword);
		} catch (Exception e) {
			System.out.println("Unable to Connect to Database");
		}
	}
	
	public static void getItem(int id) {
		try {
			System.out.println("ID\tName\tCategory\tPrice");
			
			
			PreparedStatement statement = conn.prepareStatement(SQLGetItem);
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getFloat(4));
			}
			System.out.println();
		} catch(SQLException e) {
			System.out.println("Unable to get information");
		}
	}
	
	public static Boolean insertItem(String name, String category, float price) {
		try {
			PreparedStatement statement = conn.prepareStatement(SQLInsertItem);
			statement.setString(1, name);
			statement.setString(2, category);
			statement.setFloat(3, price);
			
			int rowInserted = statement.executeUpdate();
			if (rowInserted > 0) {
				return true;
			} else {
				return false;
			}
		} catch(SQLException e)  {
			return false;
		}
	}
	
	public static void getMenu() {
		try {
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(SQLGetMenu);
			System.out.println("ID\tName\tCategory\tPrice");
			
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getFloat(4));
			}
			System.out.println();
		} catch(SQLException e)  {
			System.out.println("Some Error Occured");
		}
	}
	
	public static Boolean updateItem(int id, String name, String category, float price) {
		try {
			PreparedStatement statement = conn.prepareStatement(SQLUpdateItem);
			statement.setString(1, name);
			statement.setString(2, category);
			statement.setFloat(3, price);
			statement.setInt(4, id);
			
			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
				return true;
			} else {
				return false;
			}
		} catch(SQLException e) {
			return false;
		}
	}
	
	public static Boolean deleteItem(int id) {
		try {
			PreparedStatement statement = conn.prepareStatement(SQLDeleteItem);
			statement.setInt(1, id);
			int rowDeleted = statement.executeUpdate();
			if (rowDeleted > 0) {
				return true;
			} else {
				return false;
			}
		} catch(SQLException e) {
			return false;
		}
	}
	
	public static void main(String[] args) {
		createConnection();
		getMenu();
		System.out.println();
		String name, category;
		Float price;
		int id;
		
		String s = "";
		Scanner scan = new Scanner(System.in);
		while (!s.equals("q")) {
			System.out.println("Insert: i, Delete: d, Update: u, Quit: q");
			s = scan.nextLine();
			if (s.equals("i")) {
				System.out.println("Name: ");
				name = scan.nextLine();
				System.out.println("Category: ");
				category = scan.nextLine();
				System.out.println("Price: ");
				price = Float.valueOf(scan.nextLine());
				
				insertItem(name, category, price);
				
				System.out.println();
				getMenu();
				System.out.println();
			}
			else if (s.equals("d")) {
				System.out.println("ID of Item: ");
				id = Integer.valueOf(scan.nextLine());
				deleteItem(id);
				
				System.out.println();
				getMenu();
				System.out.println();
			}
			else if (s.equals("u")) {
				System.out.println("ID of Item: ");
				id = Integer.valueOf(scan.nextLine());
				
				getItem(id);
				System.out.println();
				
				System.out.println("Name: ");
				name = scan.nextLine();
				System.out.println("Category: ");
				category = scan.nextLine();
				System.out.println("Price: ");
				price = Float.valueOf(scan.nextLine());
				
				updateItem(id, name, category, price);
				
				System.out.println();
				getMenu();
				System.out.println();
			}
		}
	}
}


//CREATE DATABASE Menu;
//
//USE Menu;
//
//CREATE TABLE `items` (
//	`id` INT(11) NOT NULL AUTO_INCREMENT,
//	`name` VARCHAR(45) NOT NULL,
//	`category` VARCHAR(45) NOT NULL,
//	`price` DECIMAL(10,2) NOT NULL,
//	PRIMARY KEY (`ID`)
//);
