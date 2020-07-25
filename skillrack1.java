import java.io.*; 
import java.util.*;
 class Skillrack1 
 { 
     public static void main(String[] args) 
     {  
         Scanner s=new Scanner(System.in); 
         String ip=s.next(); 
         ArrayList<Character> ch=new ArrayList<Character>(); 
         int times[]=new int[ip.length()]; 
         int tadd=0; 
         for(int i=0;i<ip.length();i++) 
         { 
             if(ch.contains(ip.charAt(i))) 
             { 
                 continue; 
             } 
             else 
             { 
                 ch.add(ip.charAt(i)); 
                 int t=0; 
                 char check=ip.charAt(i); 
                 for(int j=i;j<ip.length();j++) 
                 { 
                     if(check==ip.charAt(j)) 
                     { 
                         t++; 
                     } 
                 } 
                 times[tadd]=t; 
                 tadd++; 
             } 
         } 
         char op[]=new char[ch.size()]; 
         for(int i=0;i<ch.size();i++) 
         { 
             op[i]=ch.get(i); 
         } 
         for(int i=0;i<op.length;i++) 
         { 
             for(int j=i+1;j<op.length;j++) 
             { 
                 if(times[i]<times[j]) 
                 { 
                     char chartemp=op[i]; 
                     int inttemp=times[i]; 
                     op[i]=op[j]; 
                     times[i]=times[j]; 
                     op[j]=chartemp; 
                     times[j]=inttemp; 
                 } 
             } 
         } 
         for(int i=0;i<op.length;i++) 
         { 
             for(int j=i+1;j<op.length;j++) 
             { 
                 if(times[i]==times[j]) 
                 { 
                     if(op[i]>op[j]) 
                     { 
                         char temp=op[i]; 
                         op[i]=op[j]; 
                         op[j]=temp; 
                     } 
                 } 
             } 
         } 
         for(int i=0;i<op.length;i++) 
         { 
             for(int j=0;j<times[i];j++) 
             { 
                 System.out.print(op[i]); 
             } 
         } 
    } 
}
