package uk.co.theludwigs.actions;

import java.util.Collection;

import org.junit.Test;

import uk.co.theludwigs.domain.MyClass;

import com.google.common.collect.Lists;

import static org.mockito.Mockito.*;

public class OutputterTest {

	@Test
	public void assertItemsPrinted() {
		final Outputter outputter = new Outputter();
		final MyClass mockMyClass= mock(MyClass.class);
		final Collection<MyClass> collection = Lists.newArrayList();
		collection.add(mockMyClass);		
		outputter.showCollection(collection);
		verify(mockMyClass).printResult();
	}
}
