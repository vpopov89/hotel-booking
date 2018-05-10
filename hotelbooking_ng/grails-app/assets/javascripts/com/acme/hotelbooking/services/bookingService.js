//= wrapped

angular
    .module("com.acme.hotelbooking")
    .service("bookingService", function($http) {

    var bookingApiUri = 'http://localhost:8080/booking';

	this.saveBooking = function(booking, callback) {
		$http.post(bookingApiUri, booking).then(callback);
	};
});
