package org.wecancodeit.pairs.repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import org.springframework.stereotype.Repository;
import org.wecancodeit.pairs.model.Student;

@Repository
public class PairsRepository {

	ArrayList<Student> students = new ArrayList<>();
	ArrayList<Collection<Student>> studentPairs = new ArrayList<Collection<Student>>();

	public void addAll() {
		add(new Student("Josh"));
		add(new Student("Wayne"));
		add(new Student("Kevin"));
		add(new Student("Justin"));
		add(new Student("Ingrid"));
		add(new Student("Riley"));
		add(new Student("Max"));
		add(new Student("Tre"));
		add(new Student("Jane"));
		add(new Student("Kelli"));
		add(new Student("Khoi"));
		add(new Student("Thomas"));
		add(new Student("Alex"));
		add(new Student("Joe"));
	}

	public void add(Student student) {
		students.add(student);

	}

	public Collection<Student> getStudents() {
		// TODO Auto-generated method stub
		return students;
	}

	public Collection<Student> get2Students() {
		ArrayList<Student> twoStudents = new ArrayList<>();

		int random = new Random().nextInt(students.size());
		twoStudents.add(students.get(random));
		students.remove(random);

		random = new Random().nextInt(students.size());
		twoStudents.add(students.get(random));
		students.remove(random);
		return twoStudents;
	}

	public Collection<Collection<Student>> getRandomPairs() {
		addAll();
		studentPairs.clear();
		for (int i = 0; i < 7; i++) {
			studentPairs.add(get2Students());
		}
		return studentPairs;
	}

}
