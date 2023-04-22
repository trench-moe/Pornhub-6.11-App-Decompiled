package androidx.appcompat.widget;

import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a  reason: collision with root package name */
    public int f1010a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1011b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f1012c = IntCompanionObject.MIN_VALUE;
    public int d = IntCompanionObject.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public int f1013e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1014f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1015g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1016h = false;

    public void a(int i10, int i11) {
        this.f1012c = i10;
        this.d = i11;
        this.f1016h = true;
        if (this.f1015g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1010a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1011b = i10;
            }
        } else {
            if (i10 != Integer.MIN_VALUE) {
                this.f1010a = i10;
            }
            if (i11 != Integer.MIN_VALUE) {
                this.f1011b = i11;
            }
        }
    }
}
