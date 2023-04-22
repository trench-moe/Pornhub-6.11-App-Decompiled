package k1;

import androidx.multidex.MultiDexExtractor;
import java.io.File;
import java.io.FileFilter;

/* loaded from: classes2.dex */
public class b implements FileFilter {
    public b(MultiDexExtractor multiDexExtractor) {
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}
