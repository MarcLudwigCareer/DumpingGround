package uk.co.theludwigs.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class FibonnaciTest {
	
	@Test
	public void assertFib() {
		SeriesService seriesService = new SeriesService();
		
		assertThat(seriesService.fibonnaci(1), is(0));
		
	}

}
