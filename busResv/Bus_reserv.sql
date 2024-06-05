CREATE DATABASE bus_reservation;

USE bus_reservation;

CREATE TABLE buses (
    bus_id INT PRIMARY KEY AUTO_INCREMENT,
    bus_name VARCHAR(50),
    source VARCHAR(50),
    destination VARCHAR(50),
    total_seats INT
);

CREATE TABLE tickets (
    ticket_id INT PRIMARY KEY AUTO_INCREMENT,
    bus_id INT,
    passenger_name VARCHAR(50),
    seat_number INT,
    FOREIGN KEY (bus_id) REFERENCES buses(bus_id)
);
INSERT INTO buses (bus_name, source, destination, total_seats) VALUES
('TN Express', 'Chennai', 'Coimbatore', 50),
('Madurai Fast', 'Chennai', 'Madurai', 40),
('Salem Super', 'Chennai', 'Salem', 45),
('Trichy Express', 'Chennai', 'Trichy', 35),
('Erode Express', 'Chennai', 'Erode', 30),
('Kanyakumari King', 'Chennai', 'Kanyakumari', 60),
('Vellore Voyager', 'Chennai', 'Vellore', 55),
('Thanjavur Thunder', 'Chennai', 'Thanjavur', 25),
('Tirunelveli Tiger', 'Chennai', 'Tirunelveli', 50),
('Cuddalore Comet', 'Chennai', 'Cuddalore', 40),
('Nagercoil Express', 'Chennai', 'Nagercoil', 55),
('Tirupur Turbo', 'Chennai', 'Tirupur', 30),
('Dindigul Dart', 'Chennai', 'Dindigul', 45),
('Karur Kingfisher', 'Chennai', 'Karur', 35),
('Tiruvannamalai Thrill', 'Chennai', 'Tiruvannamalai', 20);

USE bus_reservation;
ALTER TABLE tickets ADD COLUMN gender VARCHAR(10);

