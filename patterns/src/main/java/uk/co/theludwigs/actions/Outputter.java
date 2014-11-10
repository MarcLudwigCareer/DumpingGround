package uk.co.theludwigs.actions;

import java.util.Collection;
import java.util.Iterator;

public class Outputter {

	public void showCollection (Collection collection) {
		Iterator ii = collection.iterator();
	   	for(int kk = 0; kk < collection.size(); kk++) {
	                 MyClass one = (MyClass) ii.next();
			one.printResult();
		}
	}

}
