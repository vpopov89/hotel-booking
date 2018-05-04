package com.acme.hotelbooking

class Booking {

	Date startDate
	Date endDate
	Double deposit

	static belongsTo = Guest
	static hasMany = [guests:Guest]

    static constraints = {
    	from(blank:false, nullable:false)
    	to(blank:false, nullable:false)
    }
}
