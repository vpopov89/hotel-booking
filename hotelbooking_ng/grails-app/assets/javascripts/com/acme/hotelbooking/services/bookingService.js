//= wrapped

angular
    .module("com.acme.hotelbooking")
    .service("bookingService", function($http) {

    var bookingApiUri = "http://localhost:8080/booking";

    this.getBookings = function(callback) {
		$http.get(bookingApiUri).then(callback);
	};

	this.saveBooking = function(booking, callback) {
		$http.post(bookingApiUri, booking).then(callback);
	};

	this.deleteBooking = function(bookingId, callback) {
		$http.delete(bookingApiUri + "/" + bookingId).then(callback);
	};
});
