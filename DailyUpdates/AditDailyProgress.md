# Daily Notes 

## July 8th, 2021
- Attended kick-start meeting with Dr. Kerekes and Mr. Pallarolas 
- Created a splash screen for the app
- Created a navigation bar for users to use when going to different sections of the app
- Obtained API data that is needed for the core functions of the app (location, sensor code, aqi value, date, color, text, latitude, longitude)  
## July 9th, 2021
- Looked into Google Maps API for map implementation
## July 10th, 2021
- Completed home page (introduction to what AireParaguay is and an introduction to the sensor process) 
- Added hyperlinks 
## July 11th, 2021
- Added RecyclerView for the EPAScale section of the app 
- Implemented correct RGB Color Values to match the EPA's
## July 12th, 2021
- Created new intents for each item in the RecyclerView (EPA Scale RV) 
- Added descriptions of who should be concerned, as well as plan of action for individuals
- Adding emoji images to coordinate with the sensor data that I will be working on later
## July 13th, 2021
- Edited EPA Scale
- Fixed Splash Screen
- Looking into Custom ArrayAdapter integration for displaying sensor data 
## July 15th, 2021 
- Check in meeting 
- Looked into changing language for the entire app through Android Studio itself 
## July 19th, 2021
- Finished RecyclerView that contains sensor data 
- Added background colors to match the sensors AQI value 
- Scrolling compatability 
<img src = "https://user-images.githubusercontent.com/77937577/126188834-45fac125-bbe9-4bb8-a15f-9dc5342a3b4e.png" width = "250" height = "500">

## July 21, 2021
- Read more documentation on maps and markers (looking specifically into the development of custom markers for the sensor data on the map) 
- Links
  - https://developers.google.com/maps/documentation/android-sdk/start
  - https://developers.google.com/maps/documentation/android-sdk/map-with-marker
## July 22, 2021
- Added basic map to the app 
- Added marker (tested with capital of Paraguay) 
  - Update: added markers for all sensors, however, done non-progmatically. 
    - Tried to do it progmatically, but was getting a null value for each of the API elments where I created the new marker
    - Will look into doing it progmatically for increased efficiency/better practice (will also help if future sensors are added)
  - Markers display region name when clicked on (looking into possibly adding the AQI value 
<img src = "https://user-images.githubusercontent.com/77937577/126712341-f4534f75-39ec-492f-a97f-5ae451edf574.png" width = "250" height = "500">

## July 23, 2021
- Changed marker code so it was done through programmatically instead of manually entering region names and coordinates 
  - Will help when future sensors are added (no need to go back and add anything to code; it will work with the API to add it manually) 
- Looked into changing color of the markers (this works)
- Researched into color changes of markers, and continuing to look around custom marker development 
## July 27, 2021
- Check-in meeting 
  - Rearrange Icons: Map, Data, Scale, More Info 
  - Custom Markers 
  - More Color for Sensor Data
  - Make chart more user friendly/appealing (Spanish + English) 
  - Research publication process
- Rearranged Icons
- Added outline for Data Table to make it more clear and impactful  
## July 28th, 2021 
- Looked further into the language barrier issue 
- Was able to get some basic changes from Spanish to English 
  - If user system is in Spanish, a few texts will be changed to the Spanish version (only for a few so far, but basic testing is occuring at the moment)
  - Should be able to have a solution for both Spanish and English compatabilities with more time (should be good before beta release) 
## August 2nd, 2021
- Created About Me Page 
- Worked with basic tables for EPA chart 
- Looked into stages of releasing app for beta 
