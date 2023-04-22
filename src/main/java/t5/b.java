package t5;

import j5.i;
import java.io.File;
import java.util.Objects;

/* loaded from: classes2.dex */
public class b implements i<File> {

    /* renamed from: c  reason: collision with root package name */
    public final File f15129c;

    public b(File file) {
        Objects.requireNonNull(file, "Argument must not be null");
        this.f15129c = file;
    }

    @Override // j5.i
    public /* bridge */ /* synthetic */ void b() {
    }

    @Override // j5.i
    public final /* bridge */ /* synthetic */ int c() {
        return 1;
    }

    @Override // j5.i
    public Class<File> d() {
        return this.f15129c.getClass();
    }

    @Override // j5.i
    public final File get() {
        return this.f15129c;
    }
}
