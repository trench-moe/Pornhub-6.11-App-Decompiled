package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.y;
import androidx.navigation.m;
import androidx.navigation.v;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;

@v.b("fragment")
/* loaded from: classes.dex */
public class a extends v<C0036a> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2658a;

    /* renamed from: b  reason: collision with root package name */
    public final y f2659b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2660c;
    public ArrayDeque<Integer> d = new ArrayDeque<>();

    /* renamed from: androidx.navigation.fragment.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0036a extends m {
        public String y;

        public C0036a(v<? extends C0036a> vVar) {
            super(vVar);
        }

        @Override // androidx.navigation.m
        public void l(Context context, AttributeSet attributeSet) {
            super.l(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, a0.b.f119f);
            String string = obtainAttributes.getString(0);
            if (string != null) {
                this.y = string;
            }
            obtainAttributes.recycle();
        }

        @Override // androidx.navigation.m
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append(" class=");
            String str = this.y;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            return sb2.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements v.a {
    }

    public a(Context context, y yVar, int i10) {
        this.f2658a = context;
        this.f2659b = yVar;
        this.f2660c = i10;
    }

    @Override // androidx.navigation.v
    public C0036a a() {
        return new C0036a(this);
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
    public androidx.navigation.m b(androidx.navigation.fragment.a.C0036a r12, android.os.Bundle r13, androidx.navigation.s r14, androidx.navigation.v.a r15) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.a.b(androidx.navigation.m, android.os.Bundle, androidx.navigation.s, androidx.navigation.v$a):androidx.navigation.m");
    }

    @Override // androidx.navigation.v
    public void c(Bundle bundle) {
        int[] intArray = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds");
        if (intArray != null) {
            this.d.clear();
            for (int i10 : intArray) {
                this.d.add(Integer.valueOf(i10));
            }
        }
    }

    @Override // androidx.navigation.v
    public Bundle d() {
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.d.size()];
        Iterator<Integer> it = this.d.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
        return bundle;
    }

    @Override // androidx.navigation.v
    public boolean e() {
        if (this.d.isEmpty()) {
            return false;
        }
        if (this.f2659b.T()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        y yVar = this.f2659b;
        String f10 = f(this.d.size(), this.d.peekLast().intValue());
        Objects.requireNonNull(yVar);
        yVar.A(new y.n(f10, -1, 1), false);
        this.d.removeLast();
        return true;
    }

    public final String f(int i10, int i11) {
        return i10 + "-" + i11;
    }
}
