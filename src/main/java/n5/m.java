package n5;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public interface m<Model, Data> {

    /* loaded from: classes2.dex */
    public static class a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final h5.b f13338a;

        /* renamed from: b  reason: collision with root package name */
        public final List<h5.b> f13339b;

        /* renamed from: c  reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f13340c;

        public a(h5.b bVar, com.bumptech.glide.load.data.d<Data> dVar) {
            List<h5.b> emptyList = Collections.emptyList();
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.f13338a = bVar;
            Objects.requireNonNull(emptyList, "Argument must not be null");
            this.f13339b = emptyList;
            Objects.requireNonNull(dVar, "Argument must not be null");
            this.f13340c = dVar;
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i10, int i11, h5.d dVar);
}
