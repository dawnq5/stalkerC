package com.d.stalker.bean;

import com.baidu.location.BDLocation;

public class Location {

	private String addrStr;
	private String addUrl;
	private Double altitude;
	private String city;
	private String cityCode;
	private String coorType;
	private float direction;
	private String district;
	private String floor;
	private double latitude;
	private int locType;
	private double longitude;
	private String networkLocationType;
	private int operators;
	private String province;
	private float radius;
	private int satelliteNumber;
	private float speed;
	private String street;
	private String streetNumber;
	private String time;
	
	public static Location toLocation(BDLocation bdloc){
		Location loc=new Location();
		loc.setAddrStr(bdloc.getAddrStr());
		loc.setAltitude(bdloc.getAltitude());
		loc.setCity(bdloc.getCity());
		loc.setCityCode(bdloc.getCityCode());
		loc.setCoorType(bdloc.getCoorType());
		loc.setDirection(bdloc.getDirection());
		loc.setDistrict(bdloc.getDistrict());
		loc.setFloor(bdloc.getFloor());
		loc.setLatitude(bdloc.getLatitude());
		loc.setLocType(bdloc.getLocType());
		loc.setLongitude(bdloc.getLongitude());
		loc.setNetworkLocationType(bdloc.getNetworkLocationType());
		loc.setOperators(bdloc.getOperators());
		loc.setProvince(bdloc.getProvince());
		loc.setRadius(bdloc.getRadius());
		loc.setSatelliteNumber(bdloc.getSatelliteNumber());
		loc.setSpeed(bdloc.getSpeed());
		loc.setStreet(bdloc.getStreet());
		loc.setStreetNumber(bdloc.getStreetNumber());
		loc.setTime(bdloc.getTime());
		
		
		return loc;
		
		
	}
	
	
	public String getAddrStr() {
		return addrStr;
	}
	public void setAddrStr(String addrStr) {
		this.addrStr = addrStr;
	}
	public String getAddUrl() {
		return addUrl;
	}
	public void setAddUrl(String addUrl) {
		this.addUrl = addUrl;
	}
	public Double getAltitude() {
		return altitude;
	}
	public void setAltitude(Double altitude) {
		this.altitude = altitude;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCoorType() {
		return coorType;
	}
	public void setCoorType(String coorType) {
		this.coorType = coorType;
	}
	public float getDirection() {
		return direction;
	}
	public void setDirection(float direction) {
		this.direction = direction;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public int getLocType() {
		return locType;
	}
	public void setLocType(int locType) {
		this.locType = locType;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getNetworkLocationType() {
		return networkLocationType;
	}
	public void setNetworkLocationType(String networkLocationType) {
		this.networkLocationType = networkLocationType;
	}
	public int getOperators() {
		return operators;
	}
	public void setOperators(int operators) {
		this.operators = operators;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public int getSatelliteNumber() {
		return satelliteNumber;
	}
	public void setSatelliteNumber(int satelliteNumber) {
		this.satelliteNumber = satelliteNumber;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
}
