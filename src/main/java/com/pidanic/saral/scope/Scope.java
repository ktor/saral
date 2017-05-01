package com.pidanic.saral.scope;

import com.pidanic.saral.domain.Function;
import com.pidanic.saral.domain.LocalVariable;
import com.pidanic.saral.exception.FunctionNotFoundException;
import com.pidanic.saral.exception.VariableNotFoundException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Scope {

    private List<LocalVariable> localVariables;
    private List<Function> functions;
    private String className;

    public Scope(String className) {
        localVariables = new ArrayList<>();
        functions = new ArrayList<>();
        this.className = className;
    }

    public Scope(Scope scope) {
        localVariables = new ArrayList<>(scope.localVariables);
        functions = new ArrayList<>(scope.functions);
        className = scope.className;
    }

    public List<LocalVariable> getLocalVariables() {
        return Collections.unmodifiableList(localVariables);
    }

    public void addVariable(LocalVariable localVariable) {
        localVariables.add(localVariable);
    }

    public LocalVariable getLocalVariable(String varName) {
        return localVariables.stream()
                .filter(variable -> variable.getName().equals(varName))
                .findFirst()
                .orElseThrow(() -> new VariableNotFoundException(this, varName));
    }

    public int getVariableIndex(String varName) {
        LocalVariable localVariable = getLocalVariable(varName);
        return localVariables.indexOf(localVariable);
    }

    public Function getFunction(String functionName) {
        return functions.stream().filter(proc -> proc.getName().equals(functionName))
                .findFirst()
                .orElseThrow(() -> new FunctionNotFoundException(this, functionName));
    }

    public String getClassName() {
        return className;
    }

    public void addFunction(Function function) {
        this.functions.add(function);
    }
}
