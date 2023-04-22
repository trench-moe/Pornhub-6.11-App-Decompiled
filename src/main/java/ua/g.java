package ua;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: c  reason: collision with root package name */
    public float f15811c;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference<b> f15812e;

    /* renamed from: f  reason: collision with root package name */
    public za.d f15813f;

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f15809a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final af.c f15810b = new a();
    public boolean d = true;

    /* loaded from: classes2.dex */
    public class a extends af.c {
        public a() {
        }

        @Override // af.c
        public void n(int i10) {
            g gVar = g.this;
            gVar.d = true;
            b bVar = gVar.f15812e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // af.c
        public void o(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            g gVar = g.this;
            gVar.d = true;
            b bVar = gVar.f15812e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public g(b bVar) {
        this.f15812e = new WeakReference<>(null);
        this.f15812e = new WeakReference<>(bVar);
    }

    public float a(String str) {
        if (this.d) {
            float measureText = str == null ? 0.0f : this.f15809a.measureText((CharSequence) str, 0, str.length());
            this.f15811c = measureText;
            this.d = false;
            return measureText;
        }
        return this.f15811c;
    }

    public void b(za.d dVar, Context context) {
        if (this.f15813f != dVar) {
            this.f15813f = dVar;
            if (dVar != null) {
                dVar.f(context, this.f15809a, this.f15810b);
                b bVar = this.f15812e.get();
                if (bVar != null) {
                    this.f15809a.drawableState = bVar.getState();
                }
                dVar.e(context, this.f15809a, this.f15810b);
                this.d = true;
            }
            b bVar2 = this.f15812e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}
