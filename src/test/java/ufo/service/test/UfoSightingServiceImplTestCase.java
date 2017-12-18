package ufo.service.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import ufo.cache.CacheManager;
import ufo.dto.UfoSighting;
import ufo.service.UfoSightingService;
import ufo.service.UfoSightingServiceImpl;

public class UfoSightingServiceImplTestCase {

	@Test
    public void testUfoSightingServiceImpl() throws Exception {
		UfoSightingService ufoSightingService = new UfoSightingServiceImpl();
		
		Assert.assertNotNull(ufoSightingService);
	}
	
	@Test
    public void testGetAllSightings() throws Exception {
		Integer totalExpected = 61391;
		UfoSightingService ufoSightingService = new UfoSightingServiceImpl();

		List<UfoSighting> result = ufoSightingService.getAllSightings();
		
		Assert.assertNotNull(result);
		Assert.assertTrue(totalExpected.equals(result.size()));
	}
	
	@Test
    public void testSearchOctober1995() throws Exception {
		Integer yearSeen = 1995;
		Integer monthSeen = 10;
		Integer totalExpected = 107;

		UfoSightingService ufoSightingService = new UfoSightingServiceImpl();

		List<UfoSighting> result = ufoSightingService.search(yearSeen, monthSeen);
		
		Assert.assertNotNull(result);
		Assert.assertTrue(totalExpected.equals(result.size()));
	}

	@Test
    public void testSearchNoResult() throws Exception {
		Integer yearSeen = 2017;
		Integer monthSeen = 11;
		Integer totalExpected = 0;

		UfoSightingService ufoSightingService = new UfoSightingServiceImpl();

		List<UfoSighting> result = ufoSightingService.search(yearSeen, monthSeen);
		
		Assert.assertNotNull(result);
		Assert.assertTrue(totalExpected.equals(result.size()));
	}

	@Test
    public void testSearchWrongYear() throws Exception {
		Integer yearSeen = -120;
		Integer monthSeen = 11;
		Integer totalExpected = 0;

		UfoSightingService ufoSightingService = new UfoSightingServiceImpl();

		List<UfoSighting> result = ufoSightingService.search(yearSeen, monthSeen);
		
		Assert.assertNotNull(result);
		Assert.assertTrue(totalExpected.equals(result.size()));
	}

	@Test
    public void testSearchAllAndOctober1995() throws Exception {
		Integer yearSeen = 1995;
		Integer monthSeen = 10;

		UfoSightingService ufoSightingService = new UfoSightingServiceImpl();

		List<UfoSighting> fullResult = ufoSightingService.getAllSightings();

		List<UfoSighting> result = ufoSightingService.search(yearSeen, monthSeen);

		Assert.assertNotNull(fullResult);
		Assert.assertNotNull(result);
	}
	
	@Test
	public void testCacheManagerSetup() {
		String CACHE_NAME = "AllSightings";

		UfoSightingService ufoSightingService = new UfoSightingServiceImpl();
		
		Assert.assertNotNull(ufoSightingService);
		Assert.assertNotNull(CacheManager.getInstance().getEntry(CACHE_NAME) == null);
	}
}
