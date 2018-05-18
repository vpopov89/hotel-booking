//= wrapped

angular.module("com.acme.hotelbooking").controller("BookingFormController", function($scope, guestService, roomService, bookingService) {
    $scope.$watch('booking', function(booking) {
        
    });

    // FIXME probably should be in rooms controller
    roomService.getRooms(function(response) {
        $scope.rooms = response.data;
    });

    // FIXME probably should be in guests controller
    guestService.getGuests(function(response) {
        $scope.guests = response.data;
    });

    $scope.removeGuestFromBooking = function(guestIndex) {
        $scope.booking.guests.splice(guestIndex, 1);
    };

    // FIXME probably should be in guests controller
    $scope.saveNewGuest = function() {
        guestService.saveGuest($scope.newGuest, function(response) {
            $scope.booking.guests.push(response.data);
            $scope.newGuest = null;
        });
    };

    // FIXME probably should be in guests controller
    $scope.searchGuests = function(searchText) {
        return $scope.guests;
    };

    $scope.addExistingGuestFromSearch = function(selectedItem) {
        // check if already added
        if ($scope.booking.guests.indexOf(selectedItem) == -1) {
            $scope.booking.guests.push(selectedItem);
        } else {
            alert("This guest has been already added to the booking!");
        }
    };

    $scope.saveBooking = function() {
        $scope.statusMessage = '';

        bookingService.saveBooking($scope.booking, function(response) {
            $scope.statusMessage = "Succeessfully saved booking";
            $scope.booking = {
                guests: []
            };
            $scope.onSaveBooking(response.data);
        });
    };

    $scope.cancelBooking = function() {
        $scope.statusMessage = '';

        bookingService.deleteBooking($scope.booking.id, function(response) {
            $scope.statusMessage = "Succeessfully canceled booking";
            $scope.booking = {
                guests: []
            };
            $scope.onCancelBooking();
        });
    };
});
