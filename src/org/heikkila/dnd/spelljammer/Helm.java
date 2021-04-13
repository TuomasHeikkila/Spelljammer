package org.heikkila.dnd.spelljammer;

public class Helm {
	private HelmTypes type;

	public HelmTypes getType() {
		return type;
	}

	public void setType(HelmTypes type) {
		this.type = type;
	}

	public double getHelmTypeModifier() {
		if (this.getType() == HelmTypes.MINOR) {
			return 0.333;
		} else {
			return 0.5;
		}
	}
	
}

