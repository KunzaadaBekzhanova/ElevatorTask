package com.company;

import com.company.service.Service;

public class Main {

    public static void main(String[] args) {

        //Create object which contains main methods of the program
        Service elevator = new Service();

        //Initialize the data (building, elevator, passengers)
        elevator.initData();

        //Run the program
        elevator.run();
    }
}
