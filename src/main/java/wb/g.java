package wb;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.io.ConstantsKt;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final a f17456a = new a(this, false);

    /* renamed from: b  reason: collision with root package name */
    public final a f17457b = new a(this, true);

    /* renamed from: c  reason: collision with root package name */
    public final AtomicMarkableReference<String> f17458c = new AtomicMarkableReference<>(null, false);

    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicMarkableReference<b> f17459a;

        public a(g gVar, boolean z10) {
            new AtomicReference(null);
            this.f17459a = new AtomicMarkableReference<>(new b(64, z10 ? ConstantsKt.DEFAULT_BUFFER_SIZE : 1024), false);
        }

        public Map<String, String> a() {
            Map<String, String> unmodifiableMap;
            b reference = this.f17459a.getReference();
            synchronized (reference) {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.f17432a));
            }
            return unmodifiableMap;
        }
    }

    public g(String str, ac.c cVar, vb.e eVar) {
    }
}
