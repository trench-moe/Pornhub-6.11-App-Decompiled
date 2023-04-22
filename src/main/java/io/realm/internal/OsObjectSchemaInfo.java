package io.realm.internal;

/* loaded from: classes2.dex */
public class OsObjectSchemaInfo implements g {

    /* renamed from: f  reason: collision with root package name */
    public static final long f10876f = nativeGetFinalizerPtr();

    /* renamed from: c  reason: collision with root package name */
    public long f10877c;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f10878a;

        /* renamed from: c  reason: collision with root package name */
        public final long[] f10880c;

        /* renamed from: b  reason: collision with root package name */
        public int f10879b = 0;
        public int d = 0;

        public b(String str, String str2, boolean z10, int i10, int i11) {
            this.f10878a = new long[i10];
            this.f10880c = new long[i11];
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.realm.internal.OsObjectSchemaInfo.b a(java.lang.String r4, java.lang.String r5, io.realm.RealmFieldType r6, boolean r7, boolean r8, boolean r9) {
            /*
                r3 = this;
                int r0 = io.realm.internal.Property.f10922j
                int[] r0 = io.realm.internal.Property.a.f10924a
                int r1 = r6.ordinal()
                r0 = r0[r1]
                r1 = 1
                r2 = 0
                switch(r0) {
                    case 1: goto L60;
                    case 2: goto L5d;
                    case 3: goto L5a;
                    case 4: goto L52;
                    case 5: goto L50;
                    case 6: goto L4e;
                    case 7: goto L4c;
                    case 8: goto L4a;
                    case 9: goto L48;
                    case 10: goto L45;
                    case 11: goto L42;
                    case 12: goto L40;
                    case 13: goto L3d;
                    case 14: goto L3a;
                    case 15: goto L37;
                    case 16: goto L34;
                    case 17: goto L31;
                    case 18: goto L2e;
                    case 19: goto L2b;
                    case 20: goto L28;
                    case 21: goto L25;
                    default: goto Lf;
                }
            Lf:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.util.Locale r5 = java.util.Locale.US
                java.lang.Object[] r7 = new java.lang.Object[r1]
                java.lang.String r6 = r6.name()
                r7[r2] = r6
                java.lang.String r6 = "Unsupported filed type: '%s'."
                java.lang.String r5 = java.lang.String.format(r5, r6, r7)
                r4.<init>(r5)
                throw r4
            L25:
                r6 = 134(0x86, float:1.88E-43)
                goto L53
            L28:
                r6 = 138(0x8a, float:1.93E-43)
                goto L53
            L2b:
                r6 = 139(0x8b, float:1.95E-43)
                goto L53
            L2e:
                r6 = 133(0x85, float:1.86E-43)
                goto L53
            L31:
                r6 = 132(0x84, float:1.85E-43)
                goto L53
            L34:
                r6 = 131(0x83, float:1.84E-43)
                goto L53
            L37:
                r6 = 130(0x82, float:1.82E-43)
                goto L53
            L3a:
                r6 = 129(0x81, float:1.81E-43)
                goto L53
            L3d:
                r6 = 128(0x80, float:1.8E-43)
                goto L53
            L40:
                r6 = 6
                goto L53
            L42:
                r6 = 10
                goto L53
            L45:
                r6 = 11
                goto L53
            L48:
                r6 = 5
                goto L53
            L4a:
                r6 = 4
                goto L53
            L4c:
                r6 = 3
                goto L53
            L4e:
                r6 = 2
                goto L53
            L50:
                r6 = 1
                goto L53
            L52:
                r6 = 0
            L53:
                if (r9 == 0) goto L56
                goto L58
            L56:
                r2 = 64
            L58:
                r6 = r6 | r2
                goto L62
            L5a:
                r6 = 136(0x88, float:1.9E-43)
                goto L62
            L5d:
                r6 = 135(0x87, float:1.89E-43)
                goto L62
            L60:
                r6 = 71
            L62:
                long r4 = io.realm.internal.Property.nativeCreatePersistedProperty(r5, r4, r6, r7, r8)
                long[] r6 = r3.f10878a
                int r7 = r3.f10879b
                r6[r7] = r4
                int r7 = r7 + r1
                r3.f10879b = r7
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.realm.internal.OsObjectSchemaInfo.b.a(java.lang.String, java.lang.String, io.realm.RealmFieldType, boolean, boolean, boolean):io.realm.internal.OsObjectSchemaInfo$b");
        }
    }

    public OsObjectSchemaInfo(long j10) {
        this.f10877c = j10;
        f.f10955b.a(this);
    }

    public OsObjectSchemaInfo(String str, String str2, boolean z10, a aVar) {
        this.f10877c = nativeCreateRealmObjectSchema(str, str2, z10);
        f.f10955b.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddProperties(long j10, long[] jArr, long[] jArr2);

    private static native long nativeCreateRealmObjectSchema(String str, String str2, boolean z10);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetPrimaryKeyProperty(long j10);

    private static native long nativeGetProperty(long j10, String str);

    public Property b() {
        if (nativeGetPrimaryKeyProperty(this.f10877c) == 0) {
            return null;
        }
        return new Property(nativeGetPrimaryKeyProperty(this.f10877c));
    }

    public Property c(String str) {
        return new Property(nativeGetProperty(this.f10877c, str));
    }

    @Override // io.realm.internal.g
    public long getNativeFinalizerPtr() {
        return f10876f;
    }

    @Override // io.realm.internal.g
    public long getNativePtr() {
        return this.f10877c;
    }
}
