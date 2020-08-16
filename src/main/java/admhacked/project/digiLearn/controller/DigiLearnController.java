package admhacked.project.digiLearn.controller;
import java.util.ArrayList;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.sql.SQLException;
import admhacked.project.digiLearn.model.DigiLearn;
import admhacked.project.digiLearn.service.ServiceImpl;

@Controller
public class DigiLearnController {


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView goLoginPage(Model model) {
		model.addAttribute("home", new DigiLearn());
		return new ModelAndView("home");
	}

	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public ModelAndView showLoginPage(@ModelAttribute("home") DigiLearn model, BindingResult result) throws SQLException, IOException {
		ModelAndView mv = new ModelAndView();
		String interest=model.getInterests();
		String employeename=model.getName();
		String employeeid=model.getEmployeeid();
		(new ServiceImpl()).getCheckEmployee(employeeid, employeename, interest);
		ArrayList<ArrayList<String>> ar = (new ServiceImpl()).getcourseList1(interest);
		mv.addObject("ar",ar);
		mv.setViewName("courseList1");
		return mv;
		}
	
	@RequestMapping(value = "/submitProject", method = RequestMethod.POST)
	public ModelAndView showPage(@ModelAttribute("home") DigiLearn model, BindingResult result) throws SQLException, IOException {
		ModelAndView mv = new ModelAndView();
		String projectid=model.getProjectid();
		ArrayList<ArrayList<String>> ar = (new ServiceImpl()).getcourseList2(projectid);
		mv.addObject("ar",ar);
		mv.setViewName("courseList2");
		return mv;
		}
	
	@RequestMapping(value = "/goto", method = RequestMethod.POST)
	public ModelAndView gotoLink(@ModelAttribute("home") DigiLearn model, BindingResult result) throws SQLException, IOException {
		String coursename=model.getCoursename();
		String Link = (new ServiceImpl()).getLink(coursename);
		ModelAndView url=new ModelAndView("redirect:"+Link);
		return url;
		}
	
	@ModelAttribute("courses")
	   public Map<String, String> getCourseList() throws SQLException, IOException {
		
	    return (new ServiceImpl()).getCourseList();
	   }
	}