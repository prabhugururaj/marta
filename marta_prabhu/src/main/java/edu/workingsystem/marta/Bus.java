package edu.workingsystem.marta;

public class Bus {
	
	public Integer busId;
	public Integer routeId;
	public Integer currentLocation;
	public Integer nextLocation;
	public Integer currentPassengerCount;
	public Integer maxPassengerCount;
	public Integer speed;
	public Integer currentLatLong;
	public Integer nextLatLong;
	public Integer arrivalTime;
	public Integer fuelCapacity;
	public Integer currentFuel;
	


	public Bus(Integer busId, Integer routeId, Integer currentLocation, Integer currentPassengerCount,
			Integer maxPassengerCount, Integer speed, Integer currentLatLong, Integer nextLatLong,
			Integer arrivalTime) {
		super();
		this.busId = busId;
		this.routeId = routeId;
		this.currentLocation = currentLocation;
		this.currentPassengerCount = currentPassengerCount;
		this.maxPassengerCount = maxPassengerCount;
		this.speed = speed;
		this.currentLatLong = currentLatLong;
		this.nextLatLong = nextLatLong;
		this.arrivalTime = arrivalTime;
	}
	
	public Bus() {}

	public Integer getBusId() {
		return busId;
	}
	public void setBusId(Integer busId) {
		this.busId = busId;
	}
	public Integer getRouteId() {
		return routeId;
	}
	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
	}
	public Integer getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(Integer currentLocation) {
		this.currentLocation = currentLocation;
	}
	public Integer getCurrentPassengerCount() {
		return currentPassengerCount;
	}
	public void setCurrentPassengerCount(Integer currentPassengerCount) {
		this.currentPassengerCount = currentPassengerCount;
	}
	public Integer getMaxPassengerCount() {
		return maxPassengerCount;
	}
	public void setMaxPassengerCount(Integer maxPassengerCount) {
		this.maxPassengerCount = maxPassengerCount;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	public Integer getCurrentLatLong() {
		return currentLatLong;
	}
	public void setCurrentLatLong(Integer currentLatLong) {
		this.currentLatLong = currentLatLong;
	}
	public Integer getNextLatLong() {
		return nextLatLong;
	}
	public void setNextLatLong(Integer nextLatLong) {
		this.nextLatLong = nextLatLong;
	}
	public Integer getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Integer arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public Integer getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(Integer fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public Integer getCurrentFuel() {
		return currentFuel;
	}

	public void setCurrentFuel(Integer currentFuel) {
		this.currentFuel = currentFuel;
	}
	
	public boolean equals(Object object)
	{
		boolean result = false;
		if ((object == null) || (object.getClass() != getClass())) {
			result = false;
		} else {
			Bus bus = (Bus) object;
			if (this.busId.equals(bus.busId)) {
				result = true;
			}
		}
		return result;
	}

}
