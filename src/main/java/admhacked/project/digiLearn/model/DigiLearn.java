package admhacked.project.digiLearn.model;
public class DigiLearn {
	private String name;
	private String employeeid;
	private String interests;
	private String projectid;
	private String coursename;
	
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	/**
	 * @param projectid
	 */
	public DigiLearn(String projectid) {
		super();
		this.projectid = projectid;
	}
	public String getProjectid() {
		return projectid;
	}
	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}
	/**
	 * 
	 */
	public DigiLearn() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param employeeid
	 * @param interests
	 */
	public DigiLearn(String name, String employeeid, String interests) {
		super();
		this.name = name;
		this.employeeid = employeeid;
		this.interests = interests;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public String getInterests() {
		return interests;
	}
	public void setInterests(String interests) {
		this.interests = interests;
	}
	
	

}
