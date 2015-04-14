package cn.howard;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class test {

	/**
	 * TODO<请描述这个方法是干什么的>
	 * 
	 * @param args
	 * @throw
	 * @return void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub123-08-0
		// boolean res = casCheck("123", "08", "0");
		// System.out.println("result==" + System.currentTimeMillis());
		// String
		// hotSearch="'19315-93-6','196929-78-9','Methyl nicotinate','19315-93-6',";
		// System.out.println("result=="+hotSearch.substring(0,
		// hotSearch.length()-1));

		Date date = new Date();
		SimpleDateFormat tmp = new SimpleDateFormat("MMMM d", Locale.ENGLISH);

		String str = tmp.format(date);
		str = str.substring(0, 1).toUpperCase() + str.substring(1);

		if (date.getDate() > 10 && date.getDate() < 14) {
			str = str + "th";
		} else {
			if (str.endsWith("1")) {
				str = str + "st";
			} else if (str.endsWith("2")) {
				str = str + "nd";
			} else if (str.endsWith("3")) {
				str = str + "rd";
			} else {
				str = str + "th";
			}
		}

		System.out.println(str);

	}

	public static boolean casCheck(String first, String second, String check) {
		int count = 1;
		int result = 0;
		int checkInt = Integer.parseInt(check);
		for (int i = second.length(); i > 0; i--) {
			String temp = second.substring(i - 1, i);
			result += Integer.parseInt(temp) * count++;
		}

		for (int j = first.length(); j > 0; j--) {
			String temp = first.substring(j - 1, j);
			result += Integer.parseInt(temp) * count++;
		}
		if (result % 10 == checkInt) {
			return true;
		}
		return false;
	}
}
