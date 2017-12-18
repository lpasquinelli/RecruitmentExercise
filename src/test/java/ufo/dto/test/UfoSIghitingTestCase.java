package ufo.dto.test;

import org.junit.Assert;
import org.junit.Test;

import ufo.dto.UfoSighting;

public class UfoSIghitingTestCase {

	@Test
    public void testUfoSighting() throws Exception {
		String dateSeen = "19950126";
		String dateReported = "19950126";
		String placeSeen = "Concrete, WA";
		String shape = "light";
		String duration = "55 min.";
		String description = "Seattle City Light employee, who had witnessed strange object along Route 20 in December 1994, reports strange lights near horizon, and dropping down below horizon.  No follow-up report.";
		
		UfoSighting ufoSighting = new UfoSighting(dateSeen, dateReported, placeSeen, shape, duration, description);

		Assert.assertNotNull(ufoSighting);
        Assert.assertEquals(dateSeen, ufoSighting.getDateSeen());
        Assert.assertEquals(dateReported, ufoSighting.getDateReported());
        Assert.assertEquals(placeSeen, ufoSighting.getPlaceSeen());
        Assert.assertEquals(shape, ufoSighting.getShape());
        Assert.assertEquals(duration, ufoSighting.getDuration());
        Assert.assertEquals(description, ufoSighting.getDescription());
    }

	@Test
    public void testUfoSightingNoShape() throws Exception {
		String dateSeen = "19950126";
		String dateReported = "19950126";
		String placeSeen = "Concrete, WA";
		String shape = null;
		String duration = "55 min.";
		String description = "Seattle City Light employee, who had witnessed strange object along Route 20 in December 1994, reports strange lights near horizon, and dropping down below horizon.  No follow-up report.";
		
		UfoSighting ufoSighting = new UfoSighting(dateSeen, dateReported, placeSeen, shape, duration, description);

		Assert.assertNotNull(ufoSighting);
        Assert.assertEquals(dateSeen, ufoSighting.getDateSeen());
        Assert.assertEquals(dateReported, ufoSighting.getDateReported());
        Assert.assertEquals(placeSeen, ufoSighting.getPlaceSeen());
        Assert.assertNull(ufoSighting.getShape());
        Assert.assertEquals(duration, ufoSighting.getDuration());
        Assert.assertEquals(description, ufoSighting.getDescription());
    }

	@Test
    public void testUfoSightingNoPlace() throws Exception {
		String dateSeen = "19950126";
		String dateReported = "19950126";
		String placeSeen = null;
		String shape = "light";
		String duration = "55 min.";
		String description = "Seattle City Light employee, who had witnessed strange object along Route 20 in December 1994, reports strange lights near horizon, and dropping down below horizon.  No follow-up report.";
		
		UfoSighting ufoSighting = new UfoSighting(dateSeen, dateReported, placeSeen, shape, duration, description);

		Assert.assertNotNull(ufoSighting);
        Assert.assertEquals(dateSeen, ufoSighting.getDateSeen());
        Assert.assertEquals(dateReported, ufoSighting.getDateReported());
        Assert.assertNull(ufoSighting.getPlaceSeen());
        Assert.assertEquals(shape, ufoSighting.getShape());
        Assert.assertEquals(duration, ufoSighting.getDuration());
        Assert.assertEquals(description, ufoSighting.getDescription());
    }

	@Test
    public void testUfoSightingNoDuration() throws Exception {
		String dateSeen = "19950126";
		String dateReported = "19950126";
		String placeSeen = "Concrete, WA";
		String shape = "light";
		String duration = null;
		String description = "Seattle City Light employee, who had witnessed strange object along Route 20 in December 1994, reports strange lights near horizon, and dropping down below horizon.  No follow-up report.";
		
		UfoSighting ufoSighting = new UfoSighting(dateSeen, dateReported, placeSeen, shape, duration, description);

		Assert.assertNotNull(ufoSighting);
        Assert.assertEquals(dateSeen, ufoSighting.getDateSeen());
        Assert.assertEquals(dateReported, ufoSighting.getDateReported());
        Assert.assertEquals(placeSeen, ufoSighting.getPlaceSeen());
        Assert.assertEquals(shape, ufoSighting.getShape());
        Assert.assertNull(ufoSighting.getDuration());
        Assert.assertEquals(description, ufoSighting.getDescription());
    }

	@Test
    public void testUfoSightingNoDescription() throws Exception {
		String dateSeen = "19950126";
		String dateReported = "19950126";
		String placeSeen = "Concrete, WA";
		String shape = "light";
		String duration = "55 min.";
		String description = null;
		
		UfoSighting ufoSighting = new UfoSighting(dateSeen, dateReported, placeSeen, shape, duration, description);

		Assert.assertNotNull(ufoSighting);
        Assert.assertEquals(dateSeen, ufoSighting.getDateSeen());
        Assert.assertEquals(dateReported, ufoSighting.getDateReported());
        Assert.assertEquals(placeSeen, ufoSighting.getPlaceSeen());
        Assert.assertEquals(shape, ufoSighting.getShape());
        Assert.assertEquals(duration, ufoSighting.getDuration());
        Assert.assertNull(ufoSighting.getDescription());
    }
}
