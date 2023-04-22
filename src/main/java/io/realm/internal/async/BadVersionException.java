package io.realm.internal.async;

import io.realm.internal.Keep;

@Keep
/* loaded from: classes2.dex */
public class BadVersionException extends Exception {
    public BadVersionException(String str) {
        super(str);
    }

    public BadVersionException(String str, Throwable th) {
        super(str, th);
    }
}
