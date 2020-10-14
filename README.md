# Project3
Project 3 for Object Oriented Analysis and Design (OOAD 4448)
## Sid Bostwick, Jackson Lee, and Ana Vukojevic

### Running
Unit tests are automatically run on startup. When prompted, input the desired number of days.

### Language & Environment
The language used for this project was Java, and the enviroment was IntelliJ

### Program Design
The program uses factories for all of the rolls. The store creates an inventory of rolls using the respective factories. Customers are created at random, and the store takes their order, updates inventory and sales, and notifies the observer, the store announcer. At the end of the day, the store notifies the store announcewr of total sales and rolls remaining, then ends the day. We also used the decorator pattern for the Extras.
