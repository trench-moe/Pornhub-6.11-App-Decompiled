package pl.droidsonroids.gif;

/* loaded from: classes3.dex */
public class a extends h {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b f14112f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, b bVar2) {
        super(bVar2);
        this.f14112f = bVar;
    }

    @Override // pl.droidsonroids.gif.h
    public void a() {
        if (this.f14112f.f14118u.q()) {
            this.f14112f.start();
        }
    }
}
