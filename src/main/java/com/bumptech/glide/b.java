package com.bumptech.glide;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.c;
import com.bumptech.glide.e;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import e.p;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.IntCompanionObject;
import l5.i;
import l5.j;
import m5.a;
import n5.a;
import n5.b;
import n5.c;
import n5.d;
import n5.e;
import n5.j;
import n5.r;
import n5.s;
import n5.t;
import n5.u;
import n5.v;
import o5.a;
import o5.b;
import o5.c;
import o5.d;
import o5.e;
import q5.o;
import q5.q;
import q5.s;
import r5.a;
import s5.a;
import w5.l;

/* loaded from: classes.dex */
public class b implements ComponentCallbacks2 {
    public static volatile b y;

    /* renamed from: z  reason: collision with root package name */
    public static volatile boolean f5618z;

    /* renamed from: c  reason: collision with root package name */
    public final k5.c f5619c;

    /* renamed from: f  reason: collision with root package name */
    public final i f5620f;

    /* renamed from: j  reason: collision with root package name */
    public final d f5621j;

    /* renamed from: m  reason: collision with root package name */
    public final Registry f5622m;
    public final k5.b n;

    /* renamed from: t  reason: collision with root package name */
    public final l f5623t;

    /* renamed from: u  reason: collision with root package name */
    public final w5.c f5624u;

    /* renamed from: w  reason: collision with root package name */
    public final List<g> f5625w = new ArrayList();

    /* loaded from: classes.dex */
    public interface a {
    }

