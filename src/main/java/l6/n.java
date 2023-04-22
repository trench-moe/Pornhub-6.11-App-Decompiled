package l6;

import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class n implements ie.a {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final n f12305a = new n();
    }

    @Override // ie.a
    public Object get() {
        return new p(Executors.newSingleThreadExecutor());
    }
}
