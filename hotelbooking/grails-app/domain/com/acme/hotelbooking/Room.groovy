package com.acme.hotelbooking

class Room {

	String name
	String status

	static hasMany=[bookings:Booking]

    static constraints = {
    	name(nullable:false)
    }
}
