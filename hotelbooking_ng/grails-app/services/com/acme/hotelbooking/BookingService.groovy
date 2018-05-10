package com.acme.hotelbooking

import grails.gorm.services.Service

@Service(Booking)
interface BookingService {

    Booking get(Serializable id)

    List<Booking> list(Map args)

    Long count()

    void delete(Serializable id)

    Booking save(Booking booking)

}