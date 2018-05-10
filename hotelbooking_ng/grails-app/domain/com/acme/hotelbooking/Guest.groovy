package com.acme.hotelbooking

class Guest {

	String firstName
	String lastName
	String phoneNumber

	static hasMany=[booking: Booking]

    static constraints = {
    	
    }
}
