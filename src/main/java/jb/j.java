package jb;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes2.dex */
public final class j {
    public static String a(@NullableDecl String str, @NullableDecl Object... objArr) {
        int indexOf;
        String str2;
        String valueOf = String.valueOf(str);
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            try {
                str2 = String.valueOf(obj);
            } catch (Exception e10) {
                String str3 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str3, (Throwable) e10);
                str2 = "<" + str3 + " threw " + e10.getClass().getName() + ">";
            }
            objArr[i11] = str2;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i12 = 0;
        while (i10 < objArr.length && (indexOf = valueOf.indexOf("%s", i12)) != -1) {
            sb2.append((CharSequence) valueOf, i12, indexOf);
            sb2.append(objArr[i10]);
            i12 = indexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) valueOf, i12, valueOf.length());
        if (i10 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
