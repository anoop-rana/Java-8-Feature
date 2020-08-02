package com.nashorn;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Paths;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author anoop
 * 
 *         Nashorn is a JavaScript engine. It is used to execute JavaScript code
 *         dynamically at JVM (Java Virtual Machine). Java provides a
 *         command-line tool jjs which is used to execute JavaScript code.
 */
public class NashornExample {

    public static void main(String[] args) {
        String path = Paths.get(".").toAbsolutePath().normalize().toString();
        
        // Creating script engine
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
        try {
         // Reading Nashorn file
            ee.eval(new FileReader(path+"/src/com/nashorn/js/hello.js"));
        } catch (FileNotFoundException | ScriptException e) {
            e.printStackTrace();
        }
    }

}
