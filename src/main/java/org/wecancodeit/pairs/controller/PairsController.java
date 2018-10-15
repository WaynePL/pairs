package org.wecancodeit.pairs.controller;

import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wecancodeit.pairs.model.Student;
import org.wecancodeit.pairs.repository.PairsRepository;

@Controller
public class PairsController {

	PairsRepository pairsRepo = new PairsRepository();

	@GetMapping("/pairs")
	public String getPairs(Model model) {
		Collection<Collection<Student>> pairs = pairsRepo.getRandomPairs();
		model.addAttribute("studentPairs", pairs);
		for (Collection<Student> pair : pairs) {
			System.out.println("[");
			for (Student student : pair) {
				System.out.println(student.getName());
			}
			System.out.println("]");
		}
		return "pairs";
	}

}
