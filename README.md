# UberClone
this app is working similar to uber app
when you open yur app it will ask for registration and login
if you are old user just log in if new user then create account  using  mobile nummber number (facebook or gmail in extension i ll add)
then select your pic up and drop location and start ride.
acctully i  m using firebase and Google API to handel all the thing  like login register i m using firebase and for search place ,distance,time to cover those distance i m using Gooogle API link s below for pament i m using paypal payment layout
important links

<pre>
FIrebase:https://firebase.google.com/docs/android/setup/
geofire: https://firebaseopensource.com/projects/firebase/geofire-java/
Place Autocomplete: https://developers.google.com/places/android-api/autocomplete
goolge map api:https://console.cloud.google.com/apis/library?project=calm-edge-240219&pli=1

</pre>
<pre>
<b>Implementation Guide</b>
1 - Project 1 - Open the Project in your android studio;
2 - !!!!IMPORTANT!!!! Change the Package Name.

2 - Firebase Panel 1 - Create Firebase Project (https://console.firebase.google.com/); 
2 - import the file google-service.json into your project as the instructions say;
3 - Change Pay Plan to either Flame or Blaze; 4 - Go to Firebase -> Registration and activate Login/Registrtion with email 5 - Go to Firebase -> storage and activate it;

3 - google maps 1 - Add your project to the google API console (https://console.cloud.google.com/apis?pli=1) 
2 - Activate google Maps API
3 - Activate google Places API 4 - Add google maps API key to the res/values/Strings.xml file in the string google_maps_key

4 - PayPal 1 - Install Node.js.
2 - go to paypal developer and create an app;
3 - enable payouts in the app you've just created;
4 - Add the paypal credentials to the node.js project;
5 - Set the fee in your index.js file to the percentage that you want 
6 - deploy the project; 
7 - Go to the android studio -> java -> your package name -> PayPalConfig: a) add the PAYPAL_CLIENT_ID which you get from the paypal developer control Panel; b) add the PAYPAL_PAYOUT_URL which you get in the firebase control panel -> functions and the url that you want is the payouts;
</pre>
