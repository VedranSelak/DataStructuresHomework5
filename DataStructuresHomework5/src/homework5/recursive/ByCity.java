package homework5.recursive;

import java.util.Comparator;

import homework5.IPAddress;

public class ByCity implements Comparator<IPAddress>{

	public int compare(IPAddress v, IPAddress w) {
		return v.cityName.compareTo(w.cityName);
	}


}
