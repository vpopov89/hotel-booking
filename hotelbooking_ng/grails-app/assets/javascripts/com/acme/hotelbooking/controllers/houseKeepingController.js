//= wrapped

angular
	.module("com.acme.hotelbooking")
	.controller("HouseKeepingController", function($scope, roomService) {

	$scope.statusMessage = '';
	
	roomService.getCurrentlyBookedRooms(function(response) {
        $scope.currentlyBookedRooms = response.data;
    });

    $scope.getCurrentBookingForRoom = function(room) {
    	for (var booking of room.bookings) {
    		if (Date.parse(booking.startDate) <= Date.now() && Date.parse(booking.endDate) >= Date.now()) {
    			return booking;
    		}
    	}

    	return null;
    };

    $scope.toggleRoomStatus = function(room) {
    	if (room.status == 'dirty') {
    		room.status = 'cleaned up';
    	} else if (room.status == 'cleaned up') {
    		room.status = 'inspected';
    	} else {
    		room.status = 'dirty';
    	}
    };

    $scope.saveRooms = function() {
    	$scope.statusMessage = '';

    	$scope.currentlyBookedRooms.forEach(function(room, index, rooms) {
    		// FIXME make a bulk save through the REST
    		roomService.saveRoom(room, function(response) {
    			if (index == rooms.length - 1) {
    				$scope.statusMessage = "Succeessfully saved room statuses";
    			}
    		});
    	});
    };
});
