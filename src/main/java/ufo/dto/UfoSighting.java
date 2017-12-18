package ufo.dto;

/**
 * 
 * TODO: This class can be improved implementing hashCode, equals, and toString method.
 * 
 * @author lpasquinelli
 *
 */
public class UfoSighting {
	/* TODO : dateSeen type should be moved to LocalDate.*/
	private String dateSeen;
	/* TODO : dateReported type should be moved to LocalDate */
	private String dateReported;
	/* TODO This information can be well-organized using a specific object 
	 * composed of 4 String fields : Country, State, Provice, City 
	 */
	private String placeSeen;
	/* TODO : due to the limit of types, this string should be moved to a 
	 * more specific enumeration type (, unknown, circle, oval, flare, 
	 * light, rectangle, disk, cylinder, hexagon, delta, teardrop, other, 
	 * crescent, changing, cross, changed, fireball, cigar, dome, cone, 
	 * sphere, egg, chevron, formation, triangle, round, flash, pyramid,\
	 * diamond).
	 */
	private String shape;
	/* TODO : duration type should be moved to a long type and store only 
	 * effective time in seconds (actual lower value in tsv file is 1 second)
	 */
	private String duration;
	private String description;
	
	public String getDateSeen() {
		return dateSeen;
	}

	public String getDateReported() {
		return dateReported;
	}

	public String getPlaceSeen() {
		return placeSeen;
	}

	public String getShape() {
		return shape;
	}

	public String getDuration() {
		return duration;
	}

	public String getDescription() {
		return description;
	}

	public UfoSighting(String dateSeen, String dateReported, String placeSeen, String shape, String duration, String description) {
		this.dateSeen = dateSeen;
		this.dateReported = dateReported;
		this.placeSeen = placeSeen;
		this.shape = shape;
		this.duration = duration;
		this.description = description;
	}
}
