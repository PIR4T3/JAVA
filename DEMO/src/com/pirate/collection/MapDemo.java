package com.pirate.collection;
//
//import java.util.*;
//
//public class MapDemo {
//	public static void main(String[] args) {
//		Map<Integer, String> map = new HashMap<>();
//		map.put(1, "One");
//		map.put(2, "Two");
//		map.put(3, "Three");
//		map.put(4, "Four");
//		map.put(4, "Dup Four");
//		map.putIfAbsent(4, "New Four");
////		map.remove(4);
//		
////		System.out.println(map.containsValue("Five"));
//		System.out.println(map);
////		System.out.println(map.get(2));
//
//		Set set = map.entrySet();
////		System.out.println(set);
//		Iterator itr = set.iterator();
//		while(itr.hasNext()) {
////			System.out.println(itr.next());
//			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) itr.next();
////				System.out.println(entry.getKey() +" "+ entry.getValue());
//		}
//		
//		
//		for(Map.Entry m : map.entrySet()) {
//			System.out.println(m.getKey() +" "+m.getValue());
//		}
//	}
//}


import java.util.*;  
enum days {  
  sunday, MONDAY, tuesday, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
}  
public class MapDemo {  
  public static void main(String[] args) {  
    Set<days> set = EnumSet.allOf(days.class);  
    // Traversing elements  
//    Set set2 = EnumSet.complementOf(set);
    Iterator<days> iter = set.iterator();  
    while (iter.hasNext())  
      System.out.println(iter.next());  
  }  
} 