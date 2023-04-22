package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import com.app.pornhub.R;
import e.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t9.j0;
import w.g;
import w.n;
import w.s;
import w.t;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public int f1493a;

    /* renamed from: e  reason: collision with root package name */
    public int f1496e;

    /* renamed from: f  reason: collision with root package name */
    public g f1497f;

    /* renamed from: g  reason: collision with root package name */
    public a.C0022a f1498g;

    /* renamed from: j  reason: collision with root package name */
    public int f1501j;

    /* renamed from: k  reason: collision with root package name */
    public String f1502k;

    /* renamed from: o  reason: collision with root package name */
    public Context f1505o;

    /* renamed from: b  reason: collision with root package name */
    public int f1494b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1495c = false;
    public int d = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f1499h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f1500i = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f1503l = 0;

    /* renamed from: m  reason: collision with root package name */
    public String f1504m = null;
    public int n = -1;

    /* renamed from: p  reason: collision with root package name */
    public int f1506p = -1;

    /* renamed from: q  reason: collision with root package name */
    public int f1507q = -1;

    /* renamed from: r  reason: collision with root package name */
    public int f1508r = -1;

    /* renamed from: s  reason: collision with root package name */
    public int f1509s = -1;

    /* renamed from: t  reason: collision with root package name */
    public int f1510t = -1;

    /* renamed from: u  reason: collision with root package name */
    public int f1511u = -1;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f1512a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1513b;

        /* renamed from: c  reason: collision with root package name */
        public n f1514c;
        public int d;

        /* renamed from: f  reason: collision with root package name */
        public d f1516f;

        /* renamed from: g  reason: collision with root package name */
        public Interpolator f1517g;

        /* renamed from: i  reason: collision with root package name */
        public float f1519i;

        /* renamed from: j  reason: collision with root package name */
        public float f1520j;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1523m;

        /* renamed from: e  reason: collision with root package name */
        public p f1515e = new p(1);

        /* renamed from: h  reason: collision with root package name */
        public boolean f1518h = false;

        /* renamed from: l  reason: collision with root package name */
        public Rect f1522l = new Rect();

        /* renamed from: k  reason: collision with root package name */
        public long f1521k = System.nanoTime();

        public a(d dVar, n nVar, int i10, int i11, int i12, Interpolator interpolator, int i13, int i14) {
            this.f1523m = false;
            this.f1516f = dVar;
            this.f1514c = nVar;
            this.d = i11;
            d dVar2 = this.f1516f;
            if (dVar2.f1527e == null) {
                dVar2.f1527e = new ArrayList<>();
            }
            dVar2.f1527e.add(this);
            this.f1517g = interpolator;
            this.f1512a = i13;
            this.f1513b = i14;
            if (i12 == 3) {
                this.f1523m = true;
            }
            this.f1520j = i10 == 0 ? Float.MAX_VALUE : 1.0f / i10;
            a();
        }

        public void a() {
            if (this.f1518h) {
                long nanoTime = System.nanoTime();
                this.f1521k = nanoTime;
                float f10 = this.f1519i - (((float) ((nanoTime - this.f1521k) * 1.0E-6d)) * this.f1520j);
                this.f1519i = f10;
                if (f10 < 0.0f) {
                    this.f1519i = 0.0f;
                }
                Interpolator interpolator = this.f1517g;
                float interpolation = interpolator == null ? this.f1519i : interpolator.getInterpolation(this.f1519i);
                n nVar = this.f1514c;
                boolean d = nVar.d(nVar.f16327b, interpolation, nanoTime, this.f1515e);
                if (this.f1519i <= 0.0f) {
                    int i10 = this.f1512a;
                    if (i10 != -1) {
                        this.f1514c.f16327b.setTag(i10, Long.valueOf(System.nanoTime()));
                    }
                    int i11 = this.f1513b;
                    if (i11 != -1) {
                        this.f1514c.f16327b.setTag(i11, null);
                    }
                    this.f1516f.f1528f.add(this);
                }
                if (this.f1519i <= 0.0f && !d) {
                    return;
                }
                this.f1516f.f1524a.invalidate();
                return;
            }
            long nanoTime2 = System.nanoTime();
            this.f1521k = nanoTime2;
            float f11 = (((float) ((nanoTime2 - this.f1521k) * 1.0E-6d)) * this.f1520j) + this.f1519i;
            this.f1519i = f11;
            if (f11 >= 1.0f) {
                this.f1519i = 1.0f;
            }
            Interpolator interpolator2 = this.f1517g;
            float interpolation2 = interpolator2 == null ? this.f1519i : interpolator2.getInterpolation(this.f1519i);
            n nVar2 = this.f1514c;
            boolean d10 = nVar2.d(nVar2.f16327b, interpolation2, nanoTime2, this.f1515e);
            if (this.f1519i >= 1.0f) {
                int i12 = this.f1512a;
                if (i12 != -1) {
                    this.f1514c.f16327b.setTag(i12, Long.valueOf(System.nanoTime()));
                }
                int i13 = this.f1513b;
                if (i13 != -1) {
                    this.f1514c.f16327b.setTag(i13, null);
                }
                if (!this.f1523m) {
                    this.f1516f.f1528f.add(this);
                }
            }
            if (this.f1519i >= 1.0f && !d10) {
                return;
            }
            this.f1516f.f1524a.invalidate();
        }

        public void b(boolean z10) {
            int i10;
            this.f1518h = z10;
            if (z10 && (i10 = this.d) != -1) {
                this.f1520j = i10 == 0 ? Float.MAX_VALUE : 1.0f / i10;
            }
            this.f1516f.f1524a.invalidate();
            this.f1521k = System.nanoTime();
        }
    }

    public c(Context context, XmlPullParser xmlPullParser) {
        char c10;
        this.f1505o = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (name.equals("ConstraintOverride")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 366511058:
                            if (name.equals("CustomMethod")) {
                                c10 = 4;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    if (c10 == 0) {
                        d(context, xmlPullParser);
                    } else if (c10 == 1) {
                        this.f1497f = new g(context, xmlPullParser);
                    } else if (c10 == 2) {
                        this.f1498g = androidx.constraintlayout.widget.a.d(context, xmlPullParser);
                    } else if (c10 == 3 || c10 == 4) {
                        ConstraintAttribute.e(context, xmlPullParser, this.f1498g.f1694g);
                    } else {
                        Log.e("ViewTransition", w.a.a() + " unknown tag " + name);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(".xml:");
                        sb2.append(xmlPullParser.getLineNumber());
                        Log.e("ViewTransition", sb2.toString());
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("ViewTransition".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    public void a(d dVar, MotionLayout motionLayout, int i10, androidx.constraintlayout.widget.a aVar, View... viewArr) {
        int[] constraintSetIds;
        Interpolator loadInterpolator;
        t tVar;
        if (this.f1495c) {
            return;
        }
        int i11 = this.f1496e;
        if (i11 == 2) {
            View view = viewArr[0];
            n nVar = new n(view);
            w.p pVar = nVar.f16330f;
            pVar.f16351j = 0.0f;
            pVar.f16352m = 0.0f;
            nVar.H = true;
            pVar.e(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            nVar.f16331g.e(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            nVar.f16332h.f(view);
            nVar.f16333i.f(view);
            this.f1497f.a(nVar);
            nVar.g(motionLayout.getWidth(), motionLayout.getHeight(), System.nanoTime());
            int i12 = this.f1499h;
            int i13 = this.f1500i;
            int i14 = this.f1494b;
            Context context = motionLayout.getContext();
            int i15 = this.f1503l;
            if (i15 == -2) {
                loadInterpolator = AnimationUtils.loadInterpolator(context, this.n);
            } else if (i15 == -1) {
                tVar = new t(this, r.c.c(this.f1504m));
                new a(dVar, nVar, i12, i13, i14, tVar, this.f1506p, this.f1507q);
                return;
            } else {
                loadInterpolator = i15 != 0 ? i15 != 1 ? i15 != 2 ? i15 != 4 ? i15 != 5 ? i15 != 6 ? null : new AnticipateInterpolator() : new OvershootInterpolator() : new BounceInterpolator() : new DecelerateInterpolator() : new AccelerateInterpolator() : new AccelerateDecelerateInterpolator();
            }
            tVar = loadInterpolator;
            new a(dVar, nVar, i12, i13, i14, tVar, this.f1506p, this.f1507q);
            return;
        }
        if (i11 == 1) {
            for (int i16 : motionLayout.getConstraintSetIds()) {
                if (i16 != i10) {
                    androidx.constraintlayout.widget.a E = motionLayout.E(i16);
                    for (View view2 : viewArr) {
                        a.C0022a k10 = E.k(view2.getId());
                        a.C0022a c0022a = this.f1498g;
                        if (c0022a != null) {
                            a.C0022a.C0023a c0023a = c0022a.f1695h;
                            if (c0023a != null) {
                                c0023a.e(k10);
                            }
                            k10.f1694g.putAll(this.f1498g.f1694g);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.a aVar2 = new androidx.constraintlayout.widget.a();
        aVar2.f1688f.clear();
        for (Integer num : aVar.f1688f.keySet()) {
            a.C0022a c0022a2 = aVar.f1688f.get(num);
            if (c0022a2 != null) {
                aVar2.f1688f.put(num, c0022a2.clone());
            }
        }
        for (View view3 : viewArr) {
            a.C0022a k11 = aVar2.k(view3.getId());
            a.C0022a c0022a3 = this.f1498g;
            if (c0022a3 != null) {
                a.C0022a.C0023a c0023a2 = c0022a3.f1695h;
                if (c0023a2 != null) {
                    c0023a2.e(k11);
                }
                k11.f1694g.putAll(this.f1498g.f1694g);
            }
        }
        motionLayout.S(i10, aVar2);
        motionLayout.S(R.id.view_transition, aVar);
        motionLayout.L(R.id.view_transition, -1, -1);
        a.b bVar = new a.b(-1, motionLayout.I, R.id.view_transition, i10);
        for (View view4 : viewArr) {
            int i17 = this.f1499h;
            if (i17 != -1) {
                bVar.f1457h = Math.max(i17, 8);
            }
            bVar.f1464p = this.d;
            int i18 = this.f1503l;
            String str = this.f1504m;
            int i19 = this.n;
            bVar.f1454e = i18;
            bVar.f1455f = str;
            bVar.f1456g = i19;
            int id2 = view4.getId();
            g gVar = this.f1497f;
            if (gVar != null) {
                g gVar2 = new g();
                Iterator<w.d> it = gVar.f16266a.get(-1).iterator();
                while (it.hasNext()) {
                    w.d clone = it.next().clone();
                    clone.f16227b = id2;
                    gVar2.c(clone);
                }
                bVar.f1460k.add(gVar2);
            }
        }
        motionLayout.setTransition(bVar);
        s sVar = new s(this, viewArr, 0);
        motionLayout.y(1.0f);
        motionLayout.N0 = sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(android.view.View r10) {
        /*
            r9 = this;
            r5 = r9
            int r0 = r5.f1508r
            java.lang.String r7 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r8 = -1
            r1 = r8
            r2 = 0
            r7 = 6
            r3 = 1
            if (r0 != r1) goto L10
            r8 = 6
        Ld:
            r7 = 1
            r0 = r7
            goto L1b
        L10:
            java.lang.Object r8 = r10.getTag(r0)
            r0 = r8
            if (r0 == 0) goto L19
            r7 = 2
            goto Ld
        L19:
            r8 = 0
            r0 = r8
        L1b:
            int r4 = r5.f1509s
            r8 = 1
            if (r4 != r1) goto L22
        L20:
            r10 = 1
            goto L2d
        L22:
            java.lang.Object r7 = r10.getTag(r4)
            r10 = r7
            if (r10 != 0) goto L2a
            goto L20
        L2a:
            r7 = 4
            r10 = 0
            r7 = 3
        L2d:
            if (r0 == 0) goto L35
            r8 = 6
            if (r10 == 0) goto L35
            r7 = 2
            r8 = 1
            r2 = r8
        L35:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.c.b(android.view.View):boolean");
    }

    public boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f1501j != -1 || this.f1502k != null) && b(view)) {
            if (view.getId() == this.f1501j) {
                return true;
            }
            return this.f1502k != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).Y) != null && str.matches(this.f1502k);
        }
        return false;
    }

    public final void d(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j0.f15261d0);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f1493a = obtainStyledAttributes.getResourceId(index, this.f1493a);
            } else if (index == 8) {
                if (MotionLayout.Y0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f1501j);
                    this.f1501j = resourceId;
                    if (resourceId == -1) {
                        this.f1502k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.f1502k = obtainStyledAttributes.getString(index);
                } else {
                    this.f1501j = obtainStyledAttributes.getResourceId(index, this.f1501j);
                }
            } else if (index == 9) {
                this.f1494b = obtainStyledAttributes.getInt(index, this.f1494b);
            } else if (index == 12) {
                this.f1495c = obtainStyledAttributes.getBoolean(index, this.f1495c);
            } else if (index == 10) {
                this.d = obtainStyledAttributes.getInt(index, this.d);
            } else if (index == 4) {
                this.f1499h = obtainStyledAttributes.getInt(index, this.f1499h);
            } else if (index == 13) {
                this.f1500i = obtainStyledAttributes.getInt(index, this.f1500i);
            } else if (index == 14) {
                this.f1496e = obtainStyledAttributes.getInt(index, this.f1496e);
            } else if (index == 7) {
                int i11 = obtainStyledAttributes.peekValue(index).type;
                if (i11 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f1503l = -2;
                    }
                } else if (i11 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1504m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f1503l = -1;
                    } else {
                        this.n = obtainStyledAttributes.getResourceId(index, -1);
                        this.f1503l = -2;
                    }
                } else {
                    this.f1503l = obtainStyledAttributes.getInteger(index, this.f1503l);
                }
            } else if (index == 11) {
                this.f1506p = obtainStyledAttributes.getResourceId(index, this.f1506p);
            } else if (index == 3) {
                this.f1507q = obtainStyledAttributes.getResourceId(index, this.f1507q);
            } else if (index == 6) {
                this.f1508r = obtainStyledAttributes.getResourceId(index, this.f1508r);
            } else if (index == 5) {
                this.f1509s = obtainStyledAttributes.getResourceId(index, this.f1509s);
            } else if (index == 2) {
                this.f1511u = obtainStyledAttributes.getResourceId(index, this.f1511u);
            } else if (index == 1) {
                this.f1510t = obtainStyledAttributes.getInteger(index, this.f1510t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("ViewTransition(");
        m10.append(w.a.c(this.f1505o, this.f1493a));
        m10.append(")");
        return m10.toString();
    }
}
