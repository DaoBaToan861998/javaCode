package bai5vongLap;

public class JA1_7_06b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JA1_7_06b pt = new JA1_7_06b();
		int n = 140;
		pt.phanTichThuaSoNguyenTo(n);

	}

	boolean KTsoNguyenTo(int giaTri) {
		if (giaTri < 2)
			return false;
		for (int i = 2; i <= giaTri / 2; i++) {
			if (giaTri % i == 0)
				return false;
		}
		return true;
	}
	void phanTichThuaSoNguyenTo(int n) {
		for (int i = 2; i <= n; i++) {
			while (KTsoNguyenTo(i) && (n % i == 0)) {
				System.out.println(" " + i);
				n /= i;
			}
		}
	}
}