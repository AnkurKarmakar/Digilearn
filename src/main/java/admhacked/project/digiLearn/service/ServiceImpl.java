package admhacked.project.digiLearn.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import admhacked.project.digiLearn.DAO.DAOImpl;

public class ServiceImpl implements Service{
	public Map<String, String> getCourseList() throws SQLException, IOException
	{
		return (new DAOImpl()).courseList();
	}
	
	
	public String getLink(String coursename) throws SQLException, IOException {
		return (new DAOImpl()).Link(coursename);
	}
	
	
	public ArrayList<ArrayList<String>> getcourseList2(String projectid) throws SQLException, IOException{
		String[] skills = (new DAOImpl()).getSkillsOfProjects(projectid);
		ArrayList<ArrayList<String>> temp = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> fin = new ArrayList<ArrayList<String>>();
		int count=0;
		for(int i=0;i<skills.length;i++){
			count++;
			if(count==1)
			{
				temp=(new DAOImpl()).getCourses(skills[i]);
				fin.addAll(temp);
			}
			else {
				temp=(new DAOImpl()).getCourses(skills[i]);
				fin.get(0).addAll(temp.get(0));
				fin.get(1).addAll(temp.get(1));
			}
			
		}
		return fin;
	}
	
	
	public void getCheckEmployee(String employeeid,String employeename,String interest) throws SQLException, IOException {
		if((new DAOImpl()).employeeExists(employeeid))
			(new DAOImpl()).insertEmployee(employeeid, employeename, interest);
		else
			(new DAOImpl()).setSkills(employeeid, interest);
	}
	
	
	public ArrayList<ArrayList<String>> getcourseList1(String interest) throws SQLException, IOException{
		String ar[]=interest.split(",");
		ArrayList<ArrayList<String>> temp = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> fin = new ArrayList<ArrayList<String>>();
		int count=0;
		for(String i:ar){
			i=i.toLowerCase();
			count++;
			if(count==1)
			{
				temp=(new DAOImpl()).getCourses(i);
				fin.addAll(temp);
			}
			else {
				temp=(new DAOImpl()).getCourses(i);
				fin.get(0).addAll(temp.get(0));
				fin.get(1).addAll(temp.get(1));
			}
		}
		//System.out.println(fin);
		return fin;
	}
}
