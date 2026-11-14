package edu.utsa.cs3443.mealmarker;

public class WindowInfo {
    private final String title;
    private final String info;

    public WindowInfo(String title, String info) {
        this.title = title;
        this.info = info;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }
}
