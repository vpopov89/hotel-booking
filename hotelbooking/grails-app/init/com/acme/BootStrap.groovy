package com.acme

import com.acme.hotelbooking.Guest
import com.acme.hotelbooking.Room
import com.acme.hotelbooking.Booking

class BootStrap {

	def init = { servletContext ->

	    Guest guest1 = new Guest(name: 'test_guest_1')
	    if (!guest1.save()){
	        log.error "Could not save guest!!"
	    }
	    Guest guest2 = new Guest(name: 'test_guest_2')
	    guest2.save()
	    Guest guest3 = new Guest(name: 'test_guest_3')
	    guest3.save()
	    
	    Room room1 = new Room(name: 'test_room_1', status: 'dirty')
	    room1.save()

	    Booking booking1 = new Booking(
	    	startDate: new Date().parse('yyyy/MM/dd', '2018/05/09'), 
	    	endDate: new Date().parse('yyyy/MM/dd', '2018/05/12'), 
	    	deposit: 105.0,
	    	room: room1).addToGuests(guest1).addToGuests(guest2)
	    booking1.save()
	}

    def destroy = {
    }
}
