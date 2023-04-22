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
import java.util.Objects;
import t9.j0;

/* loaded from: classes2.dex */
public class f extends d {

    /* renamed from: f  reason: collision with root package name */
    public String f16246f = null;

    /* renamed from: g  reason: collision with root package name */
    public int f16247g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f16248h = -1;

    /* renamed from: i  reason: collision with root package name */
    public String f16249i = null;

    /* renamed from: j  reason: collision with root package name */
    public float f16250j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    public float f16251k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    public float f16252l = 0.0f;

    /* renamed from: m  reason: collision with root package name */
    public float f16253m = Float.NaN;
    public int n = -1;

    /* renamed from: o  reason: collision with root package name */
    public float f16254o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    public float f16255p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    public float f16256q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    public float f16257r = Float.NaN;

    /* renamed from: s  reason: collision with root package name */
    public float f16258s = Float.NaN;

    /* renamed from: t  reason: collision with root package name */
    public float f16259t = Float.NaN;

    /* renamed from: u  reason: collision with root package name */
    public float f16260u = Float.NaN;

    /* renamed from: v  reason: collision with root package name */
    public float f16261v = Float.NaN;

    /* renamed from: w  reason: collision with root package name */
    public float f16262w = Float.NaN;

    /* renamed from: x  reason: collision with root package name */
    public float f16263x = Float.NaN;
    public float y = Float.NaN;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static SparseIntArray f16264a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f16264a = sparseIntArray;
            sparseIntArray.append(13, 1);
            f16264a.append(11, 2);
            f16264a.append(14, 3);
            f16264a.append(10, 4);
            f16264a.append(19, 5);
            f16264a.append(17, 6);
            f16264a.append(16, 7);
            f16264a.append(20, 8);
            f16264a.append(0, 9);
            f16264a.append(9, 10);
            f16264a.append(5, 11);
            f16264a.append(6, 12);
            f16264a.append(7, 13);
            f16264a.append(15, 14);
            f16264a.append(3, 15);
            f16264a.append(4, 16);
            f16264a.append(1, 17);
            f16264a.append(2, 18);
            f16264a.append(8, 19);
            f16264a.append(12, 20);
            f16264a.append(18, 21);
        }
    }

    public f() {
        this.d = 4;
        this.f16229e = new HashMap<>();
    }

    @Override // w.d
    public void a(HashMap<String, v.d> hashMap) {
        StringBuilder m10 = a1.a.m("add ");
        m10.append(hashMap.size());
        m10.append(" values");
        String sb2 = m10.toString();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(2, stackTrace.length - 1);
        String str = " ";
        for (int i10 = 1; i10 <= min; i10++) {
            StackTraceElement stackTraceElement = stackTrace[i10];
            StringBuilder m11 = a1.a.m(".(");
            m11.append(stackTrace[i10].getFileName());
            m11.append(":");
            m11.append(stackTrace[i10].getLineNumber());
            m11.append(") ");
            m11.append(stackTrace[i10].getMethodName());
            String sb3 = m11.toString();
            str = a1.a.l(str, " ");
            Log.v("KeyCycle", sb2 + str + sb3 + str);
        }
        for (String str2 : hashMap.keySet()) {
            v.d dVar = hashMap.get(str2);
            if (dVar != null) {
                Objects.requireNonNull(str2);
                str2.hashCode();
                char c10 = 65535;
                switch (str2.hashCode()) {
                    case -1249320806:
                        if (str2.equals("rotationX")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (str2.equals("rotationY")) {
                            c10 = 1;
                            break;
                        } else {
                            break;
                        }
                    case -1225497657:
                        if (str2.equals("translationX")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (str2.equals("translationY")) {
                            c10 = 3;
                            break;
                        } else {
                            break;
                        }
                    case -1225497655:
                        if (str2.equals("translationZ")) {
                            c10 = 4;
                            break;
                        } else {
                            break;
                        }
                    case -1001078227:
                        if (str2.equals("progress")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (str2.equals("scaleX")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (str2.equals("scaleY")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case -40300674:
                        if (str2.equals("rotation")) {
                            c10 = '\b';
                            break;
                        } else {
                            break;
                        }
                    case -4379043:
                        if (str2.equals("elevation")) {
                            c10 = '\t';
                            break;
                        } else {
                            break;
                        }
                    case 37232917:
                        if (str2.equals("transitionPathRotate")) {
                            c10 = '\n';
                            break;
                        }
                        break;
                    case 92909918:
                        if (str2.equals("alpha")) {
                            c10 = 11;
                            break;
                        } else {
                            break;
                        }
                    case 156108012:
                        if (str2.equals("waveOffset")) {
                            c10 = '\f';
                            break;
                        }
                        break;
                    case 1530034690:
                        if (str2.equals("wavePhase")) {
                            c10 = '\r';
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        dVar.b(this.f16226a, this.f16258s);
                        continue;
                    case 1:
                        dVar.b(this.f16226a, this.f16259t);
                        continue;
                    case 2:
                        dVar.b(this.f16226a, this.f16262w);
                        continue;
                    case 3:
                        dVar.b(this.f16226a, this.f16263x);
                        continue;
                    case 4:
                        dVar.b(this.f16226a, this.y);
                        continue;
                    case 5:
                        dVar.b(this.f16226a, this.f16253m);
                        continue;
                    case 6:
                        dVar.b(this.f16226a, this.f16260u);
                        continue;
                    case 7:
                        dVar.b(this.f16226a, this.f16261v);
                        continue;
                    case '\b':
                        dVar.b(this.f16226a, this.f16256q);
                        continue;
                    case '\t':
                        dVar.b(this.f16226a, this.f16255p);
                        continue;
                    case '\n':
                        dVar.b(this.f16226a, this.f16257r);
                        continue;
                    case 11:
                        dVar.b(this.f16226a, this.f16254o);
                        continue;
                    case '\f':
                        dVar.b(this.f16226a, this.f16251k);
                        continue;
                    case '\r':
                        dVar.b(this.f16226a, this.f16252l);
                        continue;
                    default:
                        if (!str2.startsWith("CUSTOM")) {
                            Log.v("WARNING KeyCycle", "  UNKNOWN  " + str2);
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
    }

    @Override // w.d
    /* renamed from: b */
    public d clone() {
        f fVar = new f();
        super.c(this);
        fVar.f16246f = this.f16246f;
        fVar.f16247g = this.f16247g;
        fVar.f16248h = this.f16248h;
        fVar.f16249i = this.f16249i;
        fVar.f16250j = this.f16250j;
        fVar.f16251k = this.f16251k;
        fVar.f16252l = this.f16252l;
        fVar.f16253m = this.f16253m;
        fVar.n = this.n;
        fVar.f16254o = this.f16254o;
        fVar.f16255p = this.f16255p;
        fVar.f16256q = this.f16256q;
        fVar.f16257r = this.f16257r;
        fVar.f16258s = this.f16258s;
        fVar.f16259t = this.f16259t;
        fVar.f16260u = this.f16260u;
        fVar.f16261v = this.f16261v;
        fVar.f16262w = this.f16262w;
        fVar.f16263x = this.f16263x;
        fVar.y = this.y;
        return fVar;
    }

    @Override // w.d
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f16254o)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f16255p)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f16256q)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f16258s)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f16259t)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f16260u)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f16261v)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f16257r)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f16262w)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f16263x)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.y)) {
            hashSet.add("translationZ");
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.I);
        SparseIntArray sparseIntArray = a.f16264a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            switch (a.f16264a.get(index)) {
                case 1:
                    if (MotionLayout.Y0) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f16227b);
                        this.f16227b = resourceId;
                        if (resourceId == -1) {
                            this.f16228c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.f16228c = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f16227b = obtainStyledAttributes.getResourceId(index, this.f16227b);
                        break;
                    }
                case 2:
                    this.f16226a = obtainStyledAttributes.getInt(index, this.f16226a);
                    break;
                case 3:
                    this.f16246f = obtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f16247g = obtainStyledAttributes.getInteger(index, this.f16247g);
                    break;
                case 5:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.f16249i = obtainStyledAttributes.getString(index);
                        this.f16248h = 7;
                        break;
                    } else {
                        this.f16248h = obtainStyledAttributes.getInt(index, this.f16248h);
                        break;
                    }
                case 6:
                    this.f16250j = obtainStyledAttributes.getFloat(index, this.f16250j);
                    break;
                case 7:
                    if (obtainStyledAttributes.peekValue(index).type == 5) {
                        this.f16251k = obtainStyledAttributes.getDimension(index, this.f16251k);
                        break;
                    } else {
                        this.f16251k = obtainStyledAttributes.getFloat(index, this.f16251k);
                        break;
                    }
                case 8:
                    this.n = obtainStyledAttributes.getInt(index, this.n);
                    break;
                case 9:
                    this.f16254o = obtainStyledAttributes.getFloat(index, this.f16254o);
                    break;
                case 10:
                    this.f16255p = obtainStyledAttributes.getDimension(index, this.f16255p);
                    break;
                case 11:
                    this.f16256q = obtainStyledAttributes.getFloat(index, this.f16256q);
                    break;
                case 12:
                    this.f16258s = obtainStyledAttributes.getFloat(index, this.f16258s);
                    break;
                case 13:
                    this.f16259t = obtainStyledAttributes.getFloat(index, this.f16259t);
                    break;
                case 14:
                    this.f16257r = obtainStyledAttributes.getFloat(index, this.f16257r);
                    break;
                case 15:
                    this.f16260u = obtainStyledAttributes.getFloat(index, this.f16260u);
                    break;
                case 16:
                    this.f16261v = obtainStyledAttributes.getFloat(index, this.f16261v);
                    break;
                case 17:
                    this.f16262w = obtainStyledAttributes.getDimension(index, this.f16262w);
                    break;
                case 18:
                    this.f16263x = obtainStyledAttributes.getDimension(index, this.f16263x);
                    break;
                case 19:
                    this.y = obtainStyledAttributes.getDimension(index, this.y);
                    break;
                case 20:
                    this.f16253m = obtainStyledAttributes.getFloat(index, this.f16253m);
                    break;
                case 21:
                    this.f16252l = obtainStyledAttributes.getFloat(index, this.f16252l) / 360.0f;
                    break;
                default:
                    StringBuilder m10 = a1.a.m("unused attribute 0x");
                    a0.a.q(index, m10, "   ");
                    m10.append(a.f16264a.get(index));
                    Log.e("KeyCycle", m10.toString());
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d5, code lost:
        if (r3.equals("scaleY") == false) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(java.util.HashMap<java.lang.String, v.c> r18) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.f.i(java.util.HashMap):void");
    }
}
