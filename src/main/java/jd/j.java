package jd;

import com.squareup.moshi.JsonDataException;
import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class j implements Closeable, Flushable {
    public String n;

    /* renamed from: t  reason: collision with root package name */
    public boolean f11698t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f11699u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f11700w;

    /* renamed from: c  reason: collision with root package name */
    public int f11694c = 0;

    /* renamed from: f  reason: collision with root package name */
    public int[] f11695f = new int[32];

    /* renamed from: j  reason: collision with root package name */
    public String[] f11696j = new String[32];

    /* renamed from: m  reason: collision with root package name */
    public int[] f11697m = new int[32];
    public int y = -1;

    public abstract j E(String str);

    public abstract j F(boolean z10);

    public abstract j a();

    public abstract j c();

    public final boolean d() {
        int i10 = this.f11694c;
        int[] iArr = this.f11695f;
        if (i10 != iArr.length) {
            return false;
        }
        if (i10 == 256) {
            StringBuilder m10 = a1.a.m("Nesting too deep at ");
            m10.append(h());
            m10.append(": circular reference?");
            throw new JsonDataException(m10.toString());
        }
        this.f11695f = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.f11696j;
        this.f11696j = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.f11697m;
        this.f11697m = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (this instanceof com.squareup.moshi.i) {
            com.squareup.moshi.i iVar = (com.squareup.moshi.i) this;
            Object[] objArr = iVar.f8548z;
            iVar.f8548z = Arrays.copyOf(objArr, objArr.length * 2);
        }
        return true;
    }

    public abstract j e();

    public abstract j f();

    public final String h() {
        return m9.a.u(this.f11694c, this.f11695f, this.f11696j, this.f11697m);
    }

    public abstract j i(String str);

    public abstract j k();

    public final int m() {
        int i10 = this.f11694c;
        if (i10 != 0) {
            return this.f11695f[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void n(int i10) {
        int[] iArr = this.f11695f;
        int i11 = this.f11694c;
        this.f11694c = i11 + 1;
        iArr[i11] = i10;
    }

    public void s(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.n = str;
    }

    public abstract j t(double d);

    public abstract j v(long j10);

    public abstract j w(Number number);
}
