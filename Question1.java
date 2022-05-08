import java.util.*;

//I am adding a comment 

public class Question1
{
 public static void main(String []args)
 {
	 
  Scanner sc=new Scanner(System.in);
  int inp;
  ArrayList arr=new ArrayList();
  while(true)
  {
   inp=sc.nextInt();
   if(inp<0)
   break;
   arr.add(inp); 
  }
  System.out.println(arr);
  HashMap hm=new HashMap();
  Iterator it=arr.iterator();
  int x;
  while(it.hasNext()) 
  {
   x=(int)it.next();
 
   if(hm.containsKey(x))
   {
    hm.put(x,(int)hm.get(x)+1);
    
   }
   else
   {
    hm.put(x,1);
   }
  }
  Set s=hm.keySet();
  Iterator i2=s.iterator();
  while(i2.hasNext())
  {
   x=(int)i2.next();
   if((int)hm.get(x)==1)
   {System.out.println(x);
   break;}
  } 
 }
}