package n5;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import n5.m;

/* loaded from: classes2.dex */
public final class d<Model, Data> implements m<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Data> f13307a;

    /* loaded from: classes2.dex */
    public interface a<Data> {
    }

    /* loaded from: classes2.dex */
    public static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: c  reason: collision with root package name */
        public final String f13308c;

        /* renamed from: f  reason: collision with root package name */
        public final a<Data> f13309f;

        /* renamed from: j  reason: collision with root package name */
        public Data f13310j;

        public b(String str, a<Data> aVar) {
            this.f13308c = str;
            this.f13309f = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            Objects.requireNonNull((c.a) this.f13309f);
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                a<Data> aVar = this.f13309f;
                Data data = this.f13310j;
                Objects.requireNonNull((c.a) aVar);
                ((InputStream) data).close();
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public DataSource d() {
            return DataSource.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, Data] */
        @Override // com.bumptech.glide.load.data.d
        public void e(Priority priority, d.a<? super Data> aVar) {
            try {
                ?? r52 = (Data) ((c.a) this.f13309f).a(this.f13308c);
                this.f13310j = r52;
                aVar.f(r52);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<Model> implements n<Model, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final a<InputStream> f13311a = new a(this);

        /* loaded from: classes2.dex */
        public class a implements a<InputStream> {
            public a(c cVar) {
            }

            public Object a(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf != -1) {
                        if (str.substring(0, indexOf).endsWith(";base64")) {
                            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                        }
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        }

        @Override // n5.n
        public m<Model, InputStream> a(q qVar) {
            return new d(this.f13311a);
        }
    }

    public d(a<Data> aVar) {
        this.f13307a = aVar;
    }

    @Override // n5.m
    public boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // n5.m
    public m.a<Data> b(Model model, int i10, int i11, h5.d dVar) {
        return new m.a<>(new c6.d(model), new b(model.toString(), this.f13307a));
    }
}
