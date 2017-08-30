
import static java.lang.Math.sqrt;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayush Kanoria
 */
public class Closest {
    static  int  IsPrime(int a)
    { 
        int j;
        for( j = 2; j <= sqrt(a); j++){
        if(a%j == 0){
           return 0; 
        }
    }
        return 1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please Enter the number : ");
            int N = s.nextInt();
            int i=N;
            if(i==0)
            {
                i=2;
            }
            while(IsPrime(i)== 0)
                    {
                        i++;
                    }
            System.out.print("The Distance is : ");
            System.out.println(i-N);
            s.close();
            
    }
    
   }

