package by.epam.patterns.abstract_factory.factories;

import by.epam.patterns.abstract_factory.buttons.Button;
import by.epam.patterns.abstract_factory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}