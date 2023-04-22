package p9;

import android.os.IInterface;

/* loaded from: classes.dex */
public interface c extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z10, int i10);

    int getIntFlagValue(String str, int i10, int i11);

    long getLongFlagValue(String str, long j10, int i10);

    String getStringFlagValue(String str, String str2, int i10);

    void init(n9.a aVar);
}
