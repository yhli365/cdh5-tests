package jdk;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

/**
 * @author Yanhong Lee
 *
 * @date 2016年7月26日 下午12:12:07
 */
public class PatternTest {

	@Test
	public void testMatcherGroup() {
		String[] tests = new String[] { "<name>io.compression.codec.lzo.class</name>",
				"<value>com.hadoop.compression.lzo.LzoCodec</value>" };
		Pattern pattern = Pattern.compile("lzo.");
		for (String text : tests) {
			System.out.println("\n------------------");
			System.out.println("test: " + text);
			Matcher matcher = pattern.matcher(text);
			while (matcher.find()) {
				int groups = matcher.groupCount();
				System.out.println("groups: " + groups);
				for (int i = 0; i <= groups; i++) {
					System.out.println("group[" + i + "]: " + matcher.group(i));
				}
			}
		}

	}

}
