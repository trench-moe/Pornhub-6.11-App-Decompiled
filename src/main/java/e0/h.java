package e0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import d0.d;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class h extends f {

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f8983g;

    /* renamed from: h  reason: collision with root package name */
    public final Constructor<?> f8984h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f8985i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f8986j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f8987k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f8988l;

    /* renamed from: m  reason: collision with root package name */
    public final Method f8989m;

    public h() {
        Method method;
        Method method2;
        Constructor<?> constructor;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = n(cls2);
            method4 = o(cls2);
            method5 = cls2.getMethod("freeze", new Class[0]);
            method2 = cls2.getMethod("abortCreation", new Class[0]);
            method = p(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            StringBuilder m10 = a1.a.m("Unable to collect necessary methods for class ");
            m10.append(e10.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", m10.toString(), e10);
            method = null;
            method2 = null;
            constructor = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f8983g = cls;
        this.f8984h = constructor;
        this.f8985i = method3;
        this.f8986j = method4;
        this.f8987k = method5;
        this.f8988l = method2;
        this.f8989m = method;
    }

    private Object m() {
        try {
            return this.f8984h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // e0.f, e0.k
    public Typeface a(Context context, d.b bVar, Resources resources, int i10) {
        d.c[] cVarArr;
        if (l()) {
            Object m10 = m();
            if (m10 == null) {
                return null;
            }
            for (d.c cVar : bVar.f8596a) {
                if (!i(context, m10, cVar.f8597a, cVar.f8600e, cVar.f8598b, cVar.f8599c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.d))) {
                    h(m10);
                    return null;
                }
            }
            if (k(m10)) {
                return j(m10);
            }
            return null;
        }
        return super.a(context, bVar, resources, i10);
    }

    @Override // e0.f, e0.k
    public Typeface b(Context context, CancellationSignal cancellationSignal, j0.l[] lVarArr, int i10) {
        Typeface j10;
        boolean z10;
        if (lVarArr.length < 1) {
            return null;
        }
        if (!l()) {
            j0.l e10 = e(lVarArr, i10);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(e10.f11121a, "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(e10.f11123c).setItalic(e10.d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (j0.l lVar : lVarArr) {
            if (lVar.f11124e == 0) {
                Uri uri = lVar.f11121a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, l.d(context, cancellationSignal, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object m10 = m();
        if (m10 == null) {
            return null;
        }
        boolean z11 = false;
        for (j0.l lVar2 : lVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(lVar2.f11121a);
            if (byteBuffer != null) {
                try {
                    z10 = ((Boolean) this.f8986j.invoke(m10, byteBuffer, Integer.valueOf(lVar2.f11122b), null, Integer.valueOf(lVar2.f11123c), Integer.valueOf(lVar2.d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z10 = false;
                }
                if (!z10) {
                    h(m10);
                    return null;
                }
                z11 = true;
            }
        }
        if (!z11) {
            h(m10);
            return null;
        } else if (k(m10) && (j10 = j(m10)) != null) {
            return Typeface.create(j10, i10);
        } else {
            return null;
        }
    }

    @Override // e0.k
    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        if (l()) {
            Object m10 = m();
            if (m10 == null) {
                return null;
            }
            if (!i(context, m10, str, 0, -1, -1, null)) {
                h(m10);
                return null;
            } else if (k(m10)) {
                return j(m10);
            } else {
                return null;
            }
        }
        return super.d(context, resources, i10, str, i11);
    }

    public final void h(Object obj) {
        try {
            this.f8988l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean i(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f8985i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f8983g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f8989m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.f8987k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean l() {
        if (this.f8985i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f8985i != null;
    }

    public Method n(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method o(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method p(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
