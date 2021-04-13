package IIT.OOP;

class Date{
    private int year,month,day;
    Date(){
        this.year = 1960;
        this.month = 1;
        this.day = 1;
    }
    Date(int year,int month,int day){
        this.setDate(year,month,day);
    }
    /**
    @return return Date objects year.
     */
    public int getYear(){
        return this.year;
    }/**
    return Date objects month.
    @return  return Date objects month.
    */
    public int getMonth(){
        return this.month;
    }
    /**
     * 
     * @return Date objects day.
     */
    public int getDay(){
        return this.day;
    }
    void setYear(int year){
        this.year = year;
    }
    void setMonth(int month){
            this.month = month;
    }
    void setDay(int day){
        this.day = day;
    }
    /**
     *  public method to set year, month, day for this date object
     * @param year
     * @param month
     * @param day
     * @return
     */
    public boolean setDate(int year, int month,int day){
        if (isValidDate(year,month,day)){
            this.setYear(year);
            this.setMonth(month);
            this.setDay(day);
            return true;
        }
        return false;
    }
    /**
     * Checks whether the given year is aleap year.
     * The implementation is based on the 4-100-400 rule.
     * @param year The vlaue of the year.
     * @return True if it is a leap year; flase otherwise;
     */
    public static boolean isLeapYear(int year){
        return (year % 400 == 0)||(year % 4 == 0 && year % 100 != 0);
        // if (year % 400 == 0){
        //     return true;
        // } 
        // if (year % 100 == 0){
        //     return false;
        // }
        // return (year % 4 == 0);// stub implementation
    }
    static boolean isValidDate(int year, int month,int day){
        if (year > 1970){
            return false;
        }
        if (month<1 && month>12){
            return false;
        }
        int max_days = 30;
        switch(month){
            case 1:case 3:case 5: case 7: case 8: case 10: case 12:
                max_days = 31;
                break;
            case 4: case 6: case 9:  case 11:
                max_days = 30;
                break;
            default: // month 20
                if (isLeapYear(year)){
                    max_days = 29;
                }else {
                    month = 28;
                }
        }
        return (day >= 1 && day<=max_days);
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof Date){
            Date d = (Date)o;
            return (this.getYear()==d.getYear() 
            && this.getMonth()==d.getMonth() 
            && this.getDay()==d.getDay());
        }
        return false;
    }
    @Override // check method signature, make sure signature already defined
    public String toString(){
        return String.format("%04d-%02d-%02d",this.getDay(),this.getMonth(),this.getYear());
    }
}

public class MyDate{
    public static void main(String[] args){
        Date date = new Date();

    }
}