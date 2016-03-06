import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.naming.ldap.SortControl;

public class PatternMatching {

	public static void main(String[] args) {
		//		���� �л����� ������ ���б���� ��踦 ���� ������ �м��Ͽ�
		//		�� ������ ������ ���� ������ ���ߵ��� �̰��� ���ߵ��� �Ǵ����ִ� ���α׷��� 
		//		�ۼ��ض�.
		//
		//		���⿡�� ������ �־���.
		//		�����͸� �ϳ��� Ŭ������ �����ؼ� ���α׷��� �ۼ��Ͻÿ�.

		//���� �Է�(������ ���� �̰����� �����͸� �޾ƾ���)
		Scanner in = new Scanner(System.in);

		List<Student> scoreresult = new ArrayList<>();
		//����Ʈ�� ���������� �Է�
		scoreresult.add(new Student(11.1,42.1,97.0).setCode("��"));
		scoreresult.add(new Student(21.1,33.1,95.0).setCode("��"));
		scoreresult.add(new Student(36.1,66.1,70.0).setCode("��"));
		scoreresult.add(new Student(11.1,87.1,88.0).setCode("��"));
		scoreresult.add(new Student(51.1,99.1,94.0).setCode("��"));
		scoreresult.add(new Student(89.1,99.1,13.0).setCode("��"));
		scoreresult.add(new Student(85.1,98.1,13.0).setCode("��"));
		scoreresult.add(new Student(94.1,88.1,30.0).setCode("��"));
		scoreresult.add(new Student(92.1,87.1,13.0).setCode("��"));
		scoreresult.add(new Student(78.1,84.1,13.0).setCode("��"));
		//��

		//������ �Է�
		Student me = new Student(90.0, 83.2, 30.3);//���� ���� ������ ���� ������ ���������� ���� �Է����� ����.

		Collections.sort(scoreresult, (Student s1, Student s2)->{	
			return (int)((me.getCalc(s1)-me.getCalc(s2))*100000);
		});


		int num= Integer.parseInt(in.nextLine());//������ ��� ������ ���� ���� 
		
		
		int m_count=0;
		int s_count=0;
		for(int i=0;i<num;i++){
			if(scoreresult.get(i).getCode().equals("��")){
				m_count++;
			}else{
				s_count++;
			}
		}
		
		if(m_count>s_count){
			System.out.println("����");
		}else{
			System.out.println("�̰�");
		}
		


		//

		//�������� �Է��ؼ� ��� ����

		//������ �м��ϰ�
		//��� ����


	}

}
