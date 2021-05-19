package IIT.OOP;

public class Student {
	private String ID;
	private String name;
	private String dept;
	
	public String getID() { return this.ID; }
	public void setID(String ID) { this.ID = ID; }
	public String getName() { return this.name; }
	public void setName(String name) { this.name = name; }
	public String getDept() { return this.dept; }
	public void setDept(String dept) { this.dept = dept; }
	
	public Student() {
		// all null
	}
	public Student(String ID, String name, String dept) {
		this.setID(ID);
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
		if (o.getClass() == Student.class){
			System.out.println("type compatible to Student");
			Student s = (Student)o;
			return isEqual(this.getID(), s.getID())
			       && isEqual(this.getName(), s.getName())
				   && isEqual(this.getDept(), s.getDept());
		}
		return false;
	}
	
	protected boolean isEqual(String s1, String s2) {
		return (s1==null && s2==null)||(s1!=null && s1.equals(s2));
	}
}