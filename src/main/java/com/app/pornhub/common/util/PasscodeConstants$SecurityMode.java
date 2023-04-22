package com.app.pornhub.common.util;

/* loaded from: classes.dex */
public enum PasscodeConstants$SecurityMode {
    NOLOCK(-1),
    LOCKED(0);
    
    private int value;

    PasscodeConstants$SecurityMode(int i10) {
        this.value = i10;
    }

    public int b() {
        return this.value;
    }
}
