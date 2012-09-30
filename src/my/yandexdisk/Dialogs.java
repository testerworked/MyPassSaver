/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package my.yandexdisk;

import java.awt.Frame;
import java.awt.Point;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Dialogs {

    public static void scrollToTop(JTextArea textArea) {
        textArea.setCaretPosition(0);
    }

    public static void scrollToTop(JScrollPane scrollPane) {
        scrollPane.getViewport().setViewPosition(new Point(0,0));
    }

    public static void warning(Frame caller, String warning) {
        JOptionPane.showMessageDialog(caller, warning, "Alert", JOptionPane.WARNING_MESSAGE);
    }

    public static void error(Frame caller, String error) {
        JOptionPane.showMessageDialog(caller, error, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static boolean confirm(Frame caller, String question) {
        return JOptionPane.showConfirmDialog(
                caller, question, "Confirm", JOptionPane.OK_CANCEL_OPTION)
                == JOptionPane.OK_OPTION;
    }

}