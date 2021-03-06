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
## August 4th, 2021
- Finished EPA Scale 
- Had issues with tables (wanted to use tables, but besides having issues with it, I wanted to include the emoji visualization so the users can clearly see values) 
- Need to wrap up Spanish compatabilities for entire app (done with most, just need to add more for remaining text) 
<img src = "https://user-images.githubusercontent.com/77937577/128262385-010df6c2-26c5-43e8-8467-001ef20a5ebe.png" width = "250" height = "500">
<img src = "https://user-images.githubusercontent.com/77937577/128262386-6b5de50f-a8f8-44a5-9fa3-9a51adcc770a.png" width = "250" height = "500">

## August 5th, 2021 
- Finished translations
- App done
- Next step: releasing and getting user feedback! 
## August 6th, 2021
- Meeting check in 
- Added EPA scale correlation to the data tables (i.e.; if AQI is 38, it says AQI: 38 - Bueno or AQI: 38 - Good) 
- Will look into app deployment steps 


## Past 2 Weeks
- Hi, it's been a while since I've done any commits/pushes to this repo
- Most of my time was working on releasing the app to the Play Store
  - Worked with keys 
  - Worked on getting the correct Android App Bundle (AAB) --> this was new starting in August 2021, so it was a bit difficult at first 
- Attended meetings 
- Did internal testing with Guilermo was the tester
  - App was working fine 
- Deployed to production
  - App finally launched! 
- RIT Summer Intern Presentation August 20th, 2021
  - Super fun to learn about what other interns worked on, and super honored to present about Aire Paraguay!
- Over 100 installations as of August 21st, 2021
- Waiting for user feedback to learn & grow
- Now looking into push notifications & custom markers 


## Past 3 Weeks 

- Taken some time off. Will be reconvening this Friday to discuss updates that need to be made for the app
- ~235 installations so far!
