package b0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public Context f3416a;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f3419e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f3420f;

    /* renamed from: g  reason: collision with root package name */
    public PendingIntent f3421g;

    /* renamed from: h  reason: collision with root package name */
    public Bitmap f3422h;

    /* renamed from: i  reason: collision with root package name */
    public int f3423i;

    /* renamed from: k  reason: collision with root package name */
    public m f3425k;

    /* renamed from: l  reason: collision with root package name */
    public int f3426l;

    /* renamed from: m  reason: collision with root package name */
    public int f3427m;
    public boolean n;

    /* renamed from: p  reason: collision with root package name */
    public Bundle f3429p;

    /* renamed from: s  reason: collision with root package name */
    public String f3432s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3433t;

    /* renamed from: u  reason: collision with root package name */
    public Notification f3434u;
    @Deprecated

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<String> f3435v;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<j> f3417b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<p> f3418c = new ArrayList<>();
    public ArrayList<j> d = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public boolean f3424j = true;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3428o = false;

    /* renamed from: q  reason: collision with root package name */
    public int f3430q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f3431r = 0;

    public l(Context context, String str) {
        Notification notification = new Notification();
        this.f3434u = notification;
        this.f3416a = context;
        this.f3432s = str;
        notification.when = System.currentTimeMillis();
        this.f3434u.audioStreamType = -1;
        this.f3423i = 0;
        this.f3435v = new ArrayList<>();
        this.f3433t = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            charSequence = charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public l a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
        this.f3417b.add(new j(i10 == 0 ? null : IconCompat.b(null, BuildConfig.FLAVOR, i10), charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false));
        return this;
    }

    public Notification b() {
        Notification build;
        Bundle bundle;
        RemoteViews d;
        n nVar = new n(this);
        m mVar = nVar.f3438b.f3425k;
        if (mVar != null) {
            mVar.b(nVar);
        }
        RemoteViews e10 = mVar != null ? mVar.e(nVar) : null;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            build = nVar.f3437a.build();
        } else if (i10 >= 24) {
            build = nVar.f3437a.build();
        } else {
            nVar.f3437a.setExtras(nVar.d);
            build = nVar.f3437a.build();
        }
        if (e10 != null) {
            build.contentView = e10;
        } else {
            Objects.requireNonNull(nVar.f3438b);
        }
        if (mVar != null && (d = mVar.d(nVar)) != null) {
            build.bigContentView = d;
        }
        if (mVar != null) {
            Objects.requireNonNull(nVar.f3438b.f3425k);
        }
        if (mVar != null && (bundle = build.extras) != null) {
            mVar.a(bundle);
        }
        return build;
    }

    public l d(CharSequence charSequence) {
        this.f3420f = c(charSequence);
        return this;
    }

    public l e(CharSequence charSequence) {
        this.f3419e = c(charSequence);
        return this;
    }

    public final void f(int i10, boolean z10) {
        if (z10) {
            Notification notification = this.f3434u;
            notification.flags = i10 | notification.flags;
            return;
        }
        Notification notification2 = this.f3434u;
        notification2.flags = (~i10) & notification2.flags;
    }

    public l g(int i10, int i11, boolean z10) {
        this.f3426l = i10;
        this.f3427m = i11;
        this.n = z10;
        return this;
    }
}
