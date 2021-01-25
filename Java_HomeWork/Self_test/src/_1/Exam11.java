package _1;

import java.util.ArrayList;
import java.util.Collection;

public class Exam11 {

    static class Data {
        String value;

        public Data(String value) {
            this.value = value.toUpperCase();
        }

		@Override
		public String toString() {
			return "Data(\"" + value + "\")";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((value == null) ? 0 : value.hashCode());
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
			if (value == null) {
				if (other.value != null)
					return false;
			} else if (!value.equals(other.value))
				return false;
			return true;
		}
		
        
    }

    public static void main(String[] args) {
        Collection<Data> a = new ArrayList<Data>();
        a.add(new Data("a"));
        a.add(new Data("b"));
        a.add(new Data("c"));

        a.remove(new Data("B"));
        System.out.println(a.toString());
    }

}
