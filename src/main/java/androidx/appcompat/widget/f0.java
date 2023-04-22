package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.appcompat.widget.h;
import c0.a;
import com.app.pornhub.R;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: i  reason: collision with root package name */
    public static f0 f989i;

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap<Context, p.h<ColorStateList>> f991a;

    /* renamed from: b  reason: collision with root package name */
    public p.g<String, e> f992b;

    /* renamed from: c  reason: collision with root package name */
    public p.h<String> f993c;
    public final WeakHashMap<Context, p.d<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f994e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f995f;

    /* renamed from: g  reason: collision with root package name */
    public f f996g;

    /* renamed from: h  reason: collision with root package name */
    public static final PorterDuff.Mode f988h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j  reason: collision with root package name */
    public static final c f990j = new c(6);

    /* loaded from: classes.dex */
    public static class a implements e {
        @Override // androidx.appcompat.widget.f0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return g.a.g(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements e {
        @Override // androidx.appcompat.widget.f0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                v1.c cVar = new v1.c(context, null, null);
                cVar.inflate(resources, xmlPullParser, attributeSet, theme);
                return cVar;
            } catch (Exception e10) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends p.e<Integer, PorterDuffColorFilter> {
        public c(int i10) {
            super(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class d implements e {
        @Override // androidx.appcompat.widget.f0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    h.b.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e10) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e10);
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* loaded from: classes.dex */
    public interface f {
    }

    /* loaded from: classes.dex */
    public static class g implements e {
        @Override // androidx.appcompat.widget.f0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return v1.g.a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                return null;
            }
        }
    }

    public static synchronized f0 d() {
        f0 f0Var;
        synchronized (f0.class) {
            if (f989i == null) {
                f0 f0Var2 = new f0();
                f989i = f0Var2;
                j(f0Var2);
            }
            f0Var = f989i;
        }
        return f0Var;
    }

    public static synchronized PorterDuffColorFilter h(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (f0.class) {
            try {
                c cVar = f990j;
                Objects.requireNonNull(cVar);
                int i11 = (i10 + 31) * 31;
                porterDuffColorFilter = cVar.get(Integer.valueOf(mode.hashCode() + i11));
                if (porterDuffColorFilter == null) {
                    porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
                    Objects.requireNonNull(cVar);
                    cVar.put(Integer.valueOf(mode.hashCode() + i11), porterDuffColorFilter);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(f0 f0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            f0Var.a("vector", new g());
            f0Var.a("animated-vector", new b());
            f0Var.a("animated-selector", new a());
            f0Var.a("drawable", new d());
        }
    }

    public final void a(String str, e eVar) {
        if (this.f992b == null) {
            this.f992b = new p.g<>();
        }
        this.f992b.put(str, eVar);
    }

    public final synchronized boolean b(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                p.d<WeakReference<Drawable.ConstantState>> dVar = this.d.get(context);
                if (dVar == null) {
                    dVar = new p.d<>(10);
                    this.d.put(context, dVar);
                }
                dVar.j(j10, new WeakReference<>(constantState));
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i10) {
        if (this.f994e == null) {
            this.f994e = new TypedValue();
        }
        TypedValue typedValue = this.f994e;
        context.getResources().getValue(i10, typedValue, true);
        long j10 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e10 = e(context, j10);
        if (e10 != null) {
            return e10;
        }
        f fVar = this.f996g;
        LayerDrawable layerDrawable = null;
        if (fVar != null) {
            h.a aVar = (h.a) fVar;
            if (i10 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i10 == R.drawable.abc_ratingbar_material) {
                layerDrawable = aVar.c(this, context, R.dimen.abc_star_big);
            } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = aVar.c(this, context, R.dimen.abc_star_medium);
            } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = aVar.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j10, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j10) {
        p.d<WeakReference<Drawable.ConstantState>> dVar = this.d.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> g10 = dVar.g(j10, null);
        if (g10 != null) {
            Drawable.ConstantState constantState = g10.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int h10 = a0.b.h(dVar.f13746f, dVar.f13748m, j10);
            if (h10 >= 0) {
                Object[] objArr = dVar.f13747j;
                Object obj = objArr[h10];
                Object obj2 = p.d.n;
                if (obj != obj2) {
                    objArr[h10] = obj2;
                    dVar.f13745c = true;
                }
            }
        }
        return null;
    }

    public synchronized Drawable f(Context context, int i10) {
        return g(context, i10, false);
    }

    public synchronized Drawable g(Context context, int i10, boolean z10) {
        Drawable k10;
        try {
            if (!this.f995f) {
                boolean z11 = true;
                this.f995f = true;
                Drawable f10 = f(context, R.drawable.abc_vector_test);
                if (f10 != null) {
                    if (!(f10 instanceof v1.g) && !"android.graphics.drawable.VectorDrawable".equals(f10.getClass().getName())) {
                        z11 = false;
                    }
                }
                this.f995f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
            k10 = k(context, i10);
            if (k10 == null) {
                k10 = c(context, i10);
            }
            if (k10 == null) {
                Object obj = c0.a.f3717a;
                k10 = a.c.b(context, i10);
            }
            if (k10 != null) {
                k10 = l(context, i10, z10, k10);
            }
            if (k10 != null) {
                v.b(k10);
            }
        } finally {
        }
        return k10;
    }

    public synchronized ColorStateList i(Context context, int i10) {
        ColorStateList f10;
        p.h<ColorStateList> hVar;
        try {
            WeakHashMap<Context, p.h<ColorStateList>> weakHashMap = this.f991a;
            ColorStateList colorStateList = null;
            f10 = (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) ? null : hVar.f(i10, null);
            if (f10 == null) {
                f fVar = this.f996g;
                if (fVar != null) {
                    colorStateList = ((h.a) fVar).d(context, i10);
                }
                if (colorStateList != null) {
                    if (this.f991a == null) {
                        this.f991a = new WeakHashMap<>();
                    }
                    p.h<ColorStateList> hVar2 = this.f991a.get(context);
                    if (hVar2 == null) {
                        hVar2 = new p.h<>();
                        this.f991a.put(context, hVar2);
                    }
                    hVar2.a(i10, colorStateList);
                }
                f10 = colorStateList;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10;
    }

    public final Drawable k(Context context, int i10) {
        int next;
        p.g<String, e> gVar = this.f992b;
        if (gVar == null || gVar.isEmpty()) {
            return null;
        }
        p.h<String> hVar = this.f993c;
        if (hVar != null) {
            String f10 = hVar.f(i10, null);
            if ("appcompat_skip_skip".equals(f10) || (f10 != null && this.f992b.getOrDefault(f10, null) == null)) {
                return null;
            }
        } else {
            this.f993c = new p.h<>();
        }
        if (this.f994e == null) {
            this.f994e = new TypedValue();
        }
        TypedValue typedValue = this.f994e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long j10 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e10 = e(context, j10);
        if (e10 != null) {
            return e10;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f993c.a(i10, name);
                e eVar = this.f992b.get(name);
                if (eVar != null) {
                    e10 = eVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (e10 != null) {
                    e10.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j10, e10);
                }
            } catch (Exception e11) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e11);
            }
        }
        if (e10 == null) {
            this.f993c.a(i10, "appcompat_skip_skip");
        }
        return e10;
    }

    public final Drawable l(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList i11 = i(context, i10);
        PorterDuff.Mode mode = null;
        if (i11 != null) {
            if (v.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable h10 = f0.a.h(drawable);
            h10.setTintList(i11);
            if (this.f996g != null && i10 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                h10.setTintMode(mode);
                return h10;
            }
            return h10;
        }
        f fVar = this.f996g;
        if (fVar != null) {
            h.a aVar = (h.a) fVar;
            boolean z11 = true;
            if (i10 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int c10 = k0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = h.f1002b;
                aVar.e(findDrawableByLayerId, c10, mode2);
                aVar.e(layerDrawable.findDrawableByLayerId(16908303), k0.c(context, R.attr.colorControlNormal), mode2);
                aVar.e(layerDrawable.findDrawableByLayerId(16908301), k0.c(context, R.attr.colorControlActivated), mode2);
            } else if (i10 == R.drawable.abc_ratingbar_material || i10 == R.drawable.abc_ratingbar_indicator_material || i10 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                int b10 = k0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = h.f1002b;
                aVar.e(findDrawableByLayerId2, b10, mode3);
                aVar.e(layerDrawable2.findDrawableByLayerId(16908303), k0.c(context, R.attr.colorControlActivated), mode3);
                aVar.e(layerDrawable2.findDrawableByLayerId(16908301), k0.c(context, R.attr.colorControlActivated), mode3);
            } else {
                z11 = false;
            }
            if (z11) {
                return drawable;
            }
        }
        if (m(context, i10, drawable) || !z10) {
            return drawable;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m(android.content.Context r11, int r12, android.graphics.drawable.Drawable r13) {
        /*
            r10 = this;
            r7 = r10
            androidx.appcompat.widget.f0$f r0 = r7.f996g
            r9 = 5
            r1 = 1
            r9 = 0
            r2 = r9
            if (r0 == 0) goto L8f
            r9 = 6
            androidx.appcompat.widget.h$a r0 = (androidx.appcompat.widget.h.a) r0
            r9 = 2
            java.util.Objects.requireNonNull(r0)
            android.graphics.PorterDuff$Mode r3 = androidx.appcompat.widget.h.f1002b
            int[] r4 = r0.f1005a
            boolean r9 = r0.a(r4, r12)
            r4 = r9
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            r9 = 2
            if (r4 == 0) goto L24
            r5 = 2130968857(0x7f040119, float:1.754638E38)
            goto L59
        L24:
            r9 = 5
            int[] r4 = r0.f1007c
            r9 = 7
            boolean r9 = r0.a(r4, r12)
            r4 = r9
            if (r4 == 0) goto L34
            r9 = 4
            r5 = 2130968855(0x7f040117, float:1.7546375E38)
            goto L59
        L34:
            r9 = 6
            int[] r4 = r0.d
            r9 = 4
            boolean r0 = r0.a(r4, r12)
            if (r0 == 0) goto L41
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L59
        L41:
            r0 = 2131230767(0x7f08002f, float:1.8077596E38)
            if (r12 != r0) goto L53
            r12 = 16842800(0x1010030, float:2.3693693E-38)
            r9 = 2
            r0 = 1109603123(0x42233333, float:40.8)
            int r9 = java.lang.Math.round(r0)
            r0 = r9
            goto L5c
        L53:
            r0 = 2131230749(0x7f08001d, float:1.807756E38)
            r9 = 6
            if (r12 != r0) goto L5f
        L59:
            r12 = r5
            r9 = -1
            r0 = r9
        L5c:
            r9 = 1
            r4 = r9
            goto L65
        L5f:
            r12 = 0
            r9 = 3
            r9 = -1
            r0 = r9
            r9 = 0
            r4 = r9
        L65:
            if (r4 == 0) goto L8a
            r9 = 1
            boolean r9 = androidx.appcompat.widget.v.a(r13)
            r4 = r9
            if (r4 == 0) goto L74
            android.graphics.drawable.Drawable r9 = r13.mutate()
            r13 = r9
        L74:
            int r11 = androidx.appcompat.widget.k0.c(r11, r12)
            android.graphics.PorterDuffColorFilter r11 = androidx.appcompat.widget.h.c(r11, r3)
            r13.setColorFilter(r11)
            r9 = 1
            if (r0 == r6) goto L87
            r9 = 7
            r13.setAlpha(r0)
            r9 = 7
        L87:
            r9 = 2
            r11 = 1
            goto L8c
        L8a:
            r11 = 0
            r9 = 6
        L8c:
            if (r11 == 0) goto L8f
            goto L91
        L8f:
            r9 = 0
            r1 = r9
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f0.m(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
