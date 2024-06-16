package com.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class MyCustomComparator implements Comparator<Person> {
//
//	@Override
//	public int compare(Person o1, Person o2) {
//		return Integer.compare(o1.age, o2.age);
//	}
//
//// Alternative approach	
////	@Override
////	public int compare(Person o1, Person o2) {
////		return o1.age - o2.age;
////	}
//	
//	
//	
//}

public class MainClass {

	public static void main(String[] args) {
//		Person p1 = new Person(8,"Ram","UK");
//		Person p2 = new Person(8,"Leo","US");
//		Person p3 = new Person(12,"Bhim","India");
//		Person p4 = new Person(8,"Jack","Germany");
//		
//		List<Person> list = new ArrayList<>();
//		list.add(p1);
//		list.add(p2);
//		list.add(p3);
//		list.add(p4);
//		
//		System.out.println(list);
		
		//Collections.sort(list, new MyCustomComparator());
//		Collections.sort(list, new Comparator<Person>() {
//
//			@Override
//			public int compare(Person o1, Person o2) {
//				return o1.name.compareTo(o2.name);
//			}
//			
//		});
		
		//Lambda Expression
//		Collections.sort(list, (o1, o2) -> {
//				return o1.name.compareTo(o2.name);
//			}
//			
//		);
		
//		Collections.sort(list, (o1, o2) -> (o1.age - o2.age));
		
//		Collections.sort(list, 
//				Comparator.comparing(Person::getAge).thenComparing(Person::getCountry));
//		
//		System.out.println(list);
		
		int a[][] = {
				{1,2,5},
				{1,4,2},
				{3,8,5}
		};
		
		Arrays.sort(a, (arr1, arr2) -> {
			if(arr1[0] == arr2[0]) {
				return arr1[1] - arr2[1];
			}
			
			return arr1[0] - arr2[0];
		});
		
		for(int e[] : a) {
			for(int element : e) {
				System.out.print(element+" ");
			}
			System.out.println();
		}

	}

}
