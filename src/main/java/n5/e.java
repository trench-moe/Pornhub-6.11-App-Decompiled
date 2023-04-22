package n5;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import n5.m;

/* loaded from: classes2.dex */
public class e<Data> implements m<File, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final d<Data> f13312a;

    /* loaded from: classes2.dex */
    public static class a<Data> implements n<File, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final d<Data> f13313a;

        public a(d<Data> dVar) {
            this.f13313a = dVar;
        }

        @Override // n5.n
        public final m<File, Data> a(q qVar) {
            return new e(this.f13313a);
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends a<ParcelFileDescriptor> {

        /* loaded from: classes2.dex */
        public class a implements d<ParcelFileDescriptor> {
            @Override // n5.e.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // n5.e.d
            public ParcelFileDescriptor b(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            @Override // n5.e.d
            public void c(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }
        }

        public b() {
            super(new a());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: c  reason: collision with root package name */
        public final File f13314c;

        /* renamed from: f  reason: collision with root package name */
        public final d<Data> f13315f;

        /* renamed from: j  reason: collision with root package name */
        public Data f13316j;

        public c(File file, d<Data> dVar) {
            this.f13314c = file;
            this.f13315f = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f13315f.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Data data = this.f13316j;
            if (data != null) {
                try {
                    this.f13315f.c(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public DataSource d() {
            return DataSource.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, Data] */
        @Override // com.bumptech.glide.load.data.d
        public void e(Priority priority, d.a<? super Data> aVar) {
            try {
                Data b10 = this.f13315f.b(this.f13314c);
                this.f13316j = b10;
                aVar.f(b10);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e10);
                }
                aVar.c(e10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface d<Data> {
        Class<Data> a();

        Data b(File file);

        void c(Data data);
    }

    /* renamed from: n5.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0223e extends a<InputStream> {

        /* renamed from: n5.e$e$a */
        /* loaded from: classes2.dex */
        public class a implements d<InputStream> {
            @Override // n5.e.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // n5.e.d
            public InputStream b(File file) {
                return new FileInputStream(file);
            }

            @Override // n5.e.d
            public void c(InputStream inputStream) {
                inputStream.close();
            }
        }

        public C0223e() {
            super(new a());
        }
    }

    public e(d<Data> dVar) {
        this.f13312a = dVar;
    }

    @Override // n5.m
    public /* bridge */ /* synthetic */ boolean a(File file) {
        return true;
    }

    @Override // n5.m
    public m.a b(File file, int i10, int i11, h5.d dVar) {
        File file2 = file;
        return new m.a(new c6.d(file2), new c(file2, this.f13312a));
    }
}
