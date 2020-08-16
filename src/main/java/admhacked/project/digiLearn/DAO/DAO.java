package admhacked.project.digiLearn.DAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;


public interface DAO {
	public void connect() throws SQLException,IOException;
	public Map<String, String> courseList() throws SQLException, IOException;
	public String Link(String coursename) throws SQLException, IOException;
	public boolean employeeExists(String employeeid) throws SQLException, IOException;
	public void setSkills(String employeeid,String interest) throws SQLException, IOException;
	public void insertEmployee(String employeeid,String employeename,String interest) throws SQLException, IOException;
	public String[] getSkillsOfProjects(String projectId) throws SQLException, IOException;	
}
