angular.module('com.acme.hotelbooking')
	.directive('bookingForm', function() {
	return {
		templateUrl: '/com/acme/hotelbooking/bookingForm.html',
		controller: 'BookingFormController',
		replace: true,
		scope: {
			booking: '=',
			mode: '@',
			onSaveBooking: '&',
			onCancelBooking: '&'
		}
	}
});
