package de.fastr.phonegap.plugins;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaResourceApi;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * thx to http://stackoverflow.com/questions/843675/how-do-i-find-out-if-the-gps-of-an-android-device-is-enabled
 */
public class CheckGPS extends CordovaPlugin{
	@override
	public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
		if (action.quals("check")){
			this.check();
		}	
	}

	private boolean check(CallbackContext callbackContext){
    final LocationManager manager = (LocationManager) getSystemService( Context.LOCATION_SERVICE );
    if ( manager.isProviderEnabled( LocationManager.GPS_PROVIDER ) ) {
			callbackContext.success();
    }else{
			callbackContext.error();
		}
  }
}
