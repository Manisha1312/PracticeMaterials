package com.collection.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Student a = (Student) o1;
		Student b = (Student) o1;

		if (a.age == b.age)

			return 0;
		else if (a.age > b.age)

			return 1;
		else

			return -1;

	}

}
