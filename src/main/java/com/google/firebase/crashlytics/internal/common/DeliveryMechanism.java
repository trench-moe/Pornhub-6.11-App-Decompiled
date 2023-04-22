package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes.dex */
public enum DeliveryMechanism {
    DEVELOPER(1),
    /* JADX INFO: Fake field, exist only in values array */
    USER_SIDELOAD(2),
    /* JADX INFO: Fake field, exist only in values array */
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: id  reason: collision with root package name */
    private final int f7999id;

    DeliveryMechanism(int i10) {
        this.f7999id = i10;
    }

    public int b() {
        return this.f7999id;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f7999id);
    }
}
