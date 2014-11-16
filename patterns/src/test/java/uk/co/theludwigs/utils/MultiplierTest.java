package uk.co.theludwigs.utils;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


/**
 * If we list all the natural numbers below 10 that are multiples 
 * of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * @author Marc
 *
 */
public class MultiplierTest {

	@Test
	public void testMutiplier() {
		final Multiplier multiplier = new Multiplier();
		
		assertThat(multiplier.sumDivisorsBelow(4), is(3));
	}
}
