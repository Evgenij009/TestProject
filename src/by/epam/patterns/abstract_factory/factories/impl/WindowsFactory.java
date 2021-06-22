package by.epam.patterns.abstract_factory.factories.impl;

import by.epam.patterns.abstract_factory.buttons.Button;
import by.epam.patterns.abstract_factory.buttons.impl.WindowsButton;
import by.epam.patterns.abstract_factory.checkboxes.Checkbox;
import by.epam.patterns.abstract_factory.checkboxes.impl.WindowsCheckbox;
import by.epam.patterns.abstract_factory.factories.GUIFactory;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}