package w;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import t9.j0;

/* loaded from: classes2.dex */
public class h extends i {

    /* renamed from: g  reason: collision with root package name */
    public String f16267g = null;

    /* renamed from: h  reason: collision with root package name */
    public int f16268h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f16269i = 0;

    /* renamed from: j  reason: collision with root package name */
    public float f16270j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    public float f16271k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    public float f16272l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    public float f16273m = Float.NaN;
    public float n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    public float f16274o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    public int f16275p = 0;

    /* renamed from: q  reason: collision with root package name */
    public float f16276q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    public float f16277r = Float.NaN;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static SparseIntArray f16278a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f16278a = sparseIntArray;
            sparseIntArray.append(4, 1);
            f16278a.append(2, 2);
            f16278a.append(11, 3);
            f16278a.append(0, 4);
            f16278a.append(1, 5);
            f16278a.append(8, 6);
            f16278a.append(9, 7);
            f16278a.append(3, 9);
            f16278a.append(10, 8);
            f16278a.append(7, 11);
            f16278a.append(6, 12);
            f16278a.append(5, 10);
        }
    }

    public h() {
        this.d = 2;
    }

    @Override // w.d
    public void a(HashMap<String, v.d> hashMap) {
    }

    @Override // w.d
    public d b() {
        h hVar = new h();
        super.c(this);
        hVar.f16267g = this.f16267g;
        hVar.f16268h = this.f16268h;
        hVar.f16269i = this.f16269i;
        hVar.f16270j = this.f16270j;
        hVar.f16271k = Float.NaN;
        hVar.f16272l = this.f16272l;
        hVar.f16273m = this.f16273m;
        hVar.n = this.n;
        hVar.f16274o = this.f16274o;
        hVar.f16276q = this.f16276q;
        hVar.f16277r = this.f16277r;
        return hVar;
    }

    @Override // w.d
    public void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.J);
        SparseIntArray sparseIntArray = a.f16278a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            switch (a.f16278a.get(index)) {
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
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.f16267g = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f16267g = r.c.f14539c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    this.f16279f = obtainStyledAttributes.getInteger(index, this.f16279f);
                    break;
                case 5:
                    this.f16269i = obtainStyledAttributes.getInt(index, this.f16269i);
                    break;
                case 6:
                    this.f16272l = obtainStyledAttributes.getFloat(index, this.f16272l);
                    break;
                case 7:
                    this.f16273m = obtainStyledAttributes.getFloat(index, this.f16273m);
                    break;
                case 8:
                    float f10 = obtainStyledAttributes.getFloat(index, this.f16271k);
                    this.f16270j = f10;
                    this.f16271k = f10;
                    break;
                case 9:
                    this.f16275p = obtainStyledAttributes.getInt(index, this.f16275p);
                    break;
                case 10:
                    this.f16268h = obtainStyledAttributes.getInt(index, this.f16268h);
                    break;
                case 11:
                    this.f16270j = obtainStyledAttributes.getFloat(index, this.f16270j);
                    break;
                case 12:
                    this.f16271k = obtainStyledAttributes.getFloat(index, this.f16271k);
                    break;
                default:
                    StringBuilder m10 = a1.a.m("unused attribute 0x");
                    a0.a.q(index, m10, "   ");
                    m10.append(a.f16278a.get(index));
                    Log.e("KeyPosition", m10.toString());
                    break;
            }
        }
        if (this.f16226a == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }

    public void i(String str, Object obj) {
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1127236479:
                if (str.equals("percentWidth")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1017587252:
                if (str.equals("percentHeight")) {
                    c10 = 2;
                    break;
                }
                break;
            case -827014263:
                if (!str.equals("drawPath")) {
                    break;
                } else {
                    c10 = 3;
                    break;
                }
            case -200259324:
                if (str.equals("sizePercent")) {
                    c10 = 4;
                    break;
                }
                break;
            case 428090547:
                if (!str.equals("percentX")) {
                    break;
                } else {
                    c10 = 5;
                    break;
                }
            case 428090548:
                if (str.equals("percentY")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.f16267g = obj.toString();
                return;
            case 1:
                this.f16270j = g(obj);
                return;
            case 2:
                this.f16271k = g(obj);
                return;
            case 3:
                this.f16269i = h(obj);
                return;
            case 4:
                float g10 = g(obj);
                this.f16270j = g10;
                this.f16271k = g10;
                return;
            case 5:
                this.f16272l = g(obj);
                return;
            case 6:
                this.f16273m = g(obj);
                return;
            default:
                return;
        }
    }
}
