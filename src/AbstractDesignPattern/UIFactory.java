package AbstractDesignPattern;

public interface UIFactory {
    Menu createMenu();
    Button createButton();
    Dropdown createDropdown();
}
