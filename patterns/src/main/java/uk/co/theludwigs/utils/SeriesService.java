package uk.co.theludwigs.utils;

public class SeriesService {

	public int fibonnaci(int i) {
		if (i == 0) {
			return 0;
		}
		if (i == 1) {
			return 1;	
		}
		return fibonnaci(i-1) + fibonnaci(i-2);
	}

}
