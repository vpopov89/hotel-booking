//= wrapped

angular
    .module("com.acme.hotelbooking")
    .service("guestService", function($http) {

    var guestApiUri = 'http://localhost:8080/guest';

	this.getGuests = function(callback) {
		$http.get(guestApiUri).then(callback);
	};

	this.saveGuest = function(guest, callback) {
		$http.post(guestApiUri, guest).then(callback);
	};
});
