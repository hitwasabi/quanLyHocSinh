package day1;

public class HocSinh {
	private int Masv, age;
	private String Ho , Ten , LopHoc;
	private float dtb;
	
	public HocSinh() {
	}
	
	
	public HocSinh(int masv, int age, String ho, String ten, String lopHoc, float dtb) {
		super();
		this.Masv = masv;
		this.age = age;
		this.Ho = ho;
		this.Ten = ten;
		this.LopHoc = lopHoc;
		this.dtb = dtb;
	}


	public int getMasv() {
		return Masv;
	}
	public void setMasv(int masv) {
		Masv = masv;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHo() {
		return Ho;
	}
	public void setHo(String ho) {
		Ho = ho;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public String getLopHoc() {
		return LopHoc;
	}
	public void setLopHoc(String lopHoc) {
		LopHoc = lopHoc;
	}
	public float getDtb() {
		return dtb;
	}
	public void setDtb(float dtb) {
		this.dtb = dtb;
	}


	@Override
	public String toString() {
		return "HocSinh [Masv=" + Masv + ", age=" + age + ", Ho=" + Ho + ", Ten=" + Ten + ", LopHoc=" + LopHoc
				+ ", dtb=" + dtb + "]";
	}
	
	
	
}
