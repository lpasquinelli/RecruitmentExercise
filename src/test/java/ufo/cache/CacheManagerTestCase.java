package ufo.cache;

import org.junit.Assert;
import org.junit.Test;

public class CacheManagerTestCase {

	@Test
	public void testCorrectIstantiation() {
		Assert.assertNotNull(CacheManager.getInstance());
	}

	@Test
	public void testAddStringEntry() {
		String entryKey="KeyTest123";
		String entryValue="Lorem ipsum dolor sit amet, consectetur adipiscing elit";
		CacheManager.getInstance().addEntry(entryKey, entryValue);
		Assert.assertNotNull(CacheManager.getInstance().getEntry(entryKey));
	}

	@Test
	public void testAddIntegerEntry() {
		String entryKey="KeyTest123";
		Integer entryValue = new Integer(213132);
		CacheManager.getInstance().addEntry(entryKey, entryValue);
		Assert.assertNotNull(CacheManager.getInstance().getEntry(entryKey));
		Assert.assertEquals(entryValue, (Integer)CacheManager.getInstance().getEntry(entryKey));
	}
	
}
