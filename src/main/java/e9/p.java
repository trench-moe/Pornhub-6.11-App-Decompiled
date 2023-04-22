package e9;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final Map<BasePendingResult<?>, Boolean> f9234a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final Map<ea.h<?>, Boolean> f9235b = Collections.synchronizedMap(new WeakHashMap());

    public final void a(boolean z10, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f9234a) {
            try {
                hashMap = new HashMap(this.f9234a);
            } finally {
            }
        }
        synchronized (this.f9235b) {
            hashMap2 = new HashMap(this.f9235b);
        }
        loop0: while (true) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (!z10 && !((Boolean) entry.getValue()).booleanValue()) {
                    break;
                }
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (!z10 && !((Boolean) entry2.getValue()).booleanValue()) {
            }
            ((ea.h) entry2.getKey()).a(new ApiException(status));
        }
    }
}
