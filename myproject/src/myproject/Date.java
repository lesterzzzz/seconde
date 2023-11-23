package myproject;
public class Date {
    private int year;
    private int month;
    private int day;
    public Date() {
    }
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public boolean isLead(Date date)  //判断是否为闰年
    {
        int year = date.year;
        // 能被4整除并且不能被100整除或者能被400整除的年份就是闰年
        if((year%4 == 0 && year%100 != 0) || (year%400 == 0))
        {
            return true;
        }
        return false;
    }
    public int passedMonthDays(Date date)    //当年度过的天数
    {
        int mouth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int i, monDays = 0;
        if(isLead(date))
        {
            mouth[2] = 29;
        }
        for (i=1; i <date.month; i++)
            monDays += mouth[i];
        return monDays + date.day;
    }
    public int d_Date(Date date)    //计算天数差值
    {
        int d_yearDays = 0;
        int d_otherDays = 0;
        int min_year;
        int max_year;

        if(this.year >= date.year) {
            min_year = date.year;
            max_year = this.year;
            d_otherDays = passedMonthDays(this) - passedMonthDays(date);
        }
        else {
            min_year = this.year;
            max_year = date.year;
            d_otherDays = passedMonthDays(date) - passedMonthDays(this);
        }

        for (int i=min_year; i<max_year; i++) // 计算开始年份到结束年份的天数
        {
            Date tempdate = new Date();
            tempdate.setYear(i);
            if (isLead(tempdate)) // 判断是否为闰年
                d_yearDays += 366;
            else
                d_yearDays += 365;
        }
        return d_otherDays + d_yearDays;
    }
    public void setYear(int year) {
        this.year = year;
    }
}