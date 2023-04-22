package androidx.lifecycle;

import android.app.Application;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class z {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f2417a;

    /* renamed from: b  reason: collision with root package name */
    public final b f2418b;

    /* loaded from: classes.dex */
    public static class a extends d {

        /* renamed from: c  reason: collision with root package name */
        public static a f2419c;

        /* renamed from: b  reason: collision with root package name */
        public final Application f2420b;

        public a(Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            this.f2420b = application;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        @Override // androidx.lifecycle.z.d, androidx.lifecycle.z.b
        public <T extends androidx.lifecycle.x> T a(java.lang.Class<T> r7) {
            /*
                r6 = this;
                java.lang.String r5 = "Cannot create an instance of "
                r0 = r5
                java.lang.String r5 = "modelClass"
                r1 = r5
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
                java.lang.String r5 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                java.lang.Class<androidx.lifecycle.a> r1 = androidx.lifecycle.a.class
                r5 = 2
                boolean r5 = r1.isAssignableFrom(r7)
                r1 = r5
                if (r1 == 0) goto L6c
                r1 = 1
                r5 = 6
                java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L3b java.lang.InstantiationException -> L48 java.lang.IllegalAccessException -> L54 java.lang.NoSuchMethodException -> L5f
                r5 = 6
                java.lang.Class<android.app.Application> r3 = android.app.Application.class
                r5 = 3
                r4 = 0
                r5 = 6
                r2[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L3b java.lang.InstantiationException -> L48 java.lang.IllegalAccessException -> L54 java.lang.NoSuchMethodException -> L5f
                r5 = 2
                java.lang.reflect.Constructor r2 = r7.getConstructor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L3b java.lang.InstantiationException -> L48 java.lang.IllegalAccessException -> L54 java.lang.NoSuchMethodException -> L5f
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L3b java.lang.InstantiationException -> L48 java.lang.IllegalAccessException -> L54 java.lang.NoSuchMethodException -> L5f
                android.app.Application r3 = r6.f2420b     // Catch: java.lang.reflect.InvocationTargetException -> L3b java.lang.InstantiationException -> L48 java.lang.IllegalAccessException -> L54 java.lang.NoSuchMethodException -> L5f
                r5 = 7
                r1[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L3b java.lang.InstantiationException -> L48 java.lang.IllegalAccessException -> L54 java.lang.NoSuchMethodException -> L5f
                r5 = 6
                java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L3b java.lang.InstantiationException -> L48 java.lang.IllegalAccessException -> L54 java.lang.NoSuchMethodException -> L5f
                androidx.lifecycle.x r1 = (androidx.lifecycle.x) r1     // Catch: java.lang.reflect.InvocationTargetException -> L3b java.lang.InstantiationException -> L48 java.lang.IllegalAccessException -> L54 java.lang.NoSuchMethodException -> L5f
                java.lang.String r7 = "{\n                try {\n…          }\n            }"
                r5 = 3
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r7)
                goto L70
            L3b:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                r5 = 1
                java.lang.String r7 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r7)
                r2.<init>(r7, r1)
                throw r2
                r5 = 1
            L48:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                r5 = 2
                java.lang.String r7 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r7)
                r2.<init>(r7, r1)
                throw r2
            L54:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.String r7 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r7)
                r2.<init>(r7, r1)
                throw r2
            L5f:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                r5 = 3
                java.lang.String r7 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r7)
                r2.<init>(r7, r1)
                throw r2
                r5 = 6
            L6c:
                androidx.lifecycle.x r1 = super.a(r7)
            L70:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.z.a.a(java.lang.Class):androidx.lifecycle.x");
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        <T extends x> T a(Class<T> cls);
    }

    /* loaded from: classes.dex */
    public static abstract class c extends e implements b {
        public <T extends x> T a(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementations of KeyedFactory");
        }

        public abstract <T extends x> T c(String str, Class<T> cls);
    }

    /* loaded from: classes.dex */
    public static class d implements b {

        /* renamed from: a  reason: collision with root package name */
        public static d f2421a;

        @Override // androidx.lifecycle.z.b
        public <T extends x> T a(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            try {
                T newInstance = modelClass.newInstance();
                Intrinsics.checkNotNullExpressionValue(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(Intrinsics.stringPlus("Cannot create an instance of ", modelClass), e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException(Intrinsics.stringPlus("Cannot create an instance of ", modelClass), e11);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public void b(x viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        }
    }

    public z(a0 store, b factory) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f2417a = store;
        this.f2418b = factory;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z(androidx.lifecycle.b0 r2, androidx.lifecycle.z.b r3) {
        /*
            r1 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.core.mh.ComponentActivity r2 = (androidx.core.mh.ComponentActivity) r2
            androidx.lifecycle.a0 r2 = r2.j()
            java.lang.String r0 = "owner.viewModelStore"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.z.<init>(androidx.lifecycle.b0, androidx.lifecycle.z$b):void");
    }

    public <T extends x> T a(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            String key = Intrinsics.stringPlus("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            T viewModel = (T) this.f2417a.f2357a.get(key);
            if (modelClass.isInstance(viewModel)) {
                b bVar = this.f2418b;
                e eVar = bVar instanceof e ? (e) bVar : null;
                if (eVar != null) {
                    Intrinsics.checkNotNullExpressionValue(viewModel, "viewModel");
                    eVar.b(viewModel);
                }
                Objects.requireNonNull(viewModel, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            } else {
                b bVar2 = this.f2418b;
                viewModel = (T) (bVar2 instanceof c ? ((c) bVar2).c(key, modelClass) : bVar2.a(modelClass));
                x put = this.f2417a.f2357a.put(key, viewModel);
                if (put != null) {
                    put.a();
                }
                Intrinsics.checkNotNullExpressionValue(viewModel, "viewModel");
            }
            return viewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