    public b(Context context, com.bumptech.glide.load.engine.f fVar, i iVar, k5.c cVar, k5.b bVar, l lVar, w5.c cVar2, int i10, a aVar, Map<Class<?>, h<?, ?>> map, List<z5.e<Object>> list, e eVar) {
        h5.e fVar2;
        h5.e cVar3;
        Object obj;
        Object obj2;
        int i11;
        this.f5619c = cVar;
        this.n = bVar;
        this.f5620f = iVar;
        this.f5623t = lVar;
        this.f5624u = cVar2;
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.f5622m = registry;
        DefaultImageHeaderParser defaultImageHeaderParser = new DefaultImageHeaderParser();
        o3.d dVar = registry.f5614g;
        synchronized (dVar) {
            ((List) dVar.f13543c).add(defaultImageHeaderParser);
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 27) {
            q5.l lVar2 = new q5.l();
            o3.d dVar2 = registry.f5614g;
            synchronized (dVar2) {
                ((List) dVar2.f13543c).add(lVar2);
            }
        }
        List<ImageHeaderParser> e10 = registry.e();
        u5.a aVar2 = new u5.a(context, e10, cVar, bVar);
        VideoDecoder videoDecoder = new VideoDecoder(cVar, new VideoDecoder.g());
        com.bumptech.glide.load.resource.bitmap.a aVar3 = new com.bumptech.glide.load.resource.bitmap.a(registry.e(), resources.getDisplayMetrics(), cVar, bVar);
        if (i12 < 28 || !eVar.f5650a.containsKey(c.C0070c.class)) {
            fVar2 = new q5.f(aVar3);
            cVar3 = new com.bumptech.glide.load.resource.bitmap.c(aVar3, bVar);
        } else {
            cVar3 = new o();
            fVar2 = new q5.g();
        }
        if (i12 >= 28) {
            i11 = i12;
            if (eVar.f5650a.containsKey(c.b.class)) {
                obj2 = Integer.class;
                obj = g5.a.class;
                registry.d("Animation", InputStream.class, Drawable.class, new a.c(new s5.a(e10, bVar)));
                registry.d("Animation", ByteBuffer.class, Drawable.class, new a.b(new s5.a(e10, bVar)));
            } else {
                obj = g5.a.class;
                obj2 = Integer.class;
            }
        } else {
            obj = g5.a.class;
            obj2 = Integer.class;
            i11 = i12;
        }
        s5.e eVar2 = new s5.e(context);
        r.c cVar4 = new r.c(resources);
        r.d dVar3 = new r.d(resources);
        r.b bVar2 = new r.b(resources);
        r.a aVar4 = new r.a(resources);
        q5.b bVar3 = new q5.b(bVar);
        v5.a aVar5 = new v5.a();
        r3.c cVar5 = new r3.c();
        ContentResolver contentResolver = context.getContentResolver();
        registry.a(ByteBuffer.class, new a0.b());
        registry.a(InputStream.class, new p(bVar));
        registry.d("Bitmap", ByteBuffer.class, Bitmap.class, fVar2);
        registry.d("Bitmap", InputStream.class, Bitmap.class, cVar3);
        registry.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new q(aVar3));
        registry.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, videoDecoder);
        registry.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new VideoDecoder(cVar, new VideoDecoder.c(null)));
        t.a<?> aVar6 = t.a.f13369a;
        registry.c(Bitmap.class, Bitmap.class, aVar6);
        registry.d("Bitmap", Bitmap.class, Bitmap.class, new s());
        registry.b(Bitmap.class, bVar3);
        registry.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new q5.a(resources, fVar2));
        registry.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new q5.a(resources, cVar3));
        registry.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new q5.a(resources, videoDecoder));
        registry.b(BitmapDrawable.class, new g2.h(cVar, bVar3, 2));
        registry.d("Animation", InputStream.class, u5.c.class, new u5.i(e10, aVar2, bVar));
        registry.d("Animation", ByteBuffer.class, u5.c.class, aVar2);
        registry.b(u5.c.class, new r3.c());
        Object obj3 = obj;
        registry.c(obj3, obj3, aVar6);
        registry.d("Bitmap", obj3, Bitmap.class, new u5.g(cVar));
        registry.d("legacy_append", Uri.class, Drawable.class, eVar2);
        registry.d("legacy_append", Uri.class, Bitmap.class, new q5.a(eVar2, cVar));
        registry.h(new a.C0254a());
        registry.c(File.class, ByteBuffer.class, new c.b());
        registry.c(File.class, InputStream.class, new e.C0223e());
        registry.d("legacy_append", File.class, File.class, new t5.a());
        registry.c(File.class, ParcelFileDescriptor.class, new e.b());
        registry.c(File.class, File.class, aVar6);
        registry.h(new k.a(bVar));
        registry.h(new ParcelFileDescriptorRewinder.a());
        Class cls = Integer.TYPE;
        registry.c(cls, InputStream.class, cVar4);
        registry.c(cls, ParcelFileDescriptor.class, bVar2);
        Object obj4 = obj2;
        registry.c(obj4, InputStream.class, cVar4);
        registry.c(obj4, ParcelFileDescriptor.class, bVar2);
        registry.c(obj4, Uri.class, dVar3);
        registry.c(cls, AssetFileDescriptor.class, aVar4);
        registry.c(obj4, AssetFileDescriptor.class, aVar4);
        registry.c(cls, Uri.class, dVar3);
        registry.c(String.class, InputStream.class, new d.c());
        registry.c(Uri.class, InputStream.class, new d.c());
        registry.c(String.class, InputStream.class, new s.c());
        registry.c(String.class, ParcelFileDescriptor.class, new s.b());
        registry.c(String.class, AssetFileDescriptor.class, new s.a());
        registry.c(Uri.class, InputStream.class, new a.c(context.getAssets()));
        registry.c(Uri.class, AssetFileDescriptor.class, new a.b(context.getAssets()));
        registry.c(Uri.class, InputStream.class, new b.a(context));
        registry.c(Uri.class, InputStream.class, new c.a(context));
        int i13 = i11;
        if (i13 >= 29) {
            registry.c(Uri.class, InputStream.class, new d.c(context));
            registry.c(Uri.class, ParcelFileDescriptor.class, new d.b(context));
        }
        registry.c(Uri.class, InputStream.class, new u.d(contentResolver));
        registry.c(Uri.class, ParcelFileDescriptor.class, new u.b(contentResolver));
        registry.c(Uri.class, AssetFileDescriptor.class, new u.a(contentResolver));
        registry.c(Uri.class, InputStream.class, new v.a());
        registry.c(URL.class, InputStream.class, new e.a());
        registry.c(Uri.class, File.class, new j.a(context));
        registry.c(n5.f.class, InputStream.class, new a.C0236a());
        registry.c(byte[].class, ByteBuffer.class, new b.a());
        registry.c(byte[].class, InputStream.class, new b.d());
        registry.c(Uri.class, Uri.class, aVar6);
        registry.c(Drawable.class, Drawable.class, aVar6);
        registry.d("legacy_append", Drawable.class, Drawable.class, new s5.f());
        registry.i(Bitmap.class, BitmapDrawable.class, new o3.d(resources));
        registry.i(Bitmap.class, byte[].class, aVar5);
        registry.i(Drawable.class, byte[].class, new a2.c(cVar, aVar5, cVar5));
        registry.i(u5.c.class, byte[].class, cVar5);
        if (i13 >= 23) {
            VideoDecoder videoDecoder2 = new VideoDecoder(cVar, new VideoDecoder.d());
            registry.d("legacy_append", ByteBuffer.class, Bitmap.class, videoDecoder2);
            registry.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new q5.a(resources, videoDecoder2));
        }
        this.f5621j = new d(context, bVar, registry, new cb.e(), aVar, map, list, fVar, eVar, i10);
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f5618z) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f5618z = true;
        c cVar = new c();
        Context applicationContext = context.getApplicationContext();
        Collections.emptyList();
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(x5.e.a(str));
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Loaded Glide module: " + str);
                        }
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
            if (generatedAppGlideModule != null && !generatedAppGlideModule.c().isEmpty()) {
                Set<Class<?>> c10 = generatedAppGlideModule.c();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    x5.c cVar2 = (x5.c) it.next();
                    if (c10.contains(cVar2.getClass())) {
                        if (Log.isLoggable("Glide", 3)) {
                            Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + cVar2);
                        }
                        it.remove();
                    }
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    StringBuilder m10 = a1.a.m("Discovered GlideModule from manifest: ");
                    m10.append(((x5.c) it2.next()).getClass());
                    Log.d("Glide", m10.toString());
                }
            }
            cVar.n = null;
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((x5.c) it3.next()).a(applicationContext, cVar);
            }
            if (cVar.f5631g == null) {
                a.b bVar = new a.b(null);
                int a10 = m5.a.a();
                if (TextUtils.isEmpty("source")) {
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
                }
                cVar.f5631g = new m5.a(new ThreadPoolExecutor(a10, a10, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.c(bVar, "source", a.d.f12910a, false)));
            }
            if (cVar.f5632h == null) {
                int i10 = m5.a.f12902j;
                a.b bVar2 = new a.b(null);
                if (TextUtils.isEmpty("disk-cache")) {
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
                }
                cVar.f5632h = new m5.a(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.c(bVar2, "disk-cache", a.d.f12910a, true)));
            }
            if (cVar.f5638o == null) {
                int i11 = m5.a.a() >= 4 ? 2 : 1;
                a.b bVar3 = new a.b(null);
                if (TextUtils.isEmpty("animation")) {
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
                }
                cVar.f5638o = new m5.a(new ThreadPoolExecutor(i11, i11, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.c(bVar3, "animation", a.d.f12910a, true)));
            }
            if (cVar.f5634j == null) {
                cVar.f5634j = new l5.j(new j.a(applicationContext));
            }
            if (cVar.f5635k == null) {
                cVar.f5635k = new w5.e();
            }
            if (cVar.d == null) {
                int i12 = cVar.f5634j.f12247a;
                if (i12 > 0) {
                    cVar.d = new k5.i(i12);
                } else {
                    cVar.d = new k5.d();
                }
            }
            if (cVar.f5629e == null) {
                cVar.f5629e = new k5.h(cVar.f5634j.d);
            }
            if (cVar.f5630f == null) {
                cVar.f5630f = new l5.h(cVar.f5634j.f12248b);
            }
            if (cVar.f5633i == null) {
                cVar.f5633i = new l5.g(applicationContext);
            }
            if (cVar.f5628c == null) {
                cVar.f5628c = new com.bumptech.glide.load.engine.f(cVar.f5630f, cVar.f5633i, cVar.f5632h, cVar.f5631g, new m5.a(new ThreadPoolExecutor(0, (int) IntCompanionObject.MAX_VALUE, m5.a.f12901f, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a.c(new a.b(null), "source-unlimited", a.d.f12910a, false))), cVar.f5638o, false);
            }
            List<z5.e<Object>> list = cVar.f5639p;
            if (list == null) {
                cVar.f5639p = Collections.emptyList();
            } else {
                cVar.f5639p = Collections.unmodifiableList(list);
            }
            e.a aVar = cVar.f5627b;
            Objects.requireNonNull(aVar);
            e eVar = new e(aVar);
            b bVar4 = new b(applicationContext, cVar.f5628c, cVar.f5630f, cVar.d, cVar.f5629e, new l(cVar.n, eVar), cVar.f5635k, cVar.f5636l, cVar.f5637m, cVar.f5626a, cVar.f5639p, eVar);
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                x5.c cVar3 = (x5.c) it4.next();
                try {
                    cVar3.b(applicationContext, bVar4, bVar4.f5622m);
                } catch (AbstractMethodError e10) {
                    StringBuilder m11 = a1.a.m("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                    m11.append(cVar3.getClass().getName());
                    throw new IllegalStateException(m11.toString(), e10);
                }
            }
            applicationContext.registerComponentCallbacks(bVar4);
            y = bVar4;
            f5618z = false;
        } catch (PackageManager.NameNotFoundException e11) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e11);
        }
    }

    public static b b(Context context) {
        if (y == null) {
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (IllegalAccessException e10) {
                d(e10);
                throw null;
            } catch (InstantiationException e11) {
                d(e11);
                throw null;
            } catch (NoSuchMethodException e12) {
                d(e12);
                throw null;
            } catch (InvocationTargetException e13) {
                d(e13);
                throw null;
            }
            synchronized (b.class) {
                if (y == null) {
                    a(context, generatedAppGlideModule);
                }
            }
        }
        return y;
    }

    public static l c(Context context) {
        Objects.requireNonNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).f5623t;
    }

    public static void d(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static g e(View view) {
        l c10 = c(view.getContext());
        Objects.requireNonNull(c10);
        if (d6.l.h()) {
            return c10.f(view.getContext().getApplicationContext());
        }
        Objects.requireNonNull(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity a10 = l.a(view.getContext());
        if (a10 == null) {
            return c10.f(view.getContext().getApplicationContext());
        }
        if (a10 instanceof androidx.fragment.app.o) {
            androidx.fragment.app.o oVar = (androidx.fragment.app.o) a10;
            c10.f16412t.clear();
            l.c(oVar.u().M(), c10.f16412t);
            View findViewById = oVar.findViewById(16908290);
            Fragment fragment = null;
            while (!view.equals(findViewById) && (fragment = c10.f16412t.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            c10.f16412t.clear();
            return fragment != null ? c10.g(fragment) : c10.h(oVar);
        }
        c10.f16413u.clear();
        c10.b(a10.getFragmentManager(), c10.f16413u);
        View findViewById2 = a10.findViewById(16908290);
        android.app.Fragment fragment2 = null;
        while (!view.equals(findViewById2)) {
            fragment2 = c10.f16413u.getOrDefault(view, null);
            if (fragment2 != null) {
                break;
            } else if (!(view.getParent() instanceof View)) {
                break;
            } else {
                view = (View) view.getParent();
            }
        }
        c10.f16413u.clear();
        if (fragment2 == null) {
            return c10.e(a10);
        }
        if (fragment2.getActivity() != null) {
            if (d6.l.h()) {
                return c10.f(fragment2.getActivity().getApplicationContext());
            }
            if (fragment2.getActivity() != null) {
                c10.y.b(fragment2.getActivity());
            }
            return c10.d(fragment2.getActivity(), fragment2.getChildFragmentManager(), fragment2, fragment2.isVisible());
        }
        throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
    }

    public static g f(androidx.fragment.app.o oVar) {
        Objects.requireNonNull(oVar, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(oVar).f5623t.h(oVar);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        d6.l.a();
        ((d6.i) this.f5620f).e(0L);
        this.f5619c.b();
        this.n.b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        long j10;
        d6.l.a();
        synchronized (this.f5625w) {
            for (g gVar : this.f5625w) {
                Objects.requireNonNull(gVar);
            }
        }
        l5.h hVar = (l5.h) this.f5620f;
        Objects.requireNonNull(hVar);
        if (i10 >= 40) {
            hVar.e(0L);
        } else if (i10 >= 20 || i10 == 15) {
            synchronized (hVar) {
                j10 = hVar.f8795b;
            }
            hVar.e(j10 / 2);
        }
        this.f5619c.a(i10);
        this.n.a(i10);
    }
}
