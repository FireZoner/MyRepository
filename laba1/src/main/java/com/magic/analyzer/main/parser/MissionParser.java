/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.magic.analyzer.main.parser;

import com.magic.analyzer.main.model.Mission;
import java.io.*;

/**
 *
 * @author zubbo
 */
public interface MissionParser {
    Mission parse(File file) throws IOException;
}
