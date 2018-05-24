package parse;

import java.util.HashMap;
import java.util.Map;

public class ClassBean {

	private String no;
	private Map<Integer, StudentBean> students = new HashMap<Integer, StudentBean>();
	
	public void addStudent(StudentBean student){
		students.put(student.getId(), student);
	}
	
	public StudentBean findById(Integer id){
		return students.get(id);
	}
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public Map<Integer, StudentBean> getStudents() {
		return students;
	}
	public void setStudents(Map<Integer, StudentBean> students) {
		this.students = students;
	}
	public ClassBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ClassBean [no=" + no + ", students=" + students + "]";
	}
	
	
}
