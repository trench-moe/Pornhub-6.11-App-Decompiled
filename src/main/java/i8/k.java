package i8;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import k8.c0;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR;
    public final boolean A;
    public final ImmutableList<String> B;
    public final ImmutableList<String> C;
    public final int D;
    public final int E;
    public final int F;
    public final ImmutableList<String> G;
    public final ImmutableList<String> H;
    public final int I;
    public final boolean J;
    public final boolean K;
    public final boolean L;

    /* renamed from: c  reason: collision with root package name */
    public final int f10639c;

    /* renamed from: f  reason: collision with root package name */
    public final int f10640f;

    /* renamed from: j  reason: collision with root package name */
    public final int f10641j;

    /* renamed from: m  reason: collision with root package name */
    public final int f10642m;
    public final int n;

    /* renamed from: t  reason: collision with root package name */
    public final int f10643t;

    /* renamed from: u  reason: collision with root package name */
    public final int f10644u;

    /* renamed from: w  reason: collision with root package name */
    public final int f10645w;
    public final int y;

    /* renamed from: z  reason: collision with root package name */
    public final int f10646z;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f10647a;

        /* renamed from: b  reason: collision with root package name */
        public int f10648b;

        /* renamed from: c  reason: collision with root package name */
        public int f10649c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f10650e;

        /* renamed from: f  reason: collision with root package name */
        public int f10651f;

        /* renamed from: g  reason: collision with root package name */
        public int f10652g;

        /* renamed from: h  reason: collision with root package name */
        public int f10653h;

        /* renamed from: i  reason: collision with root package name */
        public int f10654i;

        /* renamed from: j  reason: collision with root package name */
        public int f10655j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f10656k;

        /* renamed from: l  reason: collision with root package name */
        public ImmutableList<String> f10657l;

        /* renamed from: m  reason: collision with root package name */
        public ImmutableList<String> f10658m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public int f10659o;

        /* renamed from: p  reason: collision with root package name */
        public int f10660p;

        /* renamed from: q  reason: collision with root package name */
        public ImmutableList<String> f10661q;

        /* renamed from: r  reason: collision with root package name */
        public ImmutableList<String> f10662r;

        /* renamed from: s  reason: collision with root package name */
        public int f10663s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f10664t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f10665u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f10666v;

        @Deprecated
        public b() {
            this.f10647a = IntCompanionObject.MAX_VALUE;
            this.f10648b = IntCompanionObject.MAX_VALUE;
            this.f10649c = IntCompanionObject.MAX_VALUE;
            this.d = IntCompanionObject.MAX_VALUE;
            this.f10654i = IntCompanionObject.MAX_VALUE;
            this.f10655j = IntCompanionObject.MAX_VALUE;
            this.f10656k = true;
            this.f10657l = ImmutableList.w();
            this.f10658m = ImmutableList.w();
            this.n = 0;
            this.f10659o = IntCompanionObject.MAX_VALUE;
            this.f10660p = IntCompanionObject.MAX_VALUE;
            this.f10661q = ImmutableList.w();
            this.f10662r = ImmutableList.w();
            this.f10663s = 0;
            this.f10664t = false;
            this.f10665u = false;
            this.f10666v = false;
        }

        public b(k kVar) {
            this.f10647a = kVar.f10639c;
            this.f10648b = kVar.f10640f;
            this.f10649c = kVar.f10641j;
            this.d = kVar.f10642m;
            this.f10650e = kVar.n;
            this.f10651f = kVar.f10643t;
            this.f10652g = kVar.f10644u;
            this.f10653h = kVar.f10645w;
            this.f10654i = kVar.y;
            this.f10655j = kVar.f10646z;
            this.f10656k = kVar.A;
            this.f10657l = kVar.B;
            this.f10658m = kVar.C;
            this.n = kVar.D;
            this.f10659o = kVar.E;
            this.f10660p = kVar.F;
            this.f10661q = kVar.G;
            this.f10662r = kVar.H;
            this.f10663s = kVar.I;
            this.f10664t = kVar.J;
            this.f10665u = kVar.K;
            this.f10666v = kVar.L;
        }

        public b a(Context context) {
            int i10 = c0.f11939a;
            if (i10 >= 19) {
                if (i10 >= 23 || Looper.myLooper() != null) {
                    CaptioningManager captioningManager = (CaptioningManager) context.getSystemService("captioning");
                    if (captioningManager != null) {
                        if (captioningManager.isEnabled()) {
                            this.f10663s = 1088;
                            Locale locale = captioningManager.getLocale();
                            if (locale != null) {
                                this.f10662r = ImmutableList.x(i10 >= 21 ? locale.toLanguageTag() : locale.toString());
                            }
                        }
                    }
                }
                return this;
            }
            return this;
        }

        public b b(int i10, int i11, boolean z10) {
            this.f10654i = i10;
            this.f10655j = i11;
            this.f10656k = z10;
            return this;
        }

        public b c(Context context, boolean z10) {
            Point point;
            DisplayManager displayManager;
            int i10 = c0.f11939a;
            Display display = (i10 < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
            if (display == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                Objects.requireNonNull(windowManager);
                display = windowManager.getDefaultDisplay();
            }
            if (i10 <= 29 && display.getDisplayId() == 0 && c0.z(context)) {
                if ("Sony".equals(c0.f11941c) && c0.d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                    point = new Point(3840, 2160);
                } else {
                    String u2 = i10 < 28 ? c0.u("sys.display-size") : c0.u("vendor.display-size");
                    if (!TextUtils.isEmpty(u2)) {
                        try {
                            String[] F = c0.F(u2.trim(), "x");
                            if (F.length == 2) {
                                int parseInt = Integer.parseInt(F[0]);
                                int parseInt2 = Integer.parseInt(F[1]);
                                if (parseInt > 0 && parseInt2 > 0) {
                                    point = new Point(parseInt, parseInt2);
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                        String valueOf = String.valueOf(u2);
                        Log.e("Util", valueOf.length() != 0 ? "Invalid display size: ".concat(valueOf) : new String("Invalid display size: "));
                    }
                }
                return b(point.x, point.y, z10);
            }
            point = new Point();
            int i11 = c0.f11939a;
            if (i11 >= 23) {
                Display.Mode mode = display.getMode();
                point.x = mode.getPhysicalWidth();
                point.y = mode.getPhysicalHeight();
            } else if (i11 >= 17) {
                display.getRealSize(point);
            } else {
                display.getSize(point);
            }
            return b(point.x, point.y, z10);
        }
    }

    static {
        new k(new b());
        CREATOR = new a();
    }

    public k(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, null);
        this.C = ImmutableList.r(arrayList);
        this.D = parcel.readInt();
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, null);
        this.H = ImmutableList.r(arrayList2);
        this.I = parcel.readInt();
        int i10 = c0.f11939a;
        this.J = parcel.readInt() != 0;
        this.f10639c = parcel.readInt();
        this.f10640f = parcel.readInt();
        this.f10641j = parcel.readInt();
        this.f10642m = parcel.readInt();
        this.n = parcel.readInt();
        this.f10643t = parcel.readInt();
        this.f10644u = parcel.readInt();
        this.f10645w = parcel.readInt();
        this.y = parcel.readInt();
        this.f10646z = parcel.readInt();
        this.A = parcel.readInt() != 0;
        ArrayList arrayList3 = new ArrayList();
        parcel.readList(arrayList3, null);
        this.B = ImmutableList.r(arrayList3);
        this.E = parcel.readInt();
        this.F = parcel.readInt();
        ArrayList arrayList4 = new ArrayList();
        parcel.readList(arrayList4, null);
        this.G = ImmutableList.r(arrayList4);
        this.K = parcel.readInt() != 0;
        this.L = parcel.readInt() != 0;
    }

    public k(b bVar) {
        this.f10639c = bVar.f10647a;
        this.f10640f = bVar.f10648b;
        this.f10641j = bVar.f10649c;
        this.f10642m = bVar.d;
        this.n = bVar.f10650e;
        this.f10643t = bVar.f10651f;
        this.f10644u = bVar.f10652g;
        this.f10645w = bVar.f10653h;
        this.y = bVar.f10654i;
        this.f10646z = bVar.f10655j;
        this.A = bVar.f10656k;
        this.B = bVar.f10657l;
        this.C = bVar.f10658m;
        this.D = bVar.n;
        this.E = bVar.f10659o;
        this.F = bVar.f10660p;
        this.G = bVar.f10661q;
        this.H = bVar.f10662r;
        this.I = bVar.f10663s;
        this.J = bVar.f10664t;
        this.K = bVar.f10665u;
        this.L = bVar.f10666v;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f10639c == kVar.f10639c && this.f10640f == kVar.f10640f && this.f10641j == kVar.f10641j && this.f10642m == kVar.f10642m && this.n == kVar.n && this.f10643t == kVar.f10643t && this.f10644u == kVar.f10644u && this.f10645w == kVar.f10645w && this.A == kVar.A && this.y == kVar.y && this.f10646z == kVar.f10646z && this.B.equals(kVar.B) && this.C.equals(kVar.C) && this.D == kVar.D && this.E == kVar.E && this.F == kVar.F && this.G.equals(kVar.G) && this.H.equals(kVar.H) && this.I == kVar.I && this.J == kVar.J && this.K == kVar.K && this.L == kVar.L;
    }

    public int hashCode() {
        int hashCode = this.B.hashCode();
        int hashCode2 = this.C.hashCode();
        int hashCode3 = this.G.hashCode();
        return ((((((((this.H.hashCode() + ((hashCode3 + ((((((((hashCode2 + ((hashCode + ((((((((((((((((((((((this.f10639c + 31) * 31) + this.f10640f) * 31) + this.f10641j) * 31) + this.f10642m) * 31) + this.n) * 31) + this.f10643t) * 31) + this.f10644u) * 31) + this.f10645w) * 31) + (this.A ? 1 : 0)) * 31) + this.y) * 31) + this.f10646z) * 31)) * 31)) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31)) * 31)) * 31) + this.I) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.C);
        parcel.writeInt(this.D);
        parcel.writeList(this.H);
        parcel.writeInt(this.I);
        boolean z10 = this.J;
        int i11 = c0.f11939a;
        parcel.writeInt(z10 ? 1 : 0);
        parcel.writeInt(this.f10639c);
        parcel.writeInt(this.f10640f);
        parcel.writeInt(this.f10641j);
        parcel.writeInt(this.f10642m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.f10643t);
        parcel.writeInt(this.f10644u);
        parcel.writeInt(this.f10645w);
        parcel.writeInt(this.y);
        parcel.writeInt(this.f10646z);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeList(this.B);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeList(this.G);
        parcel.writeInt(this.K ? 1 : 0);
        parcel.writeInt(this.L ? 1 : 0);
    }
}
