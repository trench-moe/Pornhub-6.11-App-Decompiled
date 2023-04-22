package w9;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class t4 {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f17308a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f17309b;

    public t4(Uri uri) {
        this(null, uri, false);
    }

    public t4(String str, Uri uri, boolean z10) {
        this.f17308a = uri;
        this.f17309b = z10;
    }

    public final v4 a(String str, long j10) {
        return new p4(this, str, Long.valueOf(j10));
    }

    public final v4 b(String str, boolean z10) {
        return new q4(this, str, Boolean.valueOf(z10));
    }
}
