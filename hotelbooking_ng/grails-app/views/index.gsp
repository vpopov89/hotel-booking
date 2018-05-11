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

    <asset:stylesheet src="application.css"/>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />

    <script type="text/javascript">
        window.contextPath = "${request.contextPath}";
    </script>

    <!-- FIXME this should not be hardcoded -->
    <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/angular_material/1.1.9/angular-material.min.css">
</head>

<body ng-app="com.acme.hotelbooking">

    <md-content>
        <section layout="row" layout-sm="column" layout-align="left center" layout-wrap>
            <md-button href="#!newBooking" class="md-raised">Make new booking</md-button>
            <md-button href="#!houseKeeping" class="md-raised">House keeping</md-button>
        </section>
    </md-content>

    <ng-view />
    <!-- <new-booking /> -->

    <asset:javascript src="/com/acme/hotelbooking/com.acme.hotelbooking.js" />
    <asset:javascript src="/com/acme/hotelbooking/services/guestService.js" />
    <asset:javascript src="/com/acme/hotelbooking/controllers/newBookingController1.js" />

    <asset:javascript src="/com/acme/hotelbooking/controllers/newBookingController1.js" />

    
</body>
</html>
