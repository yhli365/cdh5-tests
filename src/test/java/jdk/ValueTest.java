package jdk;

import org.junit.Test;

/**
 * @author Yanhong Lee
 *
 * @date 2016年7月28日 下午1:10:53
 */
public class ValueTest {

	@Test
	public void testMapReduceSortValue() {
		int METASIZE = 4 * 4;
		int sortmb = 64;
		int maxMemUsage = sortmb << 20;
		System.out.println("sortmb=" + sortmb);
		System.out.println("maxMemUsage=" + maxMemUsage);
		System.out.println("maxMemUsage/sortmb=" + maxMemUsage / sortmb);
		maxMemUsage -= maxMemUsage % METASIZE;
		System.out.println("maxMemUsage=" + maxMemUsage);
	}

}
