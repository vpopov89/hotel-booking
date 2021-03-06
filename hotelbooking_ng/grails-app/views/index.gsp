<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>Welcome to Grails</title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>

    <style type="text/css">
        [ng\:cloak], [ng-cloak], [data-ng-cloak], [x-ng-cloak], .ng-cloak, .x-ng-cloak {
            display: none !important;
        }
    </style>

<!--
    <asset:stylesheet src="application.css"/>
-->

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />

    <script type="text/javascript">
        window.contextPath = "${request.contextPath}";
    </script>

    <!-- FIXME this should not be hardcoded -->
    <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/angular_material/1.1.9/angular-material.min.css">
</head>

<body ng-app="com.acme.hotelbooking">

    <md-content>
        <md-nav-bar md-no-ink-bar="disableInkBar" md-selected-nav-item="currentNavItem" nav-bar-aria-label="navigation links">
            <md-nav-item md-nav-href="#!newBooking" name="newBooking">Make a new booking</md-nav-item>
            <md-nav-item md-nav-href="#!manageBookings" name="manageBookings">Manage bookings</md-nav-item>
            <md-nav-item md-nav-href="#!houseKeeping" name="houseKeeping">House keeping</md-nav-item>
        </md-nav-bar>
    </md-content>

    <ng-view />

    <asset:javascript src="/com/acme/hotelbooking/com.acme.hotelbooking.js" />
    <asset:javascript src="/com/acme/hotelbooking/services/guestService.js" />
    <asset:javascript src="/com/acme/hotelbooking/controllers/newBookingController.js" />

</body>
</html>
