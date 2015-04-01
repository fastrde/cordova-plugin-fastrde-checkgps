exports.check=function(success, error, options){
        console.log("check");
		options = options || {};
		options.alert = false || options.alert;
		cordova.exec(success, error, "CheckGPS", "check", [options.alert]);
};
