package x8;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.app.pornhub.R;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import h9.o;
import java.util.ArrayList;
import t9.w;
import t9.x;
import w8.g;

/* loaded from: classes2.dex */
public final class k implements g.b {
    public static final a9.b C = new a9.b("MediaSessionManager");
    public MediaSessionCompat A;
    public boolean B;

    /* renamed from: c  reason: collision with root package name */
    public final Context f18075c;

    /* renamed from: f  reason: collision with root package name */
    public final v8.c f18076f;

    /* renamed from: j  reason: collision with root package name */
    public final t9.f f18077j;

    /* renamed from: m  reason: collision with root package name */
    public final ComponentName f18078m;
    public final b n;

    /* renamed from: t  reason: collision with root package name */
    public final b f18079t;

    /* renamed from: u  reason: collision with root package name */
    public final Handler f18080u;

    /* renamed from: w  reason: collision with root package name */
    public final Runnable f18081w;
    public w8.g y;

    /* renamed from: z  reason: collision with root package name */
    public CastDevice f18082z;

    public k(Context context, v8.c cVar, t9.f fVar) {
        this.f18075c = context;
        this.f18076f = cVar;
        this.f18077j = fVar;
        w8.a aVar = cVar.f16074t;
        if (aVar == null || TextUtils.isEmpty(aVar.f16949f)) {
            this.f18078m = null;
        } else {
            this.f18078m = new ComponentName(context, cVar.f16074t.f16949f);
        }
        b bVar = new b(context);
        this.n = bVar;
        bVar.f18066f = new sc.c(this, 6);
        b bVar2 = new b(context);
        this.f18079t = bVar2;
        bVar2.f18066f = new d3.d(this, 3);
        this.f18080u = new x(Looper.getMainLooper());
        this.f18081w = new i(this, 0);
    }

