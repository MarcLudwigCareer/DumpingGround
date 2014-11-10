package uk.co.theludwigs.actions;

import java.util.Collection;

public class Outputter {

	public void showCollection (Collection<MyClass> collection) {
		collection.forEach(p -> p.printResult());
	}

}
