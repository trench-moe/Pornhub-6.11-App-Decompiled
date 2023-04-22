package com.google.android.gms.cast.framework.media;

import a9.b;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.p;
import androidx.core.graphics.drawable.IconCompat;
import b0.j;
import b0.l;
import b0.q;
import com.app.pornhub.R;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import g2.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import l9.g;
import t9.w;
import w8.a;
import w8.c;
import w8.e;
import w8.f;
import w8.k0;
import w8.o0;
import w8.p0;

/* loaded from: classes.dex */
public class MediaNotificationService extends Service {
    public static final b G = new b("MediaNotificationService");
    public static Runnable H;
    public p0 A;
    public p B;
    public NotificationManager C;
    public Notification D;
    public v8.b E;

    /* renamed from: c  reason: collision with root package name */
    public f f6818c;

    /* renamed from: f  reason: collision with root package name */
    public c f6819f;

    /* renamed from: j  reason: collision with root package name */
    public ComponentName f6820j;

    /* renamed from: m  reason: collision with root package name */
    public ComponentName f6821m;

    /* renamed from: t  reason: collision with root package name */
    public int[] f6822t;

    /* renamed from: u  reason: collision with root package name */
    public long f6823u;

    /* renamed from: w  reason: collision with root package name */
    public x8.b f6824w;
    public w8.b y;

    /* renamed from: z  reason: collision with root package name */
    public Resources f6825z;
    public List<j> n = new ArrayList();
    public final BroadcastReceiver F = new o0(this);

    public static List<e> b(k0 k0Var) {
        try {
            return k0Var.e();
        } catch (RemoteException e10) {
            b bVar = G;
            Log.e(bVar.f254a, bVar.e("Unable to call %s on %s.", "getNotificationActions", k0.class.getSimpleName()), e10);
            return null;
        }
    }

