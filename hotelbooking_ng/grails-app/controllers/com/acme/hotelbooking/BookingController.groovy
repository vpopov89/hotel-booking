package com.acme.hotelbooking

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class BookingController {

    BookingService bookingService

    static responseFormats = ['json', 'xml']
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index() {
        respond bookingService.list(), model:[bookingCount: bookingService.count()]
    }

    def show(Long id) {
        respond bookingService.get(id)
    }

    def save(Booking booking) {
        if (booking == null) {
            render status: NOT_FOUND
            return
        }

        try {
            bookingService.save(booking)
        } catch (ValidationException e) {
            respond booking.errors, view:'create'
            return
        }

        respond booking, [status: CREATED, view:"show"]
    }

    def update(Booking booking) {
        if (booking == null) {
            render status: NOT_FOUND
            return
        }

        try {
            bookingService.save(booking)
        } catch (ValidationException e) {
            respond booking.errors, view:'edit'
            return
        }

        respond booking, [status: OK, view:"show"]
    }

    def delete(Long id) {
        if (id == null) {
            render status: NOT_FOUND
            return
        }

        bookingService.delete(id)

        render status: NO_CONTENT
    }
}
