package day1;


import java.util.*;

public class QuanLyHocSinh {
	public QuanLyHocSinh() {
	}
	static Scanner sc = new Scanner(System.in);
	private ArrayList<HocSinh> list = new ArrayList<HocSinh>();
	public void AddHocSinh() {
		HocSinh hs = new HocSinh();
		System.out.println("Ma hoc sinh:");
		hs.setMasv(Integer.parseInt(sc.nextLine()));
		System.out.println("Ten:");
		hs.setTen(sc.nextLine());
		System.out.println("Ho:");
		hs.setHo(sc.nextLine());
		System.out.println("Tuoi");
		hs.setAge(Integer.parseInt(sc.nextLine()));
		System.out.println("Diem trung binh:");
		hs.setDtb(Float.parseFloat(sc.nextLine()));
		System.out.println("Lop hoc:");
		hs.setLopHoc(sc.nextLine());
		list.add(hs);
	}
	public void UpdateHocSinh() {
		System.out.println("Nhap ID can update:");
		int a = Integer.parseInt(sc.nextLine());
		int count = 0;
		for(HocSinh hs: list) {
			if(hs.getMasv()== a) {
				System.out.println("Update Ma hoc sinh:");
				hs.setMasv(Integer.parseInt(sc.nextLine()));
				System.out.println("Update Ten:");
				hs.setTen(sc.nextLine());
				System.out.println("Update Ho:");
				hs.setHo(sc.nextLine());
				System.out.println("Update Tuoi");
				hs.setAge(Integer.parseInt(sc.nextLine()));
				System.out.println("Update Diem trung binh:");
				hs.setDtb(Float.parseFloat(sc.nextLine()));
				System.out.println("Update Lop hoc:");
				hs.setLopHoc(sc.nextLine());
				count ++;
				break;
			}
			if(count == 0) {
				System.out.println("NOT FOUND");
			}
			else {
				System.out.println("Update thanh cong!");
			}
		}
	}
	public void DeleteHocSinh() {
		System.out.println("Nhap ID can update:");
		int a = Integer.parseInt(sc.nextLine());
		int count = 0;
		for(int i=0; i< list.size(); i++) {
			if(list.get(i).getMasv() == a) {
				list.remove(i);
				count++;
				break;
			}
		}
		if(count == 0 ) {
			System.out.println("Not Found");
		}else {
			System.out.println("Xoa thanh cong!");
		}
	}
	public void AllHocSinh() {
		System.out.println("----danh sach hoc sinh----");
		for(HocSinh hs:list) {
			System.out.printf(hs.toString());
		}
	}
	public void FindHocSinh() {
		System.out.println("Tim kiem theo ID");
		int a = Integer.parseInt(sc.nextLine());
		for(HocSinh hs: list) {
			if(hs.getMasv() == a) {
				System.out.println(hs.toString());
			}
		}
		
	}
	
	public void FilterHocSinhbyLop() {
		System.out.println("Tim kiem theo lop");
		String a = sc.nextLine();
		int count = 0;
		for(HocSinh hs: list) {
			if(hs.getLopHoc().equals(a) ) {
				System.out.println(hs.toString());
				count++;
			}
		}
		if(count == 0 ) {
			System.out.println("Not Found");
		}else {
			System.out.println("tim thanh cong!");
		}
		
	}
	
	public void FilterHocSinhbyDiem() {
		System.out.println("Tim kiem theo diem");
		float a = Float.parseFloat(sc.nextLine());
		if( a < 5 ) {
			for(HocSinh hs: list) {
				if(hs.getDtb() == a) {
					System.out.println("Bon nay dot!");
					System.out.println(hs.toString());
					
				}
			}
		}
		else if( a < 6  ) {
			for(HocSinh hs: list) {
				if(hs.getDtb() == a) {
					System.out.println("Bon nay trung binh!");
					System.out.println(hs.toString());

				}
			}
		}
		else if( a < 8  ) {
			for(HocSinh hs: list) {
				if(hs.getDtb() == a) {
					System.out.println("Bon nay kha!");
					System.out.println(hs.toString());

				}
			}
		}
		else  {
			for(HocSinh hs: list) {
				if(hs.getDtb() == a) {
					System.out.println("Bon nay gioi!");
					System.out.println(hs.toString());
				}
			}
		}
	}
	
	public void SortByDiem() {
		Collections.sort(list,(a,b)-> (int) (b.getDtb()-a.getDtb()));
		System.out.println("Result");
		AllHocSinh();
	}
	
	 public void sortByClass() {
	        Collections.sort(list, new Comparator<HocSinh>() {
	            @Override
	            public int compare(HocSinh a, HocSinh b) {
	                return a.getLopHoc().compareTo(b.getLopHoc());
	            }
	        });
	        AllHocSinh();
	        
	    }
	 
}
