package cb;

import android.media.MediaFormat;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.y0;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import bf.q;
import bf.s;
import bf.t;
import bf.w;
import bf.x;
import bf.y;
import bf.z;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.app.pornhub.R;
import com.appsflyer.oaid.BuildConfig;
import cz.msebera.android.httpclient.HttpVersion;
import cz.msebera.android.httpclient.ProtocolException;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.logging.Logger;
import k8.c0;
import k8.u;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import l2.d0;
import n0.b0;
import org.json.JSONObject;
import pe.p;
import t9.o1;

/* loaded from: classes.dex */
public class e implements w5.h, d0, b0, o.b, pe.j, md.a, ea.a, pd.d, o1 {
    public static int n = 5;

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f3921c = {R.attr.debugDraw, R.attr.horizontalSpacing, R.attr.itemSpacing, R.attr.lineSpacing, R.attr.orientation, R.attr.verticalSpacing};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f3922f = {R.attr.layout_horizontalSpacing, R.attr.layout_newLine, R.attr.layout_verticalSpacing};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f3923j = {R.attr.qsfl_controller};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f3924m = {R.attr.qso_animationDuration, R.attr.qso_arcSize, R.attr.qso_backgroundCircleColor, R.attr.qso_icon, R.attr.qso_iconAnimationDuration, R.attr.qso_quickSeekContainer, R.attr.qso_seekSeconds, R.attr.qso_tapCircleColor, R.attr.qso_textAppearance};

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f3925t = {16843036, 16843156, 16843157, 16843158, 16843532, 16843533};

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f3926u = {16842960, 16843161};

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f3927w = {16843161, 16843849, 16843850, 16843851};
    public static final byte[] y = {0, 0, 0, 1};

    /* renamed from: z  reason: collision with root package name */
    public static final String[] f3928z = {BuildConfig.FLAVOR, "A", "B", "C"};
    public static final e A = new e();
    public static final e B = new e();
    public static final e C = new e();
    public static final o1 D = new e();
    public static final o1 E = new e();
    public static final o1 F = new e();
    public static final o1 G = new e();
    public static final o1 H = new e();
    public static final o1 I = new e();
    public static final o1 J = new e();
    public static final o1 K = new e();
    public static final o1 L = new e();
    public static final o1 M = new e();
    public static final o1 N = new e();
    public static final o1 O = new e();

    public /* synthetic */ e() {
    }

    public /* synthetic */ e(View view, int i10) {
    }

    public /* synthetic */ e(View view, int i10, String str) {
    }

    public static void A(String str, String str2, Object... objArr) {
        Log.d(L(str), String.format(str2, objArr));
    }

    public static void B(String str, String str2) {
        if (b0(6)) {
            Log.e(str, str2);
        }
    }

    public static void C(String str, String str2, Throwable th) {
        Log.e(L(str), str2, th);
    }

    public static void D(String str, String str2, Throwable th) {
        if (b0(6)) {
            Log.e(str, str2, th);
        }
    }

