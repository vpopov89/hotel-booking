//= wrapped

angular
	.module("com.acme.hotelbooking")
	.controller("ManageBookingsController", function($scope, $timeout, $mdSidenav, bookingService, roomService) {

	$scope.statusMessage = '';
	
    bookingService.getBookings(function(response) {
        $scope.bookings = response.data;
    });

    $scope.showEditBookingSidenav = function(booking) {
        if ($scope.selectedBooking != null && booking != $scope.selectedBooking) {
            $scope.selectedBooking = booking;
        } else {

            $mdSidenav("edit-booking-sidenav").toggle().then(function () {});
            if ($mdSidenav("edit-booking-sidenav").isOpen()) {
                $scope.selectedBooking = booking;
            } else {
                $scope.selectedBooking = null;
            }
        }
    };

    $scope.isOpenEditBookingSidenav = function() {
      return $mdSidenav("edit-booking-sidenav").isOpen();
    };

    $scope.bookingSaved = function(booking) {
        $mdSidenav("edit-booking-sidenav").toggle().then(function () {});
        $scope.selectedBooking = null;
    };

    $scope.bookingCanceled = function() {
        $scope.bookings.forEach(function(booking, index, bookings) {
            if (booking.id == $scope.selectedBooking.id) {
                bookings.splice(index, 1);
            }
        });
        $mdSidenav("edit-booking-sidenav").toggle().then(function () {});
        $scope.selectedBooking = null;
    };
});
