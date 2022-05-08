package com.org.genp.day1;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i, j;  
		    System.out.println("Enter total rows and columns: ");  
		    Scanner s = new Scanner(System.in);  
		    int row = s.nextInt();  
		    int column = s.nextInt();  
		    int array[][] = new int[row][column];  
		    System.out.println("Enter matrix:");  
		    for(i = 0; i < row; i++)  
		    {  
		        for(j = 0; j < column; j++)   
		            {  
		            array[i][j] = s.nextInt();  
		            System.out.print(" ");  
		            }  
		    }  
		    System.out.println("The Origanl Matrix");  
		    for(i = 0; i < row; i++)  
		        {  
		            for(j = 0; j < column; j++)  
		            {  
		            System.out.print(array[i][j]+" ");  
		            }  
		            System.out.println(" ");  
		        }  
		    System.out.println("The Matrix After Transpose is ");  
		    for(i = 0; i < column; i++)  
		        {  
		            for(j = 0; j < row; j++)  
		            {  
		                System.out.print(array[j][i]+" ");  
		            }  
		            System.out.println(" ");  
		        }
		    //Calculates sum of each column of given matrix  
	        for(i = 0; i < column; i++){  
	            int sumCol = 0;  
	            for(j = 0; j < row; j++){  
	              sumCol = sumCol + array[j][i];  
	            }  
	            System.out.println("Sum of column " +  (i+1)+":- "  +sumCol);  
	        }  
		    }  
		}  
