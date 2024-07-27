package com.codegnan.govind;

import java.util.Scanner;

public class JavaPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=7;
		String s;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter any text: ");
			s=sc.nextLine();
			for(i=0;i<n;i++) {
				for(char c: s.toCharArray()) {
				for(j=0;j<n;j++) {
					  if (c == 'A'|| c == 'a'){
                          if ((j == 0 && i!=0) || (j == n - 1 && i!=0) || (i == 0 && j!=0 && j!=n-1) || i == n / 2) {
                              System.out.print("A ");
                          } else {
                              System.out.print("  ");
                          }
                      } if (c == 'B' || c == 'b') {
                          if ((i == 0 && j != n - 1) || j == 0 || (i == n - 1 && j != n - 1)
                                  || (j == n - 1 && i != 0 && i != n - 1 && i != n / 2) || (i == n / 2 && j != n - 1)) {
                              System.out.print("B ");
                          } else {
                              System.out.print("  ");
                          }
                      }
                      if (c == 'C' || c == 'c') {
                          if (i==0 || j==0 || i==n-1) {
                              System.out.print("C ");
                          } else {
                              System.out.print("  ");
                          }
                      } if (c == 'D' || c == 'd') {
                          if ((i==0 && j!=n-1) || (i==n-1 && j!=n-1) || j==0 || (j==n-1 && i!=0 && i!=n-1)) {
                              System.out.print("D ");
                          } else {
                              System.out.print("  ");
                          }
                      }
                      
                      if (c == 'E' || c == 'e') {
                          if (i==0 || i==n-1 || i==n/2 || j==0) {
                              System.out.print("E ");
                          } else {
                              System.out.print("  ");
                          }
                      } if (c == 'F' || c == 'f') {
                          if (i==0 || i==n/2 || j==0) {
                              System.out.print("F ");
                          } else {
                              System.out.print("  ");
                          }
                      }
                      if (c == 'G' || c == 'g') {
                          if (i==0 || i==n-1 || (i==n/2 && j>=n/2)|| j==0 || (j==n-1 && i>= n/2)) {
                              System.out.print("G ");
                          } else {
                              System.out.print("  ");
                          }
                      } if (c == 'H' || c == 'h') {
                          if (j==0 || j==n-1 || i==n/2) {
                              System.out.print("H ");
                          } else {
                              System.out.print("  ");
                          }
                      }
                      if (c == 'I' || c == 'i') {
                          if (i==0 || j==n/2 || i==n-1) {
                              System.out.print("I ");
                          } else {
                              System.out.print("  ");
                          }
                      } if (c == 'J' || c == 'j') {
                          if (i==0 || (i==n-1 && j<=n/2) || j==n/2 || (j==0 && i>n/2)) {
                              System.out.print("J ");
                          } else {
                              System.out.print("  ");
                          }
                      }
                      if (c == 'K' || c == 'k') {
                          if (j==0 || (i==n/2 && j<n/2) || (i==(n-2)-j && i<n/2) || (j==i-1 && i>n/2)) {
                              System.out.print("K ");
                          } else {
                              System.out.print("  ");
                          }
                      } if (c == 'L' || c == 'l') {
                          if (j==0 || i==n-1) {
                              System.out.print("L ");
                          } else {
                              System.out.print("  ");
                          }
                      }
                      if (c == 'M' || c == 'm') {
                          if (j==0 || j==n-1 || (j==(n-1)-i && i<=n/2) || (j==i && i<=(n/2))) {
                              System.out.print("M ");
                          } else {
                              System.out.print("  ");
                          }
                      } if (c == 'N' || c == 'n') {
                          if (j==0 || j==n-1 || j==i) {
                              System.out.print("N ");
                          } else {
                              System.out.print("  ");
                          }
                      }
                      if (c == 'O' || c == 'o') {
                          if ((j==0 && i!=0 && i!=n-1) || (j==n-1 && i!=0 && i!=n-1) || (i==0 && j!=0 && j!= n-1) || (i==n-1 && j!=0 && j!= n-1)) {
                              System.out.print("O ");
                          } else {
                              System.out.print("  ");
                          }
                      } if (c == 'P' || c == 'p') {
                          if (j==0 || (j==n-1 && i<n/2 && i!=0) || (i==0 && j!=n-1) || (i==n/2 && j!=n-1)) {
                              System.out.print("P ");
                          } else {
                              System.out.print("  ");
                          }
                      }
                      if (c == 'Q' || c == 'q') {
                          if ((j==0 && i!=0 && i!=n-2 && i!=n-1) || (j==n-1 && i!=0 && i!=n-2) || (i==0 && j!=0 && j!= n-1) || (i==n-2 && j!=0 && j!= n-1) || (j==i && i>=n/2)) {
                              System.out.print("Q ");
                          } else {
                              System.out.print("  ");
                          }
                      } if (c == 'R' || c == 'r') {
                          if (j==0 || (j==n-1 && i<n/2 && i!=0) || (i==0 && j!=n-1) || (i==n/2 && j!=n-1) || (j==i-1 && i>n/2)) {
                              System.out.print("R ");
                          } else {
                              System.out.print("  ");
                          }
                      }
                      if (c == 'S' || c == 's') {
                          if ((i==0 && j!=0 && j!=n-1) || (i==n/2 && j!=0 && j!=n-1) || (i==n-1 && j!=0 && j!=n-1) || (j==0 && i<n/2 && i!=0) || (j==n-1 && i>n/2 && i!=n-1)) {
                              System.out.print("S ");
                          } else {
                              System.out.print("  ");
                          }
                      } if (c == 'T' || c == 't') {
                          if (i==0 || j==n/2) {
                              System.out.print("T ");
                          } else {
                              System.out.print("  ");
                          }
                      }
                      if (c == 'U' || c == 'u') {
                          if ((j==0 && i!=n-1) || (j==n-1 && i!=n-1) || (i==n-1 && j!=0 && j!=n-1)) {
                              System.out.print("U ");
                          } else {
                              System.out.print("  ");
                          }
                      } if (c == 'V' || c == 'v') {
                          if ((i<n/2 && j==0) || (i<n/2 && j==n-1) || i-j==n/2 || i+j==((n-1)+(n/2))) {
                              System.out.print("V ");
                          } else {
                              System.out.print("  ");
                          }
                      }
                      if (c == 'W' || c == 'w') {
                          if (j==0 || j==n-1 || (j==(n-1)-i && i>=n/2) || (j==i && i>=(n/2))) {
                              System.out.print("W ");
                          } else {
                              System.out.print("  ");
                          }
                      } if (c == 'X' || c == 'x') {
                          if (j==i || j==n-1-i) {
                              System.out.print("X ");
                          } else {
                              System.out.print("  ");
                          }
                      }
                      if (c == 'Y' || c == 'y') {
                          if ((j==i && i<=n/2) || (j==n-1-i && i<=n/2)|| (j==n/2 && i>=n/2)) {
                              System.out.print("Y ");
                          } else {
                              System.out.print("  ");
                          }
                      } if (c == 'Z' || c == 'z') {
                          if (i==0 || i==n-1 || j==n-1-i) {
                              System.out.print("Z ");
                          } else {
                              System.out.print("  ");
                          }
                      }
                      if(c == ' '){
                          
                          System.out.print("  ");
                          
                          
                      }
                      if (c == '0') {
                          if (i==0 || i== n-1 || j==0 || j==n-1 || j==(n-1)-i) {
                              System.out.print("0 ");
                          } else {
                              System.out.print("  ");
                          }
                      } if (c == '1') {
                          if (j==n/2 || (j==n/2-i && i<n/2)) {
                              System.out.print("1 ");
                          } else {
                              System.out.print("  ");
                          }
                      }
                      if (c == '2') {
                          if ((i==0 && j!=0 && j!=n-1 && j!=1) || (i==n-1 && j!=0) || j==n-i || (j==1 && i==1)) {
                              System.out.print("2 ");
                          } else {
                              System.out.print("  ");
                          }
                      } if (c == '3') {
                          if ((i==0 && j!=0 && j!=n-1 && j!=1) || (i==n-1 && j!=0 && j!=n-1 && j!=1) || (j==n-i && i<=n/2) || (i==(n/2) && j>n/2 && j!= n-1) || (j==n-1 && i>n/2 && i!=n-1)) {
                              System.out.print("3 ");
                          } else {
                              System.out.print("  ");
                          }
                      }
                      if (c == '4') {
                          if ((j==n-2-i && j!=0) || j==n-2 || (i==n-3 && j!=0)) {
                              System.out.print("4 ");
                          } else {
                              System.out.print("  ");
                          }
                      } if (c == '5') {
                          if (i==0 || (i==n-1 && j!=n-1) || (j==0 && i<=n/2) || (i==n/2 && j!=n-1) ||(j==n-1 && i>n/2 && i!=n-1)) {
                              System.out.print("5 ");
                          } else {
                              System.out.print("  ");
                          }
                      }
                      if (c == '6') {
                          if ((i==0 && j!=0 && j!=n-1) || (i==n-1 && j!=n-1 && j!=0) || (j==0 && i!=0 && i!=n-1) || (i==n/2 && j!=n-1) ||(j==n-1 && i>n/2 && i!=n-1)) {
                              System.out.print("6 ");
                          } else {
                              System.out.print("  ");
                          }
                      } if (c == '7') {
                          if (j==n-i|| i==0) {
                              System.out.print("7 ");
                          } else {
                              System.out.print("  ");
                          }
                      }
                      if (c == '8') {
                          if ((i==0 && j!=0 && j!=n-1) || (i==n/2 && j!=0 && j!=n-1) || (i==n-1 && j!=0 && j!=n-1) || (j==0 && i!=0 && i!=n-1 && i!=n/2) || (j==n-1 && i!=0 && i!=n-1 && i!=n/2)) {
                              System.out.print("8 ");
                          } else {
                              System.out.print("  ");
                          }
                      } if (c == '9') {
                          if ((i==0 && j!=0 && j!=n-1) || (i==n/2 && j!=0 && j!=n-1) || (i==n-1 && j!=0 && j!=n-1) || (j==0 && i!=0 && i!=n-1 && i<n/2) || (j==n-1 && i!=0 && i!=n-1)) {
                              System.out.print("9 ");
                          } else {
                              System.out.print("  ");
                          }
                      }
                      if (c == '@') {
                          if ((i==2 && j>2 && j<n-2)|| (i==n-3 && j>1 && j<n-3) || (j==2 && i>2 && i<n-2)|| (j==n-3 && i>1 && i<n-3) || (j==0 && i!=0 && i!=n-1) || (i==n-1 && j!=0 && j<n-2) || (i==0 && j!=0 && j!=n-1) || (j==n-1 && i!=0 && i<n-3) || (j==n-2 && i==n-3)) {
                              System.out.print("@ ");
                          } else {
                              System.out.print("  ");
                          }
                      } if (c == '#') {
                          if (j==2 || j==n-3 || i==2 || i==n-3) {
                              System.out.print("# ");
                          } else {
                              System.out.print("  ");
                          }
                      }
                  }
                  System.out.print("  ");
              }
              System.out.println();
              try {
                  Thread.sleep(100); 
              } catch (InterruptedException e) {
                  System.out.println("Thread interrupted: " + e.getMessage());
              }
					
						
					}
				}

	}

}
