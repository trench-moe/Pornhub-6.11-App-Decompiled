package ra;

import android.content.Context;
import android.graphics.Color;
import com.app.pornhub.R;
import kotlin.KotlinVersion;
import l9.e;
import za.b;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: f  reason: collision with root package name */
    public static final int f14738f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14739a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14740b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14741c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final float f14742e;

    public a(Context context) {
        boolean b10 = b.b(context, R.attr.elevationOverlayEnabled, false);
        int d = e.d(context, R.attr.elevationOverlayColor, 0);
        int d10 = e.d(context, R.attr.elevationOverlayAccentColor, 0);
        int d11 = e.d(context, R.attr.colorSurface, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f14739a = b10;
        this.f14740b = d;
        this.f14741c = d10;
        this.d = d11;
        this.f14742e = f10;
    }

    public int a(int i10, float f10) {
        int i11;
        if (this.f14739a) {
            if (e0.a.j(i10, KotlinVersion.MAX_COMPONENT_VALUE) == this.d) {
                float f11 = this.f14742e;
                float min = (f11 <= 0.0f || f10 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f10 / f11)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
                int alpha = Color.alpha(i10);
                int i12 = e.i(e0.a.j(i10, KotlinVersion.MAX_COMPONENT_VALUE), this.f14740b, min);
                if (min > 0.0f && (i11 = this.f14741c) != 0) {
                    i12 = e0.a.f(e0.a.j(i11, f14738f), i12);
                }
                return e0.a.j(i12, alpha);
            }
            return i10;
        }
        return i10;
    }
}
