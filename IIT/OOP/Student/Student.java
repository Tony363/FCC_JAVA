package IIT.OOP.Student;
import java.io.Serializable;
import java.lang.reflect.Field;

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
	public void setName(String name) throws InvalidParameterException {
		if (isNonEmpty(name)){
			this.name = name;
		}else{
			throw new InvalidParameterException("Student name should be non-empty");
		}
	}
	public String getDept() { return this.dept; }
	public void setDept(String dept) throws InvalidParameterException{
		if (isNonEmpty(dept)){
			this.dept = dept;
		}else{
			throw new InvalidParameterException("Student Department should be non-empty");
		}
	}
	
	protected boolean isNonEmpty(String s){
		return s!=null && s.length()!=0;
	}

	public Student() {
		// nothing else
		try{
			this.checkNull();
		}catch(InvalidParameterException e){
			e.printStackTrace();
		}
	}
	public Student(String ID, String name, String dept) {
		try{
			this.setID(ID); 
			this.setName(name);
			this.setDept(dept);
		}catch(InvalidParameterException pe){
			System.err.println("Invalid field members, fallback to default value.");
		}
	}
	public void checkNull() throws InvalidParameterException{
		for (Field f : getClass().getDeclaredFields()){
			if (!this.isNonEmpty((String.valueOf(f)))){
				throw new InvalidParameterException("Fields in Student class is empty");
			}
		}	
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