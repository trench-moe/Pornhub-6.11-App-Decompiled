package f2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import b2.m;
import java.util.HashMap;
import java.util.Map;
import m2.c;

/* loaded from: classes.dex */
public class b {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f9365e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Context f9366a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9367b;

    /* renamed from: c  reason: collision with root package name */
    public b2.b f9368c;
    public final Map<String, m> d;

    public b(Drawable.Callback callback, String str, b2.b bVar, Map<String, m> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f9367b = str;
        } else {
            this.f9367b = str + '/';
        }
        if (callback instanceof View) {
            this.f9366a = ((View) callback).getContext();
            this.d = map;
            this.f9368c = bVar;
            return;
        }
        c.a("LottieDrawable must be inside of a view for images to work.");
        this.d = new HashMap();
        this.f9366a = null;
    }

    public final Bitmap a(String str, Bitmap bitmap) {
        synchronized (f9365e) {
            this.d.get(str).f3516e = bitmap;
        }
        return bitmap;
    }
}
