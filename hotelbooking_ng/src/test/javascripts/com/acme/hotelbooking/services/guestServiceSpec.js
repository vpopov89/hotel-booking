describe("com.acme.hotelbooking module", function() {

    beforeEach(angular.mock.module("com.acme.hotelbooking", function() {
    }));

    describe("guestService", function() {

        var guestService;

        beforeEach(angular.mock.inject(function(_guestService_) {
            guestService = _guestService_;
        }));

        it("should be tested", function() {
            expect(true).toEqual(false);
        });

    });

});
