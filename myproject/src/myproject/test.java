package myproject;
public class test {
	public static void main(String[] args) {
		Date d=new Date(2003,1,1);
		Date d1=new Date(2005,4,3);
		Date d2=new Date(2004,12,10);
		Date d3=new Date(2012,1,10);
		d1.d_Date(d2);
		d2.d_Date(d1);
		d3.d_Date(d2);
		d1.isLead(d1);
		d2.isLead(d2);
		d2.passedMonthDays(d2);
		d1.passedMonthDays(d1);
		d1.setYear(2008);
	}
}