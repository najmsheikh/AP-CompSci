/*
-Najm Sheikh
-09/26/14
-Study of triangles is typically covered in high school mathematics courses.  In order for three lengths to form a triangle they must meet specific requirements.  If three lengths form a triangle, we can further analyze the triangle by determining if it is an equilateral, isosceles or scalene triangle. Create a program that allows the user to enter 3 lengths.  Display if the lengths can form a triangle.  State the type of triangle if the lengths form a triangle. 
*/

import java.util.Scanner;

class triangleChecker{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		double s1 = 0, s2 = 0, s3 = 0, sum = 0, sum2 = 0, max =0;
		boolean triangle = false;

		System.out.println("AP Comp Science A2 ~ Najm Sheikh");

		System.out.println("What is the length of the first side?");
		s1 = sc.nextDouble();
		System.out.println("What is the lenght of the second side?");
		s2 = sc.nextDouble();
		System.out.println("What is the length of the third side?");
		s3 = sc.nextDouble();

		sum = s1 + s2 + s3;
		max = Math.max(s1, Math.max(s2, s3));
		sum2 = sum - max;

		if(sum2 > max){
			triangle = true;
		}else{
			System.out.println("Sorry, that's not a valid triangle.");
		}

		if(triangle == true){
			if(s1==s2 && s2==s3 && s1==s3){
				System.out.println("It's an equilateral triangle!");
			}else{
				if(s1==s2 || s2==s3 || s3 ==s1){
					System.out.println("It's an Isosceles triangle!");
				}else{
					if(s1!=s2 && s2!=s3 && s1!=s3){
						System.out.println("It's a Scalene triangle!");
					}
				}
			}
		}



	}
}