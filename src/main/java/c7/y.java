package c7;

import com.google.android.exoplayer2.ParserException;

/* loaded from: classes.dex */
public final class y {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f3842a;

        public a(String str, String[] strArr, int i10) {
            this.f3842a = strArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f3843a;

        public b(boolean z10, int i10, int i11, int i12) {
            this.f3843a = z10;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f3844a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3845b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3846c;
        public final int d;

        /* renamed from: e  reason: collision with root package name */
        public final int f3847e;

        /* renamed from: f  reason: collision with root package name */
        public final int f3848f;

        /* renamed from: g  reason: collision with root package name */
        public final byte[] f3849g;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f3844a = i11;
            this.f3845b = i12;
            this.f3846c = i13;
            this.d = i14;
            this.f3847e = i16;
            this.f3848f = i17;
            this.f3849g = bArr;
        }
    }

    public static int a(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    public static a b(k8.t tVar, boolean z10, boolean z11) {
        if (z10) {
            c(3, tVar, false);
        }
        String p10 = tVar.p((int) tVar.j());
        long j10 = tVar.j();
        String[] strArr = new String[(int) j10];
        int length = p10.length() + 11 + 4;
        for (int i10 = 0; i10 < j10; i10++) {
            strArr[i10] = tVar.p((int) tVar.j());
            length = length + 4 + strArr[i10].length();
        }
        if (z11 && (tVar.s() & 1) == 0) {
            throw ParserException.a("framing bit expected to be set", null);
        }
        return new a(p10, strArr, length + 1);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static boolean c(int r8, k8.t r9, boolean r10) {
        /*
            int r4 = r9.a()
            r0 = r4
            r1 = 0
            r4 = 0
            r2 = r4
            r3 = 7
            if (r0 >= r3) goto L21
            r6 = 1
            if (r10 == 0) goto L10
            r5 = 1
            return r1
        L10:
            int r4 = r9.a()
            r8 = r4
            r4 = 29
            r9 = r4
            java.lang.String r4 = "too short header: "
            r10 = r4
            com.google.android.exoplayer2.ParserException r4 = a1.a.d(r9, r10, r8, r2)
            r8 = r4
            throw r8
        L21:
            r7 = 4
            int r4 = r9.s()
            r0 = r4
            if (r0 == r8) goto L52
            if (r10 == 0) goto L2c
            return r1
        L2c:
            java.lang.String r9 = "expected header type "
            java.lang.String r4 = java.lang.Integer.toHexString(r8)
            r8 = r4
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r4 = r8.length()
            r10 = r4
            if (r10 == 0) goto L45
            r7 = 6
            java.lang.String r4 = r9.concat(r8)
            r8 = r4
            goto L4c
        L45:
            r5 = 2
            java.lang.String r8 = new java.lang.String
            r7 = 1
            r8.<init>(r9)
        L4c:
            com.google.android.exoplayer2.ParserException r8 = com.google.android.exoplayer2.ParserException.a(r8, r2)
            throw r8
            r6 = 5
        L52:
            int r8 = r9.s()
            r0 = 118(0x76, float:1.65E-43)
            if (r8 != r0) goto L94
            r5 = 2
            int r4 = r9.s()
            r8 = r4
            r4 = 111(0x6f, float:1.56E-43)
            r0 = r4
            if (r8 != r0) goto L94
            r6 = 7
            int r4 = r9.s()
            r8 = r4
            r0 = 114(0x72, float:1.6E-43)
            if (r8 != r0) goto L94
            r6 = 1
            int r4 = r9.s()
            r8 = r4
            r4 = 98
            r0 = r4
            if (r8 != r0) goto L94
            int r8 = r9.s()
            r4 = 105(0x69, float:1.47E-43)
            r0 = r4
            if (r8 != r0) goto L94
            r7 = 6
            int r4 = r9.s()
            r8 = r4
            r4 = 115(0x73, float:1.61E-43)
            r9 = r4
            if (r8 == r9) goto L90
            r6 = 7
            goto L95
        L90:
            r7 = 4
            r4 = 1
            r8 = r4
            return r8
        L94:
            r7 = 4
        L95:
            if (r10 == 0) goto L98
            return r1
        L98:
            java.lang.String r4 = "expected characters 'vorbis'"
            r8 = r4
            com.google.android.exoplayer2.ParserException r4 = com.google.android.exoplayer2.ParserException.a(r8, r2)
            r8 = r4
            throw r8
            r6 = 5
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.y.c(int, k8.t, boolean):boolean");
    }
}
