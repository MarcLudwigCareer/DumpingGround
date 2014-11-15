package uk.co.theludwigs.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class FibonnaciTest {
	
	/**
	 * Starting from 0
	 * 0,1,1,2,3,5,8,13
	 */
	@Test
	public void assertFib() {
		SeriesService seriesService = new SeriesService();
		
		assertThat(seriesService.fibonnaci(1), is(0)); 
		assertThat(seriesService.fibonnaci(2), is(1));
		assertThat(seriesService.fibonnaci(3), is(1));
		
	}

}
