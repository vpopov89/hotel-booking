package com.acme.hotelbooking

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class GuestController {

    GuestService guestService

    static responseFormats = ['json', 'xml']
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond guestService.list(params), model:[guestCount: guestService.count()]
    }

    def show(Long id) {
        respond guestService.get(id)
    }

    def save(Guest guest) {
        if (guest == null) {
            render status: NOT_FOUND
            return
        }

        try {
            guestService.save(guest)
        } catch (ValidationException e) {
            respond guest.errors, view:'create'
            return
        }

        respond guest, [status: CREATED, view:"show"]
    }

    def update(Guest guest) {
        if (guest == null) {
            render status: NOT_FOUND
            return
        }

        try {
            guestService.save(guest)
        } catch (ValidationException e) {
            respond guest.errors, view:'edit'
            return
        }

        respond guest, [status: OK, view:"show"]
    }

    def delete(Long id) {
        if (id == null) {
            render status: NOT_FOUND
            return
        }

        guestService.delete(id)

        render status: NO_CONTENT
    }
}
