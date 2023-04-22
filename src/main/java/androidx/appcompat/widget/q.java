package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import d0.f;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import n0.x;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f1057a;

    /* renamed from: b  reason: collision with root package name */
    public n0 f1058b;

    /* renamed from: c  reason: collision with root package name */
    public n0 f1059c;
    public n0 d;

    /* renamed from: e  reason: collision with root package name */
    public n0 f1060e;

    /* renamed from: f  reason: collision with root package name */
    public n0 f1061f;

    /* renamed from: g  reason: collision with root package name */
    public n0 f1062g;

    /* renamed from: h  reason: collision with root package name */
    public n0 f1063h;

    /* renamed from: i  reason: collision with root package name */
    public final s f1064i;

    /* renamed from: j  reason: collision with root package name */
    public int f1065j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f1066k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f1067l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1068m;

    /* loaded from: classes.dex */
    public class a extends f.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f1069a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f1070b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ WeakReference f1071c;

        public a(int i10, int i11, WeakReference weakReference) {
            this.f1069a = i10;
            this.f1070b = i11;
            this.f1071c = weakReference;
        }

        @Override // d0.f.c
        public void d(int i10) {
        }

        @Override // d0.f.c
        public void e(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1069a) != -1) {
                typeface = Typeface.create(typeface, i10, (this.f1070b & 2) != 0);
            }
            q qVar = q.this;
            WeakReference weakReference = this.f1071c;
            if (qVar.f1068m) {
                qVar.f1067l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
                    if (x.g.b(textView)) {
                        textView.post(new r(qVar, textView, typeface, qVar.f1065j));
                    } else {
                        textView.setTypeface(typeface, qVar.f1065j);
                    }
                }
            }
        }
    }

    public q(TextView textView) {
        this.f1057a = textView;
        this.f1064i = new s(textView);
    }

    public static n0 c(Context context, h hVar, int i10) {
        ColorStateList d = hVar.d(context, i10);
        if (d != null) {
            n0 n0Var = new n0();
            n0Var.d = true;
            n0Var.f1047a = d;
            return n0Var;
        }
        return null;
    }

    public final void a(Drawable drawable, n0 n0Var) {
        if (drawable != null && n0Var != null) {
            h.f(drawable, n0Var, this.f1057a.getDrawableState());
        }
    }

    public void b() {
        if (this.f1058b != null || this.f1059c != null || this.d != null || this.f1060e != null) {
            Drawable[] compoundDrawables = this.f1057a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1058b);
            a(compoundDrawables[1], this.f1059c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.f1060e);
        }
        if (this.f1061f == null) {
            if (this.f1062g != null) {
            }
        }
        Drawable[] compoundDrawablesRelative = this.f1057a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f1061f);
        a(compoundDrawablesRelative[2], this.f1062g);
    }

    public boolean d() {
        s sVar = this.f1064i;
        return sVar.i() && sVar.f1081a != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(android.util.AttributeSet r28, int r29) {
        /*
            Method dump skipped, instructions count: 1229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.q.e(android.util.AttributeSet, int):void");
    }

    public void f(Context context, int i10) {
        String n;
        ColorStateList c10;
        ColorStateList c11;
        ColorStateList c12;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, b7.k.T);
        p0 p0Var = new p0(context, obtainStyledAttributes);
        if (p0Var.p(14)) {
            this.f1057a.setAllCaps(p0Var.a(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23) {
            if (p0Var.p(3) && (c12 = p0Var.c(3)) != null) {
                this.f1057a.setTextColor(c12);
            }
            if (p0Var.p(5) && (c11 = p0Var.c(5)) != null) {
                this.f1057a.setLinkTextColor(c11);
            }
            if (p0Var.p(4) && (c10 = p0Var.c(4)) != null) {
                this.f1057a.setHintTextColor(c10);
            }
        }
        if (p0Var.p(0) && p0Var.f(0, -1) == 0) {
            this.f1057a.setTextSize(0, 0.0f);
        }
        m(context, p0Var);
        if (i11 >= 26 && p0Var.p(13) && (n = p0Var.n(13)) != null) {
            this.f1057a.setFontVariationSettings(n);
        }
        obtainStyledAttributes.recycle();
        Typeface typeface = this.f1067l;
        if (typeface != null) {
            this.f1057a.setTypeface(typeface, this.f1065j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(android.widget.TextView r13, android.view.inputmethod.InputConnection r14, android.view.inputmethod.EditorInfo r15) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.q.g(android.widget.TextView, android.view.inputmethod.InputConnection, android.view.inputmethod.EditorInfo):void");
    }

    public void h(int i10, int i11, int i12, int i13) {
        s sVar = this.f1064i;
        if (sVar.i()) {
            DisplayMetrics displayMetrics = sVar.f1089j.getResources().getDisplayMetrics();
            sVar.j(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (sVar.g()) {
                sVar.a();
            }
        }
    }

    public void i(int[] iArr, int i10) {
        s sVar = this.f1064i;
        if (sVar.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = sVar.f1089j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                sVar.f1085f = sVar.b(iArr2);
                if (!sVar.h()) {
                    StringBuilder m10 = a1.a.m("None of the preset sizes is valid: ");
                    m10.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(m10.toString());
                }
            } else {
                sVar.f1086g = false;
            }
            if (sVar.g()) {
                sVar.a();
            }
        }
    }

    public void j(int i10) {
        s sVar = this.f1064i;
        if (sVar.i()) {
            if (i10 == 0) {
                sVar.f1081a = 0;
                sVar.d = -1.0f;
                sVar.f1084e = -1.0f;
                sVar.f1083c = -1.0f;
                sVar.f1085f = new int[0];
                sVar.f1082b = false;
            } else if (i10 != 1) {
                throw new IllegalArgumentException(a1.a.j("Unknown auto-size text type: ", i10));
            } else {
                DisplayMetrics displayMetrics = sVar.f1089j.getResources().getDisplayMetrics();
                sVar.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (sVar.g()) {
                    sVar.a();
                }
            }
        }
    }

    public void k(ColorStateList colorStateList) {
        if (this.f1063h == null) {
            this.f1063h = new n0();
        }
        n0 n0Var = this.f1063h;
        n0Var.f1047a = colorStateList;
        n0Var.d = colorStateList != null;
        this.f1058b = n0Var;
        this.f1059c = n0Var;
        this.d = n0Var;
        this.f1060e = n0Var;
        this.f1061f = n0Var;
        this.f1062g = n0Var;
    }

    public void l(PorterDuff.Mode mode) {
        if (this.f1063h == null) {
            this.f1063h = new n0();
        }
        n0 n0Var = this.f1063h;
        n0Var.f1048b = mode;
        n0Var.f1049c = mode != null;
        this.f1058b = n0Var;
        this.f1059c = n0Var;
        this.d = n0Var;
        this.f1060e = n0Var;
        this.f1061f = n0Var;
        this.f1062g = n0Var;
    }

    public final void m(Context context, p0 p0Var) {
        String n;
        this.f1065j = p0Var.j(2, this.f1065j);
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 >= 28) {
            int j10 = p0Var.j(11, -1);
            this.f1066k = j10;
            if (j10 != -1) {
                this.f1065j = (this.f1065j & 2) | 0;
            }
        }
        if (!p0Var.p(10) && !p0Var.p(12)) {
            if (p0Var.p(1)) {
                this.f1068m = false;
                int j11 = p0Var.j(1, 1);
                if (j11 != 1) {
                    if (j11 == 2) {
                        this.f1067l = Typeface.SERIF;
                        return;
                    } else if (j11 != 3) {
                        return;
                    } else {
                        this.f1067l = Typeface.MONOSPACE;
                        return;
                    }
                }
                this.f1067l = Typeface.SANS_SERIF;
            }
            return;
        }
        this.f1067l = null;
        int i11 = p0Var.p(12) ? 12 : 10;
        int i12 = this.f1066k;
        int i13 = this.f1065j;
        if (!context.isRestricted()) {
            try {
                Typeface i14 = p0Var.i(i11, this.f1065j, new a(i12, i13, new WeakReference(this.f1057a)));
                if (i14 != null) {
                    if (i10 < 28 || this.f1066k == -1) {
                        this.f1067l = i14;
                    } else {
                        this.f1067l = Typeface.create(Typeface.create(i14, 0), this.f1066k, (this.f1065j & 2) != 0);
                    }
                }
                this.f1068m = this.f1067l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
            if (this.f1067l == null && (n = p0Var.n(i11)) != null) {
                if (Build.VERSION.SDK_INT < 28 && this.f1066k != -1) {
                    Typeface create = Typeface.create(n, 0);
                    int i15 = this.f1066k;
                    if ((this.f1065j & 2) != 0) {
                        z10 = true;
                    }
                    this.f1067l = Typeface.create(create, i15, z10);
                    return;
                }
                this.f1067l = Typeface.create(n, this.f1065j);
            }
        }
        if (this.f1067l == null) {
            if (Build.VERSION.SDK_INT < 28) {
            }
            this.f1067l = Typeface.create(n, this.f1065j);
        }
    }
}
