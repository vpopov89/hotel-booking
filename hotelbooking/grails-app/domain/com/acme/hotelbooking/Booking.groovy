package com.acme.hotelbooking

class Booking {

	Date from
	Date to
	Double deposit

	static hasMany=[guests:Guest]

    static constraints = {
    	from(blank:false, nullable:false)
    	to(blank:false, nullable:false)
    }
}
