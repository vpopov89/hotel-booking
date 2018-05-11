//= wrapped

angular
    .module("com.acme.hotelbooking")
    .service("roomService", function($http) {

    var roomApiUri = 'http://localhost:8080/room';

	this.getRooms = function(callback) {
		$http.get(roomApiUri).then(callback);
	};

	this.getCurrentlyBookedRooms = function(callback) {
		$http.get(roomApiUri + '?currentlyBooked=true').then(callback);
	};

	this.saveRoom = function(room, callback) {
		$http.post(roomApiUri, room).then(callback);
	};
});
