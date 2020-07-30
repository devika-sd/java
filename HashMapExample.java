import java.util.*;  
class HashMap1{  
 public static void main(String args[]){  
   HashMap<Integer,String> hm=new HashMap<Integer,String>();    
    System.out.println("Initial list of elements: "+hm);  
      hm.put(1,"devi");    
      hm.put(2,"devika-sd");    
      hm.put(3,"dev");   
       
      System.out.println("After invoking put() method ");  
      for(Map.Entry m:hm.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());    
      }  
        
      hm.putIfAbsent(103, "Guru");  
      System.out.println("After invoking putIfAbsent() method ");  
      for(Map.Entry m:hm.entrySet()){    
           System.out.println(m.getKey()+" "+m.getValue());    
          }  
      HashMap<Integer,String> map=new HashMap<Integer,String>();  
      map.put(104,"ragavi");  
      map.putAll(hm);  
      System.out.println("After invoking putAll() method ");  
      for(Map.Entry m:map.entrySet()){    
           System.out.println(m.getKey()+" "+m.getValue());    
          }  
 }  
}  
