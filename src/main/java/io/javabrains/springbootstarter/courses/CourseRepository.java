package io.javabrains.springbootstarter.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{
	
	//public List<Course> findByName(String topicIdname);
	//public List<Course> findByDescription(String foo);
	
	//specify the class and the field of the class
	public List<Course> findByTopicId(String topicId);
	
}
