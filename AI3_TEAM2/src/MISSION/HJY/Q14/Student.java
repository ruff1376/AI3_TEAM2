package MISSION.HJY.Q14;

public class Student {

	private int no;
	private String name;
	private int score;
	private String className;
	
	public Student() {
		this(0, "이름 없음", 0, "수업 없음");
	}
	
	public Student(int no, String name, int score, String className) {
		this.no = no;
		this.name = name;
		this.score = score;
		this.className = className;
	}
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	@Override
	public String toString() {
		return no + "\t" + name + "\t" + score + "\t" + className;
	}
	
	
}
