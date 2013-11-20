package ch.zhaw.AuD;

public class Palindrom {

	public static boolean IsPalindrom(String s) {
		int length = s.length();
		if (length == 0 || length == 1) return true;
		if (!s.substring(0,1).equals(s.substring(length-1,length))) return false;
		return IsPalindrom(s.substring(1, length-1));
	}
}
