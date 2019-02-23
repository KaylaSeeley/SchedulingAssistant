import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

public class NurseTimes {
    public static void main(String[] args) {
        String[] quarterHours = {"00", "30"};
        String[] times = new String[48];
        for (int i = 0; i < 48; i++) {
            for (int j = 0; j < 2; j++) {
                String time = "";
                if (i < 20) {
                    time = "0" + time;
                }
                time = i / 2 + ":";
                if (i % 2 == 0) {
                    time += "00";
                } else {
                    time += "30";
                }
                times[i] = time;
            }
        }
        DateFormat sdf = new SimpleDateFormat("hh:mm");

        String[] locations = {"Chicago", "Indianapolis", "Boston"};
        String s = (String) JOptionPane.showInputDialog(
                null,
                "Enter the time you can start working",
                "Start time",
                JOptionPane.QUESTION_MESSAGE,
                null,
                times,
                times[0]);
        LocalTime start = LocalTime.parse(s);
        String j = (String) JOptionPane.showInputDialog(
                null,
                "Enter the time you end working",
                "End time",
                JOptionPane.QUESTION_MESSAGE,
                null,
                times,
                times[0]);
        LocalTime end = LocalTime.parse(j);
        String m = JOptionPane.showInputDialog(null, "What is your name?",
                "Nurse Name", JOptionPane.INFORMATION_MESSAGE);
        String id = JOptionPane.showInputDialog(null, "What is your ID number?",
                "Nurse Name", JOptionPane.INFORMATION_MESSAGE);
        String k = (String) JOptionPane.showInputDialog(
                null,
                "What location do you work at",
                "Location",
                JOptionPane.QUESTION_MESSAGE,
                null,
                locations,
                locations[0]);
    }
}

