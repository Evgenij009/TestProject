package by.epam.patterns.factory_method.factory;

import by.epam.patterns.factory_method.Button;
import by.epam.patterns.factory_method.impl.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}