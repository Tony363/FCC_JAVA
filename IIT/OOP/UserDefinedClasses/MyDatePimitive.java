public class MyDate {
    private int year = 1970;
    private int month = 1;
    private int day = 1;

    public MyDate() {
    }
    public MyDate(int year, int month, int day) {
	this.setYear(year);
	this.setMonth(month);
	this.setDay(day);
    }

    public int getYear() {
	return this.year;
    }
    public void setYear(int year) {
	this.year = year;
    }
    public int getMonth() {
	return this.month;
    }
    public void setMonth(int month) {
	this.month = month;
    }
    public int getDay() {
	return this.day;
    }
    public void setDay(int day) {
	this.day = day;
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
