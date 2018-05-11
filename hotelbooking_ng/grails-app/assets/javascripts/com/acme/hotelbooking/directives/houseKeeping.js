angular.module('com.acme.hotelbooking')
	.directive('houseKeeping', function() {
	return {
		templateUrl: '/com/acme/hotelbooking/houseKeeping.html',
		controller: 'HouseKeepingController',
		replace: true
	}
});
