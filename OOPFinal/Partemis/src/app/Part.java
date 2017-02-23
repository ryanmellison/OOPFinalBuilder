package app;

import interfaces.Component;

public class Part implements Component{
	
	private int powerDraw;
	private float performance;
	private int price;
	private float priceRating;
	
	
	public int getPowerDraw() {
		return powerDraw;
	}
	public void setPowerDraw(int powerDraw) {
		this.powerDraw = powerDraw;
	}
	public float getPerformance() {
		return performance;
	}
	public void setPerformance(float performance) {
		this.performance = performance;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getPriceRating() {
		return priceRating;
	}
	public void setPriceRating(float priceRating) {
		this.priceRating = priceRating;
	}
	@Override
	public void install() {
		
	}
	@Override
	public void uninstall() {
		
	}
	
}
