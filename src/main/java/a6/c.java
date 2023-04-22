package a6;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.SingleRequest;
import d6.l;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public abstract class c<T> implements g<T> {

    /* renamed from: c  reason: collision with root package name */
    public final int f191c;

    /* renamed from: f  reason: collision with root package name */
    public final int f192f;

    /* renamed from: j  reason: collision with root package name */
    public z5.c f193j;

    public c() {
        if (!l.j(IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f191c = IntCompanionObject.MIN_VALUE;
        this.f192f = IntCompanionObject.MIN_VALUE;
    }

    @Override // a6.g
    public final void a(f fVar) {
    }

    @Override // a6.g
    public final void c(f fVar) {
        ((SingleRequest) fVar).b(this.f191c, this.f192f);
    }

    @Override // w5.i
    public void e() {
    }

    @Override // a6.g
    public void f(Drawable drawable) {
    }

    @Override // w5.i
    public void g() {
    }

    @Override // a6.g
    public final void h(z5.c cVar) {
        this.f193j = cVar;
    }

    @Override // a6.g
    public void i(Drawable drawable) {
    }

    @Override // a6.g
    public final z5.c j() {
        return this.f193j;
    }

    @Override // w5.i
    public void m() {
    }
}
