package l6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.JsonReader;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.Map;
import java.util.regex.Pattern;
import k8.m;
import l7.c0;
import sc.f;
import w6.n0;
import yb.a;

/* loaded from: classes3.dex */
public final /* synthetic */ class s implements i6.f, m.a, k8.e, c7.l, MediaCodecUtil.f, jb.f, f.a, a.InterfaceC0311a {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ s f12312f = new s(0);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ s f12313j = new s(1);

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ s f12314m = new s(5);
    public static final /* synthetic */ s n = new s(6);

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ s f12315t = new s(7);

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ s f12316u = new s(8);

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ s f12317w = new s(9);
    public static final /* synthetic */ s y = new s(11);

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ s f12318z = new s(13);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f12319c;

    public /* synthetic */ s(int i10) {
        this.f12319c = i10;
    }

    @Override // sc.f.a
    public String a(Object obj) {
        ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? BuildConfig.FLAVOR : String.valueOf(applicationInfo.minSdkVersion);
    }

    @Override // k8.e
    public void accept(Object obj) {
        ((c.a) obj).b();
    }

    @Override // jb.f
    /* renamed from: apply */
    public boolean mo1631apply(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public c7.h[] b() {
        switch (this.f12319c) {
            case 5:
                return new c7.h[0];
            case 6:
                return new c7.h[]{new l7.c()};
            default:
                return new c7.h[]{new c0(1, 0, 112800)};
        }
    }

    @Override // yb.a.InterfaceC0311a
    public Object c(JsonReader jsonReader) {
        switch (this.f12319c) {
            case 12:
                return yb.a.b(jsonReader);
            default:
                return yb.a.a(jsonReader);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
    public int d(Object obj) {
        Pattern pattern = MediaCodecUtil.f6233a;
        String str = ((com.google.android.exoplayer2.mediacodec.c) obj).f6250a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (k8.c0.f11939a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // c7.l
    public c7.h[] f(Uri uri, Map map) {
        switch (this.f12319c) {
            case 5:
                return b();
            case 6:
                return b();
            default:
                return b();
        }
    }

    @Override // i6.f
    public void g(Exception exc) {
    }

    @Override // k8.m.a
    public void invoke(Object obj) {
        ((n0.c) obj).n();
    }
}
