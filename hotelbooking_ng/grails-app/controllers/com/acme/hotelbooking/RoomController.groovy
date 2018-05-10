package com.acme.hotelbooking

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class RoomController {

    RoomService roomService

    static responseFormats = ['json', 'xml']
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond roomService.list(params), model:[roomCount: roomService.count()]
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
