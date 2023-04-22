package cz.msebera.android.httpclient;

/* loaded from: classes.dex */
public class TruncatedChunkException extends MalformedChunkCodingException {
    private static final long serialVersionUID = -23506263930279460L;

    public TruncatedChunkException(String str, Object... objArr) {
        super(HttpException.a(String.format(str, objArr)));
    }
}
