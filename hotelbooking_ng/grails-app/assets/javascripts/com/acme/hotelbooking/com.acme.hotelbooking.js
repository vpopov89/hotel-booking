//= wrapped
//= require /angular/angular 
//= require /angular/angular-material
//= require /angular/angular-route
//= require /angular-animate/angular-animate
//= require /angular-aria/angular-aria
//= require_self
//= require_tree services
//= require_tree controllers
//= require_tree directives
//= require_tree domain
//= require_tree templates

var app = angular.module("com.acme.hotelbooking", ['ngRoute', 'ngMaterial']);
app.config(function($routeProvider) {
	$routeProvider
	.when("/newBooking", { templateUrl: "/com/acme/hotelbooking/newBooking.html", controller: "NewBookingController" })
	.when("/manageBookings", { templateUrl: "/com/acme/hotelbooking/manageBookings.html", controller: "ManageBookingsController" })
	.when("/houseKeeping", { templateUrl: "/com/acme/hotelbooking/houseKeeping.html", controller: "HouseKeepingController" });
});
