package q2;

import com.app.pornhub.data.util.JNI;

/* loaded from: classes2.dex */
public final class v implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final a0.b f14306a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<String> f14307b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<JNI> f14308c;

    public v(a0.b bVar, ie.a<String> aVar, ie.a<JNI> aVar2) {
        this.f14306a = bVar;
        this.f14307b = aVar;
        this.f14308c = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        r0 = "https://api-stage" + r0 + ".pornhub.com/android/";
     */
    @Override // ie.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object get() {
        /*
            r5 = this;
            a0.b r0 = r5.f14306a
            java.lang.String r4 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            ie.a<java.lang.String> r1 = r5.f14307b
            r4 = 1
            java.lang.Object r3 = r1.get()
            r1 = r3
            java.lang.String r1 = (java.lang.String) r1
            r4 = 4
            ie.a<com.app.pornhub.data.util.JNI> r2 = r5.f14308c
            java.lang.Object r3 = r2.get()
            r2 = r3
            com.app.pornhub.data.util.JNI r2 = (com.app.pornhub.data.util.JNI) r2
            r4 = 5
            java.util.Objects.requireNonNull(r0)
            java.lang.String r3 = "jni"
            r0 = r3
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r4 = 3
            if (r1 != 0) goto L28
            r3 = 0
            r0 = r3
            goto L2d
        L28:
            r4 = 6
            java.lang.Integer r0 = kotlin.text.StringsKt.toIntOrNull(r1)
        L2d:
            if (r1 != 0) goto L3b
            java.lang.String r0 = r2.a()
            java.lang.String r3 = "{\n                jni.domain\n            }"
            r1 = r3
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r4 = 3
            goto L76
        L3b:
            r4 = 1
            int r1 = r1.length()
            if (r1 != 0) goto L45
            r3 = 1
            r1 = r3
            goto L48
        L45:
            r4 = 1
            r3 = 0
            r1 = r3
        L48:
            if (r1 == 0) goto L4b
            goto L58
        L4b:
            if (r0 != 0) goto L4f
            r4 = 6
            goto L5b
        L4f:
            r4 = 5
            int r3 = r0.intValue()
            r1 = r3
            if (r1 != 0) goto L5b
            r4 = 1
        L58:
            java.lang.String r0 = "https://api-stage.pornhub.com/android/"
            goto L76
        L5b:
            if (r0 == 0) goto L7d
            r4 = 4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "https://api-stage"
            r4 = 6
            r1.append(r2)
            r1.append(r0)
            java.lang.String r3 = ".pornhub.com/android/"
            r0 = r3
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L76:
            java.lang.String r3 = "Cannot return null from a non-@Nullable @Provides method"
            r1 = r3
            java.util.Objects.requireNonNull(r0, r1)
            return r0
        L7d:
            r4 = 2
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r4 = 1
            java.lang.String r1 = "Invalid api target"
            r4 = 2
            r0.<init>(r1)
            r4 = 4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.v.get():java.lang.Object");
    }
}
