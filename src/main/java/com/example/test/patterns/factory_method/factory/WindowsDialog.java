package by.epam.patterns.factory_method.factory;

import by.epam.patterns.factory_method.Button;
import by.epam.patterns.factory_method.impl.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}