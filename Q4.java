public class Q4 { 
public static void main(String args[]) { 
int x = Integer.parseInt(args[0]);
int y = Integer.parseInt(args[1]);
int z = Integer.parseInt(args[2]);
int minimum = Math.min(x, Math.min(y, z));
int maximum = Math.max(x, Math.max(y, z));
int middle = (x+y+z) - (minimum+maximum);
System.out.println(minimum);
System.out.println(middle);
System.out.println(maximum);
  } 
}