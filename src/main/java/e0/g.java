package e0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import d0.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes.dex */
public class g extends k {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?> f8980b;

    /* renamed from: c  reason: collision with root package name */
    public static final Constructor<?> f8981c;
    public static final Method d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f8982e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            method2 = null;
        }
        f8981c = constructor;
        f8980b = cls;
        d = method2;
        f8982e = method;
    }

    public static boolean f(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface g(Object obj) {
        try {
            Object newInstance = Array.newInstance(f8980b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f8982e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // e0.k
    public Typeface a(Context context, d.b bVar, Resources resources, int i10) {
        Object obj;
        d.c[] cVarArr;
        MappedByteBuffer mappedByteBuffer;
        try {
            obj = f8981c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (d.c cVar : bVar.f8596a) {
            int i11 = cVar.f8601f;
            File c10 = l.c(context);
            if (c10 != null) {
                try {
                    if (l.a(c10, resources, i11)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(c10);
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                            } finally {
                                break;
                            }
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        if (mappedByteBuffer != null || !f(obj, mappedByteBuffer, cVar.f8600e, cVar.f8598b, cVar.f8599c)) {
                            return null;
                        }
                    }
                } finally {
                    c10.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        return g(obj);
    }

    @Override // e0.k
    public Typeface b(Context context, CancellationSignal cancellationSignal, j0.l[] lVarArr, int i10) {
        Object obj;
        int i11;
        try {
            obj = f8981c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        p.g gVar = new p.g();
        int length = lVarArr.length;
        while (i11 < length) {
            j0.l lVar = lVarArr[i11];
            Uri uri = lVar.f11121a;
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(uri);
            if (byteBuffer == null) {
                byteBuffer = l.d(context, cancellationSignal, uri);
                gVar.put(uri, byteBuffer);
            }
            i11 = (byteBuffer != null && f(obj, byteBuffer, lVar.f11122b, lVar.f11123c, lVar.d)) ? i11 + 1 : 0;
            return null;
        }
        Typeface g10 = g(obj);
        if (g10 == null) {
            return null;
        }
        return Typeface.create(g10, i10);
    }
}
