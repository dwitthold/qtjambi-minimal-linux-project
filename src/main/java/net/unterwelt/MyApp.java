package net.unterwelt;

import io.qt.widgets.QApplication;
import io.qt.widgets.QMessageBox;

public class MyApp {

    public static void main(String[] args) {
        QApplication.initialize(args);
        QMessageBox.information(null, "QtJambi", "Moin World!");
        QApplication.shutdown();
    }
}
