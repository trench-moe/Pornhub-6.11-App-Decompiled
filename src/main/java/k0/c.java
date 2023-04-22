package k0;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.util.JsonReader;
import android.view.View;
import android.view.animation.AnticipateInterpolator;
import androidx.core.splashscreen.SplashScreenViewProvider;
import c7.l;
import com.app.pornhub.view.home.HomeActivity;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoTimeoutException;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import g4.u;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;
import k8.m;
import kotlin.jvm.internal.Intrinsics;
import mc.a;
import qb.q;
import s6.s;
import sc.f;
import w6.n0;
import x6.c0;
import yb.a;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements g, h, s.b, m.a, m.b, k8.e, l, MediaCodecUtil.f, f.a, a.InterfaceC0215a, a.InterfaceC0311a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f11748c;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ c f11741f = new c(0);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ c f11742j = new c(1);

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ c f11743m = new c(3);
    public static final /* synthetic */ c n = new c(4);

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ c f11744t = new c(5);

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ c f11745u = new c(6);

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ c f11746w = new c(7);
    public static final /* synthetic */ c y = new c(8);

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ c f11747z = new c(9);
    public static final /* synthetic */ c A = new c(10);
    public static final /* synthetic */ c B = new c(11);
    public static final /* synthetic */ c C = new c(12);
    public static final /* synthetic */ c D = new c(13);
    public static final /* synthetic */ c E = new c(14);
    public static final /* synthetic */ c F = new c(15);
    public static final /* synthetic */ c G = new c(16);

    public /* synthetic */ c(int i10) {
        this.f11748c = i10;
    }

    @Override // sc.f.a
    public String a(Object obj) {
        Context context = (Context) obj;
        int i10 = Build.VERSION.SDK_INT;
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : (i10 < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? (i10 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? BuildConfig.FLAVOR : "embedded" : "auto";
    }

    @Override // k8.e
    public void accept(Object obj) {
        ((c.a) obj).a();
    }

    @Override // s6.s.b
    public Object apply(Object obj) {
        switch (this.f11748c) {
            case 3:
                i6.b bVar = s.f14890t;
                throw new SynchronizationException("Timed out while trying to acquire the lock.", (Throwable) obj);
            case 4:
                i6.b bVar2 = s.f14890t;
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            default:
                Cursor cursor = (Cursor) obj;
                i6.b bVar3 = s.f14890t;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (cursor.moveToNext()) {
                    byte[] blob = cursor.getBlob(0);
                    arrayList.add(blob);
                    i10 += blob.length;
                }
                byte[] bArr = new byte[i10];
                int i11 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    byte[] bArr2 = (byte[]) arrayList.get(i12);
                    System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
                    i11 += bArr2.length;
                }
                return bArr;
        }
    }

    @Override // mc.a.InterfaceC0215a
    public void b(mc.b bVar) {
        int i10 = q.f14482c;
    }

    @Override // yb.a.InterfaceC0311a
    public Object c(JsonReader jsonReader) {
        return yb.a.d(jsonReader);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
    public int d(Object obj) {
        Pattern pattern = MediaCodecUtil.f6233a;
        return ((com.google.android.exoplayer2.mediacodec.c) obj).f6250a.startsWith("OMX.google") ? 1 : 0;
    }

    @Override // k8.m.b
    public void e(Object obj, k8.h hVar) {
        c0 c0Var = (c0) obj;
    }

    @Override // c7.l
    public c7.h[] f(Uri uri, Map map) {
        switch (this.f11748c) {
            case 10:
                return h();
            case 11:
                return h();
            default:
                return h();
        }
    }

    @Override // k0.g
    public boolean g() {
        return false;
    }

    public c7.h[] h() {
        switch (this.f11748c) {
            case 10:
                return new c7.h[]{new e7.b(0)};
            case 11:
                return new c7.h[]{new i7.d(0)};
            default:
                return new c7.h[]{new l7.e(0)};
        }
    }

    public void i(SplashScreenViewProvider splashScreenView) {
        int i10 = HomeActivity.f4998a0;
        Intrinsics.checkNotNullParameter(splashScreenView, "splashScreenView");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(splashScreenView.a(), View.TRANSLATION_Y, 0.0f, -splashScreenView.a().getHeight());
        ofFloat.setInterpolator(new AnticipateInterpolator());
        ofFloat.setDuration(200L);
        ofFloat.addListener(new u(splashScreenView));
        ofFloat.start();
    }

    @Override // k8.m.a
    public void invoke(Object obj) {
        ((n0.c) obj).p(ExoPlaybackException.b(new ExoTimeoutException(1), 1003));
    }
}
