package uc;

/* loaded from: classes2.dex */
public class e implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f15831c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g f15832f;

    public e(g gVar, boolean z10) {
        this.f15832f = gVar;
        this.f15831c = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f15832f.f15838e.setVisibility(this.f15831c ? 0 : 4);
    }
}
