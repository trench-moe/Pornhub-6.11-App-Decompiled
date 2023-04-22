package r5;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class a implements e<ByteBuffer> {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f14677a;

    /* renamed from: r5.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0254a implements e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.e.a
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f14677a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    public ByteBuffer a() {
        this.f14677a.position(0);
        return this.f14677a;
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }
}
