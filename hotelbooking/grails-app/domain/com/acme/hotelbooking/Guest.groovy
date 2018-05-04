package com.acme.hotelbooking

class Guest {

	String name

	static hasMany=[booking:Booking]

    static constraints = {
    	name(nullable:false)
    }
}
