angular.module('com.acme.hotelbooking')
	.directive('newBooking', function() {
	return {
		templateUrl: '/com/acme/hotelbooking/newBooking.html',
		controller: 'NewBookingController',
		replace: true
	}
});
