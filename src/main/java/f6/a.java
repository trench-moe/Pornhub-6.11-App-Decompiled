package f6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: f6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0131a {

        /* renamed from: a  reason: collision with root package name */
        public ZipFile f9453a;

        /* renamed from: b  reason: collision with root package name */
        public ZipEntry f9454b;

        public C0131a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f9453a = zipFile;
            this.f9454b = zipEntry;
        }
    }

    public final C0131a a(Context context, String[] strArr, String str, e eVar) {
        String[] c10 = c(context);
        int length = c10.length;
        char c11 = 0;
        int i10 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i10 >= length) {
                return null;
            }
            String str2 = c10[i10];
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i11 = i12;
                }
            }
            if (zipFile != null) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    if (i13 < 5) {
                        int length2 = strArr.length;
                        int i15 = 0;
                        while (i15 < length2) {
                            String str3 = strArr[i15];
                            StringBuilder m10 = a1.a.m("lib");
                            m10.append(File.separatorChar);
                            m10.append(str3);
                            m10.append(File.separatorChar);
                            m10.append(str);
                            String sb2 = m10.toString();
                            Object[] objArr = new Object[2];
                            objArr[c11] = sb2;
                            objArr[1] = str2;
                            Objects.requireNonNull(eVar);
                            String.format(Locale.US, "Looking for %s in APK %s...", objArr);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                return new C0131a(zipFile, entry);
                            }
                            i15++;
                            c11 = 0;
                        }
                        i13 = i14;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i10++;
            c11 = 0;
        }
    }

    public final String[] b(Context context, String str) {
        StringBuilder m10 = a1.a.m("lib");
        m10.append(File.separatorChar);
        m10.append("([^\\");
        m10.append(File.separatorChar);
        m10.append("]*)");
        m10.append(File.separatorChar);
        m10.append(str);
        Pattern compile = Pattern.compile(m10.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : c(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public final String[] c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }
}
