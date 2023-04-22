package w;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import t9.j0;

/* loaded from: classes2.dex */
public class j extends d {

    /* renamed from: f  reason: collision with root package name */
    public String f16280f;

    /* renamed from: g  reason: collision with root package name */
    public int f16281g = -1;

    /* renamed from: h  reason: collision with root package name */
    public float f16282h = Float.NaN;

    /* renamed from: i  reason: collision with root package name */
    public float f16283i = Float.NaN;

    /* renamed from: j  reason: collision with root package name */
    public float f16284j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    public float f16285k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    public float f16286l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    public float f16287m = Float.NaN;
    public float n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    public float f16288o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    public float f16289p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    public float f16290q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    public float f16291r = Float.NaN;

    /* renamed from: s  reason: collision with root package name */
    public float f16292s = Float.NaN;

    /* renamed from: t  reason: collision with root package name */
    public int f16293t = 0;

    /* renamed from: u  reason: collision with root package name */
    public float f16294u = Float.NaN;

    /* renamed from: v  reason: collision with root package name */
    public float f16295v = 0.0f;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static SparseIntArray f16296a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f16296a = sparseIntArray;
            sparseIntArray.append(0, 1);
            f16296a.append(9, 2);
            f16296a.append(5, 4);
            f16296a.append(6, 5);
            f16296a.append(7, 6);
            f16296a.append(3, 7);
            f16296a.append(15, 8);
            f16296a.append(14, 9);
            f16296a.append(13, 10);
            f16296a.append(11, 12);
            f16296a.append(10, 13);
            f16296a.append(4, 14);
            f16296a.append(1, 15);
            f16296a.append(2, 16);
            f16296a.append(8, 17);
            f16296a.append(12, 18);
            f16296a.append(18, 20);
            f16296a.append(17, 21);
            f16296a.append(20, 19);
        }
    }

    public j() {
        this.d = 3;
        this.f16229e = new HashMap<>();
    }

    @Override // w.d
    public void a(HashMap<String, v.d> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // w.d
    /* renamed from: b */
    public d clone() {
        j jVar = new j();
        super.c(this);
        jVar.f16280f = this.f16280f;
        jVar.f16281g = this.f16281g;
        jVar.f16293t = this.f16293t;
        jVar.f16294u = this.f16294u;
        jVar.f16295v = this.f16295v;
        jVar.f16292s = this.f16292s;
        jVar.f16282h = this.f16282h;
        jVar.f16283i = this.f16283i;
        jVar.f16284j = this.f16284j;
        jVar.f16287m = this.f16287m;
        jVar.f16285k = this.f16285k;
        jVar.f16286l = this.f16286l;
        jVar.n = this.n;
        jVar.f16288o = this.f16288o;
        jVar.f16289p = this.f16289p;
        jVar.f16290q = this.f16290q;
        jVar.f16291r = this.f16291r;
        return jVar;
    }

    @Override // w.d
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f16282h)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f16283i)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f16284j)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f16285k)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f16286l)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f16289p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f16290q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f16291r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f16287m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f16288o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f16292s)) {
            hashSet.add("progress");
        }
        if (this.f16229e.size() > 0) {
            Iterator<String> it = this.f16229e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // w.d
    public void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.K);
        SparseIntArray sparseIntArray = a.f16296a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            switch (a.f16296a.get(index)) {
                case 1:
                    this.f16282h = obtainStyledAttributes.getFloat(index, this.f16282h);
                    break;
                case 2:
                    this.f16283i = obtainStyledAttributes.getDimension(index, this.f16283i);
                    continue;
                case 3:
                case 11:
                default:
                    StringBuilder m10 = a1.a.m("unused attribute 0x");
                    a0.a.q(index, m10, "   ");
                    m10.append(a.f16296a.get(index));
                    Log.e("KeyTimeCycle", m10.toString());
                    continue;
                case 4:
                    this.f16284j = obtainStyledAttributes.getFloat(index, this.f16284j);
                    continue;
                case 5:
                    this.f16285k = obtainStyledAttributes.getFloat(index, this.f16285k);
                    continue;
                case 6:
                    this.f16286l = obtainStyledAttributes.getFloat(index, this.f16286l);
                    continue;
                case 7:
                    this.n = obtainStyledAttributes.getFloat(index, this.n);
                    continue;
                case 8:
                    this.f16287m = obtainStyledAttributes.getFloat(index, this.f16287m);
                    continue;
                case 9:
                    this.f16280f = obtainStyledAttributes.getString(index);
                    continue;
                case 10:
                    if (MotionLayout.Y0) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f16227b);
                        this.f16227b = resourceId;
                        if (resourceId == -1) {
                            this.f16228c = obtainStyledAttributes.getString(index);
                            continue;
                        }
                    } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.f16228c = obtainStyledAttributes.getString(index);
                    } else {
                        this.f16227b = obtainStyledAttributes.getResourceId(index, this.f16227b);
                    }
                    break;
                case 12:
                    this.f16226a = obtainStyledAttributes.getInt(index, this.f16226a);
                    continue;
                case 13:
                    this.f16281g = obtainStyledAttributes.getInteger(index, this.f16281g);
                    continue;
                case 14:
                    this.f16288o = obtainStyledAttributes.getFloat(index, this.f16288o);
                    continue;
                case 15:
                    this.f16289p = obtainStyledAttributes.getDimension(index, this.f16289p);
                    continue;
                case 16:
                    this.f16290q = obtainStyledAttributes.getDimension(index, this.f16290q);
                    continue;
                case 17:
                    this.f16291r = obtainStyledAttributes.getDimension(index, this.f16291r);
                    continue;
                case 18:
                    this.f16292s = obtainStyledAttributes.getFloat(index, this.f16292s);
                    continue;
                case 19:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        this.f16293t = 7;
                        continue;
                    } else {
                        this.f16293t = obtainStyledAttributes.getInt(index, this.f16293t);
                    }
                case 20:
                    this.f16294u = obtainStyledAttributes.getFloat(index, this.f16294u);
                    continue;
                case 21:
                    if (obtainStyledAttributes.peekValue(index).type == 5) {
                        this.f16295v = obtainStyledAttributes.getDimension(index, this.f16295v);
                        continue;
                    } else {
                        this.f16295v = obtainStyledAttributes.getFloat(index, this.f16295v);
                    }
            }
        }
    }

    @Override // w.d
    public void f(HashMap<String, Integer> hashMap) {
        if (this.f16281g == -1) {
            return;
        }
        if (!Float.isNaN(this.f16282h)) {
            hashMap.put("alpha", Integer.valueOf(this.f16281g));
        }
        if (!Float.isNaN(this.f16283i)) {
            hashMap.put("elevation", Integer.valueOf(this.f16281g));
        }
        if (!Float.isNaN(this.f16284j)) {
            hashMap.put("rotation", Integer.valueOf(this.f16281g));
        }
        if (!Float.isNaN(this.f16285k)) {
            hashMap.put("rotationX", Integer.valueOf(this.f16281g));
        }
        if (!Float.isNaN(this.f16286l)) {
            hashMap.put("rotationY", Integer.valueOf(this.f16281g));
        }
        if (!Float.isNaN(this.f16289p)) {
            hashMap.put("translationX", Integer.valueOf(this.f16281g));
        }
        if (!Float.isNaN(this.f16290q)) {
            hashMap.put("translationY", Integer.valueOf(this.f16281g));
        }
        if (!Float.isNaN(this.f16291r)) {
            hashMap.put("translationZ", Integer.valueOf(this.f16281g));
        }
        if (!Float.isNaN(this.f16287m)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f16281g));
        }
        if (!Float.isNaN(this.n)) {
            hashMap.put("scaleX", Integer.valueOf(this.f16281g));
        }
        if (!Float.isNaN(this.n)) {
            hashMap.put("scaleY", Integer.valueOf(this.f16281g));
        }
        if (!Float.isNaN(this.f16292s)) {
            hashMap.put("progress", Integer.valueOf(this.f16281g));
        }
        if (this.f16229e.size() > 0) {
            for (String str : this.f16229e.keySet()) {
                hashMap.put(a1.a.l("CUSTOM,", str), Integer.valueOf(this.f16281g));
            }
        }
    }
}
