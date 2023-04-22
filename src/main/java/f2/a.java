package f2;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import g2.h;
import java.util.HashMap;
import java.util.Map;
import m2.c;

/* loaded from: classes.dex */
public class a {
    public final AssetManager d;

    /* renamed from: a  reason: collision with root package name */
    public final h f9361a = new h(0);

    /* renamed from: b  reason: collision with root package name */
    public final Map<h, Typeface> f9362b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Typeface> f9363c = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public String f9364e = ".ttf";

    public a(Drawable.Callback callback) {
        if (callback instanceof View) {
            this.d = ((View) callback).getContext().getAssets();
            return;
        }
        c.a("LottieDrawable must be inside of a view for images to work.");
        this.d = null;
    }
}
