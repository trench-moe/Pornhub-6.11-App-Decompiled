package uc;

/* loaded from: classes2.dex */
public class f implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Runnable f15833c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g f15834f;

    public f(g gVar, Runnable runnable) {
        this.f15834f = gVar;
        this.f15833c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f15834f.f15839f.setVisibility(this.f15833c == null ? 4 : 0);
    }
}
