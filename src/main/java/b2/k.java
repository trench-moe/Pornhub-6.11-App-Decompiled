package b2;

import java.io.InputStream;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class k implements Callable<r<f>> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ InputStream f3476c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3477f;

    public k(InputStream inputStream, String str) {
        this.f3476c = inputStream;
        this.f3477f = str;
    }

    @Override // java.util.concurrent.Callable
    public r<f> call() {
        return g.c(this.f3476c, this.f3477f);
    }
}
