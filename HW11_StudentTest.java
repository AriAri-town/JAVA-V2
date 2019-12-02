import java.util.Scanner;
import java.io.*;
class Student{
	private String name;
	private int grade;
	private double score;
	
	Student(){}
	Student(String name, int grade, double score){
		this.name = name;
		
		if(grade>0 && grade<=6) this.grade = grade;
		else this.grade = 1;
		
		if(score>=0 && score<=4.3) this.score = score;
		else this.score = 3.0;
	}
	
	public String toString(){
		return String.format("�̸�: %s, �г�: %d, ����: %.1f", this.name, this.grade, this.score);
	}
}


class StudentTest{
	public static void main(String [] args) throws Exception{
		Student [] students = new Student[3];
		
		File input = new File("�л�����.java");		
		
		if(!input.exists()){
			System.out.printf("\"%s\" ������ �������� �ʽ��ϴ�. Ȯ�����ּ���.\n", input.getName());
			Ststem.exit(1);
		}
		
		Scanner s = new Scanner(input);
		int i=0;
		
		while(s.hasNext()){//�������� ���� ���ڿ� ���� �Ǽ��θ� �����Ǿ� �����Ƿ� �Ʒ��� ���� �ۼ� ����
			students[i] = new Student(s.next(), s.nextInt(), s.nextDouble());
			i++;
		}
		
		s.close();//�� �ݴ��� ���忡 (PrintWriter ó��)������ �߻������� ������ ��ĳ�ʵ� �ݾ� �ִ°� ����.
		
		for(Student student:students){
			System.out.println(student);
		}
		
		
	}
}