//package issAssignment;
//
//
//
//public class Student {
//	
//	private String name;
//	private int id;
//	
//	public Student(String name, int id){
//		this.name = name;
//		this.id = id;
//	}
//	
//	public String getName(){
//		return name;
//	}
//	
//	public int getId(){
//		return id;
//	}
//	
//	@Override
//	public String toString(){
//		return "Name: "+name+" ID: "+id;
//	}
//	
//	@Override
//	public boolean equals(Object o){
//		if(this == o) return true;
//		if(o == null || getClass() != o.getClass()) return false;
//		
//		Student student = (Student) o;
//		
//		if (id != student.id) return false;
//		return name != null ? name.equals(student.name) : student.name == null;
//	}
//	
//	@Override
//	public int hashCode(){
//		int result = name != null ?name.hashCode() : 0;
//		result = 31 * result + id;
//		return result;
//	}
//	
//}
