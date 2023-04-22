package com.mixpanel.android.mpmetrics;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.locks.ReentrantLock;

@TargetApi(16)
/* loaded from: classes.dex */
public class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* renamed from: m  reason: collision with root package name */
    public static final ReentrantLock f8308m = new ReentrantLock();
    public static long n = -1;

    /* renamed from: t  reason: collision with root package name */
    public static s f8309t = null;

    /* renamed from: u  reason: collision with root package name */
    public static int f8310u = 0;

    /* renamed from: w  reason: collision with root package name */
    public static int f8311w = -1;

    /* renamed from: c  reason: collision with root package name */
    public final String f8312c;

    /* renamed from: f  reason: collision with root package name */
    public final String f8313f;

    /* renamed from: j  reason: collision with root package name */
    public final b f8314j;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        public s createFromParcel(Parcel parcel) {
            Bundle bundle = new Bundle(s.class.getClassLoader());
            bundle.readFromParcel(parcel);
            return new s(bundle, null);
        }

        @Override // android.os.Parcelable.Creator
        public s[] newArray(int i10) {
            return new s[i10];
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public b createFromParcel(Parcel parcel) {
                Bundle bundle = new Bundle(b.class.getClassLoader());
                bundle.readFromParcel(parcel);
                String string = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_TYPE_KEY");
                Bundle bundle2 = bundle.getBundle("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_IMPL_KEY");
                if ("InAppNotificationState".equals(string)) {
                    return new C0110b(bundle2, (a) null);
                }
                throw new RuntimeException(a1.a.l("Unrecognized display state type ", string));
            }

            @Override // android.os.Parcelable.Creator
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        /* renamed from: com.mixpanel.android.mpmetrics.s$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0110b extends b {
            public static final Parcelable.Creator<C0110b> CREATOR = new a();

            /* renamed from: c  reason: collision with root package name */
            public final InAppNotification f8315c;

            /* renamed from: f  reason: collision with root package name */
            public final int f8316f;

            /* renamed from: com.mixpanel.android.mpmetrics.s$b$b$a */
            /* loaded from: classes.dex */
            public static class a implements Parcelable.Creator<C0110b> {
                @Override // android.os.Parcelable.Creator
                public C0110b createFromParcel(Parcel parcel) {
                    Bundle bundle = new Bundle(C0110b.class.getClassLoader());
                    bundle.readFromParcel(parcel);
                    return new C0110b(bundle, (a) null);
                }

                @Override // android.os.Parcelable.Creator
                public C0110b[] newArray(int i10) {
                    return new C0110b[i10];
                }
            }

            public C0110b(Bundle bundle, a aVar) {
                super(null);
                this.f8315c = (InAppNotification) bundle.getParcelable("com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.INAPP_KEY");
                this.f8316f = bundle.getInt("com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.HIGHLIGHT_KEY");
            }

            public C0110b(InAppNotification inAppNotification, int i10) {
                super(null);
                this.f8315c = inAppNotification;
                this.f8316f = i10;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.INAPP_KEY", this.f8315c);
                bundle.putInt("com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.HIGHLIGHT_KEY", this.f8316f);
                parcel.writeBundle(bundle);
            }
        }

        public b() {
        }

        public b(a aVar) {
        }
    }

    public s(Bundle bundle, a aVar) {
        this.f8312c = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY");
        this.f8313f = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY");
        this.f8314j = (b) bundle.getParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY");
    }

    public s(b bVar, String str, String str2) {
        this.f8312c = str;
        this.f8313f = str2;
        this.f8314j = bVar;
    }

    public static s a(int i10) {
        ReentrantLock reentrantLock = f8308m;
        reentrantLock.lock();
        try {
            int i11 = f8311w;
            if (i11 > 0 && i11 != i10) {
                reentrantLock.unlock();
                return null;
            } else if (f8309t == null) {
                reentrantLock.unlock();
                return null;
            } else {
                n = System.currentTimeMillis();
                f8311w = i10;
                s sVar = f8309t;
                reentrantLock.unlock();
                return sVar;
            }
        } catch (Throwable th) {
            f8308m.unlock();
            throw th;
        }
    }

    public static boolean b() {
        if (f8308m.isHeldByCurrentThread()) {
            long currentTimeMillis = System.currentTimeMillis() - n;
            if (f8310u > 0 && currentTimeMillis > 43200000) {
                cb.e.O("MixpanelAPI.UpDisplSt", "UpdateDisplayState set long, long ago, without showing. Update state will be cleared.");
                f8309t = null;
            }
            return f8309t != null;
        }
        throw new AssertionError();
    }

    public static int c(b bVar, String str, String str2) {
        if (f8308m.isHeldByCurrentThread()) {
            if (b()) {
                cb.e.h0("MixpanelAPI.UpDisplSt", "Already showing (or cooking) a Mixpanel update, declining to show another.");
                return -1;
            }
            n = System.currentTimeMillis();
            f8309t = new s(bVar, str, str2);
            int i10 = f8310u + 1;
            f8310u = i10;
            return i10;
        }
        throw new AssertionError();
    }

    public static void d(int i10) {
        ReentrantLock reentrantLock = f8308m;
        reentrantLock.lock();
        try {
            if (i10 == f8311w) {
                f8311w = -1;
                f8309t = null;
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            f8308m.unlock();
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY", this.f8312c);
        bundle.putString("com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY", this.f8313f);
        bundle.putParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY", this.f8314j);
        parcel.writeBundle(bundle);
    }
}
