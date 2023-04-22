package d6;

import java.util.Objects;

/* loaded from: classes.dex */
public class f implements g<Object> {

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f8790a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f8791b;

    public f(g gVar) {
        this.f8791b = gVar;
    }

    @Override // d6.g
    public Object get() {
        if (this.f8790a == null) {
            synchronized (this) {
                if (this.f8790a == null) {
                    Object obj = this.f8791b.get();
                    Objects.requireNonNull(obj, "Argument must not be null");
                    this.f8790a = obj;
                }
            }
        }
        return this.f8790a;
    }
}
