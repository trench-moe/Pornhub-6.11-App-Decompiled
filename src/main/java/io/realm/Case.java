package io.realm;

/* loaded from: classes2.dex */
public enum Case {
    SENSITIVE(true),
    /* JADX INFO: Fake field, exist only in values array */
    INSENSITIVE(false);
    
    private final boolean value;

    Case(boolean z10) {
        this.value = z10;
    }

    public boolean b() {
        return this.value;
    }
}
