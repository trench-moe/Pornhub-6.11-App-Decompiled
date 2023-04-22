package l5;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final int f12247a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12248b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f12249c;
    public final int d;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final int f12250e;

        /* renamed from: a  reason: collision with root package name */
        public final Context f12251a;

        /* renamed from: b  reason: collision with root package name */
        public ActivityManager f12252b;

        /* renamed from: c  reason: collision with root package name */
        public c f12253c;
        public float d;

        static {
            f12250e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.d = f12250e;
            this.f12251a = context;
            this.f12252b = (ActivityManager) context.getSystemService("activity");
            this.f12253c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !this.f12252b.isLowRamDevice()) {
                return;
            }
            this.d = 0.0f;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final DisplayMetrics f12254a;

        public b(DisplayMetrics displayMetrics) {
            this.f12254a = displayMetrics;
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
    }

    public j(a aVar) {
        ActivityManager activityManager;
        this.f12249c = aVar.f12251a;
        int i10 = aVar.f12252b.isLowRamDevice() ? 2097152 : 4194304;
        this.d = i10;
        int round = Math.round(activityManager.getMemoryClass() * 1024 * 1024 * (aVar.f12252b.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = ((b) aVar.f12253c).f12254a;
        float f10 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int round2 = Math.round(aVar.d * f10);
        int round3 = Math.round(f10 * 2.0f);
        int i11 = round - i10;
        int i12 = round3 + round2;
        if (i12 <= i11) {
            this.f12248b = round3;
            this.f12247a = round2;
        } else {
            float f11 = i11 / (aVar.d + 2.0f);
            this.f12248b = Math.round(2.0f * f11);
            this.f12247a = Math.round(f11 * aVar.d);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder m10 = a1.a.m("Calculation complete, Calculated memory cache size: ");
            m10.append(a(this.f12248b));
            m10.append(", pool size: ");
            m10.append(a(this.f12247a));
            m10.append(", byte array size: ");
            m10.append(a(i10));
            m10.append(", memory class limited? ");
            m10.append(i12 > round);
            m10.append(", max size: ");
            m10.append(a(round));
            m10.append(", memoryClass: ");
            m10.append(aVar.f12252b.getMemoryClass());
            m10.append(", isLowMemoryDevice: ");
            m10.append(aVar.f12252b.isLowRamDevice());
            Log.d("MemorySizeCalculator", m10.toString());
        }
    }

    public final String a(int i10) {
        return Formatter.formatFileSize(this.f12249c, i10);
    }
}
