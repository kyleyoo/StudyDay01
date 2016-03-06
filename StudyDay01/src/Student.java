import java.util.Scanner;

public class Student {

	private double kor;
	private double eng;
	private double math;
	private String code;
	
	public String getCode(){
		return code;
	}
	public Student(double kor, double eng, double math){
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		//this.code = code;
		
	}
	
	public double getCalc(Student other){
		double avr= (Math.abs(this.kor-other.kor) 
				+ Math.abs(this.eng-other.eng)
				+Math.abs(this.math-other.math))/3;

		double result =Math.pow((Math.abs(this.kor-other.kor)-avr),2)
				+Math.pow((Math.abs(this.eng-other.eng)-avr),2)
				+Math.pow((Math.abs(this.math-other.math)-avr),2);
		return result;
	}

	@Override
	public String toString() {
		return "Student [kor=" + kor + ", eng=" + eng + ", math=" + math + ", code=" + code + "]";
	}
	//빌드패턴은 선택적인 데이터(Code)를 생성자로 입력받지 않고 
	//선택적으로 객체를 생성하면서 데이터를 입력 할 수 있게 만들어주는 패턴입니다.
	public Student setCode(String code){
		this.code=code;
		return this;
	}
	
}