    public static String K(int i10) {
        switch (i10) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return android.support.v4.media.b.e(32, "unknown status code: ", i10);
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static String L(String str) {
        return a1.a.l("TransportRuntime.", str);
    }

    public static void M(String str, String str2) {
        Log.i(L(str), str2);
    }

    public static void N(String str, String str2, Throwable th) {
        if (b0(4)) {
            Log.i(str, str2, th);
        }
    }

    public static void O(String str, String str2) {
        if (b0(4)) {
            Log.i(str, str2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01b4, code lost:
        if (r0.equals("video/mp2t") == false) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d8 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01df A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e5 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f6 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01fb A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int P(java.util.Map r17) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.e.P(java.util.Map):int");
    }

    public static int Q(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
            if (lastPathSegment.endsWith(".ac4")) {
                return 1;
            }
            if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
                return 2;
            }
            if (lastPathSegment.endsWith(".amr")) {
                return 3;
            }
            if (lastPathSegment.endsWith(".flac")) {
                return 4;
            }
            if (lastPathSegment.endsWith(".flv")) {
                return 5;
            }
            if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                if (lastPathSegment.endsWith(".mp3")) {
                    return 7;
                }
                if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5)) {
                    return 8;
                }
                if (lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                    return 8;
                }
                if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                    if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg")) {
                        if (!lastPathSegment.endsWith(".m2p")) {
                            if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                    if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                        if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                            return -1;
                                        }
                                        return 14;
                                    }
                                    return 13;
                                }
                                return 12;
                            }
                            return 11;
                        }
                    }
                    return 10;
                }
                return 9;
            }
            return 6;
        }
        return 0;
    }

    public static final boolean R(AssertionError isAndroidGetsocknameError) {
        Logger logger = bf.o.f3684a;
        Intrinsics.checkNotNullParameter(isAndroidGetsocknameError, "$this$isAndroidGetsocknameError");
        if (isAndroidGetsocknameError.getCause() != null) {
            String message = isAndroidGetsocknameError.getMessage();
            return message != null ? StringsKt.contains$default((CharSequence) message, (CharSequence) "getsockname failed", false, 2, (Object) null) : false;
        }
        return false;
    }

    public static final boolean T(bf.f isProbablyUtf8) {
        Intrinsics.checkNotNullParameter(isProbablyUtf8, "$this$isProbablyUtf8");
        try {
            bf.f fVar = new bf.f();
            isProbablyUtf8.d(fVar, 0L, RangesKt.coerceAtMost(isProbablyUtf8.f3669f, 64L));
            for (int i10 = 0; i10 < 16; i10++) {
                if (fVar.C()) {
                    return true;
                }
                int J2 = fVar.J();
                if (Character.isISOControl(J2) && !Character.isWhitespace(J2)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static void U(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void W(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(a1.a.l(str, " is null"));
        }
    }

    public static InputConnection X(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                ViewParent viewParent = parent;
                if (!(viewParent instanceof View)) {
                    break;
                } else if (viewParent instanceof y0) {
                    editorInfo.hintText = ((y0) viewParent).a();
                    break;
                } else {
                    parent = viewParent.getParent();
                }
            }
        }
        return inputConnection;
    }

    public static String Y(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }

    public static void Z(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(android.support.v4.media.b.e(15, "csd-", i10), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }

    public static boolean b0(int i10) {
        return n <= i10;
    }

    public static final w c0(Socket sink) {
        Logger logger = bf.o.f3684a;
        Intrinsics.checkNotNullParameter(sink, "$this$sink");
        x xVar = new x(sink);
        OutputStream outputStream = sink.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream()");
        q sink2 = new q(outputStream, xVar);
        Intrinsics.checkNotNullParameter(sink2, "sink");
        return new bf.d(xVar, sink2);
    }

    public static final y d0(InputStream source) {
        Logger logger = bf.o.f3684a;
        Intrinsics.checkNotNullParameter(source, "$this$source");
        return new bf.n(source, new z());
    }

    public static final y e0(Socket source) {
        Logger logger = bf.o.f3684a;
        Intrinsics.checkNotNullParameter(source, "$this$source");
        x xVar = new x(source);
        InputStream inputStream = source.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream()");
        bf.n source2 = new bf.n(inputStream, xVar);
        Intrinsics.checkNotNullParameter(source2, "source");
        return new bf.e(xVar, source2);
    }

    public static void h0(String str, String str2) {
        if (b0(2)) {
            Log.v(str, str2);
        }
    }

    public static void i0(String str, String str2, Throwable th) {
        if (b0(2)) {
            Log.v(str, str2, th);
        }
    }

    public static void j0(String str, String str2) {
        if (b0(5)) {
            Log.w(str, str2);
        }
    }

    public static void k0(String str, String str2, Throwable th) {
        if (b0(5)) {
            Log.w(str, str2, th);
        }
    }

    public static final bf.g n(w buffer) {
        Intrinsics.checkNotNullParameter(buffer, "$this$buffer");
        return new s(buffer);
    }

    public static final bf.h o(y buffer) {
        Intrinsics.checkNotNullParameter(buffer, "$this$buffer");
        return new t(buffer);
    }

    public static String p(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static String q(u uVar) {
        uVar.k(24);
        int e10 = uVar.e(2);
        boolean d = uVar.d();
        int e11 = uVar.e(5);
        int i10 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
            if (uVar.d()) {
                i10 |= 1 << i11;
            }
        }
        int i12 = 6;
        int[] iArr = new int[6];
        for (int i13 = 0; i13 < 6; i13++) {
            iArr[i13] = uVar.e(8);
        }
        int e12 = uVar.e(8);
        Object[] objArr = new Object[5];
        objArr[0] = f3928z[e10];
        objArr[1] = Integer.valueOf(e11);
        objArr[2] = Integer.valueOf(i10);
        objArr[3] = Character.valueOf(d ? 'H' : 'L');
        objArr[4] = Integer.valueOf(e12);
        StringBuilder sb2 = new StringBuilder(c0.k("hvc1.%s%d.%X.%c%d", objArr));
        while (i12 > 0) {
            int i14 = i12 - 1;
            if (iArr[i14] != 0) {
                break;
            }
            i12 = i14;
        }
        for (int i15 = 0; i15 < i12; i15++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i15])));
        }
        return sb2.toString();
    }

    public static void r(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int s(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException();
    }

    public static int t(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str);
    }

    public static Object u(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void v(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    public static final Lazy w(Fragment fragment, KClass kClass, Function0 function0, Function0 function02) {
        return new androidx.lifecycle.y(kClass, function0, function02);
    }

    public static void x(String str, String str2) {
        if (b0(3)) {
            Log.d(str, str2);
        }
    }

    public static void y(String str, String str2, Object obj) {
        Log.d(L(str), String.format(str2, obj));
    }

    public static void z(String str, String str2, Throwable th) {
        if (b0(3)) {
            Log.d(str, str2, th);
        }
    }

    public k2.a E(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new k2.a(httpURLConnection);
    }

    public boolean F() {
        return this instanceof f;
    }

    public o.c G(o.a aVar) {
        return (o.c) ((CardView.a) aVar).f1158a;
    }

    public void H(float f10, float f11, float f12, n nVar) {
        nVar.d(f10, 0.0f);
    }

    public float I(o.a aVar) {
        return G(aVar).f13468e;
    }

    public float J(o.a aVar) {
        return G(aVar).f13465a;
    }

    @Override // pe.j
    public List a(p url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return CollectionsKt.emptyList();
    }

    public void a0(o.a aVar, float f10) {
        o.c G2 = G(aVar);
        CardView.a aVar2 = (CardView.a) aVar;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean a10 = aVar2.a();
        if (f10 != G2.f13468e || G2.f13469f != useCompatPadding || G2.f13470g != a10) {
            G2.f13468e = f10;
            G2.f13469f = useCompatPadding;
            G2.f13470g = a10;
            G2.c(null);
            G2.invalidateSelf();
        }
        f0(aVar);
    }

    public void b(View view) {
    }

    @Override // w5.h
    public void c(w5.i iVar) {
    }

    @Override // ea.a
    public Object f(ea.g gVar) {
        if (!gVar.m()) {
            Log.e("FirebaseCrashlytics", "Error fetching settings.", gVar.i());
        }
        return null;
    }

    public void f0(o.a aVar) {
        CardView.a aVar2 = (CardView.a) aVar;
        if (!CardView.this.getUseCompatPadding()) {
            aVar2.b(0, 0, 0, 0);
            return;
        }
        float f10 = G(aVar).f13468e;
        float f11 = G(aVar).f13465a;
        int ceil = (int) Math.ceil(o.d.a(f10, f11, aVar2.a()));
        int ceil2 = (int) Math.ceil(o.d.b(f10, f11, aVar2.a()));
        aVar2.b(ceil, ceil2, ceil, ceil2);
    }

    @Override // w5.h
    public void g(w5.i iVar) {
        iVar.m();
    }

    @Override // pe.j
    public void i(p url, List cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
    }

    @Override // l2.d0
    public Object j(JsonReader jsonReader, float f10) {
        return Float.valueOf(l2.m.d(jsonReader) * f10);
    }

    @Override // pd.d
    public long k(md.h hVar) {
        l9.e.l(hVar, "HTTP message");
        md.d n10 = hVar.n("Transfer-Encoding");
        if (n10 != null) {
            String value = n10.getValue();
            if (!"chunked".equalsIgnoreCase(value)) {
                if ("identity".equalsIgnoreCase(value)) {
                    return -1L;
                }
                throw new ProtocolException(a1.a.l("Unsupported transfer encoding: ", value));
            } else if (hVar.a().b(HttpVersion.f8581f)) {
                StringBuilder m10 = a1.a.m("Chunked transfer encoding not allowed for ");
                m10.append(hVar.a());
                throw new ProtocolException(m10.toString());
            } else {
                return -2L;
            }
        }
        md.d n11 = hVar.n("Content-Length");
        if (n11 != null) {
            String value2 = n11.getValue();
            try {
                long parseLong = Long.parseLong(value2);
                if (parseLong >= 0) {
                    return parseLong;
                }
                throw new ProtocolException("Negative content length: " + value2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(a1.a.l("Invalid content length: ", value2));
            }
        }
        return -1;
    }

    public void l(View view) {
    }
}
