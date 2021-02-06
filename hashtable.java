package arraylist;
import java.util.*; 
public class hashtable {
	public static void main(String[] args) {
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(1275,"mounika");  
		  hm.put(1274,"jhaveri");  
		  hm.put(0444,"prathyusha");  
		  hm.put(0243,"varshitha");  
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
	}

}
