package sc;

import a9.m;
import a9.o;
import a9.x;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.fragment.app.h0;
import b3.h;
import b3.j;
import com.google.android.gms.internal.cast.g1;
import com.google.android.gms.internal.cast.zzju;
import e9.m;
import ea.u;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import l6.v;
import t9.k0;
import t9.t0;
import t9.y;
import u8.p;
import u8.z;
import vd.i;
import x8.k;

/* loaded from: classes2.dex */
public class c implements x8.a, ea.e, o {

    /* renamed from: j  reason: collision with root package name */
    public static volatile c f14952j;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f14953c;

    /* renamed from: f  reason: collision with root package name */
    public Object f14954f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(int i10) {
        this(new i());
        this.f14953c = i10;
        if (i10 == 1) {
            this.f14954f = new HashMap();
        } else if (i10 != 10) {
            this.f14954f = new HashSet();
        }
    }

    public c(b3.b categoriesRepository) {
        this.f14953c = 2;
        Intrinsics.checkNotNullParameter(categoriesRepository, "categoriesRepository");
        this.f14954f = categoriesRepository;
    }

    public c(b3.d commentsRepository) {
        this.f14953c = 3;
        Intrinsics.checkNotNullParameter(commentsRepository, "commentsRepository");
        this.f14954f = commentsRepository;
    }

    public c(h gifsRepository) {
        this.f14953c = 4;
        Intrinsics.checkNotNullParameter(gifsRepository, "gifsRepository");
        this.f14954f = gifsRepository;
    }

    public c(j photosRepository) {
        this.f14953c = 5;
        Intrinsics.checkNotNullParameter(photosRepository, "photosRepository");
        this.f14954f = photosRepository;
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.f14953c = i10;
        this.f14954f = obj;
    }

    public c(i iVar) {
        this.f14953c = 10;
        this.f14954f = iVar;
    }

    @Override // a9.o
    public void a(long j10) {
        ((m) this.f14954f).f300w.f9273a.p(null);
    }

    @Override // a9.o
    public void b(long j10, int i10, Object obj) {
        if (i10 != 0) {
            ea.h<p> hVar = ((m) this.f14954f).f300w;
            hVar.f9273a.o(new IOException("storing session is timeout"));
        }
    }

    public Set c() {
        Set unmodifiableSet;
        synchronized (((Set) this.f14954f)) {
            unmodifiableSet = Collections.unmodifiableSet((Set) this.f14954f);
        }
        return unmodifiableSet;
    }

    @Override // x8.a
    public void i(Bitmap bitmap) {
        a9.b bVar = k.C;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f10 = width;
            int i10 = (int) (((9.0f * f10) / 16.0f) + 0.5f);
            float f11 = (i10 - height) / 2;
            RectF rectF = new RectF(0.0f, f11, f10, height + f11);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, i10, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((k) this.f14954f).h(bitmap2, 0);
    }

    @Override // ea.e
    public void onSuccess(Object obj) {
        switch (this.f14953c) {
            case 7:
                v8.b bVar = (v8.b) this.f14954f;
                Bundle bundle = (Bundle) obj;
                a9.b bVar2 = v8.b.f16060i;
                boolean z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED");
                boolean z11 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED");
                if (!z10) {
                    if (z11) {
                        z11 = true;
                    }
                    return;
                }
                String packageName = bVar.f16063a.getPackageName();
                String format = String.format(Locale.ROOT, "%s.%s", bVar.f16063a.getPackageName(), "client_cast_analytics_data");
                v.b(bVar.f16063a);
                i6.e b10 = v.a().c(j6.a.f11418e).b("CAST_SENDER_SDK", new i6.b("proto"), k0.f15282m);
                long j10 = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE");
                SharedPreferences sharedPreferences = bVar.f16063a.getApplicationContext().getSharedPreferences(format, 0);
                y yVar = new y(sharedPreferences, b10, j10);
                if (z10) {
                    x xVar = new x(bVar.f16063a);
                    m.a aVar = new m.a();
                    aVar.f9224a = new androidx.appcompat.widget.i(xVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                    aVar.f9226c = new c9.d[]{z.f15769c};
                    aVar.f9225b = false;
                    aVar.d = 8426;
                    Object b11 = xVar.b(0, aVar.a());
                    h0 h0Var = new h0(bVar, yVar, sharedPreferences, 3);
                    u uVar = (u) b11;
                    Objects.requireNonNull(uVar);
                    uVar.e(ea.i.f9274a, h0Var);
                }
                if (z11) {
                    a9.b bVar3 = t0.f15343i;
                    synchronized (t0.class) {
                        try {
                            if (t0.f15345k == null) {
                                t0.f15345k = new t0(sharedPreferences, yVar, packageName);
                            }
                            t0 t0Var = t0.f15345k;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    t0.b(zzju.CAST_CONTEXT);
                    return;
                }
                return;
            default:
                t9.g gVar = (t9.g) this.f14954f;
                p pVar = (p) obj;
                a9.b bVar4 = t9.g.f15212f;
                if (pVar == null) {
                    return;
                }
                gVar.f15216e = pVar;
                g1<Void> g1Var = gVar.d;
                if (g1Var != null) {
                    g1Var.o(null);
                }
                return;
        }
    }
}
