package androidx.navigation.fragment;

import a0.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.l;
import androidx.fragment.app.y;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.navigation.c;
import androidx.navigation.m;
import androidx.navigation.v;
import java.util.HashSet;

@v.b("dialog")
/* loaded from: classes.dex */
public final class DialogFragmentNavigator extends v<a> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2649a;

    /* renamed from: b  reason: collision with root package name */
    public final y f2650b;

    /* renamed from: c  reason: collision with root package name */
    public int f2651c = 0;
    public final HashSet<String> d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    public i f2652e = new i(this) { // from class: androidx.navigation.fragment.DialogFragmentNavigator.1
        @Override // androidx.lifecycle.i
        public void c(k kVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_STOP) {
                l lVar = (l) kVar;
                if (lVar.N0().isShowing()) {
                    return;
                }
                NavHostFragment.K0(lVar).k();
            }
        }
    };

    /* loaded from: classes.dex */
    public static class a extends m implements c {
        public String y;

        public a(v<? extends a> vVar) {
            super(vVar);
        }

        @Override // androidx.navigation.m
        public void l(Context context, AttributeSet attributeSet) {
            super.l(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, b.f118c);
            String string = obtainAttributes.getString(0);
            if (string != null) {
                this.y = string;
            }
            obtainAttributes.recycle();
        }
    }

    public DialogFragmentNavigator(Context context, y yVar) {
        this.f2649a = context;
        this.f2650b = yVar;
    }

    @Override // androidx.navigation.v
    public a a() {
        return new a(this);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // androidx.navigation.v
    public androidx.navigation.m b(androidx.navigation.fragment.DialogFragmentNavigator.a r7, android.os.Bundle r8, androidx.navigation.s r9, androidx.navigation.v.a r10) {
        /*
            r6 = this;
            androidx.navigation.fragment.DialogFragmentNavigator$a r7 = (androidx.navigation.fragment.DialogFragmentNavigator.a) r7
            androidx.fragment.app.y r9 = r6.f2650b
            boolean r9 = r9.T()
            if (r9 == 0) goto L16
            java.lang.String r7 = "DialogFragmentNavigator"
            java.lang.String r2 = "Ignoring navigate() call: FragmentManager has already saved its state"
            r8 = r2
            android.util.Log.i(r7, r8)
            r2 = 0
            r7 = r2
            goto Lb2
        L16:
            r3 = 2
            java.lang.String r9 = r7.y
            r5 = 1
            java.lang.String r2 = "DialogFragment class was not set"
            r10 = r2
            if (r9 == 0) goto Lb3
            r5 = 7
            r0 = 0
            r3 = 4
            char r0 = r9.charAt(r0)
            r2 = 46
            r1 = r2
            if (r0 != r1) goto L42
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = r6.f2649a
            r5 = 7
            java.lang.String r1 = r1.getPackageName()
            r0.append(r1)
            r0.append(r9)
            java.lang.String r2 = r0.toString()
            r9 = r2
        L42:
            r5 = 5
            androidx.fragment.app.y r0 = r6.f2650b
            r4 = 4
            androidx.fragment.app.u r2 = r0.L()
            r0 = r2
            android.content.Context r1 = r6.f2649a
            r5 = 7
            java.lang.ClassLoader r2 = r1.getClassLoader()
            r1 = r2
            androidx.fragment.app.Fragment r9 = r0.a(r1, r9)
            java.lang.Class<androidx.fragment.app.l> r0 = androidx.fragment.app.l.class
            r4 = 5
            java.lang.Class r1 = r9.getClass()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L86
            r5 = 6
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r5 = 1
            java.lang.String r9 = "Dialog destination "
            java.lang.StringBuilder r2 = a1.a.m(r9)
            r9 = r2
            java.lang.String r7 = r7.y
            if (r7 == 0) goto L7e
            r4 = 4
            java.lang.String r10 = " is not an instance of DialogFragment"
            java.lang.String r7 = android.support.v4.media.b.m(r9, r7, r10)
            r8.<init>(r7)
            throw r8
        L7e:
            r3 = 3
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r10)
            throw r7
            r4 = 4
        L86:
            androidx.fragment.app.l r9 = (androidx.fragment.app.l) r9
            r4 = 3
            r9.A0(r8)
            androidx.lifecycle.l r8 = r9.f2009f0
            r4 = 3
            androidx.lifecycle.i r10 = r6.f2652e
            r3 = 2
            r8.a(r10)
            r5 = 3
            androidx.fragment.app.y r8 = r6.f2650b
            java.lang.String r2 = "androidx-nav-fragment:navigator:dialog:"
            r10 = r2
            java.lang.StringBuilder r2 = a1.a.m(r10)
            r10 = r2
            int r0 = r6.f2651c
            r3 = 3
            int r1 = r0 + 1
            r6.f2651c = r1
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.Q0(r8, r10)
            r4 = 3
        Lb2:
            return r7
        Lb3:
            r5 = 5
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r5 = 1
            r7.<init>(r10)
            r3 = 4
            throw r7
            r5 = 4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.DialogFragmentNavigator.b(androidx.navigation.m, android.os.Bundle, androidx.navigation.s, androidx.navigation.v$a):androidx.navigation.m");
    }

    @Override // androidx.navigation.v
    public void c(Bundle bundle) {
        this.f2651c = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
        for (int i10 = 0; i10 < this.f2651c; i10++) {
            y yVar = this.f2650b;
            l lVar = (l) yVar.I("androidx-nav-fragment:navigator:dialog:" + i10);
            if (lVar != null) {
                lVar.f2009f0.a(this.f2652e);
            } else {
                HashSet<String> hashSet = this.d;
                hashSet.add("androidx-nav-fragment:navigator:dialog:" + i10);
            }
        }
    }

    @Override // androidx.navigation.v
    public Bundle d() {
        if (this.f2651c == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.f2651c);
        return bundle;
    }

    @Override // androidx.navigation.v
    public boolean e() {
        if (this.f2651c == 0) {
            return false;
        }
        if (this.f2650b.T()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        y yVar = this.f2650b;
        StringBuilder m10 = a1.a.m("androidx-nav-fragment:navigator:dialog:");
        int i10 = this.f2651c - 1;
        this.f2651c = i10;
        m10.append(i10);
        Fragment I = yVar.I(m10.toString());
        if (I != null) {
            I.f2009f0.b(this.f2652e);
            ((l) I).K0();
        }
        return true;
    }
}
