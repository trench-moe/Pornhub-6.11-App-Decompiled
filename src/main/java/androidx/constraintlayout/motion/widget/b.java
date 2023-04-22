package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import org.xmlpull.v1.XmlPullParser;
import t9.j0;

/* loaded from: classes.dex */
public class b {
    public static final float[][] E = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    public static final float[][] F = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    public float A;
    public float B;
    public int C;
    public int D;

    /* renamed from: a  reason: collision with root package name */
    public int f1470a;

    /* renamed from: b  reason: collision with root package name */
    public int f1471b;

    /* renamed from: c  reason: collision with root package name */
    public int f1472c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f1473e;

    /* renamed from: f  reason: collision with root package name */
    public int f1474f;

    /* renamed from: g  reason: collision with root package name */
    public float f1475g;

    /* renamed from: h  reason: collision with root package name */
    public float f1476h;

    /* renamed from: i  reason: collision with root package name */
    public int f1477i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1478j;

    /* renamed from: k  reason: collision with root package name */
    public float f1479k;

    /* renamed from: l  reason: collision with root package name */
    public float f1480l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1481m = false;
    public float[] n = new float[2];

    /* renamed from: o  reason: collision with root package name */
    public int[] f1482o = new int[2];

    /* renamed from: p  reason: collision with root package name */
    public float f1483p;

    /* renamed from: q  reason: collision with root package name */
    public float f1484q;

    /* renamed from: r  reason: collision with root package name */
    public final MotionLayout f1485r;

    /* renamed from: s  reason: collision with root package name */
    public float f1486s;

    /* renamed from: t  reason: collision with root package name */
    public float f1487t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1488u;

    /* renamed from: v  reason: collision with root package name */
    public float f1489v;

    /* renamed from: w  reason: collision with root package name */
    public int f1490w;

    /* renamed from: x  reason: collision with root package name */
    public float f1491x;
    public float y;

    /* renamed from: z  reason: collision with root package name */
    public float f1492z;

    public b(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f1470a = 0;
        this.f1471b = 0;
        this.f1472c = 0;
        this.d = -1;
        this.f1473e = -1;
        this.f1474f = -1;
        this.f1475g = 0.5f;
        this.f1476h = 0.5f;
        this.f1477i = -1;
        this.f1478j = false;
        this.f1479k = 0.0f;
        this.f1480l = 1.0f;
        this.f1486s = 4.0f;
        this.f1487t = 1.2f;
        this.f1488u = true;
        this.f1489v = 1.0f;
        this.f1490w = 0;
        this.f1491x = 10.0f;
        this.y = 10.0f;
        this.f1492z = 1.0f;
        this.A = Float.NaN;
        this.B = Float.NaN;
        this.C = 0;
        this.D = 0;
        this.f1485r = motionLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j0.W);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 16) {
                this.d = obtainStyledAttributes.getResourceId(index, this.d);
            } else if (index == 17) {
                int i11 = obtainStyledAttributes.getInt(index, this.f1470a);
                this.f1470a = i11;
                float[][] fArr = E;
                this.f1476h = fArr[i11][0];
                this.f1475g = fArr[i11][1];
            } else if (index == 1) {
                int i12 = obtainStyledAttributes.getInt(index, this.f1471b);
                this.f1471b = i12;
                float[][] fArr2 = F;
                if (i12 < fArr2.length) {
                    this.f1479k = fArr2[i12][0];
                    this.f1480l = fArr2[i12][1];
                } else {
                    this.f1480l = Float.NaN;
                    this.f1479k = Float.NaN;
                    this.f1478j = true;
                }
            } else if (index == 6) {
                this.f1486s = obtainStyledAttributes.getFloat(index, this.f1486s);
            } else if (index == 5) {
                this.f1487t = obtainStyledAttributes.getFloat(index, this.f1487t);
            } else if (index == 7) {
                this.f1488u = obtainStyledAttributes.getBoolean(index, this.f1488u);
            } else if (index == 2) {
                this.f1489v = obtainStyledAttributes.getFloat(index, this.f1489v);
            } else if (index == 3) {
                this.f1491x = obtainStyledAttributes.getFloat(index, this.f1491x);
            } else if (index == 18) {
                this.f1473e = obtainStyledAttributes.getResourceId(index, this.f1473e);
            } else if (index == 9) {
                this.f1472c = obtainStyledAttributes.getInt(index, this.f1472c);
            } else if (index == 8) {
                this.f1490w = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == 4) {
                this.f1474f = obtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 10) {
                this.f1477i = obtainStyledAttributes.getResourceId(index, this.f1477i);
            } else if (index == 12) {
                this.y = obtainStyledAttributes.getFloat(index, this.y);
            } else if (index == 13) {
                this.f1492z = obtainStyledAttributes.getFloat(index, this.f1492z);
            } else if (index == 14) {
                this.A = obtainStyledAttributes.getFloat(index, this.A);
            } else if (index == 15) {
                this.B = obtainStyledAttributes.getFloat(index, this.B);
            } else if (index == 11) {
                this.C = obtainStyledAttributes.getInt(index, this.C);
            } else if (index == 0) {
                this.D = obtainStyledAttributes.getInt(index, this.D);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public RectF a(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i10 = this.f1474f;
        if (i10 == -1 || (findViewById = viewGroup.findViewById(i10)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public RectF b(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i10 = this.f1473e;
        if (i10 == -1 || (findViewById = viewGroup.findViewById(i10)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public void c(boolean z10) {
        if (z10) {
            float[][] fArr = F;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = E;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = F;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = E;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[][] fArr5 = E;
        int i10 = this.f1470a;
        this.f1476h = fArr5[i10][0];
        this.f1475g = fArr5[i10][1];
        int i11 = this.f1471b;
        float[][] fArr6 = F;
        if (i11 >= fArr6.length) {
            return;
        }
        this.f1479k = fArr6[i11][0];
        this.f1480l = fArr6[i11][1];
    }

    public String toString() {
        if (Float.isNaN(this.f1479k)) {
            return "rotation";
        }
        return this.f1479k + " , " + this.f1480l;
    }
}
