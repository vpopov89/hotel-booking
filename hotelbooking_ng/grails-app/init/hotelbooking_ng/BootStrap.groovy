package hotelbooking_ng

import com.acme.hotelbooking.Guest
import com.acme.hotelbooking.Room
import com.acme.hotelbooking.Booking

class BootStrap {

	def init = { servletContext ->

		def guests = [
			new Guest(firstName: 'John', lastName: 'Johnson', phoneNumber: '+359886123456'),
			new Guest(firstName: 'John', lastName: 'Travolta', phoneNumber: '0887890123'),
			new Guest(firstName: 'Arnold', lastName: 'Schwarzenegger', phoneNumber: '0888901234'),
			new Guest(firstName: 'Sylvester', lastName: 'Stallone', phoneNumber: '0888901235')
		]
		guests.each { guest -> guest.save() }
	    
	    def rooms = [
	    	new Room(name: '10', status: 'dirty'), 
	    	new Room(name: '11', status: 'dirty'),
	    	new Room(name: '12', status: 'dirty'),
	    	new Room(name: '13', status: 'dirty'),
	    	new Room(name: '14', status: 'dirty'),
	    	new Room(name: '20', status: 'dirty'),
	    	new Room(name: '21', status: 'dirty'),
	    	new Room(name: '22', status: 'dirty'),
	    	new Room(name: '23', status: 'dirty'),
	    	new Room(name: '24', status: 'dirty')
	    ]
	    rooms.each { room -> room.save() }

	    def bookings = [
	    	new Booking(
	    	startDate: new Date().parse('yyyy/MM/dd', '2018/05/09'), 
	    	endDate: new Date().parse('yyyy/MM/dd', '2018/05/12'), 
	    	deposit: 1.0,
	    	room: rooms[0]).addToGuests(guests[0]).addToGuests(guests[1]),
	    	new Booking(
	    	startDate: new Date().parse('yyyy/MM/dd', '2018/05/13'), 
	    	endDate: new Date().parse('yyyy/MM/dd', '2018/05/15'), 
	    	deposit: 2.0,
	    	room: rooms[0]).addToGuests(guests[0]).addToGuests(guests[1]),
	    	new Booking(
	    	startDate: new Date().parse('yyyy/MM/dd', '2018/05/11'), 
	    	endDate: new Date().parse('yyyy/MM/dd', '2018/05/12'), 
	    	deposit: 3.0,
	    	room: rooms[1]).addToGuests(guests[0]).addToGuests(guests[1]),
	    	new Booking(
	    	startDate: new Date().parse('yyyy/MM/dd', '2018/05/13'), 
	    	endDate: new Date().parse('yyyy/MM/dd', '2018/05/15'), 
	    	deposit: 4.0,
	    	room: rooms[1]).addToGuests(guests[0]).addToGuests(guests[1]),
	    	new Booking(
	    	startDate: new Date().parse('yyyy/MM/dd', '2018/05/08'), 
	    	endDate: new Date().parse('yyyy/MM/dd', '2018/05/11'), 
	    	deposit: 5.0,
	    	room: rooms[2]).addToGuests(guests[0]).addToGuests(guests[1]),
	    	new Booking(
	    	startDate: new Date().parse('yyyy/MM/dd', '2018/05/12'), 
	    	endDate: new Date().parse('yyyy/MM/dd', '2018/05/16'), 
	    	deposit: 6.0,
	    	room: rooms[2]).addToGuests(guests[0]).addToGuests(guests[1]),
	    	new Booking(
	    	startDate: new Date().parse('yyyy/MM/dd', '2018/05/09'), 
	    	endDate: new Date().parse('yyyy/MM/dd', '2018/05/12'), 
	    	deposit: 7.0,
	    	room: rooms[3]).addToGuests(guests[0]).addToGuests(guests[1]),
	    	new Booking(
	    	startDate: new Date().parse('yyyy/MM/dd', '2018/05/09'), 
	    	endDate: new Date().parse('yyyy/MM/dd', '2018/05/12'), 
	    	deposit: 8.0,
	    	room: rooms[4]).addToGuests(guests[0]).addToGuests(guests[1]),
	    	new Booking(
	    	startDate: new Date().parse('yyyy/MM/dd', '2018/05/09'), 
	    	endDate: new Date().parse('yyyy/MM/dd', '2018/05/12'), 
	    	deposit: 9.0,
	    	room: rooms[5]).addToGuests(guests[0]).addToGuests(guests[1]),
	    	new Booking(
	    	startDate: new Date().parse('yyyy/MM/dd', '2018/05/09'), 
	    	endDate: new Date().parse('yyyy/MM/dd', '2018/05/12'), 
	    	deposit: 10.0,
	    	room: rooms[6]).addToGuests(guests[0]).addToGuests(guests[1])
	    ]
	    bookings.each { booking -> booking.save() }
	}

    def destroy = {
    }
}
