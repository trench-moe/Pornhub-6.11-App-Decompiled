package y7;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: r  reason: collision with root package name */
    public static final a f18511r = new a(BuildConfig.FLAVOR, null, null, null, -3.4028235E38f, IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE, -3.4028235E38f, IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, IntCompanionObject.MIN_VALUE, 0.0f, null);

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f18512a;

    /* renamed from: b  reason: collision with root package name */
    public final Layout.Alignment f18513b;

    /* renamed from: c  reason: collision with root package name */
    public final Layout.Alignment f18514c;
    public final Bitmap d;

    /* renamed from: e  reason: collision with root package name */
    public final float f18515e;

    /* renamed from: f  reason: collision with root package name */
    public final int f18516f;

    /* renamed from: g  reason: collision with root package name */
    public final int f18517g;

    /* renamed from: h  reason: collision with root package name */
    public final float f18518h;

    /* renamed from: i  reason: collision with root package name */
    public final int f18519i;

    /* renamed from: j  reason: collision with root package name */
    public final float f18520j;

    /* renamed from: k  reason: collision with root package name */
    public final float f18521k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f18522l;

    /* renamed from: m  reason: collision with root package name */
    public final int f18523m;
    public final int n;

    /* renamed from: o  reason: collision with root package name */
    public final float f18524o;

    /* renamed from: p  reason: collision with root package name */
    public final int f18525p;

    /* renamed from: q  reason: collision with root package name */
    public final float f18526q;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public CharSequence f18527a;

        /* renamed from: b  reason: collision with root package name */
        public Bitmap f18528b;

        /* renamed from: c  reason: collision with root package name */
        public Layout.Alignment f18529c;
        public Layout.Alignment d;

        /* renamed from: e  reason: collision with root package name */
        public float f18530e;

        /* renamed from: f  reason: collision with root package name */
        public int f18531f;

        /* renamed from: g  reason: collision with root package name */
        public int f18532g;

        /* renamed from: h  reason: collision with root package name */
        public float f18533h;

        /* renamed from: i  reason: collision with root package name */
        public int f18534i;

        /* renamed from: j  reason: collision with root package name */
        public int f18535j;

        /* renamed from: k  reason: collision with root package name */
        public float f18536k;

        /* renamed from: l  reason: collision with root package name */
        public float f18537l;

        /* renamed from: m  reason: collision with root package name */
        public float f18538m;
        public boolean n;

        /* renamed from: o  reason: collision with root package name */
        public int f18539o;

        /* renamed from: p  reason: collision with root package name */
        public int f18540p;

        /* renamed from: q  reason: collision with root package name */
        public float f18541q;

        public b() {
            this.f18527a = null;
            this.f18528b = null;
            this.f18529c = null;
            this.d = null;
            this.f18530e = -3.4028235E38f;
            this.f18531f = IntCompanionObject.MIN_VALUE;
            this.f18532g = IntCompanionObject.MIN_VALUE;
            this.f18533h = -3.4028235E38f;
            this.f18534i = IntCompanionObject.MIN_VALUE;
            this.f18535j = IntCompanionObject.MIN_VALUE;
            this.f18536k = -3.4028235E38f;
            this.f18537l = -3.4028235E38f;
            this.f18538m = -3.4028235E38f;
            this.n = false;
            this.f18539o = -16777216;
            this.f18540p = IntCompanionObject.MIN_VALUE;
        }

        public b(a aVar, C0309a c0309a) {
            this.f18527a = aVar.f18512a;
            this.f18528b = aVar.d;
            this.f18529c = aVar.f18513b;
            this.d = aVar.f18514c;
            this.f18530e = aVar.f18515e;
            this.f18531f = aVar.f18516f;
            this.f18532g = aVar.f18517g;
            this.f18533h = aVar.f18518h;
            this.f18534i = aVar.f18519i;
            this.f18535j = aVar.n;
            this.f18536k = aVar.f18524o;
            this.f18537l = aVar.f18520j;
            this.f18538m = aVar.f18521k;
            this.n = aVar.f18522l;
            this.f18539o = aVar.f18523m;
            this.f18540p = aVar.f18525p;
            this.f18541q = aVar.f18526q;
        }

        public a a() {
            return new a(this.f18527a, this.f18529c, this.d, this.f18528b, this.f18530e, this.f18531f, this.f18532g, this.f18533h, this.f18534i, this.f18535j, this.f18536k, this.f18537l, this.f18538m, this.n, this.f18539o, this.f18540p, this.f18541q, null);
        }
    }

    public a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15, C0309a c0309a) {
        if (charSequence == null) {
            Objects.requireNonNull(bitmap);
        } else {
            k8.a.c(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f18512a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f18512a = charSequence.toString();
        } else {
            this.f18512a = null;
        }
        this.f18513b = alignment;
        this.f18514c = alignment2;
        this.d = bitmap;
        this.f18515e = f10;
        this.f18516f = i10;
        this.f18517g = i11;
        this.f18518h = f11;
        this.f18519i = i12;
        this.f18520j = f13;
        this.f18521k = f14;
        this.f18522l = z10;
        this.f18523m = i14;
        this.n = i13;
        this.f18524o = f12;
        this.f18525p = i15;
        this.f18526q = f15;
    }

    public b a() {
        return new b(this, null);
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            return TextUtils.equals(this.f18512a, aVar.f18512a) && this.f18513b == aVar.f18513b && this.f18514c == aVar.f18514c && ((bitmap = this.d) != null ? !((bitmap2 = aVar.d) == null || !bitmap.sameAs(bitmap2)) : aVar.d == null) && this.f18515e == aVar.f18515e && this.f18516f == aVar.f18516f && this.f18517g == aVar.f18517g && this.f18518h == aVar.f18518h && this.f18519i == aVar.f18519i && this.f18520j == aVar.f18520j && this.f18521k == aVar.f18521k && this.f18522l == aVar.f18522l && this.f18523m == aVar.f18523m && this.n == aVar.n && this.f18524o == aVar.f18524o && this.f18525p == aVar.f18525p && this.f18526q == aVar.f18526q;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18512a, this.f18513b, this.f18514c, this.d, Float.valueOf(this.f18515e), Integer.valueOf(this.f18516f), Integer.valueOf(this.f18517g), Float.valueOf(this.f18518h), Integer.valueOf(this.f18519i), Float.valueOf(this.f18520j), Float.valueOf(this.f18521k), Boolean.valueOf(this.f18522l), Integer.valueOf(this.f18523m), Integer.valueOf(this.n), Float.valueOf(this.f18524o), Integer.valueOf(this.f18525p), Float.valueOf(this.f18526q)});
    }
}
