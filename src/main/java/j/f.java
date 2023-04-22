package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.widget.p0;
import androidx.appcompat.widget.v;
import b7.k;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.io.ConstantsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class f extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class<?>[] f11056e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f11057f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f11058a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f11059b;

    /* renamed from: c  reason: collision with root package name */
    public Context f11060c;
    public Object d;

    /* loaded from: classes2.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?>[] f11061c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        public Object f11062a;

        /* renamed from: b  reason: collision with root package name */
        public Method f11063b;

        public a(Object obj, String str) {
            this.f11062a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f11063b = cls.getMethod(str, f11061c);
            } catch (Exception e10) {
                StringBuilder p10 = a1.a.p("Couldn't resolve menu item onClick handler ", str, " in class ");
                p10.append(cls.getName());
                InflateException inflateException = new InflateException(p10.toString());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f11063b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f11063b.invoke(this.f11062a, menuItem)).booleanValue();
                }
                this.f11063b.invoke(this.f11062a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b {
        public CharSequence A;
        public CharSequence B;

        /* renamed from: a  reason: collision with root package name */
        public Menu f11064a;

        /* renamed from: h  reason: collision with root package name */
        public boolean f11070h;

        /* renamed from: i  reason: collision with root package name */
        public int f11071i;

        /* renamed from: j  reason: collision with root package name */
        public int f11072j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f11073k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f11074l;

        /* renamed from: m  reason: collision with root package name */
        public int f11075m;
        public char n;

        /* renamed from: o  reason: collision with root package name */
        public int f11076o;

        /* renamed from: p  reason: collision with root package name */
        public char f11077p;

        /* renamed from: q  reason: collision with root package name */
        public int f11078q;

        /* renamed from: r  reason: collision with root package name */
        public int f11079r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f11080s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f11081t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f11082u;

        /* renamed from: v  reason: collision with root package name */
        public int f11083v;

        /* renamed from: w  reason: collision with root package name */
        public int f11084w;

        /* renamed from: x  reason: collision with root package name */
        public String f11085x;
        public String y;

        /* renamed from: z  reason: collision with root package name */
        public n0.b f11086z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* renamed from: b  reason: collision with root package name */
        public int f11065b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f11066c = 0;
        public int d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f11067e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f11068f = true;

        /* renamed from: g  reason: collision with root package name */
        public boolean f11069g = true;

        public b(Menu menu) {
            this.f11064a = menu;
        }

        public SubMenu a() {
            this.f11070h = true;
            SubMenu addSubMenu = this.f11064a.addSubMenu(this.f11065b, this.f11071i, this.f11072j, this.f11073k);
            c(addSubMenu.getItem());
            return addSubMenu;
        }

        public final <T> T b(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.f11060c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0168  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x018e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(android.view.MenuItem r10) {
            /*
                Method dump skipped, instructions count: 417
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j.f.b.c(android.view.MenuItem):void");
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f11056e = clsArr;
        f11057f = clsArr;
    }

    public f(Context context) {
        super(context);
        this.f11060c = context;
        Object[] objArr = {context};
        this.f11058a = objArr;
        this.f11059b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        ColorStateList colorStateList;
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException(a1.a.l("Expecting menu, got ", name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z11 && name2.equals(str)) {
                        str = null;
                        z11 = false;
                    } else if (name2.equals("group")) {
                        bVar.f11065b = 0;
                        bVar.f11066c = 0;
                        bVar.d = 0;
                        bVar.f11067e = 0;
                        bVar.f11068f = true;
                        bVar.f11069g = true;
                    } else if (name2.equals("item")) {
                        if (!bVar.f11070h) {
                            n0.b bVar2 = bVar.f11086z;
                            if (bVar2 == null || !bVar2.a()) {
                                bVar.f11070h = true;
                                bVar.c(bVar.f11064a.add(bVar.f11065b, bVar.f11071i, bVar.f11072j, bVar.f11073k));
                            } else {
                                bVar.a();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z10 = true;
                    }
                }
            } else if (!z11) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    TypedArray obtainStyledAttributes = f.this.f11060c.obtainStyledAttributes(attributeSet, k.L);
                    bVar.f11065b = obtainStyledAttributes.getResourceId(1, 0);
                    bVar.f11066c = obtainStyledAttributes.getInt(3, 0);
                    bVar.d = obtainStyledAttributes.getInt(4, 0);
                    bVar.f11067e = obtainStyledAttributes.getInt(5, 0);
                    bVar.f11068f = obtainStyledAttributes.getBoolean(2, true);
                    bVar.f11069g = obtainStyledAttributes.getBoolean(0, true);
                    obtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    p0 q10 = p0.q(f.this.f11060c, attributeSet, k.M);
                    bVar.f11071i = q10.m(2, 0);
                    bVar.f11072j = (q10.j(5, bVar.f11066c) & (-65536)) | (q10.j(6, bVar.d) & 65535);
                    bVar.f11073k = q10.o(7);
                    bVar.f11074l = q10.o(8);
                    bVar.f11075m = q10.m(0, 0);
                    String n = q10.n(9);
                    bVar.n = n == null ? (char) 0 : n.charAt(0);
                    bVar.f11076o = q10.j(16, ConstantsKt.DEFAULT_BLOCK_SIZE);
                    String n10 = q10.n(10);
                    bVar.f11077p = n10 == null ? (char) 0 : n10.charAt(0);
                    bVar.f11078q = q10.j(20, ConstantsKt.DEFAULT_BLOCK_SIZE);
                    if (q10.p(11)) {
                        bVar.f11079r = q10.a(11, false) ? 1 : 0;
                    } else {
                        bVar.f11079r = bVar.f11067e;
                    }
                    bVar.f11080s = q10.a(3, false);
                    bVar.f11081t = q10.a(4, bVar.f11068f);
                    bVar.f11082u = q10.a(1, bVar.f11069g);
                    bVar.f11083v = q10.j(21, -1);
                    bVar.y = q10.n(12);
                    bVar.f11084w = q10.m(13, 0);
                    bVar.f11085x = q10.n(15);
                    String n11 = q10.n(14);
                    boolean z12 = n11 != null;
                    if (z12 && bVar.f11084w == 0 && bVar.f11085x == null) {
                        bVar.f11086z = (n0.b) bVar.b(n11, f11057f, f.this.f11059b);
                    } else {
                        if (z12) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        bVar.f11086z = null;
                    }
                    bVar.A = q10.o(17);
                    bVar.B = q10.o(22);
                    if (q10.p(19)) {
                        bVar.D = v.e(q10.j(19, -1), bVar.D);
                        colorStateList = null;
                    } else {
                        colorStateList = null;
                        bVar.D = null;
                    }
                    if (q10.p(18)) {
                        bVar.C = q10.c(18);
                    } else {
                        bVar.C = colorStateList;
                    }
                    q10.f1055b.recycle();
                    bVar.f11070h = false;
                } else if (name3.equals("menu")) {
                    b(xmlPullParser, attributeSet, bVar.a());
                } else {
                    z11 = true;
                    str = name3;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof h0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f11060c.getResources().getLayout(i10);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (XmlPullParserException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (IOException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
