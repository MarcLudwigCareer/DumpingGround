package uk.co.theludwigs.actions;

import java.util.Collection;

public class Outputter {

	public void showCollection (Collection<MyClass> collection) {
		for (MyClass myClass : collection) {
			myClass.printResult();
		}
	}

}
