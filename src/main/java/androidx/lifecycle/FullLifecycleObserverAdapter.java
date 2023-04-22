package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements i {

    /* renamed from: a  reason: collision with root package name */
    public final e f2323a;

    /* renamed from: b  reason: collision with root package name */
    public final i f2324b;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2325a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            f2325a = iArr;
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2325a[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2325a[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2325a[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2325a[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2325a[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2325a[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(e eVar, i iVar) {
        this.f2323a = eVar;
        this.f2324b = iVar;
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
    public void c(androidx.lifecycle.k r7, androidx.lifecycle.Lifecycle.Event r8) {
        /*
            r6 = this;
            int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.a.f2325a
            java.lang.String r4 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            int r1 = r8.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L41;
                case 2: goto L39;
                case 3: goto L30;
                case 4: goto L29;
                case 5: goto L21;
                case 6: goto L1b;
                case 7: goto Lf;
                default: goto Ld;
            }
        Ld:
            r4 = 7
            goto L49
        Lf:
            r4 = 6
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r4 = 1
            java.lang.String r8 = "ON_ANY must not been send by anybody"
            r3 = 2
            r7.<init>(r8)
            throw r7
            r4 = 1
        L1b:
            androidx.lifecycle.e r0 = r6.f2323a
            r0.f(r7)
            goto L49
        L21:
            androidx.lifecycle.e r0 = r6.f2323a
            r5 = 5
            r0.e(r7)
            r3 = 7
            goto L49
        L29:
            androidx.lifecycle.e r0 = r6.f2323a
            r3 = 1
            r0.d(r7)
            goto L49
        L30:
            r5 = 5
            androidx.lifecycle.e r0 = r6.f2323a
            r5 = 5
            r0.a(r7)
            r5 = 6
            goto L49
        L39:
            r3 = 4
            androidx.lifecycle.e r0 = r6.f2323a
            r3 = 6
            r0.g(r7)
            goto L49
        L41:
            r4 = 3
            androidx.lifecycle.e r0 = r6.f2323a
            r4 = 7
            r0.b(r7)
            r5 = 1
        L49:
            androidx.lifecycle.i r0 = r6.f2324b
            if (r0 == 0) goto L51
            r0.c(r7, r8)
            r3 = 6
        L51:
            r4 = 7
            return
            r4 = 1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FullLifecycleObserverAdapter.c(androidx.lifecycle.k, androidx.lifecycle.Lifecycle$Event):void");
    }
}
