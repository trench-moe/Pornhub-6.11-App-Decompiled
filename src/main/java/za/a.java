package za;

import android.graphics.Typeface;

/* loaded from: classes2.dex */
public final class a extends af.c {

    /* renamed from: a  reason: collision with root package name */
    public final Typeface f21917a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0320a f21918b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f21919c;

    /* renamed from: za.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0320a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0320a interfaceC0320a, Typeface typeface) {
        this.f21917a = typeface;
        this.f21918b = interfaceC0320a;
    }

    @Override // af.c
    public void n(int i10) {
        Typeface typeface = this.f21917a;
        if (!this.f21919c) {
            this.f21918b.a(typeface);
        }
    }

    @Override // af.c
    public void o(Typeface typeface, boolean z10) {
        if (!this.f21919c) {
            this.f21918b.a(typeface);
        }
    }
}
