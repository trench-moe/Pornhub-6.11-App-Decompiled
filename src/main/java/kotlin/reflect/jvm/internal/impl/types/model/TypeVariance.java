package kotlin.reflect.jvm.internal.impl.types.model;

import com.appsflyer.oaid.BuildConfig;

/* loaded from: classes3.dex */
public enum TypeVariance {
    IN("in"),
    OUT("out"),
    INV(BuildConfig.FLAVOR);
    
    private final String presentation;

    TypeVariance(String str) {
        this.presentation = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.presentation;
    }
}
