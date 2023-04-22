package we;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class a {
    @JvmField
    public static final ByteString d;
    @JvmField

    /* renamed from: e  reason: collision with root package name */
    public static final ByteString f17463e;
    @JvmField

    /* renamed from: f  reason: collision with root package name */
    public static final ByteString f17464f;
    @JvmField

    /* renamed from: g  reason: collision with root package name */
    public static final ByteString f17465g;
    @JvmField

    /* renamed from: h  reason: collision with root package name */
    public static final ByteString f17466h;
    @JvmField

    /* renamed from: i  reason: collision with root package name */
    public static final ByteString f17467i;
    @JvmField

    /* renamed from: a  reason: collision with root package name */
    public final int f17468a;
    @JvmField

    /* renamed from: b  reason: collision with root package name */
    public final ByteString f17469b;
    @JvmField

    /* renamed from: c  reason: collision with root package name */
    public final ByteString f17470c;

    static {
        ByteString.a aVar = ByteString.f13728m;
        d = aVar.c(":");
        f17463e = aVar.c(":status");
        f17464f = aVar.c(":method");
        f17465g = aVar.c(":path");
        f17466h = aVar.c(":scheme");
        f17467i = aVar.c(":authority");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.ByteString$a r0 = okio.ByteString.f13728m
            okio.ByteString r2 = r0.c(r2)
            okio.ByteString r3 = r0.c(r3)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: we.a.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(ByteString name, String value) {
        this(name, ByteString.f13728m.c(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public a(ByteString name, ByteString value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f17469b = name;
        this.f17470c = value;
        this.f17468a = name.f() + 32 + value.f();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f17469b, aVar.f17469b) && Intrinsics.areEqual(this.f17470c, aVar.f17470c);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        ByteString byteString = this.f17469b;
        int hashCode = (byteString != null ? byteString.hashCode() : 0) * 31;
        ByteString byteString2 = this.f17470c;
        return hashCode + (byteString2 != null ? byteString2.hashCode() : 0);
    }

    public String toString() {
        return this.f17469b.m() + ": " + this.f17470c.m();
    }
}
