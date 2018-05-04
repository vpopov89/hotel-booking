package com.acme.hotelbooking

class Booking {

	Date startDate
	Date endDate
	Double deposit

	static belongsTo = Guest
	static hasMany = [guests: Guest]
	static hasOne = [room: Room]

    static constraints = {
    	startDate(blank: false, nullable: false)
    	endDate(blank: false, nullable: false)
    }
}
