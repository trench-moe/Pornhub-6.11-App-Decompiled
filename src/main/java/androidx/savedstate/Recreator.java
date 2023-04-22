package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.savedstate.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class Recreator implements i {

    /* renamed from: a  reason: collision with root package name */
    public final c f3126a;

    /* loaded from: classes.dex */
    public static final class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final Set<String> f3127a = new HashSet();

        public a(androidx.savedstate.a aVar) {
            aVar.b("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.a.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f3127a));
            return bundle;
        }
    }

    public Recreator(c cVar) {
        this.f3126a = cVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // androidx.lifecycle.i
    public void c(androidx.lifecycle.k r6, androidx.lifecycle.Lifecycle.Event r7) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.savedstate.Recreator.c(androidx.lifecycle.k, androidx.lifecycle.Lifecycle$Event):void");
    }
}
