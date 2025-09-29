package com;

import java.util.HashSet;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {
		
		Set<Set<Set<Integer>>> outerSet = new HashSet<>();
		
		Set<Set<Integer>> middleSet = new HashSet<Set<Integer>>();
		
		Set<Integer> ineerSet1 = new HashSet<>();
		ineerSet1.add(10);
		ineerSet1.add(20);
		ineerSet1.add(30);
		ineerSet1.add(40);
		
		Set<Integer> ineerSet2 = new HashSet<>();
		ineerSet2.add(90);
		ineerSet2.add(100);
		ineerSet2.add(30);
		ineerSet2.add(77);
		
		
		middleSet.add(ineerSet1);
		middleSet.add(ineerSet2);
		
		outerSet.add(middleSet);
		
		System.out.println("--Enhance for loop--");
		
		for(Set<Set<Integer>> middleSetVar : outerSet ) {
			for(Set<Integer> innerSetVar : middleSetVar) {
				for(Integer i : innerSetVar)
					System.out.println(i);
			}
		}
		
		System.out.println();
		System.out.println("--For Each---");
		outerSet.forEach(middleSetVar ->
			middleSetVar.forEach(innerSetVar ->
				innerSetVar.forEach(i -> 
						System.out.println(i))
					)
				);
	}
	}

