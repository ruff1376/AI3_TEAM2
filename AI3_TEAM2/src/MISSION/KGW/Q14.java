package MISSION.KGW;
	
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;



class Student {
	String no;
	String name;
	String score;
	String major;
	
	List<ArrayList> stoken = new ArrayList<>();
	
	public Student() {
		this("", "", "", "");
	}
	public Student(String no, String name, String score, String major) {
		this.no = no;
		this.name = name;
		this.score = score;
		this.major = major;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void add(int i) {
		
	}
	
}

public class Q14 {

	public static void main(String[] args) {
		String filePath = "C:\\KGW\\GITHUB\\AI3_TEAM2\\AI3_TEAM2\\src\\MISSION\\KGW\\student.txt";
		ArrayList<Student> studentList = new ArrayList<Student>();
		List<ArrayList> stoken = new ArrayList<>();
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
		
		for ( int i = 0; i < stoken.size()-1; i++) {
			Student studen = new Student();
			for (int j = 0; j < 4; j++) {
				List<String> temp = stoken.get(i);
				studen.setNo(temp.getFirst());
				studen.setName(temp.get(1));
				studen.setScore(temp.get(2));
				studen.setMajor(temp.getLast());
			}studentList.add(i, studen);
		}
		
		
		
	}
}
