package by.epam.patterns.factory_method.factory;

import by.epam.patterns.factory_method.Button;

public abstract class Dialog {

    public void renderWindow() {
        // ... остальной код диалога ...

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Подклассы будут переопределять этот метод, чтобы создавать конкретные
     * объекты продуктов, разные для каждой фабрики.
     */
    public abstract Button createButton();
}
