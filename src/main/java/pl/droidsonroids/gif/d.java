package pl.droidsonroids.gif;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a */
    public static final List<String> f14124a = Arrays.asList("raw", "drawable", "mipmap");

    /* loaded from: classes3.dex */
    public static class a extends b {

        /* renamed from: c */
        public final int f14125c;
        public final int d;

        public a() {
            this.f14125c = 0;
            this.d = 0;
        }

        public a(ImageView imageView, AttributeSet attributeSet, int i10, int i11) {
            super(imageView, attributeSet, i10, i11);
            this.f14125c = a(imageView, attributeSet, true);
            this.d = a(imageView, attributeSet, false);
        }

        public static int a(ImageView imageView, AttributeSet attributeSet, boolean z10) {
            int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", z10 ? "src" : "background", 0);
            if (attributeResourceValue > 0) {
                if (d.f14124a.contains(imageView.getResources().getResourceTypeName(attributeResourceValue)) && !d.d(imageView, z10, attributeResourceValue)) {
                    return attributeResourceValue;
                }
            }
            return 0;
        }
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        public boolean f14126a;

        /* renamed from: b */
        public final int f14127b;

        public b() {
            this.f14126a = false;
            this.f14127b = -1;
        }

        public b(View view, AttributeSet attributeSet, int i10, int i11) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, mb.a.n, i10, i11);
            this.f14126a = obtainStyledAttributes.getBoolean(0, false);
            this.f14127b = obtainStyledAttributes.getInt(1, -1);
            obtainStyledAttributes.recycle();
        }
    }

    public static void a(int i10, Drawable drawable) {
        if (drawable instanceof pl.droidsonroids.gif.b) {
            ((pl.droidsonroids.gif.b) drawable).f14118u.v(i10);
        }
    }

    public static a b(ImageView imageView, AttributeSet attributeSet, int i10, int i11) {
        if (attributeSet == null || imageView.isInEditMode()) {
            return new a();
        }
        a aVar = new a(imageView, attributeSet, i10, i11);
        int i12 = aVar.f14127b;
        if (i12 >= 0) {
            a(i12, imageView.getDrawable());
            a(i12, imageView.getBackground());
        }
        return aVar;
    }

    public static boolean c(ImageView imageView, Uri uri) {
        if (uri != null) {
            try {
                imageView.setImageDrawable(new pl.droidsonroids.gif.b(imageView.getContext().getContentResolver(), uri));
                return true;
            } catch (IOException unused) {
                return false;
            }
        }
        return false;
    }

    public static boolean d(ImageView imageView, boolean z10, int i10) {
        Resources resources = imageView.getResources();
        if (resources != null) {
            try {
                if (f14124a.contains(resources.getResourceTypeName(i10))) {
                    pl.droidsonroids.gif.b bVar = new pl.droidsonroids.gif.b(resources, i10);
                    if (z10) {
                        imageView.setImageDrawable(bVar);
                        return true;
                    }
                    imageView.setBackground(bVar);
                    return true;
                }
                return false;
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        return false;
    }
}
