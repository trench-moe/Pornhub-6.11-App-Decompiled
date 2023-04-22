package pl.droidsonroids.gif;

import java.io.IOException;

/* loaded from: classes3.dex */
public class GifIOException extends IOException {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f14093c = 0;
    private static final long serialVersionUID = 13038402904505L;
    private final String mErrnoMessage;
    public final GifError reason;

    public GifIOException(int i10, String str) {
        GifError gifError;
        GifError[] values = GifError.values();
        int length = values.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                gifError = GifError.UNKNOWN;
                gifError.errorCode = i10;
                break;
            }
            gifError = values[i11];
            if (gifError.errorCode == i10) {
                break;
            }
            i11++;
        }
        this.reason = gifError;
        this.mErrnoMessage = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.mErrnoMessage == null) {
            return this.reason.b();
        }
        return this.reason.b() + ": " + this.mErrnoMessage;
    }
}
