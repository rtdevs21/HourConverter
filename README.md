# HourConverter
24 Hour to 12 Hour Converter build by RTDev


For add this library in your android Project Please follow simple way from below:

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}


Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.rtdevs21:HourConverter:1.0.+'
	}


Leatest Version:
[![](https://jitpack.io/v/rtdevs21/HourConverter.svg)](https://jitpack.io/#rtdevs21/HourConverter)


Init your Hour Converter

       HourConvert hourConvert = new HourConvert();

        //if need with am or pm
       String time = hourConvert.ConvertTo("16:17",true);
       
       //if don't need am or pm format
       String time = hourConvert.ConvertTo("23:22",false);

Note:
```ruby
 If you got any error please comment here
 ```


