package uk.co.theludwigs.actions;

import java.util.Collection;

import uk.co.theludwigs.domain.MyClass;

public class Outputter {

	public void showCollection (Collection<MyClass> collection) {
		collection.forEach(p -> p.printResult());
	}

}
