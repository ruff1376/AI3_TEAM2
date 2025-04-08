package MISSION.HJY.Q14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Manager {

	public static void main(String[] args) {
		LinkedList<Student> list = new LinkedList<>();
		list = getTxtToList(list);
		list = sortScoreAndNo(list);
		printList(list);
	}

	/**
	 * 텍스트 파일 입력
	 * @param list
	 * @return 학생 리스트
	 */
	public static LinkedList<Student> getTxtToList(LinkedList<Student> list) {
		try {
			File file = new File("./src/MISSION/HJY/Q14/student.txt");
			Scanner sc = new Scanner(file);
			Student std;
			while (sc.hasNextLine()) {
				String stn = sc.nextLine();
				String[] data = stn.split("/");
				int no = Integer.parseInt(data[0]);
				String name = data[1];
				int score = Integer.parseInt(data[2]);
				String className = data[3];
				std = new Student(no, name, score, className);
				list.offer(std);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 리스트 정렬
	 * @param list
	 * @return 정렬된 리스트
	 */
	public static LinkedList<Student> sortScoreAndNo(LinkedList<Student> list) {
		LinkedList<Student> newList = new LinkedList<>(list);
		newList.sort(
			Comparator.comparingInt(Student::getScore).reversed()
				   	  .thenComparingInt(Student::getNo)
	    );
		return newList;
	}

	/**
	 * 리스트 출력
	 * @param list
	 */
	public static void printList(LinkedList<Student> list) {
		System.out.println("번호\t이름\t성적\t반");
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
