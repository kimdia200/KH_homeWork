package _2;

import java.util.Date;
import java.util.GregorianCalendar;

class Data {
    double weight;
    String name;
    boolean enabled;
    Date startDate;

    public Data(double weight, String name, boolean enabled, Date startDate) {
        this.weight = weight;
        this.name = name;
        this.enabled = enabled;
        this.startDate = startDate;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (enabled ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		if (enabled != other.enabled)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

    
}

public class Example07 {

    static Date createDate(int year, int month, int day) {
        GregorianCalendar calendar = new GregorianCalendar(year, month, day);
        return calendar.getTime();
    }

    public static void main(String[] args) {
        Data d1 = new Data(10.3, "data", true, createDate(2018, 9, 10));
        Data d2 = new Data(10.3, "data", true, createDate(2018, 9, 10));
        Data d3 = new Data(11.9, "data", true, createDate(2018, 9, 10));
        Data d4 = new Data(10.3, "datt", true, createDate(2018, 9, 10));
        Data d5 = new Data(10.3, "data", false, createDate(2018, 9, 10));
        Data d6 = new Data(10.3, "data", true, createDate(2018, 9, 11));

        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));
        System.out.println(d1.equals(d4));
        System.out.println(d1.equals(d5));
        System.out.println(d1.equals(d6));
     }
}
