# CSCI2040
Project

# Furniture Catalogue

## Description
The purpose of this documentation is to instruct the user how to use the furniture catalogue program, as well as how to clone and execute the program.

## Download

### Prerequisites:

You will need the following to be able to run and compile this program:
- The latest version of Java
- Git
- An IDE is recommended


1. Go to your terminal, and use the proper command to get to the folder you want to clone the repo.
2. Use `git clone https://github.com/DylanJReynolds/CSCI2040` to clone the repository into your desired folder. You should have the file in your folder.
3. Using your IDE or Java, you should be able to run it using the `javac CatalogueUI.java CatalogueFileIO.java` command, or through your IDE.

## How to use:

Each piece of furniture is represented using an identification number and has various parameters. These parameters are as follows:
- Price
- Furniture Type
- Colour
- Materials
- Size
- Quantity
- Company
- Weight
- Style

Now that it is running, you will have five options to choose from on how to use the program displayed on the command line interface. To select the option you want to use, type in the corresponding integer. They are:

1. Display all entries (Print every entry in the database in the console).
2. Edit an entry (Given an entry ID, allows the user to change each of the Price, Furniture Type, Colour, Materials, Size, Quantity, Company, Weight, and Style of that entry.)
3. Add an entry (Adds an entry to the database, and allows the user to set the ID, Price, Furniture Type, Colour, Materials, Size, Quantity, Company, Weight, and Style of that entry.)
4. Remove an entry (Removes an entry from the database corresponding to its ID).
5. View specific entry (Given an ID, will remove that corresponding ID from the database).
6. Exit (Terminates the program, saving any changes).

Please note that terminating the program in other ways (i.e. shutting it down via task manager) will still keep the changes made to the database prior.


