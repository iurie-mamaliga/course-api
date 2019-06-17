package io.javabrains.springbootstarter.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	/*private List<Topic> topics = new ArrayList<>( Arrays.asList(
			new Topic("spring1", "Spring Framework1", "Spring Framework Description1"),
			new Topic("spring2", "Spring Framework2", "Spring Framework Description2"),
			new Topic("spring3", "Spring Framework3", "Spring Framework Description3")
		));*/
	
	public List<Course> getAllCourses(String topicId){
		List<Course> topics = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(topics::add);
		return topics;
	}
	
	public Course getCourse(String id) {
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courseRepository.findOne(id);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
		
	}

	public void updateCourse(Course course) {
		/* for(int i =0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().contentEquals(id)) {
				topics.set(i, topic);
				return;
			}
		}*/
		
		courseRepository.save(course);
		
	}

	public void  deleteCourse(String id) {
		//topics.removeIf(t -> t.getId().contentEquals(id));
		courseRepository.delete(id);
	}
	
}

