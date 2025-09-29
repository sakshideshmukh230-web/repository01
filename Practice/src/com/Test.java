package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
	
	public static void main(String[] args) {
		
		List<Set<Student>> list = new ArrayList<Set<Student>>();
		 
		Set<Student> set = new HashSet<Student>();
		
		Student s1 = new Student();
		s1.setId(101);
		s1.setName("Abc");
		s1.setAdd("Pune");
		s1.setMobileno(223445);
		
		Student s2 = new Student();
		s2.setId(102);
		s2.setName("Pqr");
		s2.setAdd("Pune");
		s2.setMobileno(263445);
		
		Student s3 = new Student();
		s3.setId(103);
		s3.setName("gfhh");
		s3.setAdd("Mumbai");
		s3.setMobileno(223445);
		
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		list.add(set);
		
		//--Using Enhance for loop---
		for(Set<Student> stu : list) {
			for(Student st : stu) {
				System.out.println(st);
			}
		}
		
		System.out.println("----------");
		
		//---Using for Each--
		list.forEach(setOfStudent ->{
				setOfStudent.forEach(student -> {
					System.out.println(student);
				});
		});
	}

}
