package ufo.service;

import ufo.dto.UfoSighting;

import java.util.List;

public interface UfoSightingService {


    /**
     * Returns all the sightings in the tsv file.
     * 
     */
    List<UfoSighting> getAllSightings();

    /**
     * Search for sightings happened in the specified year and month;
     *
     * @param yearSeen  The year when the sighting happened
     * @param monthSeen The month when the sightings happened
     * 
     * TODO : I suggest to incapsulate input parameter in a specific Object and
     *        pass it as input of this method and output object should be 
     *        incapsulated in a specific Object. In this way, if in future we 
     *        want to extend actual I/O (e.g. search for other fields, or 
     *        introducing pagination...) it wouldn't impact this service cotract. 
     */
    List<UfoSighting> search(int yearSeen, int monthSeen);


}
