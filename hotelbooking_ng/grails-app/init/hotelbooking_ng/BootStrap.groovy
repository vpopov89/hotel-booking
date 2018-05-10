package hotelbooking_ng

import com.acme.hotelbooking.Guest
import com.acme.hotelbooking.Room
import com.acme.hotelbooking.Booking

class BootStrap {

	def init = { servletContext ->

	    Guest guest1 = new Guest(firstName: 'test_fn1', lastName: 'test_ln1', phoneNumber: '0886123456')
	    guest1.save()
	    Guest guest2 = new Guest(firstName: 'test_fn2', lastName: 'test_ln2', phoneNumber: '0887890123')
	    guest2.save()
	    Guest guest3 = new Guest(firstName: 'test_fn3', lastName: 'test_ln3', phoneNumber: '0888901234')
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
