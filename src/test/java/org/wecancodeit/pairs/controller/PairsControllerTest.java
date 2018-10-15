package org.wecancodeit.pairs.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.wecancodeit.pairs.controller.PairsController;
import org.wecancodeit.pairs.model.Student;
import org.wecancodeit.pairs.repository.PairsRepository;

@RunWith(SpringRunner.class)
@WebMvcTest(PairsController.class)
public class PairsControllerTest {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void shouldBeOk() throws Exception {
		mockMvc.perform(get("/pairs")).andExpect(status().isOk());
	}

}
