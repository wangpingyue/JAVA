package wangpingyu;

import java.util.Scanner;

public class rtret {
	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
       int a=scn.nextInt();
       int c=scn.nextInt();
       int b=0;
       int judge=0;
       for(int i=a;i<=c;i++) {
    	   for(int q=1;q<i;q++)
    	   {
    		   if(i%q==0) {
    			   b+=q;
    		   }
    	   }
    	   if(b==i) {
    		   System.out.print(b+" ");
    		   judge=1;
    	   }
    	   b=0;
       }
}
}
