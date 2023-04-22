package dagger.android;

import a0.b;
import dagger.android.a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class DispatchingAndroidInjector<T> implements a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ie.a<a.InterfaceC0123a<?>>> f8885a;

    /* loaded from: classes.dex */
    public static final class InvalidInjectorBindingException extends RuntimeException {
        public InvalidInjectorBindingException(String str, ClassCastException classCastException) {
            super(str, classCastException);
        }
    }

    public DispatchingAndroidInjector(Map<Class<?>, ie.a<a.InterfaceC0123a<?>>> map, Map<String, ie.a<a.InterfaceC0123a<?>>> map2) {
        if (!map.isEmpty()) {
            LinkedHashMap R = b.R(map2.size() + map.size());
            R.putAll(map2);
            for (Map.Entry<Class<?>, ie.a<a.InterfaceC0123a<?>>> entry : map.entrySet()) {
                R.put(entry.getKey().getName(), entry.getValue());
            }
            map2 = Collections.unmodifiableMap(R);
        }
        this.f8885a = map2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // dagger.android.a
    public void a(T r13) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dagger.android.DispatchingAndroidInjector.a(java.lang.Object):void");
    }
}
