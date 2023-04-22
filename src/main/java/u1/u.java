package u1;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;
import n0.x;

/* loaded from: classes2.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    public static final mb.a f15511a;

    /* renamed from: b  reason: collision with root package name */
    public static final Property<View, Float> f15512b;

    /* renamed from: c  reason: collision with root package name */
    public static final Property<View, Rect> f15513c;

    /* loaded from: classes2.dex */
    public static class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(u.a(view));
        }

        @Override // android.util.Property
        public void set(View view, Float f10) {
            float floatValue = f10.floatValue();
            u.f15511a.g(view, floatValue);
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Rect get(View view) {
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            return x.f.a(view);
        }

        @Override // android.util.Property
        public void set(View view, Rect rect) {
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            x.f.c(view, rect);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f15511a = new z();
        } else if (i10 >= 23) {
            f15511a = new y();
        } else if (i10 >= 22) {
            f15511a = new x();
        } else {
            f15511a = new w();
        }
        f15512b = new a(Float.class, "translationAlpha");
        f15513c = new b(Rect.class, "clipBounds");
    }

    public static float a(View view) {
        return f15511a.c(view);
    }

    public static void b(View view, int i10, int i11, int i12, int i13) {
        f15511a.f(view, i10, i11, i12, i13);
    }
}
