package l9;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public static String f12749a;

    /* renamed from: b  reason: collision with root package name */
    public static int f12750b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static String a() {
        BufferedReader bufferedReader;
        if (f12749a == null) {
            int i10 = f12750b;
            if (i10 == 0) {
                i10 = Process.myPid();
                f12750b = i10;
            }
            ?? r1 = 0;
            try {
                if (i10 > 0) {
                    try {
                        StringBuilder sb2 = new StringBuilder(25);
                        sb2.append("/proc/");
                        sb2.append(i10);
                        sb2.append("/cmdline");
                        String sb3 = sb2.toString();
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        bufferedReader = new BufferedReader(new FileReader(sb3));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        try {
                            String readLine = bufferedReader.readLine();
                            Objects.requireNonNull(readLine, "null reference");
                            String trim = readLine.trim();
                            bufferedReader.close();
                            r1 = trim;
                        } catch (IOException unused) {
                            if (bufferedReader != null) {
                                bufferedReader.close();
                                r1 = r1;
                            }
                            f12749a = r1;
                            return f12749a;
                        } catch (Throwable th) {
                            th = th;
                            r1 = bufferedReader;
                            if (r1 != 0) {
                                try {
                                    r1.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused3) {
                        bufferedReader = r1;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (IOException unused4) {
            }
            f12749a = r1;
        }
        return f12749a;
    }
}
