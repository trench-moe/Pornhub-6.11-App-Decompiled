package e6;

/* loaded from: classes.dex */
public abstract class d {

    /* loaded from: classes.dex */
    public static class b extends d {

        /* renamed from: a  reason: collision with root package name */
        public volatile boolean f9125a;

        public b() {
            super(null);
        }

        @Override // e6.d
        public void a() {
            if (this.f9125a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public d(a aVar) {
    }

    public abstract void a();
}
