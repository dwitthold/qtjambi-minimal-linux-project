package net.unterwelt;

import io.qt.widgets.QApplication;
import io.qt.widgets.QCalendarWidget;
import io.qt.widgets.QMainWindow;
import io.qt.widgets.QWidget;

public class MyApp {

    public static void main(String[] args) {
        QApplication.initialize(args);

        QWidget calendar = new QCalendarWidget();

        QMainWindow mainWindow = new QMainWindow();
        mainWindow.setCentralWidget(calendar);
        mainWindow.setFixedSize(300, 300);

        mainWindow.show();
        QApplication.exec();

        QApplication.shutdown();
    }
}
