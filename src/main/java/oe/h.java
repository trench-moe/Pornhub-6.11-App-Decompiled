package oe;

import kotlin.jvm.JvmField;

/* loaded from: classes3.dex */
public final class h extends f {
    @JvmField

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f13652j;

    public h(Runnable runnable, long j10, g gVar) {
        super(j10, gVar);
        this.f13652j = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f13652j.run();
        } finally {
            this.f13651f.a();
        }
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Task[");
        m10.append(a0.b.w(this.f13652j));
        m10.append('@');
        m10.append(a0.b.B(this.f13652j));
        m10.append(", ");
        m10.append(this.f13650c);
        m10.append(", ");
        m10.append(this.f13651f);
        m10.append(']');
        return m10.toString();
    }
}
