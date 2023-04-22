package w7;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicLong f16904b = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<String>> f16905a;

    public c(long j10, j8.h hVar, long j11) {
        Uri uri = hVar.f11575a;
        this.f16905a = Collections.emptyMap();
    }

    public c(long j10, j8.h hVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f16905a = map;
    }

    public static long a() {
        return f16904b.getAndIncrement();
    }
}
