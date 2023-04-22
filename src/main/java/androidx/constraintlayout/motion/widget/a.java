package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.app.pornhub.R;
import io.reactivex.annotations.SchedulerSupport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import kotlin.io.ConstantsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t9.j0;
import w.g;
import w.n;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final MotionLayout f1433a;

    /* renamed from: b  reason: collision with root package name */
    public x.d f1434b;

    /* renamed from: c  reason: collision with root package name */
    public b f1435c;

    /* renamed from: e  reason: collision with root package name */
    public b f1436e;

    /* renamed from: l  reason: collision with root package name */
    public MotionEvent f1443l;

    /* renamed from: o  reason: collision with root package name */
    public MotionLayout.f f1445o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1446p;

    /* renamed from: q  reason: collision with root package name */
    public final d f1447q;

    /* renamed from: r  reason: collision with root package name */
    public float f1448r;

    /* renamed from: s  reason: collision with root package name */
    public float f1449s;
    public ArrayList<b> d = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<b> f1437f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public SparseArray<androidx.constraintlayout.widget.a> f1438g = new SparseArray<>();

    /* renamed from: h  reason: collision with root package name */
    public HashMap<String, Integer> f1439h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    public SparseIntArray f1440i = new SparseIntArray();

    /* renamed from: j  reason: collision with root package name */
    public int f1441j = 400;

    /* renamed from: k  reason: collision with root package name */
    public int f1442k = 0;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1444m = false;
    public boolean n = false;

    /* renamed from: androidx.constraintlayout.motion.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class animation.InterpolatorC0020a implements Interpolator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r.c f1450a;

        public animation.InterpolatorC0020a(a aVar, r.c cVar) {
            this.f1450a = cVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return (float) this.f1450a.a(f10);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1451a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1452b;

        /* renamed from: c  reason: collision with root package name */
        public int f1453c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f1454e;

        /* renamed from: f  reason: collision with root package name */
        public String f1455f;

        /* renamed from: g  reason: collision with root package name */
        public int f1456g;

        /* renamed from: h  reason: collision with root package name */
        public int f1457h;

        /* renamed from: i  reason: collision with root package name */
        public float f1458i;

        /* renamed from: j  reason: collision with root package name */
        public final a f1459j;

        /* renamed from: k  reason: collision with root package name */
        public ArrayList<g> f1460k;

        /* renamed from: l  reason: collision with root package name */
        public androidx.constraintlayout.motion.widget.b f1461l;

        /* renamed from: m  reason: collision with root package name */
        public ArrayList<View$OnClickListenerC0021a> f1462m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f1463o;

        /* renamed from: p  reason: collision with root package name */
        public int f1464p;

        /* renamed from: q  reason: collision with root package name */
        public int f1465q;

        /* renamed from: r  reason: collision with root package name */
        public int f1466r;

        /* renamed from: androidx.constraintlayout.motion.widget.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class View$OnClickListenerC0021a implements View.OnClickListener {

            /* renamed from: c  reason: collision with root package name */
            public final b f1467c;

            /* renamed from: f  reason: collision with root package name */
            public int f1468f;

            /* renamed from: j  reason: collision with root package name */
            public int f1469j;

            public View$OnClickListenerC0021a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.f1468f = -1;
                this.f1469j = 17;
                this.f1467c = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j0.V);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i10 = 0; i10 < indexCount; i10++) {
                    int index = obtainStyledAttributes.getIndex(i10);
                    if (index == 1) {
                        this.f1468f = obtainStyledAttributes.getResourceId(index, this.f1468f);
                    } else if (index == 0) {
                        this.f1469j = obtainStyledAttributes.getInt(index, this.f1469j);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v5, types: [android.view.View] */
            public void a(MotionLayout motionLayout, int i10, b bVar) {
                int i11 = this.f1468f;
                MotionLayout motionLayout2 = motionLayout;
                if (i11 != -1) {
                    motionLayout2 = motionLayout.findViewById(i11);
                }
                if (motionLayout2 == null) {
                    StringBuilder m10 = a1.a.m("OnClick could not find id ");
                    m10.append(this.f1468f);
                    Log.e("MotionScene", m10.toString());
                    return;
                }
                int i12 = bVar.d;
                int i13 = bVar.f1453c;
                if (i12 == -1) {
                    motionLayout2.setOnClickListener(this);
                    return;
                }
                int i14 = this.f1469j;
                int i15 = i14 & 1;
                boolean z10 = false;
                boolean z11 = (i15 != 0 && i10 == i12) | (i15 != 0 && i10 == i12) | ((i14 & 256) != 0 && i10 == i12) | ((i14 & 16) != 0 && i10 == i13);
                if ((i14 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 && i10 == i13) {
                    z10 = true;
                }
                if (z11 | z10) {
                    motionLayout2.setOnClickListener(this);
                }
            }

            public void b(MotionLayout motionLayout) {
                int i10 = this.f1468f;
                if (i10 == -1) {
                    return;
                }
                View findViewById = motionLayout.findViewById(i10);
                if (findViewById != null) {
                    findViewById.setOnClickListener(null);
                    return;
                }
                StringBuilder m10 = a1.a.m(" (*)  could not find id ");
                m10.append(this.f1468f);
                Log.e("MotionScene", m10.toString());
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x00c3  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onClick(android.view.View r12) {
                /*
                    Method dump skipped, instructions count: 276
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.a.b.View$OnClickListenerC0021a.onClick(android.view.View):void");
            }
        }

        public b(int i10, a aVar, int i11, int i12) {
            this.f1451a = -1;
            this.f1452b = false;
            this.f1453c = -1;
            this.d = -1;
            this.f1454e = 0;
            this.f1455f = null;
            this.f1456g = -1;
            this.f1457h = 400;
            this.f1458i = 0.0f;
            this.f1460k = new ArrayList<>();
            this.f1461l = null;
            this.f1462m = new ArrayList<>();
            this.n = 0;
            this.f1463o = false;
            this.f1464p = -1;
            this.f1465q = 0;
            this.f1466r = 0;
            this.f1451a = i10;
            this.f1459j = aVar;
            this.d = i11;
            this.f1453c = i12;
            this.f1457h = aVar.f1441j;
            this.f1465q = aVar.f1442k;
        }

        public b(a aVar, Context context, XmlPullParser xmlPullParser) {
            this.f1451a = -1;
            this.f1452b = false;
            this.f1453c = -1;
            this.d = -1;
            this.f1454e = 0;
            this.f1455f = null;
            this.f1456g = -1;
            this.f1457h = 400;
            this.f1458i = 0.0f;
            this.f1460k = new ArrayList<>();
            this.f1461l = null;
            this.f1462m = new ArrayList<>();
            this.n = 0;
            this.f1463o = false;
            this.f1464p = -1;
            this.f1465q = 0;
            this.f1466r = 0;
            this.f1457h = aVar.f1441j;
            this.f1465q = aVar.f1442k;
            this.f1459j = aVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j0.f15258b0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 2) {
                    this.f1453c = obtainStyledAttributes.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1453c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.a aVar2 = new androidx.constraintlayout.widget.a();
                        aVar2.l(context, this.f1453c);
                        aVar.f1438g.append(this.f1453c, aVar2);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f1453c = aVar.k(context, this.f1453c);
                    }
                } else if (index == 3) {
                    this.d = obtainStyledAttributes.getResourceId(index, this.d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.d);
                    if ("layout".equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.a aVar3 = new androidx.constraintlayout.widget.a();
                        aVar3.l(context, this.d);
                        aVar.f1438g.append(this.d, aVar3);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.d = aVar.k(context, this.d);
                    }
                } else if (index == 6) {
                    int i11 = obtainStyledAttributes.peekValue(index).type;
                    if (i11 == 1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        this.f1456g = resourceId;
                        if (resourceId != -1) {
                            this.f1454e = -2;
                        }
                    } else if (i11 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f1455f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f1456g = obtainStyledAttributes.getResourceId(index, -1);
                                this.f1454e = -2;
                            } else {
                                this.f1454e = -1;
                            }
                        }
                    } else {
                        this.f1454e = obtainStyledAttributes.getInteger(index, this.f1454e);
                    }
                } else if (index == 4) {
                    int i12 = obtainStyledAttributes.getInt(index, this.f1457h);
                    this.f1457h = i12;
                    if (i12 < 8) {
                        this.f1457h = 8;
                    }
                } else if (index == 8) {
                    this.f1458i = obtainStyledAttributes.getFloat(index, this.f1458i);
                } else if (index == 1) {
                    this.n = obtainStyledAttributes.getInteger(index, this.n);
                } else if (index == 0) {
                    this.f1451a = obtainStyledAttributes.getResourceId(index, this.f1451a);
                } else if (index == 9) {
                    this.f1463o = obtainStyledAttributes.getBoolean(index, this.f1463o);
                } else if (index == 7) {
                    this.f1464p = obtainStyledAttributes.getInteger(index, -1);
                } else if (index == 5) {
                    this.f1465q = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == 10) {
                    this.f1466r = obtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.d == -1) {
                this.f1452b = true;
            }
            obtainStyledAttributes.recycle();
        }

        public b(a aVar, b bVar) {
            this.f1451a = -1;
            this.f1452b = false;
            this.f1453c = -1;
            this.d = -1;
            this.f1454e = 0;
            this.f1455f = null;
            this.f1456g = -1;
            this.f1457h = 400;
            this.f1458i = 0.0f;
            this.f1460k = new ArrayList<>();
            this.f1461l = null;
            this.f1462m = new ArrayList<>();
            this.n = 0;
            this.f1463o = false;
            this.f1464p = -1;
            this.f1465q = 0;
            this.f1466r = 0;
            this.f1459j = aVar;
            this.f1457h = aVar.f1441j;
            if (bVar != null) {
                this.f1464p = bVar.f1464p;
                this.f1454e = bVar.f1454e;
                this.f1455f = bVar.f1455f;
                this.f1456g = bVar.f1456g;
                this.f1457h = bVar.f1457h;
                this.f1460k = bVar.f1460k;
                this.f1458i = bVar.f1458i;
                this.f1465q = bVar.f1465q;
            }
        }

        public boolean a(int i10) {
            return (i10 & this.f1466r) != 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a(Context context, MotionLayout motionLayout, int i10) {
        this.f1434b = null;
        this.f1435c = null;
        this.f1436e = null;
        this.f1433a = motionLayout;
        this.f1447q = new d(motionLayout);
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            b bVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    char c10 = 2;
                    if (eventType != 2) {
                        continue;
                    } else {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (name.equals("ConstraintSet")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1239391468:
                                if (name.equals("KeyFrameSet")) {
                                    c10 = '\b';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -687739768:
                                if (name.equals("Include")) {
                                    c10 = 7;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 61998586:
                                if (name.equals("ViewTransition")) {
                                    c10 = '\t';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 269306229:
                                if (name.equals("Transition")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 312750793:
                                if (name.equals("OnClick")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 327855227:
                                if (name.equals("OnSwipe")) {
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 793277014:
                                if (name.equals("MotionScene")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1382829617:
                                if (name.equals("StateSet")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1942574248:
                                if (name.equals("include")) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                                m(context, xml);
                                continue;
                            case 1:
                                ArrayList<b> arrayList = this.d;
                                bVar = new b(this, context, xml);
                                arrayList.add(bVar);
                                if (this.f1435c == null && !bVar.f1452b) {
                                    this.f1435c = bVar;
                                    androidx.constraintlayout.motion.widget.b bVar2 = bVar.f1461l;
                                    if (bVar2 != null) {
                                        bVar2.c(this.f1446p);
                                    }
                                }
                                if (bVar.f1452b) {
                                    if (bVar.f1453c == -1) {
                                        this.f1436e = bVar;
                                    } else {
                                        this.f1437f.add(bVar);
                                    }
                                    this.d.remove(bVar);
                                    continue;
                                } else {
                                    continue;
                                }
                            case 2:
                                if (bVar == null) {
                                    Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i10) + ".xml:" + xml.getLineNumber() + ")");
                                }
                                if (bVar != null) {
                                    bVar.f1461l = new androidx.constraintlayout.motion.widget.b(context, this.f1433a, xml);
                                    continue;
                                } else {
                                    continue;
                                }
                            case 3:
                                if (bVar != null) {
                                    bVar.f1462m.add(new b.View$OnClickListenerC0021a(context, bVar, xml));
                                    continue;
                                } else {
                                    continue;
                                }
                            case 4:
                                this.f1434b = new x.d(context, xml);
                                continue;
                            case 5:
                                j(context, xml);
                                continue;
                            case 6:
                            case 7:
                                l(context, xml);
                                continue;
                            case '\b':
                                g gVar = new g(context, xml);
                                if (bVar != null) {
                                    bVar.f1460k.add(gVar);
                                    continue;
                                } else {
                                    continue;
                                }
                            case '\t':
                                c cVar = new c(context, xml);
                                d dVar = this.f1447q;
                                dVar.f1525b.add(cVar);
                                dVar.f1526c = null;
                                int i11 = cVar.f1494b;
                                if (i11 == 4) {
                                    dVar.a(cVar, true);
                                    continue;
                                } else if (i11 == 5) {
                                    dVar.a(cVar, false);
                                    continue;
                                } else {
                                    continue;
                                }
                            default:
                                continue;
                        }
                    }
                } else {
                    xml.getName();
                    continue;
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
        this.f1438g.put(R.id.motion_base, new androidx.constraintlayout.widget.a());
        this.f1439h.put("motion_base", Integer.valueOf((int) R.id.motion_base));
    }

    public boolean a(MotionLayout motionLayout, int i10) {
        b bVar;
        int i11;
        int i12;
        MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.FINISHED;
        MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.MOVING;
        MotionLayout.TransitionState transitionState3 = MotionLayout.TransitionState.SETUP;
        if (this.f1445o != null) {
            return false;
        }
        Iterator<b> it = this.d.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.n != 0 && ((bVar = this.f1435c) != next || !bVar.a(2))) {
                if (i10 != next.d || ((i12 = next.n) != 4 && i12 != 2)) {
                    if (i10 == next.f1453c && ((i11 = next.n) == 3 || i11 == 1)) {
                        motionLayout.setState(transitionState);
                        motionLayout.setTransition(next);
                        if (next.n == 3) {
                            motionLayout.y(0.0f);
                            motionLayout.setState(transitionState3);
                            motionLayout.setState(transitionState2);
                        } else {
                            motionLayout.setProgress(0.0f);
                            motionLayout.A(true);
                            motionLayout.setState(transitionState3);
                            motionLayout.setState(transitionState2);
                            motionLayout.setState(transitionState);
                            motionLayout.I();
                        }
                        return true;
                    }
                }
                motionLayout.setState(transitionState);
                motionLayout.setTransition(next);
                if (next.n == 4) {
                    motionLayout.O();
                    motionLayout.setState(transitionState3);
                    motionLayout.setState(transitionState2);
                } else {
                    motionLayout.setProgress(1.0f);
                    motionLayout.A(true);
                    motionLayout.setState(transitionState3);
                    motionLayout.setState(transitionState2);
                    motionLayout.setState(transitionState);
                    motionLayout.I();
                }
                return true;
            }
        }
        return false;
    }

    public androidx.constraintlayout.widget.a b(int i10) {
        int a10;
        x.d dVar = this.f1434b;
        if (dVar != null && (a10 = dVar.a(i10, -1, -1)) != -1) {
            i10 = a10;
        }
        if (this.f1438g.get(i10) == null) {
            StringBuilder m10 = a1.a.m("Warning could not find ConstraintSet id/");
            m10.append(w.a.c(this.f1433a.getContext(), i10));
            m10.append(" In MotionScene");
            Log.e("MotionScene", m10.toString());
            SparseArray<androidx.constraintlayout.widget.a> sparseArray = this.f1438g;
            return sparseArray.get(sparseArray.keyAt(0));
        }
        return this.f1438g.get(i10);
    }

    public int c() {
        b bVar = this.f1435c;
        return bVar != null ? bVar.f1457h : this.f1441j;
    }

    public int d() {
        b bVar = this.f1435c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f1453c;
    }

    public final int e(Context context, String str) {
        int i10;
        if (str.contains("/")) {
            i10 = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            i10 = -1;
        }
        if (i10 == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
            return i10;
        }
        return i10;
    }

    public Interpolator f() {
        b bVar = this.f1435c;
        int i10 = bVar.f1454e;
        if (i10 != -2) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 6) {
                                        return null;
                                    }
                                    return new AnticipateInterpolator();
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new animation.InterpolatorC0020a(this, r.c.c(bVar.f1455f));
        }
        return AnimationUtils.loadInterpolator(this.f1433a.getContext(), this.f1435c.f1456g);
    }

    public void g(n nVar) {
        b bVar = this.f1435c;
        if (bVar != null) {
            Iterator<g> it = bVar.f1460k.iterator();
            while (it.hasNext()) {
                it.next().b(nVar);
            }
            return;
        }
        b bVar2 = this.f1436e;
        if (bVar2 != null) {
            Iterator<g> it2 = bVar2.f1460k.iterator();
            while (it2.hasNext()) {
                it2.next().b(nVar);
            }
        }
    }

    public float h() {
        androidx.constraintlayout.motion.widget.b bVar;
        b bVar2 = this.f1435c;
        if (bVar2 == null || (bVar = bVar2.f1461l) == null) {
            return 0.0f;
        }
        return bVar.f1487t;
    }

    public int i() {
        b bVar = this.f1435c;
        if (bVar == null) {
            return -1;
        }
        return bVar.d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int j(Context context, XmlPullParser xmlPullParser) {
        char c10;
        char c11;
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        aVar.f1687e = false;
        int attributeCount = xmlPullParser.getAttributeCount();
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < attributeCount; i12++) {
            String attributeName = xmlPullParser.getAttributeName(i12);
            String attributeValue = xmlPullParser.getAttributeValue(i12);
            Objects.requireNonNull(attributeName);
            int hashCode = attributeName.hashCode();
            if (hashCode == -1496482599) {
                if (attributeName.equals("deriveConstraintsFrom")) {
                    c10 = 0;
                }
                c10 = 65535;
            } else if (hashCode != -1153153640) {
                if (hashCode == 3355 && attributeName.equals("id")) {
                    c10 = 2;
                }
                c10 = 65535;
            } else {
                if (attributeName.equals("constraintRotate")) {
                    c10 = 1;
                }
                c10 = 65535;
            }
            if (c10 == 0) {
                i11 = e(context, attributeValue);
            } else if (c10 == 1) {
                try {
                    aVar.f1686c = Integer.parseInt(attributeValue);
                } catch (NumberFormatException unused) {
                    Objects.requireNonNull(attributeValue);
                    switch (attributeValue.hashCode()) {
                        case -768416914:
                            if (attributeValue.equals("x_left")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3317767:
                            if (attributeValue.equals("left")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3387192:
                            if (attributeValue.equals(SchedulerSupport.NONE)) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 108511772:
                            if (attributeValue.equals("right")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1954540437:
                            if (attributeValue.equals("x_right")) {
                                c11 = 4;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    if (c11 == 0) {
                        aVar.f1686c = 4;
                    } else if (c11 == 1) {
                        aVar.f1686c = 2;
                    } else if (c11 == 2) {
                        aVar.f1686c = 0;
                    } else if (c11 == 3) {
                        aVar.f1686c = 1;
                    } else if (c11 == 4) {
                        aVar.f1686c = 3;
                    }
                }
            } else if (c10 == 2) {
                i10 = e(context, attributeValue);
                HashMap<String, Integer> hashMap = this.f1439h;
                int indexOf = attributeValue.indexOf(47);
                if (indexOf >= 0) {
                    attributeValue = attributeValue.substring(indexOf + 1);
                }
                hashMap.put(attributeValue, Integer.valueOf(i10));
                aVar.f1684a = w.a.c(context, i10);
            }
        }
        if (i10 != -1) {
            int i13 = this.f1433a.f1380f0;
            aVar.m(context, xmlPullParser);
            if (i11 != -1) {
                this.f1440i.put(i10, i11);
            }
            this.f1438g.put(i10, aVar);
        }
        return i10;
    }

    public final int k(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return j(context, xml);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
        return -1;
    }

    public final void l(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j0.f15262e0);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                k(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void m(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j0.T);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                int i11 = obtainStyledAttributes.getInt(index, this.f1441j);
                this.f1441j = i11;
                if (i11 < 8) {
                    this.f1441j = 8;
                }
            } else if (index == 1) {
                this.f1442k = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x028d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0285  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(int r13, androidx.constraintlayout.motion.widget.MotionLayout r14) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.a.n(int, androidx.constraintlayout.motion.widget.MotionLayout):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r2 != (-1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o(int r10, int r11) {
        /*
            r9 = this;
            x.d r0 = r9.f1434b
            r8 = 3
            r1 = -1
            if (r0 == 0) goto L1b
            r8 = 4
            int r7 = r0.a(r10, r1, r1)
            r0 = r7
            if (r0 == r1) goto Lf
            goto L10
        Lf:
            r0 = r10
        L10:
            x.d r2 = r9.f1434b
            r8 = 1
            int r7 = r2.a(r11, r1, r1)
            r2 = r7
            if (r2 == r1) goto L1d
            goto L1e
        L1b:
            r8 = 3
            r0 = r10
        L1d:
            r2 = r11
        L1e:
            androidx.constraintlayout.motion.widget.a$b r3 = r9.f1435c
            r8 = 6
            if (r3 == 0) goto L2f
            int r4 = r3.f1453c
            if (r4 != r11) goto L2f
            r8 = 6
            int r3 = r3.d
            r8 = 5
            if (r3 != r10) goto L2f
            r8 = 2
            return
        L2f:
            r8 = 4
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r3 = r9.d
            java.util.Iterator r3 = r3.iterator()
        L36:
            boolean r7 = r3.hasNext()
            r4 = r7
            if (r4 == 0) goto L64
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.a$b r4 = (androidx.constraintlayout.motion.widget.a.b) r4
            int r5 = r4.f1453c
            r8 = 4
            if (r5 != r2) goto L4d
            int r6 = r4.d
            r8 = 5
            if (r6 == r0) goto L55
        L4d:
            if (r5 != r11) goto L36
            r8 = 7
            int r5 = r4.d
            if (r5 != r10) goto L36
            r8 = 7
        L55:
            r9.f1435c = r4
            androidx.constraintlayout.motion.widget.b r10 = r4.f1461l
            r8 = 7
            if (r10 == 0) goto L63
            boolean r11 = r9.f1446p
            r8 = 2
            r10.c(r11)
            r8 = 5
        L63:
            return
        L64:
            androidx.constraintlayout.motion.widget.a$b r10 = r9.f1436e
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r3 = r9.f1437f
            r8 = 5
            java.util.Iterator r3 = r3.iterator()
        L6d:
            boolean r7 = r3.hasNext()
            r4 = r7
            if (r4 == 0) goto L81
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.a$b r4 = (androidx.constraintlayout.motion.widget.a.b) r4
            int r5 = r4.f1453c
            if (r5 != r11) goto L6d
            r8 = 2
            r10 = r4
            goto L6d
        L81:
            androidx.constraintlayout.motion.widget.a$b r11 = new androidx.constraintlayout.motion.widget.a$b
            r11.<init>(r9, r10)
            r11.d = r0
            r8 = 4
            r11.f1453c = r2
            r8 = 3
            if (r0 == r1) goto L94
            r8 = 4
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r10 = r9.d
            r10.add(r11)
        L94:
            r9.f1435c = r11
            r8 = 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.a.o(int, int):void");
    }

    public boolean p() {
        Iterator<b> it = this.d.iterator();
        while (it.hasNext()) {
            if (it.next().f1461l != null) {
                return true;
            }
        }
        b bVar = this.f1435c;
        return (bVar == null || bVar.f1461l == null) ? false : true;
    }
}
