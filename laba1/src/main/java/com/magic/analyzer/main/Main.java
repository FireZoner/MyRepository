/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.magic.analyzer.main;

import javax.swing.*;

/**
 *
 * @author zubbo
 */

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MissionAnalyzerGUI().setVisible(true);
        });
    }
}
