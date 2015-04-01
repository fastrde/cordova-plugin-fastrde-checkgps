# phonegap-checkGPS
Plugin to Check if GPS enabled on iOS and Android

## install
```
yourAppDir$ phonegap plugin add https://github.com/fastrde/phonegap-checkGPS.git
```

## usage

```javascript
CheckGPS.check(function(){
    //GPS is enabled!

  },
  function(){
    //GPS is disabled!

  });
```
