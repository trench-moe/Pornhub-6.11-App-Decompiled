package ye;

import android.util.Log;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static final d f18645a = new d();

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        int min;
        Intrinsics.checkNotNullParameter(record, "record");
        c cVar = c.f18644c;
        String loggerName = record.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "record.loggerName");
        int i10 = record.getLevel().intValue() > Level.INFO.intValue() ? 5 : record.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        String message = record.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "record.message");
        Throwable thrown = record.getThrown();
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String str = c.f18643b.get(loggerName);
        if (str == null) {
            str = StringsKt.take(loggerName, 23);
        }
        if (Log.isLoggable(str, i10)) {
            if (thrown != null) {
                StringBuilder l10 = android.support.v4.media.a.l(message, "\n");
                l10.append(Log.getStackTraceString(thrown));
                message = l10.toString();
            }
            int i11 = 0;
            int length = message.length();
            while (i11 < length) {
                int indexOf$default = StringsKt.indexOf$default((CharSequence) message, '\n', i11, false, 4, (Object) null);
                if (indexOf$default == -1) {
                    indexOf$default = length;
                }
                while (true) {
                    min = Math.min(indexOf$default, i11 + 4000);
                    String substring = message.substring(i11, min);
                    Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i10, str, substring);
                    if (min >= indexOf$default) {
                        break;
                    }
                    i11 = min;
                }
                i11 = min + 1;
            }
        }
    }
}
