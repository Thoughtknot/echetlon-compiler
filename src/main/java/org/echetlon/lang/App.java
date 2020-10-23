package org.echetlon.lang;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class App {

    public static void main(String[] args) throws IOException {
        System.out.println(Paths.get("").toAbsolutePath().toString());
        System.out.println(Paths.get(args[0]).toAbsolutePath().toString());
        List<String> lines = Files.readAllLines(Paths.get(args[0]));
        String program = String.join("\n", lines);
        byte[] compiled = EchetlonCompiler.compile(program);
        Files.write(Paths.get(args[1]), compiled);
    }
}
