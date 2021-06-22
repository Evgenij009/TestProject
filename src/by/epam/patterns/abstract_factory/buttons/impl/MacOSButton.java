package by.epam.patterns.abstract_factory.buttons.impl;

import by.epam.patterns.abstract_factory.buttons.Button;

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}