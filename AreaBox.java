//using overload method write a simple java program to cal
//- area of box
//-volume of box

import java.util.*;
public class AreaBox
{
  public static int box(int l)
  {
    int area = 6*l;
    System.out.println("The area of the box is " + " " + area);
    return area;
  }
  public static int box(int len,int b)
  {
    int perimeter = 6*(len+b);
    return perimeter;

  }
  public static void main(String[]args)
  {
    System.out.println("Enter values");
    Scanner sc= new Scanner(System.in);
    int l= sc.nextInt();
    int b= sc.nextInt();
    int len = sc.nextInt();
    System.out.println("the area of box" + " " + box(5));
    System.out.println("the area of box" + " " + box(4 , 5));


  }
}