    public final void a(w8.g gVar, CastDevice castDevice) {
        v8.c cVar;
        if (!this.B && (cVar = this.f18076f) != null && cVar.f16074t != null && gVar != null) {
            if (castDevice == null) {
                return;
            }
            this.y = gVar;
            o.d("Must be called from the main thread.");
            gVar.f17013g.add(this);
            this.f18082z = castDevice;
            ComponentName componentName = new ComponentName(this.f18075c, this.f18076f.f16074t.f16948c);
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.f18075c, 0, intent, w.f15363a);
            if (this.f18076f.f16074t.f16952t) {
                this.A = new MediaSessionCompat(this.f18075c, "CastMediaSession", componentName, broadcast);
                n(0, null);
                CastDevice castDevice2 = this.f18082z;
                if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.f6784m)) {
                    MediaSessionCompat mediaSessionCompat = this.A;
                    Bundle bundle = new Bundle();
                    String string = this.f18075c.getResources().getString(R.string.cast_casting_to_device, this.f18082z.f6784m);
                    p.a<String, Integer> aVar = MediaMetadataCompat.f370m;
                    if ((aVar.e("android.media.metadata.ALBUM_ARTIST") >= 0) && aVar.getOrDefault("android.media.metadata.ALBUM_ARTIST", null).intValue() != 1) {
                        throw new IllegalArgumentException("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                    }
                    bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                    mediaSessionCompat.f399a.h(new MediaMetadataCompat(bundle));
                }
                this.A.e(new j(this), null);
                this.A.d(true);
                this.f18077j.b1(this.A);
            }
            this.B = true;
            e(false);
        }
    }

    @Override // w8.g.b
    public final void b() {
        e(false);
    }

    @Override // w8.g.b
    public final void c() {
        e(false);
    }

    @Override // w8.g.b
    public final void d() {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(boolean r14) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.k.e(boolean):void");
    }

    public final Uri f(u8.j jVar, int i10) {
        g9.a a10 = this.f18076f.f16074t.p0() != null ? this.f18076f.f16074t.p0().a(jVar, i10) : jVar.r0() ? jVar.f15693c.get(0) : null;
        if (a10 == null) {
            return null;
        }
        return a10.f9883f;
    }

    public final MediaMetadataCompat.b g() {
        MediaSessionCompat mediaSessionCompat = this.A;
        MediaMetadataCompat a10 = mediaSessionCompat == null ? null : mediaSessionCompat.f400b.a();
        return a10 == null ? new MediaMetadataCompat.b() : new MediaMetadataCompat.b(a10);
    }

    public final void h(Bitmap bitmap, int i10) {
        MediaSessionCompat mediaSessionCompat = this.A;
        if (mediaSessionCompat == null) {
            return;
        }
        if (i10 != 0) {
            if (i10 == 3) {
                MediaMetadataCompat.b g10 = g();
                g10.b("android.media.metadata.ALBUM_ART", bitmap);
                mediaSessionCompat.f399a.h(g10.a());
            }
        } else if (bitmap != null) {
            MediaMetadataCompat.b g11 = g();
            g11.b("android.media.metadata.DISPLAY_ICON", bitmap);
            mediaSessionCompat.f399a.h(g11.a());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(0);
            MediaSessionCompat mediaSessionCompat2 = this.A;
            MediaMetadataCompat.b g12 = g();
            g12.b("android.media.metadata.DISPLAY_ICON", createBitmap);
            mediaSessionCompat2.f399a.h(g12.a());
        }
    }

    @Override // w8.g.b
    public final void i() {
        e(false);
    }

    public final void j(boolean z10) {
        if (this.f18076f.f16075u) {
            this.f18080u.removeCallbacks(this.f18081w);
            Intent intent = new Intent(this.f18075c, ReconnectionService.class);
            intent.setPackage(this.f18075c.getPackageName());
            try {
                this.f18075c.startService(intent);
            } catch (IllegalStateException unused) {
                if (z10) {
                    this.f18080u.postDelayed(this.f18081w, 1000L);
                }
            }
        }
    }

    public final void k() {
        if (this.f18076f.f16074t.f16951m == null) {
            return;
        }
        C.a("Stopping notification service.", new Object[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            Runnable runnable = MediaNotificationService.H;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        Intent intent = new Intent(this.f18075c, MediaNotificationService.class);
        intent.setPackage(this.f18075c.getPackageName());
        intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
        this.f18075c.stopService(intent);
    }

    public final void l() {
        if (this.f18076f.f16075u) {
            this.f18080u.removeCallbacks(this.f18081w);
            Intent intent = new Intent(this.f18075c, ReconnectionService.class);
            intent.setPackage(this.f18075c.getPackageName());
            this.f18075c.stopService(intent);
        }
    }

    @Override // w8.g.b
    public final void m() {
        e(false);
    }

    public final void n(int i10, MediaInfo mediaInfo) {
        PendingIntent activity;
        MediaSessionCompat mediaSessionCompat = this.A;
        if (mediaSessionCompat == null) {
            return;
        }
        if (i10 == 0) {
            mediaSessionCompat.f399a.l(new PlaybackStateCompat(0, 0L, 0L, 1.0f, 0L, 0, null, SystemClock.elapsedRealtime(), new ArrayList(), -1L, null));
            this.A.f399a.h(new MediaMetadataCompat(new Bundle()));
            return;
        }
        long j10 = true != this.y.l() ? 768L : 512L;
        this.A.f399a.l(new PlaybackStateCompat(i10, this.y.l() ? 0L : this.y.c(), 0L, 1.0f, j10, 0, null, SystemClock.elapsedRealtime(), new ArrayList(), -1L, null));
        MediaSessionCompat mediaSessionCompat2 = this.A;
        if (this.f18078m == null) {
            activity = null;
        } else {
            Intent intent = new Intent();
            intent.setComponent(this.f18078m);
            activity = PendingIntent.getActivity(this.f18075c, 0, intent, w.f15363a | 134217728);
        }
        mediaSessionCompat2.f399a.c(activity);
        if (this.A == null) {
            return;
        }
        u8.j jVar = mediaInfo.f6797m;
        long j11 = this.y.l() ? 0L : mediaInfo.n;
        MediaMetadataCompat.b g10 = g();
        g10.c("android.media.metadata.TITLE", jVar.q0("com.google.android.gms.cast.metadata.TITLE"));
        g10.c("android.media.metadata.DISPLAY_TITLE", jVar.q0("com.google.android.gms.cast.metadata.TITLE"));
        g10.c("android.media.metadata.DISPLAY_SUBTITLE", jVar.q0("com.google.android.gms.cast.metadata.SUBTITLE"));
        p.a<String, Integer> aVar = MediaMetadataCompat.f370m;
        if ((aVar.e("android.media.metadata.DURATION") >= 0) && aVar.getOrDefault("android.media.metadata.DURATION", null).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        g10.f376a.putLong("android.media.metadata.DURATION", j11);
        this.A.f399a.h(g10.a());
        Uri f10 = f(jVar, 0);
        if (f10 != null) {
            this.n.b(f10);
        } else {
            h(null, 0);
        }
        Uri f11 = f(jVar, 3);
        if (f11 != null) {
            this.f18079t.b(f11);
        } else {
            h(null, 3);
        }
    }

    @Override // w8.g.b
    public final void o() {
        e(false);
    }
}
