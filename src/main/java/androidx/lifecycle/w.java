package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.z;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w extends z.c {

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f2405f = {Application.class, v.class};

    /* renamed from: g  reason: collision with root package name */
    public static final Class<?>[] f2406g = {v.class};

    /* renamed from: a  reason: collision with root package name */
    public final Application f2407a;

    /* renamed from: b  reason: collision with root package name */
    public final z.b f2408b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f2409c;
    public final Lifecycle d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.savedstate.a f2410e;

    @SuppressLint({"LambdaLast"})
    public w(Application application, androidx.savedstate.c cVar, Bundle bundle) {
        z.b bVar;
        this.f2410e = cVar.l();
        this.d = cVar.b();
        this.f2409c = bundle;
        this.f2407a = application;
        if (application != null) {
            Intrinsics.checkNotNullParameter(application, "application");
            if (z.a.f2419c == null) {
                z.a.f2419c = new z.a(application);
            }
            bVar = z.a.f2419c;
            Intrinsics.checkNotNull(bVar);
        } else {
            if (z.d.f2421a == null) {
                z.d.f2421a = new z.d();
            }
            bVar = z.d.f2421a;
            Intrinsics.checkNotNull(bVar);
        }
        this.f2408b = bVar;
    }

    public static <T> Constructor<T> d(Class<T> cls, Class<?>[] clsArr) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            if (Arrays.equals(clsArr, constructor2.getParameterTypes())) {
                return constructor2;
            }
        }
        return null;
    }

    @Override // androidx.lifecycle.z.c, androidx.lifecycle.z.b
    public <T extends x> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.z.e
    public void b(x xVar) {
        SavedStateHandleController.h(xVar, this.f2410e, this.d);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // androidx.lifecycle.z.c
    public <T extends androidx.lifecycle.x> T c(java.lang.String r14, java.lang.Class<T> r15) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.w.c(java.lang.String, java.lang.Class):androidx.lifecycle.x");
    }
}
