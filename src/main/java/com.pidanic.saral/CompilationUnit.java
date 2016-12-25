package com.pidanic.saral;

import java.util.List;

public class CompilationUnit {

    private List<Instruction> instructions;

    public CompilationUnit(List<Instruction> instructions) {
        this.instructions = instructions;
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }
}
