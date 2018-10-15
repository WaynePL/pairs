package org.wecancodeit.pairs.repository;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.Collection;

import org.junit.Test;
import org.wecancodeit.pairs.model.Student;

public class PairsRepositoryTest {

	@Test
	public void shouldContainAllStudents() {
		PairsRepository underTest = new PairsRepository();
		Student josh = new Student("Josh");
		Student wayne = new Student("Wayne");
		underTest.add(josh);
		underTest.add(wayne);
		Collection<Student> result = underTest.getStudents();
		assertThat(result, hasItems(josh, wayne));
	}

	@Test
	public void shouldContain2Students() {
		PairsRepository underTest = new PairsRepository();
		Student josh = new Student("Josh");
		Student wayne = new Student("Wayne");
		Student ingrid = new Student("Ingrid");
		underTest.add(josh);
		underTest.add(wayne);
		underTest.add(ingrid);
		Collection<Student> result = underTest.get2Students();
		for (Student student : result) {
			System.out.println(student.getName());
		}
		assertThat(result.size(), is(equalTo(2)));
	}

}
