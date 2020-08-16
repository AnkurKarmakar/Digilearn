package admhacked.project.digiLearn.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DAOImpl implements DAO {
	String driver = "com.mysql.jdbc.Driver";
	String connectionUrl = "jdbc:mysql://localhost:3306/";
	String database;
	
	private String userid;
	private String password;
	
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
	
	
public void connect() throws SQLException, IOException {
	database=(new DBLogin()).getDatabase();
	userid=(new DBLogin()).getUsername();
	password=(new DBLogin()).getPassword();
	//System.out.println(userid+" "+password);
	try {
		Class.forName(driver);
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
		}
	connection = DriverManager.getConnection(connectionUrl+database, userid, password);
	statement=connection.createStatement();
}


 public Map<String, String> courseList() throws SQLException, IOException
 {
		connect();
	    Map<String, String> courseList = new HashMap<String, String>();
		String sql ="SELECT * from course;";
		resultSet = statement.executeQuery(sql);
		while(resultSet.next()) {
			courseList.put(resultSet.getString("CourseName"),resultSet.getString("CourseName"));
		}
		return courseList;
 }
 
 

 public String Link(String coursename) throws SQLException, IOException {
	 connect();
	 String Link="";
	 String sql="select Link from course where CourseName='"+coursename+"';";
		resultSet=statement.executeQuery(sql);
		while(resultSet.next())
			Link = resultSet.getString("Link");
		return Link;
 }
 

 
 public boolean employeeExists(String employeeid) throws SQLException, IOException {
	 connect();
	 String sql ="SELECT * from employee WHERE EmployeeID='"+employeeid+"';";
	 resultSet = statement.executeQuery(sql);
	 return (!resultSet.next());
 }
 public void setSkills(String employeeid,String interest)throws SQLException, IOException{
	 	connect();
		String z="select Skills from employee where EmployeeID='"+employeeid+"';";
		resultSet=statement.executeQuery(z);
		String sk="";
		while(resultSet.next()) {
			sk = resultSet.getString("Skills");
		}
		z="update employee set skills='"+sk+","+interest +"' where EmployeeID='"+employeeid+"';";
		statement.execute(z); 
 }
 
 
 public void insertEmployee(String employeeid,String employeename,String interest) throws SQLException, IOException {
	 connect();
	 String s ="INSERT INTO employee VALUES ('"+employeeid+"','"+employeename+"','"+interest+"');";
	 statement.execute(s);
 }

 public String[] getSkillsOfProjects(String projectId) throws SQLException, IOException{
	 connect();
	 String sql1 ="select skills from project where project_id='"+projectId+"';";
	resultSet = statement.executeQuery(sql1);
	String skills[]=null;
	while(resultSet.next()){
		skills=resultSet.getString("skills").split(",");
	}
	 return skills;
 }
 
 
 public ArrayList<ArrayList<String>> getCourses(String i) throws SQLException, IOException{
	 connect();
	 ArrayList<ArrayList<String>> arr=new ArrayList<ArrayList<String>>();
	 ArrayList<String> cn=new ArrayList<String>();
	 ArrayList<String> l=new ArrayList<String>();
	 String sql ="select CourseName,Link from course where Interest like '%"+i+"%';";
	//System.out.println(sql);
	resultSet = statement.executeQuery(sql);
		
	while(resultSet.next()){
		cn.add(resultSet.getString("CourseName"));
		l.add(resultSet.getString("Link"));
		}
	arr.add(cn);
	 arr.add(l);
	return arr;
	}
}
