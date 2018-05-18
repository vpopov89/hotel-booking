//= wrapped

angular
	.module("com.acme.hotelbooking")
	.controller("NewBookingController", function($scope, guestService, roomService, bookingService) {

    $scope.statusMessage = '';
    
	$scope.booking = {
		guests: [],
	}

    bookingService.getBookings(function(response) {
        $scope.bookings = response.data;
    });

    $scope.bookingSaved = function(booking) {
    	$scope.bookings.push(booking);
    };
});
