package app;

import java.io.File;

public class System {
	
	private float performance;
	private int powerDraw;
	private Part CPU;
	private Part GPU;
	private Part PSU;
	private Part moBo;
	private Part drive;
	private Part RAM;
	private Part tower;
	private boolean isComplete;
	
	public System(){
		
	}
	
	public System(File file){
		
	}
	
	public boolean verify(){
		return false;
	}
	
	public void toFile(){
		
	}

	public Part getCPU() {
		return CPU;
	}

	public void setCPU(Part cPU) {
		CPU = cPU;
	}

	public Part getGPU() {
		return GPU;
	}

	public void setGPU(Part gPU) {
		GPU = gPU;
	}

	public Part getPSU() {
		return PSU;
	}

	public void setPSU(Part pSU) {
		PSU = pSU;
	}

	public Part getMoBo() {
		return moBo;
	}

	public void setMoBo(Part moBo) {
		this.moBo = moBo;
	}

	public Part getDrive() {
		return drive;
	}

	public void setDrive(Part drive) {
		this.drive = drive;
	}

	public Part getRAM() {
		return RAM;
	}

	public void setRAM(Part rAM) {
		RAM = rAM;
	}

	public Part getTower() {
		return tower;
	}

	public void setTower(Part tower) {
		this.tower = tower;
	}

	public boolean isComplete() {
		return isComplete;
	}

	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
}
