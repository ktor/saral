package com.pidanic.saral.domain;

import com.pidanic.saral.scope.Scope;

abstract public class CallableStatement extends BlockStatementImpl {
    CallableStatement(Scope scope) {
        super(scope);
    }
}
