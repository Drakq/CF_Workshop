package workshop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import workshop.data.EmployeeRepository;
import workshop.model.EmployeeWrapper;

@Controller
public class WebController {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/")
	public String viewAllEmployees(Model model) {
		model.addAttribute("employeeWrapper", new EmployeeWrapper(employeeRepository.findAll()));
		return "index";
	}
	
	@PostMapping("/")
	public String saveEmployees(Model model, RedirectAttributes redirectAttributes, @ModelAttribute EmployeeWrapper employeeWrapper) {
		employeeRepository.saveAll(employeeWrapper.getEmployees());
		redirectAttributes.addFlashAttribute("success", "Successfully saved.");
		return "redirect:/";
	}
}