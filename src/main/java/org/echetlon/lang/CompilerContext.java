package org.echetlon.lang;

import org.echetlon.lang.EchetlonCompiler.ObjectDeclaration;
import org.echetlon.lang.EchetlonCompiler.VariableDeclaration;

import java.util.HashMap;
import java.util.Map;

public class CompilerContext {
    private Map<String, ObjectDeclaration> objects = new HashMap<>();
    private Map<String, VariableDeclaration> variables = new HashMap<>();

    public CompilerContext() {}

    public CompilerContext(CompilerContext ctxt) {
        objects = ctxt.objects;
        variables = ctxt.variables;
    }

    public void putObject(String name, ObjectDeclaration obj) {
        objects.put(name, obj);
    }

    public ObjectDeclaration getObject(String name) {
        return objects.get(name);
    }

    public void putVariable(String varName, VariableDeclaration variableDeclaration) {
        variables.put(varName, variableDeclaration);
    }

    public VariableDeclaration getVariable(String varName) {
        return variables.get(varName);
    }
}
