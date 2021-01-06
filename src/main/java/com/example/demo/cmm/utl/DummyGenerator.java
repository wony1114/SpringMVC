package com.example.demo.cmm.utl;
import static com.example.demo.cmm.utl.Util.*;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.cmm.enm.Path;
import com.example.demo.sym.service.Manager;
import com.example.demo.sym.service.Teacher;
import com.example.demo.uss.service.Student;
@Service("dummy")
public class DummyGenerator {
	public int makeYear(int from, int to) {
		return random.apply(from, to);
	}
	/*
	public String makeMonth(int from, int to) {
		BiFunction<Integer, Integer, String> f = (a, b) ->String.valueOf((int)(Math.random()*(b-a))+a);
		return f.apply(from, to);
	}
	public String makeDay() {
		
		return makeMonth()+"-"+"";
	}
	
	윤년은 해당 연도를 4로 나눈 값이 0인 것을 의미한다. 
	그중 100으로 나눈 값이 0인 것은 윤년에서 제외하나, 
	400으로 나눈 값이 0인 것은 윤년으로 포함된다. 
	그 외의 나머지 연도는 평년이다.
	*/
	public String makeBirthday() {
		int year = random.apply(1970, 2000);
		int month = random.apply(1, 13);
		int date = 0;
		switch(month){
		case 2: date =((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)? 29: 28;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: date = 31;
		case 4: case 6: case 9: case 11: date = 30;
		}
		return year+"-"+month+"-"+date; 
	}
	public String makeRegdate() {
		int year = random.apply(2019, 2020);
		int month = random.apply(1, 13);
		int date = 0;
		switch(month){
		case 2: date =((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)? 29: 28;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: date = 31;
		case 4: case 6: case 9: case 11: date = 30;
		}
		return year+"-"+month+"-"+date; 
	}
	/*
	 * 랜덤  성별 생성
	 * "M"- male, "F" - female
	 */
	public String makeGender() {
		List<String> arr = Arrays.asList("M", "F");
		Collections.shuffle(arr);
		return arr.get(0);
	}
	/*
	 *랜덤 사용자 ID 생성하기 
	 */
	public String makeUserid() {
		List<String> ls = Arrays.asList("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".split(""));
		Collections.shuffle(ls);
		return ls.get(0)+ls.get(1)+ls.get(2)+ls.get(3);	
	}
	
	/*
	 * 랜덤 전화번호 생성하기
	 */
	
	public String makePhomeNumber() {
			return "010"+random.apply(1000, 10000)+"-"+random.apply(1000, 10000); 
			}	
	
	/*
	 * 랜덤 이름 생성하기
	 */
	public String makeUsername() {
		List<String> fname = Arrays.asList("김", "이", "박", "최", "정", "강", "조", "윤", "장", "임", "한", "오", "서", "신", "권", "황", "안",
		        "송", "류", "전", "홍", "고", "문", "양", "손", "배", "조", "백", "허", "유", "남", "심", "노", "정", "하", "곽", "성", "차", "주",
		        "우", "구", "신", "임", "나", "전", "민", "유", "진", "지", "엄", "채", "원", "천", "방", "공", "강", "현", "함", "변", "염", "양",
		        "변", "여", "추", "노", "도", "소", "신", "석", "선", "설", "마", "길", "주", "연", "방", "위", "표", "명", "기", "반", "왕", "금",
		        "옥", "육", "인", "맹", "제", "모", "장", "남", "탁", "국", "여", "진", "어", "은", "편", "구", "용");
	    List<String> name1 = Arrays.asList("가", "강", "건", "경", "고", "관", "광", "구", "규", "근", "기", "길", "나", "남", "노", "누", "다",
	        "단", "달", "담", "대", "덕", "도", "동", "두", "라", "래", "로", "루", "리", "마", "만", "명", "무", "문", "미", "민", "바", "박",
	        "백", "범", "별", "병", "보", "빛", "사", "산", "상", "새", "서", "석", "선", "설", "섭", "성", "세", "소", "솔", "수", "숙", "순",
	        "숭", "슬", "승", "시", "신", "아", "안", "애", "엄", "여", "연", "영", "예", "오", "옥", "완", "요", "용", "우", "원", "월", "위",
	        "유", "윤", "율", "으", "은", "의", "이", "익", "인", "일", "잎", "자", "잔", "장", "재", "전", "정", "제", "조", "종", "주", "준",
	        "중", "지", "진", "찬", "창", "채", "천", "철", "초", "춘", "충", "치", "탐", "태", "택", "판", "하", "한", "해", "혁", "현", "형",
	        "혜", "호", "홍", "화", "환", "회", "효", "훈", "휘", "희", "운", "모", "배", "부", "림", "봉", "혼", "황", "량", "린", "을", "비",
	        "솜", "공", "면", "탁", "온", "디", "항", "후", "려", "균", "묵", "송", "욱", "휴", "언", "령", "섬", "들", "견", "추", "걸", "삼",
	        "열", "웅", "분", "변", "양", "출", "타", "흥", "겸", "곤", "번", "식", "란", "더", "손", "술", "훔", "반", "빈", "실", "직", "흠",
	        "흔", "악", "람", "뜸", "권", "복", "심", "헌", "엽", "학", "개", "롱", "평", "늘", "늬", "랑", "얀", "향", "울", "련");
	    List<String> name2 = Arrays.asList("가", "강", "건", "경", "고", "관", "광", "구", "규", "근", "기", "길", "나", "남", "노", "누", 
	    		"다", "단", "달", "담", "대", "덕", "도", "동", "두", "라", "래", "로", "루", "리", "마", "만", "명", "무", "문", "미", "민", 
	    		"바", "박", "백", "범", "별", "병", "보", "빛", "사", "산", "상", "새", "서", "석", "선", "설", "섭", "성", "세", "소", "솔", 
	    		"수", "숙", "순", "숭", "슬", "승", "시", "신", "아", "안", "애", "엄", "여", "연", "영", "예", "오", "옥", "완", "요", "용", 
	    		"우", "원", "월", "위", "유", "윤", "율", "으", "은", "의", "이", "익", "인", "일", "잎", "자", "잔", "장", "재", "전", "정", 
	    		"제", "조", "종", "주", "준", "중", "지", "진", "찬", "창", "채", "천", "철", "초", "춘", "충", "치", "탐", "태", "택", "판", "하", 
	    		"한", "해", "혁", "현", "형", "혜", "호", "홍", "화", "환", "회", "효", "훈", "휘", "희", "운", "모", "배", "부", "림", "봉", "혼", 
	    		"황", "량", "린", "을", "비", "솜", "공", "면", "탁", "온", "디", "항", "후", "려", "균", "묵", "송", "욱", "휴", "언", "령", "섬", 
	    		"들", "견", "추", "걸", "삼", "열", "웅", "분", "변", "양", "출", "타", "흥", "겸", "곤", "번", "식", "란", "더", "손", "술", "훔", 
	    		"반", "빈", "실", "직", "흠", "흔", "악", "람", "뜸", "권", "복", "심", "헌", "엽", "학", "개", "롱", "평", "늘", "늬", "랑", "얀", 
	    		"향", "울", "련");
	    Collections.shuffle(fname);
	    Collections.shuffle(name1);
	    Collections.shuffle(name2);
	    String[] a = name1.stream()
				.flatMap(i -> name2.stream().map(j -> new String[] {i, j}))
				.collect(Collectors.toList())
				.get(0);
	    return fname.get(0)+a[0]+a[1];
	}
	public String makeSubject() {
		List<String> ls = Arrays.asList("Java", "Spring", "Python", "jQuery", "dGovframe");
		Collections.shuffle(ls);
		return ls.get(0);
	}
	public String makeEmail() {
		List<String> ls = Arrays.asList("@test.com", "@gmail.com", "@naver.com");
		Collections.shuffle(ls);
		return makeUserid()+ls.get(0);
	}
	public Student makeStudent() {
		return new Student(makeUserid(), 
				           "1", 
				           makeUsername(), 
				           makeBirthday(),
				           makeGender(),
				           makeRegdate(), 
				           makeSubject(), 
				           Path.DEFAULT_PROFILE.toString());
	}
	
	public Manager makeManager() {
		return new Manager("", makeEmail(), "1", makeUsername(), Path.DEFAULT_PROFILE.toString());
	}
	public Teacher makeTeacher() {
		return new Teacher("", makeUsername(), makeEmail(), "1", makeSubject(), Path.DEFAULT_PROFILE.toString());
	}
}

