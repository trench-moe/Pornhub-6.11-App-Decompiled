package y2;

import android.util.MalformedJsonException;
import com.app.pornhub.domain.error.MalformedDataException;
import com.app.pornhub.domain.error.NetworkException;
import com.app.pornhub.domain.error.PornhubException;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import java.io.EOFException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;

/* loaded from: classes2.dex */
public final class a {
    public final Throwable a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        boolean z10 = true;
        if (throwable instanceof EOFException ? true : throwable instanceof JsonDataException ? true : throwable instanceof JsonEncodingException ? true : throwable instanceof MalformedJsonException) {
            return new MalformedDataException();
        }
        if (throwable instanceof HttpException) {
            HttpException httpException = (HttpException) throwable;
            int a10 = httpException.a();
            String b10 = httpException.b();
            Intrinsics.checkNotNullExpressionValue(b10, "throwable.message()");
            return new PornhubException(a10, b10);
        }
        if (!(throwable instanceof IOException ? true : throwable instanceof UnknownHostException)) {
            z10 = throwable instanceof SocketTimeoutException;
        }
        if (z10) {
            throwable = new NetworkException();
        }
        return throwable;
    }
}
