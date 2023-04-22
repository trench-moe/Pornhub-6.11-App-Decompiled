package y6;

import android.media.AudioAttributes;
import k8.c0;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: f  reason: collision with root package name */
    public static final d f18438f = new d(0, 0, 1, 1, null);

    /* renamed from: a  reason: collision with root package name */
    public final int f18439a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18440b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18441c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public AudioAttributes f18442e;

    public d(int i10, int i11, int i12, int i13, a aVar) {
        this.f18439a = i10;
        this.f18440b = i11;
        this.f18441c = i12;
        this.d = i13;
    }

    public AudioAttributes a() {
        if (this.f18442e == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f18439a).setFlags(this.f18440b).setUsage(this.f18441c);
            if (c0.f11939a >= 29) {
                usage.setAllowedCapturePolicy(this.d);
            }
            this.f18442e = usage.build();
        }
        return this.f18442e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            return this.f18439a == dVar.f18439a && this.f18440b == dVar.f18440b && this.f18441c == dVar.f18441c && this.d == dVar.d;
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f18439a) * 31) + this.f18440b) * 31) + this.f18441c) * 31) + this.d;
    }
}
