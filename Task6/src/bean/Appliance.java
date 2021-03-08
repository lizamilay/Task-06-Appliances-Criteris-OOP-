package bean;

public class Appliance {
	String data;

	public Appliance() {
		
	}

	public Appliance(String parameters) {
		this.data = parameters;
	}

	public String getParameters() {
		return data;
	}

	public void setParameters(String parameters) {
		this.data = parameters;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Appliance other = (Appliance) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Appliance [data =" + data + "]";
	}
	
	
	
	
}
