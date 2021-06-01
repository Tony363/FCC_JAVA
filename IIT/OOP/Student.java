package IIT.OOP;
import java.io.Serializable;

// serializable just build tool not efficient,
public class Student implements Serializable {
	private String ID = "Default ID";
	private String name = "Default Name";
	private String dept = "Default Department";
	
	public String getID() { return this.ID; }
	public void setID(String ID)throws InvalidParameterException {
		if (isNonEmpty(ID)){
			this.ID = ID;
		}else{
			throw new InvalidParameterException("Student ID should be non-empty");
		}
	}
	public String getName() { return this.name; }
	public void setName(String name) { this.name = name; }
	public String getDept() { return this.dept; }
	public void setDept(String dept) { this.dept = dept; }
	
	protected boolean isNonEmpty(String s){
		return s!=null && s.length()!=0;
	}

	public Student() {
		// nothing else
	}
	public Student(String ID, String name, String dept) {
		try{
			this.setID(ID); 
		}catch(InvalidParameterException pe){
			System.err.println("Invalid ID, fallback to default value.");
		}
		this.setName(name);
		this.setDept(dept);
	}
	
	@Override
	public String toString() {
		return String.format("%s %s (%s)",
				this.getID(), this.getName(), this.getDept());
	}
	
	@Override
	public boolean equals(Object o) {
		// if (o instanceof Student) {
		if (o!=null && o.getClass() == Student.class){
			System.out.println("type compatible to Student");
			Student s = (Student)o;
			return isEqualStudent(this,s);
		}
		return false;
	}
	
	protected boolean isEqual(String s1, String s2) {
		return (s1==null && s2==null)||(s1!=null && s1.equals(s2));
	}
	protected boolean isEqualStudent(Student s1, Student s2){
		return isEqual(s1.getID(), s2.getID())
			&& isEqual(s1.getName(), s2.getName())
			&& isEqual(s1.getDept(), s2.getDept());
	}
}