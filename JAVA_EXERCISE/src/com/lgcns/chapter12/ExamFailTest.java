package com.lgcns.chapter12;

import java.util.ArrayList;

public class ExamFailTest {

	public static void main(String[] args) {

		ArrayList<Subject> subjects = new ArrayList<Subject>();
		subjects.add(new Subject("Sejarah", 86));
		subjects.add(new Subject("Geografi", 65));
		subjects.add(new Subject("Biologi", 58));
		subjects.add(new Subject("Fisika", 76));

		System.out.println("Mata pelajaran apa yang perlu saya pelajari selama sisa tahun ini?");
		for(Subject subject:subjects) {
			try {
				if(subject.getScore() < 70) {
					throw new ExamFailException(subject.getName() + " (" + subject.getScore() + " poin)");
				}
			}catch(ExamFailException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
