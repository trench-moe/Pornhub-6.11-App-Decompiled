package pe;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import pe.r;

/* loaded from: classes3.dex */
public final class s extends x {
    @JvmField

    /* renamed from: e  reason: collision with root package name */
    public static final r f14008e;
    @JvmField

    /* renamed from: f  reason: collision with root package name */
    public static final r f14009f;

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f14010g;

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f14011h;

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f14012i;

    /* renamed from: a  reason: collision with root package name */
    public final r f14013a;

    /* renamed from: b  reason: collision with root package name */
    public long f14014b;

    /* renamed from: c  reason: collision with root package name */
    public final ByteString f14015c;
    public final List<b> d;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ByteString f14016a;

        /* renamed from: b  reason: collision with root package name */
        public r f14017b;

        /* renamed from: c  reason: collision with root package name */
        public final List<b> f14018c;

        @JvmOverloads
        public a() {
            String boundary = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(boundary, "UUID.randomUUID().toString()");
            Intrinsics.checkNotNullParameter(boundary, "boundary");
            this.f14016a = ByteString.f13728m.c(boundary);
            this.f14017b = s.f14008e;
            this.f14018c = new ArrayList();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final o f14019a;

        /* renamed from: b  reason: collision with root package name */
        public final x f14020b;

        public b(o oVar, x xVar, DefaultConstructorMarker defaultConstructorMarker) {
            this.f14019a = oVar;
            this.f14020b = xVar;
        }
    }

    static {
        r.a aVar = r.f14004f;
        f14008e = r.a.a("multipart/mixed");
        r.a.a("multipart/alternative");
        r.a.a("multipart/digest");
        r.a.a("multipart/parallel");
        f14009f = r.a.a("multipart/form-data");
        f14010g = new byte[]{(byte) 58, (byte) 32};
        f14011h = new byte[]{(byte) 13, (byte) 10};
        byte b10 = (byte) 45;
        f14012i = new byte[]{b10, b10};
    }

    public s(ByteString boundaryByteString, r type, List<b> parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f14015c = boundaryByteString;
        this.d = parts;
        r.a aVar = r.f14004f;
        this.f14013a = r.a.a(type + "; boundary=" + boundaryByteString.m());
        this.f14014b = -1L;
    }

    @Override // pe.x
    public long a() {
        long j10 = this.f14014b;
        if (j10 == -1) {
            long d = d(null, true);
            this.f14014b = d;
            return d;
        }
        return j10;
    }

    @Override // pe.x
    public r b() {
        return this.f14013a;
    }

    @Override // pe.x
    public void c(bf.g sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        d(sink, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d(bf.g gVar, boolean z10) {
        bf.f fVar;
        if (z10) {
            gVar = new bf.f();
            fVar = gVar;
        } else {
            fVar = 0;
        }
        int size = this.d.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.d.get(i10);
            o oVar = bVar.f14019a;
            x xVar = bVar.f14020b;
            Intrinsics.checkNotNull(gVar);
            gVar.d0(f14012i);
            gVar.e0(this.f14015c);
            gVar.d0(f14011h);
            if (oVar != null) {
                int size2 = oVar.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    gVar.N(oVar.e(i11)).d0(f14010g).N(oVar.h(i11)).d0(f14011h);
                }
            }
            r b10 = xVar.b();
            if (b10 != null) {
                gVar.N("Content-Type: ").N(b10.f14005a).d0(f14011h);
            }
            long a10 = xVar.a();
            if (a10 != -1) {
                gVar.N("Content-Length: ").m0(a10).d0(f14011h);
            } else if (z10) {
                Intrinsics.checkNotNull(fVar);
                fVar.l(fVar.f3669f);
                return -1L;
            }
            byte[] bArr = f14011h;
            gVar.d0(bArr);
            if (z10) {
                j10 += a10;
            } else {
                xVar.c(gVar);
            }
            gVar.d0(bArr);
        }
        Intrinsics.checkNotNull(gVar);
        byte[] bArr2 = f14012i;
        gVar.d0(bArr2);
        gVar.e0(this.f14015c);
        gVar.d0(bArr2);
        gVar.d0(f14011h);
        if (z10) {
            Intrinsics.checkNotNull(fVar);
            long j11 = fVar.f3669f;
            long j12 = j10 + j11;
            fVar.l(j11);
            return j12;
        }
        return j10;
    }
}
