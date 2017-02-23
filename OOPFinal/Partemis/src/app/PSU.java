package app;

import interfaces.Component;

public class PSU extends Part implements Component{
	
	private int powerCapacity;
	
	public PSU(int powerCapacity){
		this.powerCapacity = powerCapacity;
	}
	
	public int getPowerCapacity() {
		return powerCapacity;
	}

	public void setPowerCapacity(int powerCapacity) {
		this.powerCapacity = powerCapacity;
	}

	@Override
	public String toString(){
		return "";
	}
}
