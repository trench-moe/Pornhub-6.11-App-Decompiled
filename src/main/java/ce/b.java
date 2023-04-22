package ce;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class b implements FileFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Pattern f4097a;

    public b(Pattern pattern) {
        this.f4097a = pattern;
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return this.f4097a.matcher(file.getName()).matches();
    }
}
