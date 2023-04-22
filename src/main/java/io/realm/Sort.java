package io.realm;

/* loaded from: classes2.dex */
public enum Sort {
    /* JADX INFO: Fake field, exist only in values array */
    ASCENDING(true),
    DESCENDING(false);
    
    private final boolean value;

    Sort(boolean z10) {
        this.value = z10;
    }

    public boolean b() {
        return this.value;
    }
}
