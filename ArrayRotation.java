package dataStructures;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

		int input = sc.nextInt();

		int temp = arr[0];

		for (int i = 0; i < input; i++)

		{
			System.out.println("start");
			temp = arr[0];

			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];

			}

			arr[arr.length - 1] = temp;
			for (int z = 0; z < arr.length; z++) {
				System.out.println(arr[z]);
			}

		}

	}

}
