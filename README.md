# Project description - backend

Park Easy, as the name suggests, makes reservations of parking spaces easy! As a
registered user, You can select a city with one of our venues and create a
reservation of a parking space. Fast, easy and reliable!

The backend of Park Easy application written in Java Spring Boot, with DTO-based
MVC architecture.

Exposes RESTful API endpoints with details listed below.

## Features

- Cookie-based user authentication and endpoint access
- Integrated Stripe payments (test mode for development phase)

## Endpoints

### User-related

All user endpoints are mapped to `/member/*`

- `/save` - register a new user
- `/login` - authenticate existing user
- `/currentUser` - return session of currently authenticated user
- `/logout` - destroy authenticated user's session

### Map-related

All map endpoints are mapped to: `/location/*`

- `/save` - create new location
- `/get` - return specified location's details
- `/getAllLocations` - return a list of all locations

### ParkingSpace-related

All parking space endpoints are mapped to: `/parking/*`

- `/save` - create new parking space
- `/saveBulk` - create many new parking spaces
- `/getAll` - return all parking spaces
- `/get` - return parking space by id
- `/getAllInCity` - return all parking spaces for specified location

### Reservation-related

All reservation endpoints are mapped to: `/reservation/*`

- `/create` - create a new reservation
- `/getAll` - return all reservations
- `/get` - return a reservation by id
- `/getAllInCity` - return all reservations in specified city
- `/getUserReservations` - return all reservations created by specified user
- `/delete` - cancel reservation
- `/completeReservationPayment` - update payment status of the reservation
- `/failReservationPayment` - update payment status of the reservation

### Payment-related

All payment endpoints are mapped to: `/payments/*`

- `/checkout` - redirect to checkout
