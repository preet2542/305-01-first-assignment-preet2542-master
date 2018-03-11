/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattren;

/**
 *
 * @author GURPREET SINGH
 */
public class Pattren {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Hello World!"); // Comment in code. Affects all words after //

        System.out.println("");
        System.out.println("IMAGE 1");
        Pattern(5);

        System.out.println("");
        System.out.println("IMAGE 2");
        Pattern(5);

        System.out.println("");
        System.out.println("IMAGE 3");
        ThirdPattern(5);
    }

    public static void Pattern(int n){
      for(int i=0;i<n;i++){
        if(i%2==0){
          System.out.print(' ');
        }
        for(int j=0;j<n;j++){
          System.out.print("* ");
        }
        System.out.println();
      }
    }

    public static void secPattern(int n){
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          if(i==0 ||i==(n-1)){
            System.out.print("* ");
          }else if(j==0 ||j==(n-1)){
            System.out.print("* ");
          }else{
            System.out.print("  ");
          }
        }
        System.out.println();
      }
    }

    public static void ThirdPattern(int n){
      int space = 0;
      for (int i = n; i > 0; i--) {
        for (int k = 0; k < space; k++) {
  				System.out.print(" ");
  			}
        space++;
  			for (int j = i; j > 0; j--) {
          if(j==i || j==1 || i==n){
            System.out.print("* ");
          }else{
            System.out.print("  ");
          }

  			}
  			System.out.println();
		}
    }
}    // TODO code application logic here
    
    

