package MISSION.KGW;
	
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;



class Student {
	int no;
	String name;
	int score;
	String major;
	
	
	public Student() {
		this(0, "", 0, "");
	}

	public Student(int no, String name, int score, String major) {
		this.no = no;
		this.name = name;
		this.score = score;
		this.major = major;
	}

	public int getNo() {
		return this.no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "{" +
			" no='" + getNo() + "'" +
			", name='" + getName() + "'" +
			", score='" + getScore() + "'" +
			", major='" + getMajor() + "'" +
			"}";
	}
	

}

public class Q14 {

	public static void main(String[] args) {
		String filePath = "C:\\AI3\\AI3_TEAM2\\AI3_TEAM2\\src\\MISSION\\KGW\\student.txt";
		List<Student> studentList = new ArrayList<Student>();
		List<ArrayList<String>> stoken = new ArrayList<>();
		try(
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
		) {
			String stu;
			int a = 0;
			while ((stu = br.readLine()) != null ) {
				StringTokenizer st = new StringTokenizer(stu, "/");
				ArrayList<String> col = new ArrayList<>();
				while (st.hasMoreTokens()) {
					col.add(st.nextToken());
				}
				stoken.add(a, col);
				a++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		int a;
		int b;
		
		for ( int i = 0; i < stoken.size(); i++) {
			Student studen = new Student();
			for (int j = 0; j < 4; j++) {
				List<String> temp = stoken.get(i);
				a = Integer.parseInt(temp.getFirst());
				b = Integer.parseInt(temp.get(2));
				studen.setNo(a);
				studen.setScore(b);
				studen.setName(temp.get(1));
				studen.setMajor(temp.getLast());
			}studentList.add(i, studen);
		}
		studentList.stream()
		.sorted(Comparator.comparing(Student::getNo))
		.sorted(Comparator.comparing(Student::getScore).reversed())
		.forEach(p->System.out.println(p));
		
		
		
	}
}
=======
package MISSION.KGW;
	
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;



class Student {
	int no;
	String name;
	int score;
	String major;
	
	
	public Student() {
		this(0, "", 0, "");
	}

	public Student(int no, String name, int score, String major) {
		this.no = no;
		this.name = name;
		this.score = score;
		this.major = major;
	}

	public int getNo() {
		return this.no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return getNo() +
			"\t" + getName() +
			"\t" + getScore() +
			"\t" + getMajor()
			;
	}
	

}

public class Q14 {

	public static void main(String[] args) {
		String filePath = "./src/MISSION/KGW/student.txt";
		List<Student> studentList = new ArrayList<Student>();
		List<ArrayList<String>> stoken = new ArrayList<>();
		try(
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
		) {
			String stu;
			int a = 0;
			while ((stu = br.readLine()) != null ) {
				StringTokenizer st = new StringTokenizer(stu, "/");
				ArrayList<String> col = new ArrayList<>();
				while (st.hasMoreTokens()) {
					col.add(st.nextToken());
				}
				stoken.add(a, col);
				a++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		int a;
		int b;
		
		for ( int i = 0; i < stoken.size(); i++) {
			Student studen = new Student();
			for (int j = 0; j < 4; j++) {
				List<String> temp = stoken.get(i);
				a = Integer.parseInt(temp.getFirst());
				b = Integer.parseInt(temp.get(2));
				studen.setNo(a);
				studen.setScore(b);
				studen.setName(temp.get(1));
				studen.setMajor(temp.getLast());
			}studentList.add(i, studen);
		}
		System.out.println("번호\t이름\t성적\t반");
		studentList.stream()
		.sorted(Comparator.comparing(Student::getNo))
		.sorted(Comparator.comparing(Student::getScore).reversed())
		.forEach(p->System.out.println(p));
		
		
		
	}
}
