package edu.workingsystem.marta;

public class Stop {
	public Integer stopId;
	public String stopName;
	public Integer numberOfPassengers;
	public Double lat;
	public Double longi;
	
	public Integer getStopId() {
		return stopId;
	}
	public void setStopId(Integer stopId) {
		this.stopId = stopId;
	}
	public String getStopName() {
		return stopName;
	}
	public void setStopName(String stopName) {
		this.stopName = stopName;
	}
	public Integer getNumberOfPassengers() {
		return numberOfPassengers;
	}
	public void setNumberOfPassengers(Integer numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLongi() {
		return longi;
	}
	public void setLongi(Double longi) {
		this.longi = longi;
	}
	public Stop(Integer stopId, String stopName, Integer numberOfPassengers, Double lat, Double longi) {
		super();
		this.stopId = stopId;
		this.stopName = stopName;
		this.numberOfPassengers = numberOfPassengers;
		this.lat = lat;
		this.longi = longi;
	}

	public Double findDistance(Stop destination) {
		double distanceBetweenStops=Double.valueOf(
				70.0D * Math.sqrt(Math.pow(this.lat.doubleValue() - destination.getLat().doubleValue(), 2.0D)
						+ Math.pow(this.longi.doubleValue() - destination.getLongi().doubleValue(), 2.0D)));
		return distanceBetweenStops;
	}
	
}
