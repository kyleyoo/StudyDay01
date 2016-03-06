import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.naming.ldap.SortControl;

public class PatternMatching {

	public static void main(String[] args) {
		//		기존 학생들의 점수와 진학기록의 통계를 내고 경향을 분석하여
		//		내 점수를 가지고 내가 문과를 가야될지 이과를 가야될지 판단해주는 프로그램을 
		//		작성해라.
		//
		//		여기에서 조건이 주어짐.
		//		데이터를 하나의 클래스로 설계해서 프로그램을 작성하시오.

		//점수 입력(점수와 문과 이과인지 데이터를 받아야함)
		Scanner in = new Scanner(System.in);

		List<Student> scoreresult = new ArrayList<>();
		//리스트로 점수데이터 입력
		scoreresult.add(new Student(11.1,42.1,97.0,"이"));
		scoreresult.add(new Student(21.1,33.1,95.0,"이"));
		scoreresult.add(new Student(36.1,66.1,70.0,"이"));
		scoreresult.add(new Student(11.1,87.1,88.0,"이"));
		scoreresult.add(new Student(51.1,99.1,94.0,"이"));
		scoreresult.add(new Student(89.1,99.1,13.0,"문"));
		scoreresult.add(new Student(85.1,98.1,13.0,"문"));
		scoreresult.add(new Student(94.1,88.1,30.0,"문"));
		scoreresult.add(new Student(92.1,87.1,13.0,"문"));
		scoreresult.add(new Student(78.1,84.1,13.0,"문"));
		//식

		//내점수 입력
		Student me = new Student(90.0, 83.2, 30.3,"X");

		Collections.sort(scoreresult, (Student s1, Student s2)->{	
			return (int)((me.getCalc(s1)-me.getCalc(s2))*100000);
		});


		int num= Integer.parseInt(in.nextLine());//위에서 몇개를 가지고 올지 결정 
		
		
		int m_count=0;
		int s_count=0;
		for(int i=0;i<num;i++){
			if(scoreresult.get(i).getCode().equals("문")){
				m_count++;
			}else{
				s_count++;
			}
		}
		
		if(m_count>s_count){
			System.out.println("문과");
		}else{
			System.out.println("이과");
		}
		


		//

		//내점수를 입력해서 결과 보기

		//점수를 분석하고
		//결과 보기


	}

}
