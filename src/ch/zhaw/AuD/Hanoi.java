package ch.zhaw.AuD;

public class Hanoi {
	public StringBuffer AC(int n) {
		StringBuffer s = new StringBuffer();
		if (n == 0) s.append("");
		else  {
			s.append(AB(n-1));
			s.append(" AC ");
			s.append(BC(n-1));
		}
		return s;
	}

	private StringBuffer AB(int n) {
		StringBuffer s = new StringBuffer();
		if (n == 0) System.out.println("");
		else  {
			s.append(AC(n - 1));
			s.append(" AB ");
			s.append(CB(n - 1));
		}
		return s;
	}

	private StringBuffer CB(int n) {
		StringBuffer s = new StringBuffer();
		if (n == 0) System.out.println("");
		else  {
			s.append(CA(n - 1));
			s.append(" CB ");
			s.append(AB(n - 1));
		}
		return s;
	}

	private StringBuffer CA(int n) {
		StringBuffer s = new StringBuffer();
		if (n == 0) System.out.println("");
		else  {
			s.append(CB(n - 1));
			s.append(" CA ");
			s.append(BA(n - 1));
		}
		return s;
	}

	private StringBuffer BA(int n) {
		StringBuffer s = new StringBuffer();
		if (n == 0) System.out.println("");
		else  {
			s.append(BC(n - 1));
			s.append(" BA ");
			s.append(CA(n - 1));
		}
		return s;
	}

	private StringBuffer BC(int n) {
		StringBuffer s = new StringBuffer();
		if (n == 0) System.out.println("");
		else  {
			s.append(BA(n-1));
			s.append(" BC ");
			s.append(AC(n-1));
		}
		return s;
	}
}
