package by.epam.patterns.abstract_factory.checkboxes.impl;

import by.epam.patterns.abstract_factory.checkboxes.Checkbox;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}