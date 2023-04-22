package ya;

import android.animation.Animator;

/* loaded from: classes2.dex */
public abstract class m<T extends Animator> {

    /* renamed from: a  reason: collision with root package name */
    public n f18607a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f18608b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f18609c;

    public m(int i10) {
        this.f18608b = new float[i10 * 2];
        this.f18609c = new int[i10];
    }

    public abstract void a();

    public float b(int i10, int i11, int i12) {
        return (i10 - i11) / i12;
    }

    public abstract void c();

    public abstract void d(v1.b bVar);

    public abstract void e();

    public abstract void f();

    public abstract void g();
}
