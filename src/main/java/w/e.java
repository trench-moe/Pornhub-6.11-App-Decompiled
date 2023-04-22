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
public class e extends d {

    /* renamed from: f  reason: collision with root package name */
    public int f16230f = -1;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16231g = false;

    /* renamed from: h  reason: collision with root package name */
    public float f16232h = Float.NaN;

    /* renamed from: i  reason: collision with root package name */
    public float f16233i = Float.NaN;

    /* renamed from: j  reason: collision with root package name */
    public float f16234j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    public float f16235k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    public float f16236l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    public float f16237m = Float.NaN;
    public float n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    public float f16238o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    public float f16239p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    public float f16240q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    public float f16241r = Float.NaN;

    /* renamed from: s  reason: collision with root package name */
    public float f16242s = Float.NaN;

    /* renamed from: t  reason: collision with root package name */
    public float f16243t = Float.NaN;

    /* renamed from: u  reason: collision with root package name */
    public float f16244u = Float.NaN;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static SparseIntArray f16245a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f16245a = sparseIntArray;
            sparseIntArray.append(0, 1);
            f16245a.append(11, 2);
            f16245a.append(7, 4);
            f16245a.append(8, 5);
            f16245a.append(9, 6);
            f16245a.append(1, 19);
            f16245a.append(2, 20);
            f16245a.append(5, 7);
            f16245a.append(18, 8);
            f16245a.append(17, 9);
            f16245a.append(15, 10);
            f16245a.append(13, 12);
            f16245a.append(12, 13);
            f16245a.append(6, 14);
            f16245a.append(3, 15);
            f16245a.append(4, 16);
            f16245a.append(10, 17);
            f16245a.append(14, 18);
        }
    }

    public e() {
        this.d = 1;
        this.f16229e = new HashMap<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x000c, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c7, code lost:
        if (r1.equals("scaleY") == false) goto L14;
     */
    @Override // w.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.util.HashMap<java.lang.String, v.d> r10) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.e.a(java.util.HashMap):void");
    }

    @Override // w.d
    /* renamed from: b */
    public d clone() {
        e eVar = new e();
        super.c(this);
        eVar.f16230f = this.f16230f;
        eVar.f16231g = this.f16231g;
        eVar.f16232h = this.f16232h;
        eVar.f16233i = this.f16233i;
        eVar.f16234j = this.f16234j;
        eVar.f16235k = this.f16235k;
        eVar.f16236l = this.f16236l;
        eVar.f16237m = this.f16237m;
        eVar.n = this.n;
        eVar.f16238o = this.f16238o;
        eVar.f16239p = this.f16239p;
        eVar.f16240q = this.f16240q;
        eVar.f16241r = this.f16241r;
        eVar.f16242s = this.f16242s;
        eVar.f16243t = this.f16243t;
        eVar.f16244u = this.f16244u;
        return eVar;
    }

    @Override // w.d
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f16232h)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f16233i)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f16234j)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f16235k)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f16236l)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f16237m)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f16241r)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f16242s)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f16243t)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f16238o)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f16239p)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f16240q)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f16244u)) {
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.H);
        SparseIntArray sparseIntArray = a.f16245a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            switch (a.f16245a.get(index)) {
                case 1:
                    this.f16232h = obtainStyledAttributes.getFloat(index, this.f16232h);
                    break;
                case 2:
                    this.f16233i = obtainStyledAttributes.getDimension(index, this.f16233i);
                    break;
                case 3:
                case 11:
                default:
                    StringBuilder m10 = a1.a.m("unused attribute 0x");
                    a0.a.q(index, m10, "   ");
                    m10.append(a.f16245a.get(index));
                    Log.e("KeyAttribute", m10.toString());
                    break;
                case 4:
                    this.f16234j = obtainStyledAttributes.getFloat(index, this.f16234j);
                    break;
                case 5:
                    this.f16235k = obtainStyledAttributes.getFloat(index, this.f16235k);
                    break;
                case 6:
                    this.f16236l = obtainStyledAttributes.getFloat(index, this.f16236l);
                    break;
                case 7:
                    this.f16239p = obtainStyledAttributes.getFloat(index, this.f16239p);
                    break;
                case 8:
                    this.f16238o = obtainStyledAttributes.getFloat(index, this.f16238o);
                    break;
                case 9:
                    obtainStyledAttributes.getString(index);
                    break;
                case 10:
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
                case 12:
                    this.f16226a = obtainStyledAttributes.getInt(index, this.f16226a);
                    break;
                case 13:
                    this.f16230f = obtainStyledAttributes.getInteger(index, this.f16230f);
                    break;
                case 14:
                    this.f16240q = obtainStyledAttributes.getFloat(index, this.f16240q);
                    break;
                case 15:
                    this.f16241r = obtainStyledAttributes.getDimension(index, this.f16241r);
                    break;
                case 16:
                    this.f16242s = obtainStyledAttributes.getDimension(index, this.f16242s);
                    break;
                case 17:
                    this.f16243t = obtainStyledAttributes.getDimension(index, this.f16243t);
                    break;
                case 18:
                    this.f16244u = obtainStyledAttributes.getFloat(index, this.f16244u);
                    break;
                case 19:
                    this.f16237m = obtainStyledAttributes.getDimension(index, this.f16237m);
                    break;
                case 20:
                    this.n = obtainStyledAttributes.getDimension(index, this.n);
                    break;
            }
        }
    }

    @Override // w.d
    public void f(HashMap<String, Integer> hashMap) {
        if (this.f16230f == -1) {
            return;
        }
        if (!Float.isNaN(this.f16232h)) {
            hashMap.put("alpha", Integer.valueOf(this.f16230f));
        }
        if (!Float.isNaN(this.f16233i)) {
            hashMap.put("elevation", Integer.valueOf(this.f16230f));
        }
        if (!Float.isNaN(this.f16234j)) {
            hashMap.put("rotation", Integer.valueOf(this.f16230f));
        }
        if (!Float.isNaN(this.f16235k)) {
            hashMap.put("rotationX", Integer.valueOf(this.f16230f));
        }
        if (!Float.isNaN(this.f16236l)) {
            hashMap.put("rotationY", Integer.valueOf(this.f16230f));
        }
        if (!Float.isNaN(this.f16237m)) {
            hashMap.put("transformPivotX", Integer.valueOf(this.f16230f));
        }
        if (!Float.isNaN(this.n)) {
            hashMap.put("transformPivotY", Integer.valueOf(this.f16230f));
        }
        if (!Float.isNaN(this.f16241r)) {
            hashMap.put("translationX", Integer.valueOf(this.f16230f));
        }
        if (!Float.isNaN(this.f16242s)) {
            hashMap.put("translationY", Integer.valueOf(this.f16230f));
        }
        if (!Float.isNaN(this.f16243t)) {
            hashMap.put("translationZ", Integer.valueOf(this.f16230f));
        }
        if (!Float.isNaN(this.f16238o)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f16230f));
        }
        if (!Float.isNaN(this.f16239p)) {
            hashMap.put("scaleX", Integer.valueOf(this.f16230f));
        }
        if (!Float.isNaN(this.f16240q)) {
            hashMap.put("scaleY", Integer.valueOf(this.f16230f));
        }
        if (!Float.isNaN(this.f16244u)) {
            hashMap.put("progress", Integer.valueOf(this.f16230f));
        }
        if (this.f16229e.size() > 0) {
            for (String str : this.f16229e.keySet()) {
                hashMap.put(a1.a.l("CUSTOM,", str), Integer.valueOf(this.f16230f));
            }
        }
    }

    public void i(String str, Object obj) {
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1913008125:
                if (!str.equals("motionProgress")) {
                    break;
                } else {
                    c10 = 0;
                    break;
                }
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1249320806:
                if (!str.equals("rotationX")) {
                    break;
                } else {
                    c10 = 2;
                    break;
                }
            case -1249320805:
                if (str.equals("rotationY")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1225497657:
                if (!str.equals("translationX")) {
                    break;
                } else {
                    c10 = 4;
                    break;
                }
            case -1225497656:
                if (str.equals("translationY")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c10 = 6;
                    break;
                }
                break;
            case -908189618:
                if (!str.equals("scaleX")) {
                    break;
                } else {
                    c10 = 7;
                    break;
                }
            case -908189617:
                if (!str.equals("scaleY")) {
                    break;
                } else {
                    c10 = '\b';
                    break;
                }
            case -760884510:
                if (str.equals("transformPivotX")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -760884509:
                if (!str.equals("transformPivotY")) {
                    break;
                } else {
                    c10 = '\n';
                    break;
                }
            case -40300674:
                if (!str.equals("rotation")) {
                    break;
                } else {
                    c10 = 11;
                    break;
                }
            case -4379043:
                if (!str.equals("elevation")) {
                    break;
                } else {
                    c10 = '\f';
                    break;
                }
            case 37232917:
                if (!str.equals("transitionPathRotate")) {
                    break;
                } else {
                    c10 = '\r';
                    break;
                }
            case 92909918:
                if (str.equals("alpha")) {
                    c10 = 14;
                    break;
                }
                break;
            case 579057826:
                if (!str.equals("curveFit")) {
                    break;
                } else {
                    c10 = 15;
                    break;
                }
            case 1941332754:
                if (str.equals("visibility")) {
                    c10 = 16;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.f16244u = g(obj);
                return;
            case 1:
                obj.toString();
                return;
            case 2:
                this.f16235k = g(obj);
                return;
            case 3:
                this.f16236l = g(obj);
                return;
            case 4:
                this.f16241r = g(obj);
                return;
            case 5:
                this.f16242s = g(obj);
                return;
            case 6:
                this.f16243t = g(obj);
                return;
            case 7:
                this.f16239p = g(obj);
                return;
            case '\b':
                this.f16240q = g(obj);
                return;
            case '\t':
                this.f16237m = g(obj);
                return;
            case '\n':
                this.n = g(obj);
                return;
            case 11:
                this.f16234j = g(obj);
                return;
            case '\f':
                this.f16233i = g(obj);
                return;
            case '\r':
                this.f16238o = g(obj);
                return;
            case 14:
                this.f16232h = g(obj);
                return;
            case 15:
                this.f16230f = h(obj);
                return;
            case 16:
                this.f16231g = obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
                return;
            default:
                return;
        }
    }
}
