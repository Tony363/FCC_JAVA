public class MyDatePC {
    private int year = 1970;
    private int month = 1;
    private int day = 1;

    public MyDate() {
    }
    public MyDate(int year, int month, int day) {
		this.setDate(year, month, day);
    }

	public static boolean isLeapYear(int year) {
		return true; // stub implementation
	}
	public static boolean isValidDate(int year, int month, int day) {
		if (year<1970) { return false; }
		if (month<1 || month>12) { return false; }
		int max_days;
		switch (month) {
		case 1:	case 3:	case 5:	case 7:	case 8:	case 10: case 12:
			max_days = 31;
			break;
		case 4: case 6:	case 9:	case 11:
			max_days= 30;
			break;
		default: // month 2
			if (isLeapYear(year)) {
				max_days = 29;
			} else {
				max_days = 28;
			}
		}
		return (day>=1 && day<=max_days);
	}
	
	public boolean setDate(int year, int month, int day) {
		if (isValidDate(year, month, day)) {
			this.setYear(year);
			this.setMonth(month);
			this.setDay(day);
			return true;
		}
		return false;
	}
	
    public int getYear() {
		return this.year;
    }
    void setYear(int year) {
		this.year = year;
    }
    public int getMonth() {
		return this.month;
    }
    void setMonth(int month) {
		this.month = month;
    }
    public int getDay() {
		return this.day;
    }
    void setDay(int day) {
		this.day = day;
			return true;
    }

    public boolean equals(Object o) {
		if (o instanceof MyDate) {
			MyDate d = (MyDate)o;
			return this.getYear()==d.getYear()
				&& this.getMonth()==d.getMonth()
				&& this.getDay()==d.getDay();
		}
		return false;
    }
    public String toString() {
		return String.format("%04d-%02d-%02d", this.getYear(), this.getMonth(), this.getDay());
    }
}
