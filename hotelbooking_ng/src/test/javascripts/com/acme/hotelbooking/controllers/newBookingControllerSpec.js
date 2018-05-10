describe("com.acme.hotelbooking module", function() {
    var scope;

    beforeEach(angular.mock.module("com.acme.hotelbooking", function() {
    }));

    beforeEach(angular.mock.inject(function($rootScope) {
        scope = $rootScope.$new();
    }));

    describe("NewBookingController", function() {

        var ctrl;

        beforeEach(angular.mock.inject(function($controller) {
            ctrl = $controller("NewBookingController", {});
        }));

        it("should be tested", function() {
            expect(true).toEqual(false);
        });

    });

});
