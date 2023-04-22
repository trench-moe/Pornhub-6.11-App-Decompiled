package vb;

import android.os.Process;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicLong f16122a = new AtomicLong(0);

    /* renamed from: b  reason: collision with root package name */
    public static String f16123b;

    public d(w wVar) {
        long time = new Date().getTime();
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) (time / 1000));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        byte[] array = allocate.array();
        byte[] a10 = a(time % 1000);
        byte[] a11 = a(f16122a.incrementAndGet());
        byte[] a12 = a(Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {array[0], array[1], array[2], array[3], a10[0], a10[1], a11[0], a11[1], a12[0], a12[1]};
        String l10 = CommonUtils.l(wVar.c());
        String i10 = CommonUtils.i(bArr);
        Locale locale = Locale.US;
        f16123b = String.format(locale, "%s%s%s%s", i10.substring(0, 12), i10.substring(12, 16), i10.subSequence(16, 20), l10.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j10) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j10);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public String toString() {
        return f16123b;
    }
}
