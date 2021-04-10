function initMap(){
    //map options and initial starting location
    var options = {
        center:  { lat: 40.7128, lng: -74.0060 },
        zoom: 12
    }

    map = new google.maps.Map(document.getElementById("map"), options);


    var directionsService = new google.map.DirecstionsService();

    var directionsDisplay = new google.maps.DirectionsRenderer();

    directionsDisplay.set(map);

var options2 = {
    types: ['(cities)']
}

var input1 = document.getElementById("from");
var autocomplete1 = new google.maps.places.Autocomplete(input1, options2);

var input2 = document.getElementById("to");
var autocomplete2 = new google.maps.places.Autocomplete(input2, options2);


}

function calcRoute(){
    var request = {
        origin: document.getElementById("from").nodeValue,
        destination: document.getElementById("to").nodeValue,
        travelMode: google.maps.TravelMode.DRIVING,
        unitSystem: google.maps.UnitSystem.IMPERIAL
    }

    directionsService.route(request, (result, status) => {
        if(status == google.maps.DirecstionsStatus.OK){
            const output = document.querySelector('#output');
            output.innerHTML = "<div class='alert-info'>From: " + 
            document.getElementById("from").value + ".<br />To: " +
            document.getElementById("to").value + ".<br /> Driving distance <i class='fas fa-road'></i> : " + 
            result.routes[0].legs[0].distance.text + ".<br />Duration <i class='fas fa-hourglass-start'></i> : " + 
            result.routes[0].legs[0].duration.text + ".</div>";

            //display route
            directionsDisplay.setDirections(result);
        }else{
            directionsDisplay.setDirections({route: []});

    
        } 
    });
}


