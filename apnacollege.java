// public class apnacollege{
//     public static void main(String[] args){
//         System.out.println("Hello world");
//     }
// }

//...............................................................................

// public class apnacollege{
//     public static void main(String[] args){
//         System.out.print("Hello world");
//         System.out.println("Hello world\n"); // ln gives line and \n also gives line 
//         System.out.println("Hello world");
//         System.out.println("*\n**\n***\n****\n");
//     }
// }

//...................................................................................

// import java.util.*;
// public class apnacollege{
//     public static void main(String[] args){
//         //INPUT
//         Scanner sc=new Scanner(System.in);
//         String name = sc.nextLine();
//         System.out.println(name);
//         Scanner dc=new Scanner(System.in);
//         String line = dc.next();
//         System.out.println(line);
//         //nextInt() , nextFloat() ,etc
//     }
// }

//...............................................................................


// import java.util.*;
// public class apnacollege{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c = a+b;
//         System.out.println(c);
//     }
// }

//............................................................................

//making table of given number
// import java.util.*;
// public class apnacollege{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         System.out.println(a+" * 1 = "+(a*1));
//         System.out.println(a+" * 2 = "+(a*2));
//         System.out.println(a+" * 3 = "+(a*3));
//         System.out.println(a+" * 4 = "+(a*4));
//         System.out.println(a+" * 5 = "+(a*5));
//         System.out.println(a+" * 6 = "+(a*6));
//         System.out.println(a+" * 7 = "+(a*7));
//         System.out.println(a+" * 8 = "+(a*8));
//         System.out.println(a+" * 9 = "+(a*9));
//         System.out.println(a+" * 10 = "+(a*10));
//     }
// }

//...............................................................................

//area of circle
// import java.util.*;
// public class apnacollege{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int r=sc.nextInt();
//         double pi =3.14;
//         double area=(r*r)*pi;
//         System.out.println("area= "+area);
//     }
// }

//..............................................................................

//...............................  CALCULATOR  .................................................
// import java.util.*;
// public class apnacollege{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("a= ");
//         int a=sc.nextInt();
//         System.out.print("b= ");
//         int b=sc.nextInt();
//         System.out.println("Operations=> 1=sum , 2=subtract , 3=multiply , 4=divide , 5=modulus");
//         System.out.print("operation to be performed= ");
//         int c=sc.nextInt();
//         if(c==1){
//             System.out.println("a+b= "+(a+b));
//         }else if(c==2){
//             System.out.println("a-b= "+(a-b));
//         }else if(c==3){
//             System.out.println("a*b= "+(a*b));
//         }else if(c==4){
//             System.out.println("a/b= "+(a/b));
//         }else if(c==5){
//             System.out.println("a%b= "+(a%b));
//         }else{
//             System.out.println("not operation performed!!");
//         }

//     }
// }

//.......................................   USING SWITCH STATEMENT  ....................................................


// import java.util.*;
// public class apnacollege{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter mounth number= ");
//         int a=sc.nextInt();
//         switch(a){
//             case 1:
//             System.out.println("JANUARY");
//             break;
//             case 2:
//             System.out.println("FEBURARY");
//             break;
//             case 3:
//             System.out.println("MARCH");
//             break;
//             case 4:
//             System.out.println("APRIL");
//             break;
//             case 5:
//             System.out.println("MAY");
//             break;
//             case 6:
//             System.out.println("JUNE");
//             break;
//             case 7:
//             System.out.println("JULLY");
//             break;
//             case 8:
//             System.out.println("AUGUST");
//             break;
//             case 9:
//             System.out.println("SEPTEMBER");
//             break;
//             case 10:
//             System.out.println("OCTOMBER");
//             break;
//             case 11:
//             System.out.println("NOVEMBER");
//             break;
//             case 12:
//             System.out.println("DECEMBER");
//             break;
//         }
//     }
// }




//........................................................................FUNCTIONS...............................................................................

/*       return type funtion name(type arg1, type arg2){ operation}
          return type = int , float ,string , void (will not return anything)
          public stattic void main ( void is return type main is function and public and static are keywords)
          arguments are inputs (int age , float temp) 
 */



//  import java.util.*;

//  public class apnacollege {
//      public static void printMyName(String name) {
//          System.out.println(name);
//          return;
//      }
 
//      public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          String name = sc.nextLine();
//          printMyName(name);
//          sc.close(); 
//      }
//  }

//......................................................................................................................
// import java.util.*;
// public class apnacollege{
//     public static int calculateSum (int a,int b){
//         int sum=a+b;
//         return sum;
//     }
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calculateSum(a, b);
//         System.out.println(sum);
//         sc.close();
//     }
// }

//.......................................................................................................................
// import java.util.*;
// public class apnacollege{
//     public static int formula(int a){
//      int b=1;
//      for(int i=a;i>=1;i--){
//         b=b*i;
//      }
//      return b;   
//     }
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int a=sc.nextInt();
//         System.out.println(formula(a));

//     }
// }


import java.util.*;
public class apnacollege{
    public static int average(int a,int b,int c){
        int av=(a+b+C)/3;
        return av;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(average(a,b,c));
        sc.close();
    }
}


 