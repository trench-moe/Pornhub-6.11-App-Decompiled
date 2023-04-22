package n5;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import n5.m;

/* loaded from: classes2.dex */
public class b<Data> implements m<byte[], Data> {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0222b<Data> f13303a;

    /* loaded from: classes2.dex */
    public static class a implements n<byte[], ByteBuffer> {

        /* renamed from: n5.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0221a implements InterfaceC0222b<ByteBuffer> {
            public C0221a(a aVar) {
            }

            @Override // n5.b.InterfaceC0222b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // n5.b.InterfaceC0222b
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // n5.n
        public m<byte[], ByteBuffer> a(q qVar) {
            return new b(new C0221a(this));
        }
    }

    /* renamed from: n5.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0222b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* loaded from: classes2.dex */
    public static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f13304c;

        /* renamed from: f  reason: collision with root package name */
        public final InterfaceC0222b<Data> f13305f;

        public c(byte[] bArr, InterfaceC0222b<Data> interfaceC0222b) {
            this.f13304c = bArr;
            this.f13305f = interfaceC0222b;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f13305f.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public DataSource d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(Priority priority, d.a<? super Data> aVar) {
            aVar.f((Data) this.f13305f.b(this.f13304c));
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements n<byte[], InputStream> {

        /* loaded from: classes2.dex */
        public class a implements InterfaceC0222b<InputStream> {
            public a(d dVar) {
            }

            @Override // n5.b.InterfaceC0222b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // n5.b.InterfaceC0222b
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // n5.n
        public m<byte[], InputStream> a(q qVar) {
            return new b(new a(this));
        }
    }

    public b(InterfaceC0222b<Data> interfaceC0222b) {
        this.f13303a = interfaceC0222b;
    }

    @Override // n5.m
    public /* bridge */ /* synthetic */ boolean a(byte[] bArr) {
        return true;
    }

    @Override // n5.m
    public m.a b(byte[] bArr, int i10, int i11, h5.d dVar) {
        byte[] bArr2 = bArr;
        return new m.a(new c6.d(bArr2), new c(bArr2, this.f13303a));
    }
}
