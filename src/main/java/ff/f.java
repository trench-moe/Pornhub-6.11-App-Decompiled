package ff;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes2.dex */
public class f implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f9585a;

    public f(e eVar, String str) {
        this.f9585a = str;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.startsWith(this.f9585a);
    }
}
