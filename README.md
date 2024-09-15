Ride-Sharing Platform

Overview

This is a ride-sharing platform built using Java, following SOLID principles and best practices. The platform allows riders to book various types of rides (e.g., Carpool, Luxury, Bike), supports multiple payment methods, and includes a robust rating and notification system. It also provides an admin panel for managing drivers, riders, trip histories, and handling disputes.

Features
Rider Features:

Request rides by specifying pickup and drop-off locations.
Choose from different ride types (Carpool, Luxury, Bike).
Pay using various payment methods (Credit Card, PayPal, Digital Wallet).
Rate drivers after a completed trip.
Driver Features:

Accept ride requests based on proximity and ride type.
Update real-time location and start trips.
Rate riders after each trip.
Payment Processing:

Riders can save preferred payment methods and automatically process payments at the end of the trip.
Easy integration of new payment methods through the PaymentMethod interface.
Admin Panel:

Manage drivers and riders (activate/deactivate).
View trip histories and resolve disputes.
Monitor system metrics like user ratings and payment data.
Notifications:

Send notifications for ride requests, driver arrival, trip start, and completion.
Multiple channels supported: SMS, Email, and In-App notifications.
