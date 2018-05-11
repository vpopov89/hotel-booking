package com.acme.hotelbooking

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class RoomController {

    RoomService roomService
    BookingService bookingService

    static responseFormats = ['json', 'xml']
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index() {
        if (params.currentlyBooked || params.currentlyBooked == '') {
            def todayDate = new Date()
            // FIXME move this to the BookingService
            def bookings = Booking.findAllByStartDateLessThanEqualsAndEndDateGreaterThanEquals(todayDate, todayDate)
            def currentlyBookedRooms = bookings.collect { booking -> booking.room }
            respond currentlyBookedRooms, model:[roomCount: roomService.count()]
        } else {
            respond roomService.list(), model:[roomCount: roomService.count()]
        }
    }

    def show(Long id) {
        respond roomService.get(id)
    }

    def save(Room room) {
        if (room == null) {
            render status: NOT_FOUND
            return
        }

        try {
            roomService.save(room)
        } catch (ValidationException e) {
            respond room.errors, view:'create'
            return
        }

        respond room, [status: CREATED, view:"show"]
    }

    def update(Room room) {
        if (room == null) {
            render status: NOT_FOUND
            return
        }

        try {
            roomService.save(room)
        } catch (ValidationException e) {
            respond room.errors, view:'edit'
            return
        }

        respond room, [status: OK, view:"show"]
    }

    def delete(Long id) {
        if (id == null) {
            render status: NOT_FOUND
            return
        }

        roomService.delete(id)

        render status: NO_CONTENT
    }
}
