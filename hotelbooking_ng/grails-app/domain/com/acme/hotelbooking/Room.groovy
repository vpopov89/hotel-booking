package com.acme.hotelbooking

class Room {

	String name
	// FIXME make this an enumeration
	String status

	static hasMany=[bookings: Booking]

    static constraints = {
    	name(nullable: false, unique: true)
    }
}
