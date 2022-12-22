package day1;

import java.util.Scanner;

public class Main {
	private static void showMenu() {
		System.out.println("-----Quan li hoc sinh -----");
		System.out.println("1.Add hoc sinh");
		System.out.println("2.Update hoc sinh");
		System.out.println("3.Delete hoc sinh");
		System.out.println("4.All hoc sinh");
		System.out.println("5.Find hoc sinh");
		System.out.println("-----Tool  hoc sinh -----");
		System.out.println("6.Filter by LopHoc");
		System.out.println("7.Filter by dtb");
		System.out.println("8.Sort by dtb");
		System.out.println("9.Sort by name");
		System.out.println("10.Exit");
		}
	public static void main(String[] args) {
		QuanLyHocSinh ql = new QuanLyHocSinh();
		Scanner in = new Scanner(System.in);
		int n;
		
		do {
			showMenu();
			System.out.println("Nhap lua chon");
			n = in.nextInt();
			switch(n) {
			
			case 1: ql.AddHocSinh();
				System.out.println("Nhap thanh cong!");
				break;
			case 2: ql.UpdateHocSinh();
				System.out.println("Nhap thanh cong!");
				break;
			case 3: ql.DeleteHocSinh();
				break;
			case 4: ql.AllHocSinh();
				break;
			case 5: ql.FindHocSinh();
			break;	
			case 6: ql.FilterHocSinhbyLop();
			break;
			case 7:
				ql.FilterHocSinhbyDiem();
				break;
			case 8:
				ql.SortByDiem();
				break;
			case 9 : 
				ql.sortByClass();
				break;
			}
		}while(n != 10);
		in.close();
	}
}
