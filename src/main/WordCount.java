package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WordCount {

	public static StringBuilder CountIt(String CountME){
	

		LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
		//not sure why i had to create yet another string, oh well
		String FinishMe = CountME;
		
		 String[] words = FinishMe.split(" ");
		 
	     for (String word : words) {

	        
	    	 //making sure there's a word available, returns null if not.
	         Integer integer = hashMap.get(word);

	         if (integer == null)
	    
	        	 //word is the key, number is the value
	             hashMap.put(word, 1);

	         else {
	           
	        	 //for every new occurrence, the value goes up
	             hashMap.put(word, integer + 1);
	         }
	     }
	     
	     // rank it-----------------------------------------------------------------------------------------------------------------------------------------------
	     
	     //send to arraylist to be organized, reversed, then back to a linkedhashmap to be printed
	     LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
	     ArrayList<Integer> list = new ArrayList<>();
	     
	     for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
	         list.add(entry.getValue());
	     }
	     Collections.sort(list, Collections.reverseOrder()); 
	     for (int num: list) {
	         for (Entry<String, Integer> entry : hashMap.entrySet()) {
	             if (entry.getValue().equals(num)) {
	                 sortedMap.put(entry.getKey(), num);
	             }
	         }
	     }
	     
	     
	     //GUI it----------------------------------------------------------------------------------------------------------------------------------
	     //cycle through keyset to print, break if it's more than the top 20
	     
	     StringBuilder masterString = new StringBuilder();
	    int i = 0;
	     for (String key : sortedMap.keySet()) {
	    	 i++;
	    	  
	    	 masterString.append(key + " = " + sortedMap.get(key) +  "\n");
	    	
	    	 
	    	   if(i==20) {break;}
		}
		
	     return masterString;

}
	



	
}
