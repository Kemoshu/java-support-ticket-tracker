# Java Support Ticket Tracker

A beginner-friendly Java command-line application for managing support tickets. Built to practice core Java programming concepts, object-oriented programming, collections, loops, and input validation.

## Features

- Create support tickets with automatically assigned sequential IDs.
- List all tickets and their current statuses.
- Resolve tickets by ID.
- Validate user input, including empty titles, invalid IDs, and unsupported menu choices.
- Navigate an interactive command-line menu.

## Technologies

- Java (JDK)
- Java Standard Library
- `ArrayList` for in-memory ticket storage
- `Scanner` for command-line input

## Project Structure

```text
java-support-ticket-tracker/
├── src/
│   ├── Main.java
│   └── Ticket.java
└── README.md
```

## Requirements

Java Development Kit (JDK) 8 or newer.

## How to Run

Open a terminal in the project's root directory.

**1. Compile the application**

```bash
javac -d out src/*.java
```

**2. Run the application**

```bash
java -cp out Main
```

## Usage

The application displays the following menu:

```text
===== Support Ticket Tracker =====
1. Create Ticket
2. List Tickets
3. Resolve Ticket
0. Exit
Enter choice:
```

Select an option to create, view, or resolve support tickets.

Each new ticket receives a unique sequential ID and starts with an `OPEN` status. Resolving a ticket changes its status to `RESOLVED`.

## Input Validation

The application handles:

- Empty or whitespace-only ticket titles
- Non-numeric ticket IDs
- Zero or negative ticket IDs
- Ticket IDs that do not exist
- Invalid menu selections

## Limitations

Tickets are stored in memory using an `ArrayList`. All ticket data is lost when the application exits.

The project intentionally does not include a database, graphical interface, or external frameworks.

## Learning Objectives

This project demonstrates:

- Java classes, objects, constructors, and encapsulation
- Conditional statements and loops
- Collections using `ArrayList`
- User input handling with `Scanner`
- Exception handling with `try-catch`
- Basic application logic and input validation