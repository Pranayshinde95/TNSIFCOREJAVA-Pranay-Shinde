package com.basics4MultipleInheritance;

public class City extends State {
	
	private String CityName;
	private String area;
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "City [CityName=" + CityName + ", area=" + area + ", getCityName()=" + getCityName() + ", getArea()="
				+ getArea() + ", getStateName()=" + getStateName() + ", getLanguage()=" + getLanguage()
				+ ", toString()=" + super.toString() + ", getCountryName()=" + getCountryName() + ", getCapital()="
				+ getCapital() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
