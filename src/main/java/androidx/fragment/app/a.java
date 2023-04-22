package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i0;
import androidx.fragment.app.y;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a extends i0 implements y.m {

    /* renamed from: q  reason: collision with root package name */
    public final y f2072q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2073r;

    /* renamed from: s  reason: collision with root package name */
    public int f2074s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(androidx.fragment.app.y r3) {
        /*
            r2 = this;
            androidx.fragment.app.u r0 = r3.L()
            androidx.fragment.app.v<?> r1 = r3.f2297q
            if (r1 == 0) goto Lf
            android.content.Context r1 = r1.f2271f
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L10
        Lf:
            r1 = 0
        L10:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f2074s = r0
            r2.f2072q = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.<init>(androidx.fragment.app.y):void");
    }

    @Override // androidx.fragment.app.y.m
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (y.P(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f2156g) {
            y yVar = this.f2072q;
            if (yVar.d == null) {
                yVar.d = new ArrayList<>();
            }
            yVar.d.add(this);
        }
        return true;
    }

    @Override // androidx.fragment.app.i0
    public int d() {
        return m(false);
    }

    @Override // androidx.fragment.app.i0
    public void e() {
        if (this.f2156g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f2157h = false;
        this.f2072q.D(this, true);
    }

    @Override // androidx.fragment.app.i0
    public i0 f(Fragment fragment) {
        y yVar = fragment.I;
        if (yVar != null && yVar != this.f2072q) {
            StringBuilder m10 = a1.a.m("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
            m10.append(fragment.toString());
            m10.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(m10.toString());
        }
        b(new i0.a(6, fragment));
        return this;
    }

    @Override // androidx.fragment.app.i0
    public void g(int i10, Fragment fragment, String str, int i11) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder m10 = a1.a.m("Fragment ");
            m10.append(cls.getCanonicalName());
            m10.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(m10.toString());
        }
        if (str != null) {
            String str2 = fragment.O;
            if (str2 != null && !str.equals(str2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(": was ");
                throw new IllegalStateException(android.support.v4.media.b.n(sb2, fragment.O, " now ", str));
            }
            fragment.O = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i12 = fragment.M;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.M + " now " + i10);
            }
            fragment.M = i10;
            fragment.N = i10;
        }
        b(new i0.a(i11, fragment));
        fragment.I = this.f2072q;
    }

    @Override // androidx.fragment.app.i0
    public i0 h(Fragment fragment) {
        y yVar = fragment.I;
        if (yVar == null || yVar == this.f2072q) {
            b(new i0.a(3, fragment));
            return this;
        }
        StringBuilder m10 = a1.a.m("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        m10.append(fragment.toString());
        m10.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(m10.toString());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // androidx.fragment.app.i0
    public androidx.fragment.app.i0 j(androidx.fragment.app.Fragment r8, androidx.lifecycle.Lifecycle.State r9) {
        /*
            r7 = this;
            r3 = r7
            androidx.fragment.app.y r0 = r8.I
            androidx.fragment.app.y r1 = r3.f2072q
            r6 = 4
            if (r0 != r1) goto L68
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            r5 = 4
            java.lang.String r5 = "Cannot set maximum Lifecycle to "
            r1 = r5
            if (r9 != r0) goto L34
            int r0 = r8.f2004c
            r6 = 3
            r2 = -1
            r5 = 3
            if (r0 > r2) goto L18
            goto L34
        L18:
            r5 = 6
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = " after the Fragment has been created"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.<init>(r9)
            r6 = 7
            throw r8
        L34:
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            r5 = 4
            if (r9 == r0) goto L48
            androidx.fragment.app.i0$a r0 = new androidx.fragment.app.i0$a
            r6 = 2
            r1 = 10
            r5 = 6
            r0.<init>(r1, r8, r9)
            r6 = 7
            r3.b(r0)
            r5 = 6
            return r3
        L48:
            r5 = 3
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r6 = 4
            r0.<init>()
            r0.append(r1)
            r0.append(r9)
            java.lang.String r6 = ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction."
            r9 = r6
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.<init>(r9)
            java.lang.String r6 = "Ⓢⓜⓞⓑ⓸⓺"
            throw r8
            r6 = 4
        L68:
            r5 = 4
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Cannot setMaxLifecycle for Fragment not attached to FragmentManager "
            java.lang.StringBuilder r6 = a1.a.m(r9)
            r9 = r6
            androidx.fragment.app.y r0 = r3.f2072q
            r6 = 7
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            r5 = 5
            throw r8
            r5 = 4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.j(androidx.fragment.app.Fragment, androidx.lifecycle.Lifecycle$State):androidx.fragment.app.i0");
    }

    public void k(int i10) {
        if (this.f2156g) {
            if (y.P(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f2151a.size();
            for (int i11 = 0; i11 < size; i11++) {
                i0.a aVar = this.f2151a.get(i11);
                Fragment fragment = aVar.f2166b;
                if (fragment != null) {
                    fragment.H += i10;
                    if (y.P(2)) {
                        StringBuilder m10 = a1.a.m("Bump nesting of ");
                        m10.append(aVar.f2166b);
                        m10.append(" to ");
                        m10.append(aVar.f2166b.H);
                        Log.v("FragmentManager", m10.toString());
                    }
                }
            }
        }
    }

    public int l() {
        return m(true);
    }

    public int m(boolean z10) {
        if (this.f2073r) {
            throw new IllegalStateException("commit already called");
        }
        if (y.P(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new v0("FragmentManager"));
            n("  ", printWriter, true);
            printWriter.close();
        }
        this.f2073r = true;
        if (this.f2156g) {
            this.f2074s = this.f2072q.f2290i.getAndIncrement();
        } else {
            this.f2074s = -1;
        }
        this.f2072q.A(this, z10);
        return this.f2074s;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n(java.lang.String r9, java.io.PrintWriter r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.n(java.lang.String, java.io.PrintWriter, boolean):void");
    }

    public void o() {
        int size = this.f2151a.size();
        for (int i10 = 0; i10 < size; i10++) {
            i0.a aVar = this.f2151a.get(i10);
            Fragment fragment = aVar.f2166b;
            if (fragment != null) {
                fragment.F0(false);
                int i11 = this.f2155f;
                if (fragment.Z != null || i11 != 0) {
                    fragment.m();
                    fragment.Z.f2030h = i11;
                }
                ArrayList<String> arrayList = this.n;
                ArrayList<String> arrayList2 = this.f2163o;
                fragment.m();
                Fragment.b bVar = fragment.Z;
                bVar.f2031i = arrayList;
                bVar.f2032j = arrayList2;
            }
            switch (aVar.f2165a) {
                case 1:
                    fragment.y0(aVar.f2167c, aVar.d, aVar.f2168e, aVar.f2169f);
                    this.f2072q.f0(fragment, false);
                    this.f2072q.a(fragment);
                    break;
                case 2:
                default:
                    StringBuilder m10 = a1.a.m("Unknown cmd: ");
                    m10.append(aVar.f2165a);
                    throw new IllegalArgumentException(m10.toString());
                case 3:
                    fragment.y0(aVar.f2167c, aVar.d, aVar.f2168e, aVar.f2169f);
                    this.f2072q.a0(fragment);
                    break;
                case 4:
                    fragment.y0(aVar.f2167c, aVar.d, aVar.f2168e, aVar.f2169f);
                    this.f2072q.O(fragment);
                    break;
                case 5:
                    fragment.y0(aVar.f2167c, aVar.d, aVar.f2168e, aVar.f2169f);
                    this.f2072q.f0(fragment, false);
                    this.f2072q.j0(fragment);
                    break;
                case 6:
                    fragment.y0(aVar.f2167c, aVar.d, aVar.f2168e, aVar.f2169f);
                    this.f2072q.j(fragment);
                    break;
                case 7:
                    fragment.y0(aVar.f2167c, aVar.d, aVar.f2168e, aVar.f2169f);
                    this.f2072q.f0(fragment, false);
                    this.f2072q.c(fragment);
                    break;
                case 8:
                    this.f2072q.h0(fragment);
                    break;
                case 9:
                    this.f2072q.h0(null);
                    break;
                case 10:
                    this.f2072q.g0(fragment, aVar.f2171h);
                    break;
            }
        }
    }

    public void p(boolean z10) {
        for (int size = this.f2151a.size() - 1; size >= 0; size--) {
            i0.a aVar = this.f2151a.get(size);
            Fragment fragment = aVar.f2166b;
            if (fragment != null) {
                fragment.F0(true);
                int i10 = this.f2155f;
                int i11 = i10 != 4097 ? i10 != 4099 ? i10 != 8194 ? 0 : 4097 : 4099 : 8194;
                if (fragment.Z != null || i11 != 0) {
                    fragment.m();
                    fragment.Z.f2030h = i11;
                }
                ArrayList<String> arrayList = this.f2163o;
                ArrayList<String> arrayList2 = this.n;
                fragment.m();
                Fragment.b bVar = fragment.Z;
                bVar.f2031i = arrayList;
                bVar.f2032j = arrayList2;
            }
            switch (aVar.f2165a) {
                case 1:
                    fragment.y0(aVar.f2167c, aVar.d, aVar.f2168e, aVar.f2169f);
                    this.f2072q.f0(fragment, true);
                    this.f2072q.a0(fragment);
                    break;
                case 2:
                    StringBuilder m10 = a1.a.m("Unknown cmd: ");
                    m10.append(aVar.f2165a);
                    throw new IllegalArgumentException(m10.toString());
                case 3:
                    fragment.y0(aVar.f2167c, aVar.d, aVar.f2168e, aVar.f2169f);
                    this.f2072q.a(fragment);
                    break;
                case 4:
                    fragment.y0(aVar.f2167c, aVar.d, aVar.f2168e, aVar.f2169f);
                    this.f2072q.j0(fragment);
                    break;
                case 5:
                    fragment.y0(aVar.f2167c, aVar.d, aVar.f2168e, aVar.f2169f);
                    this.f2072q.f0(fragment, true);
                    this.f2072q.O(fragment);
                    break;
                case 6:
                    fragment.y0(aVar.f2167c, aVar.d, aVar.f2168e, aVar.f2169f);
                    this.f2072q.c(fragment);
                    break;
                case 7:
                    fragment.y0(aVar.f2167c, aVar.d, aVar.f2168e, aVar.f2169f);
                    this.f2072q.f0(fragment, true);
                    this.f2072q.j(fragment);
                    break;
                case 8:
                    this.f2072q.h0(null);
                    break;
                case 9:
                    this.f2072q.h0(fragment);
                    break;
                case 10:
                    this.f2072q.g0(fragment, aVar.f2170g);
                    break;
                default:
                    StringBuilder m102 = a1.a.m("Unknown cmd: ");
                    m102.append(aVar.f2165a);
                    throw new IllegalArgumentException(m102.toString());
            }
        }
    }

    public boolean q(int i10) {
        int size = this.f2151a.size();
        for (int i11 = 0; i11 < size; i11++) {
            Fragment fragment = this.f2151a.get(i11).f2166b;
            int i12 = fragment != null ? fragment.N : 0;
            if (i12 != 0 && i12 == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean r(ArrayList<a> arrayList, int i10, int i11) {
        if (i11 == i10) {
            return false;
        }
        int size = this.f2151a.size();
        int i12 = -1;
        for (int i13 = 0; i13 < size; i13++) {
            Fragment fragment = this.f2151a.get(i13).f2166b;
            int i14 = fragment != null ? fragment.N : 0;
            if (i14 != 0 && i14 != i12) {
                for (int i15 = i10; i15 < i11; i15++) {
                    a aVar = arrayList.get(i15);
                    int size2 = aVar.f2151a.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        Fragment fragment2 = aVar.f2151a.get(i16).f2166b;
                        if ((fragment2 != null ? fragment2.N : 0) == i14) {
                            return true;
                        }
                    }
                }
                i12 = i14;
            }
        }
        return false;
    }

    public i0 s(Fragment fragment) {
        y yVar = fragment.I;
        if (yVar != null && yVar != this.f2072q) {
            StringBuilder m10 = a1.a.m("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
            m10.append(fragment.toString());
            m10.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(m10.toString());
        }
        b(new i0.a(8, fragment));
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2074s >= 0) {
            sb2.append(" #");
            sb2.append(this.f2074s);
        }
        if (this.f2158i != null) {
            sb2.append(" ");
            sb2.append(this.f2158i);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
