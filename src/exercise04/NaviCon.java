package exercise04;

/***** AUFGABE FERTIG BEARBEITET *****/

public class NaviCon implements NaviConInterface {

	private GeoLocationManager modul;
	
	@Override
	public void setGeoLocationManager(GeoLocationManager geoManager) {
		
		modul = geoManager;

	}

	@Override
	public Point getCurrentPosition() throws Exception {
		try {
			return modul.currentLocation().moved(1, -1);
		} 
		catch (IllegalAccessException e) {
			return getCurrentPosition();
		}
		catch (NullPointerException e)
		{
			throw new NullPointerException("NoGeoManager");
		}
	}

}
