//= wrapped

angular
    .module("com.acme.hotelbooking")
    .service("roomService", function($http) {

    var roomApiUri = 'http://localhost:8080/room';

	this.getRooms = function(callback) {
		$http.get(roomApiUri).then(callback)
	};
});
