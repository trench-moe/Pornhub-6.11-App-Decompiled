package n5;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import n5.m;

/* loaded from: classes2.dex */
public class c implements m<File, ByteBuffer> {

    /* loaded from: classes2.dex */
    public static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* renamed from: c  reason: collision with root package name */
        public final File f13306c;

        public a(File file) {
            this.f13306c = file;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
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
        public void e(Priority priority, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(d6.a.a(this.f13306c));
            } catch (IOException e10) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
                }
                aVar.c(e10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements n<File, ByteBuffer> {
        @Override // n5.n
        public m<File, ByteBuffer> a(q qVar) {
            return new c();
        }
    }

    @Override // n5.m
    public /* bridge */ /* synthetic */ boolean a(File file) {
        return true;
    }

    @Override // n5.m
    public m.a<ByteBuffer> b(File file, int i10, int i11, h5.d dVar) {
        File file2 = file;
        return new m.a<>(new c6.d(file2), new a(file2));
    }
}
