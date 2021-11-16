package SaturdayLabAssignment;
//Q 2 Write a java program to check file properties .

import java.util.*;  
import java.io.*;  

public class CheckFileProperties {  
public static void main(String[] args)throws Exception{  
  
Properties p=System.getProperties();  
Set set=p.entrySet();  
  
Iterator itr=set.iterator();  
while(itr.hasNext()){  
Map.Entry entry=(Map.Entry)itr.next();  
System.out.println(entry.getKey()+" = "+entry.getValue());  
}  
}  
}  