package com.collection.map.student;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class StudentProperties {

	public static void main(String[] args) {
		StudentProperties s = new StudentProperties();
		List<Student> list = new ArrayList<Student>();
		list=s.readFile();
		s.printConsole(list);
		s.saveXMLFile(list);
	}

//	- 메소드 추가 : public List<Student> readFile(){}
	public List<Student> readFile(){
		
//    //구현 내용
//    1. Properties 객체 생성하고, score.txt 파일의 내용을 읽어
		Properties p = new Properties();
		try {
			p.load(new FileReader("score.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
//    2. 리스트 만듦
		List<Student> list = new ArrayList<Student>();
//    3. 키를 사용하여, 객체정보를 List<Student>에 저장하여 리턴함
//      => ", " 으로 문자열 분리처리
//      => 분리된 문자열을 각 자료형 필드의 값으로 형변환 대입 저장함
		Enumeration<?> en = p.propertyNames();
		while(en.hasMoreElements()) {
			String key = (String)en.nextElement();
			String value = p.getProperty(key);
			String[] t = value.split(",");
			int sno = Integer.valueOf(t[0]);
			String name = t[1];
			int kor = Integer.valueOf(t[2]);
			int eng = Integer.valueOf(t[3]);
			int math = Integer.valueOf(t[4]);
			list.add(new Student(sno,name,kor,eng,math));
//			System.out.println(list);
		}
		return list;
	}
// - 메소드 추가 : public void printConsole(List<Student> stdtList){}
	public void printConsole(List<Student> stdtList) {
//    1. 전달받은 값 출력
		System.out.println(stdtList);
//    2. 각 객체의 국어합계, 영어합계, 수학합계를 구하고
		int korsum=0;
		int engsum=0;
		int mathsum=0;
		for(Student s : stdtList) {
			korsum+=s.getKor();
			engsum+=s.getEng();
			mathsum+=s.getMath();
		}
//    3. 과목별 평균점수를 출력함
		double korAvg = (double)korsum/stdtList.size();
		double engAvg = (double)engsum/stdtList.size();
		double mathAvg = (double)mathsum/stdtList.size();
		System.out.println("국어 평균 : "+korAvg+
							"\n외국어 평균 : "+engAvg+
							"\n수리 평균 : "+mathAvg);
	}
// - 메소드 추가 : public void saveXMLFile(List<Student> stdtList){}
	public void saveXMLFile(List<Student> stdtList) {
//    1. "student.xml" 파일에 번호필드를 key로 객체가 가진 값 기록 저장함
		Properties p =new Properties();
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		for(Student s : stdtList) {
			map.put(s.getSno(), s);
		}
		System.out.println(map);
		Set<Entry<Integer, Student>> entrySet = map.entrySet();
		for(Entry<Integer, Student> e : entrySet) {
			String front = String.valueOf(e.getKey());
			Student back = e.getValue();
			p.setProperty(front, back.toString());
		}
		try {
			p.storeToXML(new DataOutputStream(new FileOutputStream("student.xml")), "주석");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
