package admhacked.project.digiLearn.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

public interface Service {
	public Map<String, String> getCourseList() throws SQLException, IOException;
	public String getLink(String coursename) throws SQLException, IOException;
	public ArrayList<ArrayList<String>> getcourseList2(String projectid) throws SQLException, IOException;
	public void getCheckEmployee(String employeeid,String employeename,String interest) throws SQLException, IOException;
	public ArrayList<ArrayList<String>> getcourseList1(String interest) throws SQLException, IOException;
	
}
