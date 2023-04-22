package w8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.cast.framework.media.internal.ResourceProvider;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class f extends i9.a {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final k0 V;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f16982c;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f16983f;

    /* renamed from: j  reason: collision with root package name */
    public final long f16984j;

    /* renamed from: m  reason: collision with root package name */
    public final String f16985m;
    public final int n;

    /* renamed from: t  reason: collision with root package name */
    public final int f16986t;

    /* renamed from: u  reason: collision with root package name */
    public final int f16987u;

    /* renamed from: w  reason: collision with root package name */
    public final int f16988w;
    public final int y;

    /* renamed from: z  reason: collision with root package name */
    public final int f16989z;
    public static final List<String> W = Arrays.asList(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING);
    public static final int[] X = {0, 1};
    public static final Parcelable.Creator<f> CREATOR = new j();

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f16990a;

        /* renamed from: b  reason: collision with root package name */
        public List<String> f16991b = f.W;

        /* renamed from: c  reason: collision with root package name */
        public int[] f16992c = f.X;
        public int d = b("smallIconDrawableResId");

        /* renamed from: e  reason: collision with root package name */
        public int f16993e = b("stopLiveStreamDrawableResId");

        /* renamed from: f  reason: collision with root package name */
        public int f16994f = b("pauseDrawableResId");

        /* renamed from: g  reason: collision with root package name */
        public int f16995g = b("playDrawableResId");

        /* renamed from: h  reason: collision with root package name */
        public int f16996h = b("skipNextDrawableResId");

        /* renamed from: i  reason: collision with root package name */
        public int f16997i = b("skipPrevDrawableResId");

        /* renamed from: j  reason: collision with root package name */
        public int f16998j = b("forwardDrawableResId");

        /* renamed from: k  reason: collision with root package name */
        public int f16999k = b("forward10DrawableResId");

        /* renamed from: l  reason: collision with root package name */
        public int f17000l = b("forward30DrawableResId");

        /* renamed from: m  reason: collision with root package name */
        public int f17001m = b("rewindDrawableResId");
        public int n = b("rewind10DrawableResId");

        /* renamed from: o  reason: collision with root package name */
        public int f17002o = b("rewind30DrawableResId");

        /* renamed from: p  reason: collision with root package name */
        public int f17003p = b("disconnectDrawableResId");

        /* renamed from: q  reason: collision with root package name */
        public long f17004q = 10000;

        public static int b(String str) {
            try {
                Map<String, Integer> map = ResourceProvider.f6826a;
                Integer num = (Integer) ResourceProvider.class.getMethod("findResourceByName", String.class).invoke(null, str);
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        }

        public f a() {
            return new f(this.f16991b, this.f16992c, this.f17004q, this.f16990a, this.d, this.f16993e, this.f16994f, this.f16995g, this.f16996h, this.f16997i, this.f16998j, this.f16999k, this.f17000l, this.f17001m, this.n, this.f17002o, this.f17003p, b("notificationImageSizeDimenResId"), b("castingToDeviceStringResId"), b("stopLiveStreamStringResId"), b("pauseStringResId"), b("playStringResId"), b("skipNextStringResId"), b("skipPrevStringResId"), b("forwardStringResId"), b("forward10StringResId"), b("forward30StringResId"), b("rewindStringResId"), b("rewind10StringResId"), b("rewind30StringResId"), b("disconnectStringResId"), null);
        }
    }

    public f(List<String> list, int[] iArr, long j10, String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, IBinder iBinder) {
        this.f16982c = new ArrayList(list);
        this.f16983f = Arrays.copyOf(iArr, iArr.length);
        this.f16984j = j10;
        this.f16985m = str;
        this.n = i10;
        this.f16986t = i11;
        this.f16987u = i12;
        this.f16988w = i13;
        this.y = i14;
        this.f16989z = i15;
        this.A = i16;
        this.B = i17;
        this.C = i18;
        this.D = i19;
        this.E = i20;
        this.F = i21;
        this.G = i22;
        this.H = i23;
        this.I = i24;
        this.J = i25;
        this.K = i26;
        this.L = i27;
        this.M = i28;
        this.N = i29;
        this.O = i30;
        this.P = i31;
        this.Q = i32;
        this.R = i33;
        this.S = i34;
        this.T = i35;
        this.U = i36;
        if (iBinder == null) {
            this.V = null;
            return;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
        this.V = queryLocalInterface instanceof k0 ? (k0) queryLocalInterface : new j0(iBinder);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        t9.k0.s(parcel, 2, this.f16982c, false);
        int[] iArr = this.f16983f;
        t9.k0.o(parcel, 3, Arrays.copyOf(iArr, iArr.length), false);
        long j10 = this.f16984j;
        parcel.writeInt(524292);
        parcel.writeLong(j10);
        t9.k0.r(parcel, 5, this.f16985m, false);
        int i11 = this.n;
        parcel.writeInt(262150);
        parcel.writeInt(i11);
        int i12 = this.f16986t;
        parcel.writeInt(262151);
        parcel.writeInt(i12);
        int i13 = this.f16987u;
        parcel.writeInt(262152);
        parcel.writeInt(i13);
        int i14 = this.f16988w;
        parcel.writeInt(262153);
        parcel.writeInt(i14);
        int i15 = this.y;
        parcel.writeInt(262154);
        parcel.writeInt(i15);
        int i16 = this.f16989z;
        parcel.writeInt(262155);
        parcel.writeInt(i16);
        int i17 = this.A;
        parcel.writeInt(262156);
        parcel.writeInt(i17);
        int i18 = this.B;
        parcel.writeInt(262157);
        parcel.writeInt(i18);
        int i19 = this.C;
        parcel.writeInt(262158);
        parcel.writeInt(i19);
        int i20 = this.D;
        parcel.writeInt(262159);
        parcel.writeInt(i20);
        int i21 = this.E;
        parcel.writeInt(262160);
        parcel.writeInt(i21);
        int i22 = this.F;
        parcel.writeInt(262161);
        parcel.writeInt(i22);
        int i23 = this.G;
        parcel.writeInt(262162);
        parcel.writeInt(i23);
        int i24 = this.H;
        parcel.writeInt(262163);
        parcel.writeInt(i24);
        int i25 = this.I;
        parcel.writeInt(262164);
        parcel.writeInt(i25);
        int i26 = this.J;
        parcel.writeInt(262165);
        parcel.writeInt(i26);
        int i27 = this.K;
        parcel.writeInt(262166);
        parcel.writeInt(i27);
        int i28 = this.L;
        parcel.writeInt(262167);
        parcel.writeInt(i28);
        int i29 = this.M;
        parcel.writeInt(262168);
        parcel.writeInt(i29);
        int i30 = this.N;
        parcel.writeInt(262169);
        parcel.writeInt(i30);
        int i31 = this.O;
        parcel.writeInt(262170);
        parcel.writeInt(i31);
        int i32 = this.P;
        parcel.writeInt(262171);
        parcel.writeInt(i32);
        int i33 = this.Q;
        parcel.writeInt(262172);
        parcel.writeInt(i33);
        int i34 = this.R;
        parcel.writeInt(262173);
        parcel.writeInt(i34);
        int i35 = this.S;
        parcel.writeInt(262174);
        parcel.writeInt(i35);
        int i36 = this.T;
        parcel.writeInt(262175);
        parcel.writeInt(i36);
        int i37 = this.U;
        parcel.writeInt(262176);
        parcel.writeInt(i37);
        k0 k0Var = this.V;
        t9.k0.n(parcel, 33, k0Var == null ? null : k0Var.asBinder(), false);
        t9.k0.z(parcel, v2);
    }
}