    public static int[] d(k0 k0Var) {
        try {
            return k0Var.b();
        } catch (RemoteException e10) {
            b bVar = G;
            Log.e(bVar.f254a, bVar.e("Unable to call %s on %s.", "getCompactViewActionIndices", k0.class.getSimpleName()), e10);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final j a(String str) {
        char c10;
        int i10;
        int i11;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        switch (str.hashCode()) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -945151566:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -945080078:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 235550565:
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    c10 = 3;
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
                p0 p0Var = this.A;
                int i12 = p0Var.f17032c;
                boolean z10 = p0Var.f17031b;
                if (i12 == 2) {
                    f fVar = this.f6818c;
                    i10 = fVar.f16986t;
                    i11 = fVar.J;
                } else {
                    f fVar2 = this.f6818c;
                    i10 = fVar2.f16987u;
                    i11 = fVar2.K;
                }
                if (!z10) {
                    i10 = this.f6818c.f16988w;
                }
                if (!z10) {
                    i11 = this.f6818c.L;
                }
                Intent intent = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                intent.setComponent(this.f6820j);
                PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, intent, w.f15363a);
                String string = this.f6825z.getString(i11);
                IconCompat b10 = i10 == 0 ? null : IconCompat.b(null, BuildConfig.FLAVOR, i10);
                Bundle bundle = new Bundle();
                CharSequence c11 = l.c(string);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                return new j(b10, c11, broadcast, bundle, arrayList2.isEmpty() ? null : (q[]) arrayList2.toArray(new q[arrayList2.size()]), arrayList.isEmpty() ? null : (q[]) arrayList.toArray(new q[arrayList.size()]), true, 0, true, false);
            case 1:
                if (this.A.f17034f) {
                    Intent intent2 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                    intent2.setComponent(this.f6820j);
                    pendingIntent = PendingIntent.getBroadcast(this, 0, intent2, w.f15363a);
                } else {
                    pendingIntent = null;
                }
                f fVar3 = this.f6818c;
                int i13 = fVar3.y;
                String string2 = this.f6825z.getString(fVar3.M);
                IconCompat b11 = i13 == 0 ? null : IconCompat.b(null, BuildConfig.FLAVOR, i13);
                Bundle bundle2 = new Bundle();
                CharSequence c12 = l.c(string2);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                return new j(b11, c12, pendingIntent, bundle2, arrayList4.isEmpty() ? null : (q[]) arrayList4.toArray(new q[arrayList4.size()]), arrayList3.isEmpty() ? null : (q[]) arrayList3.toArray(new q[arrayList3.size()]), true, 0, true, false);
            case 2:
                if (this.A.f17035g) {
                    Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                    intent3.setComponent(this.f6820j);
                    pendingIntent2 = PendingIntent.getBroadcast(this, 0, intent3, w.f15363a);
                } else {
                    pendingIntent2 = null;
                }
                f fVar4 = this.f6818c;
                int i14 = fVar4.f16989z;
                String string3 = this.f6825z.getString(fVar4.N);
                IconCompat b12 = i14 == 0 ? null : IconCompat.b(null, BuildConfig.FLAVOR, i14);
                Bundle bundle3 = new Bundle();
                CharSequence c13 = l.c(string3);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                return new j(b12, c13, pendingIntent2, bundle3, arrayList6.isEmpty() ? null : (q[]) arrayList6.toArray(new q[arrayList6.size()]), arrayList5.isEmpty() ? null : (q[]) arrayList5.toArray(new q[arrayList5.size()]), true, 0, true, false);
            case 3:
                long j10 = this.f6823u;
                Intent intent4 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                intent4.setComponent(this.f6820j);
                intent4.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j10);
                PendingIntent broadcast2 = PendingIntent.getBroadcast(this, 0, intent4, w.f15363a | 134217728);
                f fVar5 = this.f6818c;
                int i15 = fVar5.A;
                int i16 = fVar5.O;
                if (j10 == 10000) {
                    i15 = fVar5.B;
                    i16 = fVar5.P;
                } else if (j10 == 30000) {
                    i15 = fVar5.C;
                    i16 = fVar5.Q;
                }
                String string4 = this.f6825z.getString(i16);
                IconCompat b13 = i15 == 0 ? null : IconCompat.b(null, BuildConfig.FLAVOR, i15);
                Bundle bundle4 = new Bundle();
                CharSequence c14 = l.c(string4);
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                return new j(b13, c14, broadcast2, bundle4, arrayList8.isEmpty() ? null : (q[]) arrayList8.toArray(new q[arrayList8.size()]), arrayList7.isEmpty() ? null : (q[]) arrayList7.toArray(new q[arrayList7.size()]), true, 0, true, false);
            case 4:
                long j11 = this.f6823u;
                Intent intent5 = new Intent(MediaIntentReceiver.ACTION_REWIND);
                intent5.setComponent(this.f6820j);
                intent5.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j11);
                PendingIntent broadcast3 = PendingIntent.getBroadcast(this, 0, intent5, w.f15363a | 134217728);
                f fVar6 = this.f6818c;
                int i17 = fVar6.D;
                int i18 = fVar6.R;
                if (j11 == 10000) {
                    i17 = fVar6.E;
                    i18 = fVar6.S;
                } else if (j11 == 30000) {
                    i17 = fVar6.F;
                    i18 = fVar6.T;
                }
                String string5 = this.f6825z.getString(i18);
                IconCompat b14 = i17 == 0 ? null : IconCompat.b(null, BuildConfig.FLAVOR, i17);
                Bundle bundle5 = new Bundle();
                CharSequence c15 = l.c(string5);
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                return new j(b14, c15, broadcast3, bundle5, arrayList10.isEmpty() ? null : (q[]) arrayList10.toArray(new q[arrayList10.size()]), arrayList9.isEmpty() ? null : (q[]) arrayList9.toArray(new q[arrayList9.size()]), true, 0, true, false);
            case 5:
                Intent intent6 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                intent6.setComponent(this.f6820j);
                PendingIntent broadcast4 = PendingIntent.getBroadcast(this, 0, intent6, w.f15363a);
                f fVar7 = this.f6818c;
                int i19 = fVar7.G;
                String string6 = this.f6825z.getString(fVar7.U);
                IconCompat b15 = i19 == 0 ? null : IconCompat.b(null, BuildConfig.FLAVOR, i19);
                Bundle bundle6 = new Bundle();
                CharSequence c16 = l.c(string6);
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                return new j(b15, c16, broadcast4, bundle6, arrayList12.isEmpty() ? null : (q[]) arrayList12.toArray(new q[arrayList12.size()]), arrayList11.isEmpty() ? null : (q[]) arrayList11.toArray(new q[arrayList11.size()]), true, 0, true, false);
            case 6:
                Intent intent7 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                intent7.setComponent(this.f6820j);
                PendingIntent broadcast5 = PendingIntent.getBroadcast(this, 0, intent7, w.f15363a);
                f fVar8 = this.f6818c;
                int i20 = fVar8.G;
                String string7 = this.f6825z.getString(fVar8.U, BuildConfig.FLAVOR);
                IconCompat b16 = i20 == 0 ? null : IconCompat.b(null, BuildConfig.FLAVOR, i20);
                Bundle bundle7 = new Bundle();
                CharSequence c17 = l.c(string7);
                ArrayList arrayList13 = new ArrayList();
                ArrayList arrayList14 = new ArrayList();
                return new j(b16, c17, broadcast5, bundle7, arrayList14.isEmpty() ? null : (q[]) arrayList14.toArray(new q[arrayList14.size()]), arrayList13.isEmpty() ? null : (q[]) arrayList13.toArray(new q[arrayList13.size()]), true, 0, true, false);
            default:
                b bVar = G;
                Log.e(bVar.f254a, bVar.e("Action: %s is not a pre-defined action.", str));
                return null;
        }
    }

    public final void c() {
        PendingIntent broadcast;
        j a10;
        if (this.A == null) {
            return;
        }
        p pVar = this.B;
        Bitmap bitmap = pVar == null ? null : (Bitmap) pVar.f1053b;
        l lVar = new l(this, "cast_media_notification");
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = lVar.f3416a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
        }
        lVar.f3422h = bitmap;
        lVar.f3434u.icon = this.f6818c.n;
        lVar.e(this.A.d);
        lVar.d(this.f6825z.getString(this.f6818c.I, this.A.f17033e));
        lVar.f(2, true);
        lVar.f3424j = false;
        lVar.f3431r = 1;
        ComponentName componentName = this.f6821m;
        if (componentName == null) {
            broadcast = null;
        } else {
            Intent intent = new Intent();
            intent.putExtra("targetActivity", componentName);
            intent.setAction(componentName.flattenToString());
            broadcast = PendingIntent.getBroadcast(this, 1, intent, w.f15363a | 134217728);
        }
        if (broadcast != null) {
            lVar.f3421g = broadcast;
        }
        k0 k0Var = this.f6818c.V;
        if (k0Var != null) {
            b bVar = G;
            Log.i(bVar.f254a, bVar.e("actionsProvider != null", new Object[0]));
            int[] d = d(k0Var);
            this.f6822t = d == null ? null : (int[]) d.clone();
            List<e> b10 = b(k0Var);
            this.n = new ArrayList();
            if (b10 != null) {
                for (e eVar : b10) {
                    String str = eVar.f16976c;
                    if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || str.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || str.equals(MediaIntentReceiver.ACTION_FORWARD) || str.equals(MediaIntentReceiver.ACTION_REWIND) || str.equals(MediaIntentReceiver.ACTION_STOP_CASTING) || str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                        a10 = a(eVar.f16976c);
                    } else {
                        Intent intent2 = new Intent(eVar.f16976c);
                        intent2.setComponent(this.f6820j);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(this, 0, intent2, w.f15363a);
                        int i10 = eVar.f16977f;
                        String str2 = eVar.f16978j;
                        IconCompat b11 = i10 == 0 ? null : IconCompat.b(null, BuildConfig.FLAVOR, i10);
                        Bundle bundle = new Bundle();
                        CharSequence c10 = l.c(str2);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        a10 = new j(b11, c10, broadcast2, bundle, arrayList2.isEmpty() ? null : (q[]) arrayList2.toArray(new q[arrayList2.size()]), arrayList.isEmpty() ? null : (q[]) arrayList.toArray(new q[arrayList.size()]), true, 0, true, false);
                    }
                    if (a10 != null) {
                        this.n.add(a10);
                    }
                }
            }
        } else {
            b bVar2 = G;
            Log.i(bVar2.f254a, bVar2.e("actionsProvider == null", new Object[0]));
            this.n = new ArrayList();
            for (String str3 : this.f6818c.f16982c) {
                j a11 = a(str3);
                if (a11 != null) {
                    this.n.add(a11);
                }
            }
            int[] iArr = this.f6818c.f16983f;
            this.f6822t = (int[]) Arrays.copyOf(iArr, iArr.length).clone();
        }
        for (j jVar : this.n) {
            if (jVar != null) {
                lVar.f3417b.add(jVar);
            }
        }
        h1.b bVar3 = new h1.b();
        int[] iArr2 = this.f6822t;
        if (iArr2 != null) {
            bVar3.f10091b = iArr2;
        }
        MediaSessionCompat.Token token = this.A.f17030a;
        if (token != null) {
            bVar3.f10092c = token;
        }
        if (lVar.f3425k != bVar3) {
            lVar.f3425k = bVar3;
            bVar3.f(lVar);
        }
        Notification b12 = lVar.b();
        this.D = b12;
        startForeground(1, b12);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.C = (NotificationManager) getSystemService("notification");
        v8.b c10 = v8.b.c(this);
        this.E = c10;
        a aVar = c10.a().f16074t;
        Objects.requireNonNull(aVar, "null reference");
        f fVar = aVar.f16951m;
        Objects.requireNonNull(fVar, "null reference");
        this.f6818c = fVar;
        this.f6819f = aVar.p0();
        this.f6825z = getResources();
        this.f6820j = new ComponentName(getApplicationContext(), aVar.f16948c);
        if (TextUtils.isEmpty(this.f6818c.f16985m)) {
            this.f6821m = null;
        } else {
            this.f6821m = new ComponentName(getApplicationContext(), this.f6818c.f16985m);
        }
        f fVar2 = this.f6818c;
        this.f6823u = fVar2.f16984j;
        int dimensionPixelSize = this.f6825z.getDimensionPixelSize(fVar2.H);
        this.y = new w8.b(1, dimensionPixelSize, dimensionPixelSize);
        this.f6824w = new x8.b(getApplicationContext(), this.y);
        ComponentName componentName = this.f6821m;
        if (componentName != null) {
            registerReceiver(this.F, new IntentFilter(componentName.flattenToString()));
        }
        if (g.a()) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", "Cast", 2);
            notificationChannel.setShowBadge(false);
            this.C.createNotificationChannel(notificationChannel);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        x8.b bVar = this.f6824w;
        if (bVar != null) {
            bVar.a();
        }
        if (this.f6821m != null) {
            try {
                unregisterReceiver(this.F);
            } catch (IllegalArgumentException e10) {
                b bVar2 = G;
                Log.e(bVar2.f254a, bVar2.e("Unregistering trampoline BroadcastReceiver failed", new Object[0]), e10);
            }
            H = null;
            this.C.cancel(1);
        }
        H = null;
        this.C.cancel(1);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, final int i11) {
        p0 p0Var;
        MediaInfo mediaInfo = (MediaInfo) intent.getParcelableExtra("extra_media_info");
        Objects.requireNonNull(mediaInfo, "null reference");
        u8.j jVar = mediaInfo.f6797m;
        Objects.requireNonNull(jVar, "null reference");
        int intExtra = intent.getIntExtra("extra_remote_media_client_player_state", 0);
        CastDevice castDevice = (CastDevice) intent.getParcelableExtra("extra_cast_device");
        Objects.requireNonNull(castDevice, "null reference");
        boolean z10 = intExtra == 2;
        int i12 = mediaInfo.f6795f;
        String q02 = jVar.q0("com.google.android.gms.cast.metadata.TITLE");
        String str = castDevice.f6784m;
        boolean booleanExtra = intent.getBooleanExtra("extra_can_skip_next", false);
        boolean booleanExtra2 = intent.getBooleanExtra("extra_can_skip_prev", false);
        p0 p0Var2 = new p0(z10, i12, q02, str, (MediaSessionCompat.Token) intent.getParcelableExtra("extra_media_session_token"), booleanExtra, booleanExtra2);
        if (intent.getBooleanExtra("extra_media_notification_force_update", false) || (p0Var = this.A) == null || z10 != p0Var.f17031b || i12 != p0Var.f17032c || !a9.a.h(q02, p0Var.d) || !a9.a.h(str, p0Var.f17033e) || booleanExtra != p0Var.f17034f || booleanExtra2 != p0Var.f17035g) {
            this.A = p0Var2;
            c();
        }
        c cVar = this.f6819f;
        p pVar = new p(cVar != null ? cVar.b(jVar, this.y) : jVar.r0() ? jVar.f15693c.get(0) : null);
        p pVar2 = this.B;
        if (pVar2 == null || !a9.a.h((Uri) pVar.f1052a, (Uri) pVar2.f1052a)) {
            x8.b bVar = this.f6824w;
            bVar.f18066f = new h(this, pVar, 3, null);
            bVar.b((Uri) pVar.f1052a);
        }
        startForeground(1, this.D);
        H = new Runnable() { // from class: w8.n0
            @Override // java.lang.Runnable
            public final void run() {
                MediaNotificationService.this.stopSelf(i11);
            }
        };
        return 2;
    }
}
